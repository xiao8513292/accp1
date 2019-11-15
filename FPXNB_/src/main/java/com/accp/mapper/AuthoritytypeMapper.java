package com.accp.mapper;

import com.accp.domain.Authoritytype;
import com.accp.domain.AuthoritytypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthoritytypeMapper {
    int countByExample(AuthoritytypeExample example);

    int deleteByExample(AuthoritytypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Authoritytype record);

    int insertSelective(Authoritytype record);

    List<Authoritytype> selectByExample(AuthoritytypeExample example);

    Authoritytype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Authoritytype record, @Param("example") AuthoritytypeExample example);

    int updateByExample(@Param("record") Authoritytype record, @Param("example") AuthoritytypeExample example);

    int updateByPrimaryKeySelective(Authoritytype record);

    int updateByPrimaryKey(Authoritytype record);
}