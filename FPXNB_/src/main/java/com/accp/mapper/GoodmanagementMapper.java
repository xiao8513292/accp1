package com.accp.mapper;

import com.accp.domain.Goodmanagement;
import com.accp.domain.GoodmanagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodmanagementMapper {
    int countByExample(GoodmanagementExample example);

    int deleteByExample(GoodmanagementExample example);

    int deleteByPrimaryKey(Integer goodid);

    int insert(Goodmanagement record);

    int insertSelective(Goodmanagement record);

    List<Goodmanagement> selectByExample(GoodmanagementExample example);

    Goodmanagement selectByPrimaryKey(Integer goodid);

    int updateByExampleSelective(@Param("record") Goodmanagement record, @Param("example") GoodmanagementExample example);

    int updateByExample(@Param("record") Goodmanagement record, @Param("example") GoodmanagementExample example);

    int updateByPrimaryKeySelective(Goodmanagement record);

    int updateByPrimaryKey(Goodmanagement record);
}