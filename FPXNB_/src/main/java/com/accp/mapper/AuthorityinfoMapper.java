package com.accp.mapper;

import com.accp.domain.Authorityinfo;
import com.accp.domain.AuthorityinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityinfoMapper {
    int countByExample(AuthorityinfoExample example);

    int deleteByExample(AuthorityinfoExample example);

    int deleteByPrimaryKey(Integer infoid);

    int insert(Authorityinfo record);

    int insertSelective(Authorityinfo record);

    List<Authorityinfo> selectByExample(AuthorityinfoExample example);

    Authorityinfo selectByPrimaryKey(Integer infoid);

    int updateByExampleSelective(@Param("record") Authorityinfo record, @Param("example") AuthorityinfoExample example);

    int updateByExample(@Param("record") Authorityinfo record, @Param("example") AuthorityinfoExample example);

    int updateByPrimaryKeySelective(Authorityinfo record);

    int updateByPrimaryKey(Authorityinfo record);
}