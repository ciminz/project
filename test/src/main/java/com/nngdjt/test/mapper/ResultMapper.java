package com.nngdjt.test.mapper;

import com.nngdjt.test.entity.Result;
import com.nngdjt.test.entity.ResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ResultMapper {
    int countByExample(ResultExample example);

    int deleteByExample(ResultExample example);

    int deleteByPrimaryKey(String recId);

    int insert(Result record);

    int insertSelective(Result record);

    List<Result> selectByExampleWithRowbounds(ResultExample example, RowBounds rowBounds);

    List<Result> selectByExample(ResultExample example);

    Result selectByPrimaryKey(String recId);

    int updateByExampleSelective(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByExample(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKey(Result record);
}