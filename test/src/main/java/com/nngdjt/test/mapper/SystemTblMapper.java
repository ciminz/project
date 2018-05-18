package com.nngdjt.test.mapper;

import com.nngdjt.test.entity.SystemTbl;
import com.nngdjt.test.entity.SystemTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SystemTblMapper {
    int countByExample(SystemTblExample example);

    int deleteByExample(SystemTblExample example);

    int deleteByPrimaryKey(String sysCde);

    int insert(SystemTbl record);

    int insertSelective(SystemTbl record);

    List<SystemTbl> selectByExampleWithRowbounds(SystemTblExample example, RowBounds rowBounds);

    List<SystemTbl> selectByExample(SystemTblExample example);

    SystemTbl selectByPrimaryKey(String sysCde);

    int updateByExampleSelective(@Param("record") SystemTbl record, @Param("example") SystemTblExample example);

    int updateByExample(@Param("record") SystemTbl record, @Param("example") SystemTblExample example);

    int updateByPrimaryKeySelective(SystemTbl record);

    int updateByPrimaryKey(SystemTbl record);
}