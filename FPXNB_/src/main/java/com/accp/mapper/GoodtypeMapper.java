package com.accp.mapper;

import com.accp.domain.Goodtype;
import com.accp.domain.GoodtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodtypeMapper {
    int countByExample(GoodtypeExample example);

    int deleteByExample(GoodtypeExample example);

    int deleteByPrimaryKey(Integer goodtypeid);

    int insert(Goodtype record);

    int insertSelective(Goodtype record);

    List<Goodtype> selectByExample(GoodtypeExample example);

    Goodtype selectByPrimaryKey(Integer goodtypeid);

    int updateByExampleSelective(@Param("record") Goodtype record, @Param("example") GoodtypeExample example);

    int updateByExample(@Param("record") Goodtype record, @Param("example") GoodtypeExample example);

    int updateByPrimaryKeySelective(Goodtype record);

    int updateByPrimaryKey(Goodtype record);
}