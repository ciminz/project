package business;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.nngdjt.test.entity.EsbTraceRecords;
import com.nngdjt.test.entity.EsbTraceRecordsExample;
import com.nngdjt.test.entity.EsbTraceRecordsExample.Criteria;
import com.nngdjt.test.entity.SysTradeRecords;
import com.nngdjt.test.entity.SystemTbl;
import com.nngdjt.test.mapper.EsbTraceRecordsMapper;
import com.nngdjt.test.mapper.SysTradeRecordsMapper;
import com.nngdjt.test.mapper.SystemTblMapper;
import com.vane.utils.DateUtil;

import junit.BaseJunit4Test;

public class TestDataTask extends BaseJunit4Test{
	private static Logger logger = LoggerFactory.getLogger(TestDataTask.class);
	@Autowired
	private SystemTblMapper systemTblMapper;

	@Autowired
	private EsbTraceRecordsMapper esbTraceRecordsMapper;
	
	@Autowired
	private SysTradeRecordsMapper sysTradeRecordsMapper;
	
	@Test
	@Transactional
	@Rollback(false)
	public void testDataTask() {
		//统计笔数
		String calDte = DateUtil.dateToStr(DateUtil.getNow());
		
		logger.info(">>>>>>统计日期:" + calDte);
		
		//查询系统清单
		List<SystemTbl> systemTblList = this.systemTblMapper.selectByExample(null);
		logger.info(">>>>>>参与统计的系统个数:" + systemTblList.size());
		
		//便利系统清单，逐一进行数据筛选和预处理
		for(SystemTbl tbl : systemTblList) {
			SysTradeRecords sysTradeRecords = new SysTradeRecords();
			//设置记录ID
			sysTradeRecords.setRecId(calDte + tbl.getSysCde());
			sysTradeRecords.setCrtDte(calDte);
			sysTradeRecords.setSysCde(tbl.getSysCde());
			//统计总交易笔数
			logger.info(">>>>>>系统:" + tbl.getSysNme());
			EsbTraceRecordsExample esbTraceRecordsExample = new EsbTraceRecordsExample();
			esbTraceRecordsExample.createCriteria().andTradeTargetEqualTo(tbl.getSysCde()).andReqTimeEqualTo(calDte);
			int totCnt = this.esbTraceRecordsMapper.countByExample(esbTraceRecordsExample);
			logger.info(">>>>>>系统:" + tbl.getSysNme() + " " + calDte + " 总笔数:" + totCnt);
			sysTradeRecords.setTotCnt(totCnt + "");
			
			//统计非账务笔数
			esbTraceRecordsExample = new EsbTraceRecordsExample();
			esbTraceRecordsExample.createCriteria().andTradeTargetEqualTo(tbl.getSysCde()).andTradeTypeEqualTo("un_acc").andReqTimeEqualTo(calDte);
			int unAccCnt = this.esbTraceRecordsMapper.countByExample(esbTraceRecordsExample);
			logger.info(">>>>>>系统:" + tbl.getSysNme() + " " + calDte + " 非账务笔数:" + unAccCnt);
			sysTradeRecords.setUnAcctCnt(unAccCnt + "");
			
			//统计账务笔数
			esbTraceRecordsExample = new EsbTraceRecordsExample();
			esbTraceRecordsExample.createCriteria().andTradeTargetEqualTo(tbl.getSysCde()).andTradeTypeEqualTo("acc").andReqTimeEqualTo(calDte);
			int accCnt = this.esbTraceRecordsMapper.countByExample(esbTraceRecordsExample);
			logger.info(">>>>>>系统:" + tbl.getSysNme() + " " + calDte + " 账务笔数:" + accCnt);
			sysTradeRecords.setAcctCnt(accCnt + "");
			
			//统计账务金额
			esbTraceRecordsExample = new EsbTraceRecordsExample();
			esbTraceRecordsExample.createCriteria().andTradeTargetEqualTo(tbl.getSysCde()).andTradeTypeEqualTo("acc").andReqTimeEqualTo(calDte);
			List<EsbTraceRecords> esbTraceRecordsList = this.esbTraceRecordsMapper.selectByExample(esbTraceRecordsExample);
			BigDecimal accAmount = new BigDecimal("0");
			for(EsbTraceRecords records : esbTraceRecordsList) {
				accAmount = accAmount.add(new BigDecimal(records.getTradeAmt()));
			}
			sysTradeRecords.setTradeAmt(accAmount.toString());
			
			//统计成功金额
			BigDecimal accSucAmount = new BigDecimal("0");
			for(EsbTraceRecords records : esbTraceRecordsList) {
				if("000000".equals(records.getResCde())) {
					accSucAmount = accSucAmount.add(new BigDecimal(records.getTradeAmt()));
				}
			}
			sysTradeRecords.setSuccAmt(accSucAmount.toString());
			
			//统计账务笔数
			esbTraceRecordsExample = new EsbTraceRecordsExample();
			esbTraceRecordsExample.createCriteria().andTradeTargetEqualTo(tbl.getSysCde()).andChnEqualTo("E").andReqTimeEqualTo(calDte);
			int eChnCnt = this.esbTraceRecordsMapper.countByExample(esbTraceRecordsExample);
			logger.info(">>>>>>系统:" + tbl.getSysNme() + " " + calDte + " 电子渠道交易笔数:" + eChnCnt);
			sysTradeRecords.setEleChnCnt(eChnCnt + "");
			
			logger.info("" + (this.sysTradeRecordsMapper == null));
			this.sysTradeRecordsMapper.insert(sysTradeRecords);
		}
	}
}
