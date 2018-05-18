package com.nngdjt.test.mapper;

import com.nngdjt.test.entity.SysTradeRecords;
import com.nngdjt.test.entity.SysTradeRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysTradeRecordsMapper {
    int countByExample(SysTradeRecordsExample example);

    int deleteByExample(SysTradeRecordsExample example);

    int deleteByPrimaryKey(String recId);

    int insert(SysTradeRecords record);

    int insertSelective(SysTradeRecords record);

    List<SysTradeRecords> selectByExampleWithRowbounds(SysTradeRecordsExample example, RowBounds rowBounds);

    List<SysTradeRecords> selectByExample(SysTradeRecordsExample example);

    SysTradeRecords selectByPrimaryKey(String recId);

    int updateByExampleSelective(@Param("record") SysTradeRecords record, @Param("example") SysTradeRecordsExample example);

    int updateByExample(@Param("record") SysTradeRecords record, @Param("example") SysTradeRecordsExample example);

    int updateByPrimaryKeySelective(SysTradeRecords record);

    int updateByPrimaryKey(SysTradeRecords record);
}