package com.nngdjt.test.mapper;

import com.nngdjt.test.entity.EsbTraceRecords;
import com.nngdjt.test.entity.EsbTraceRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EsbTraceRecordsMapper {
    int countByExample(EsbTraceRecordsExample example);

    int deleteByExample(EsbTraceRecordsExample example);

    int deleteByPrimaryKey(String msgId);

    int insert(EsbTraceRecords record);

    int insertSelective(EsbTraceRecords record);

    List<EsbTraceRecords> selectByExampleWithRowbounds(EsbTraceRecordsExample example, RowBounds rowBounds);

    List<EsbTraceRecords> selectByExample(EsbTraceRecordsExample example);

    EsbTraceRecords selectByPrimaryKey(String msgId);

    int updateByExampleSelective(@Param("record") EsbTraceRecords record, @Param("example") EsbTraceRecordsExample example);

    int updateByExample(@Param("record") EsbTraceRecords record, @Param("example") EsbTraceRecordsExample example);

    int updateByPrimaryKeySelective(EsbTraceRecords record);

    int updateByPrimaryKey(EsbTraceRecords record);
}