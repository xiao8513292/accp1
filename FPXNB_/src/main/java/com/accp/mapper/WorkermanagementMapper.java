package com.accp.mapper;

import com.accp.domain.Workermanagement;
import com.accp.domain.WorkermanagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkermanagementMapper {
    int countByExample(WorkermanagementExample example);

    int deleteByExample(WorkermanagementExample example);

    int deleteByPrimaryKey(Integer workerid);

    int insert(Workermanagement record);

    int insertSelective(Workermanagement record);

    List<Workermanagement> selectByExample(WorkermanagementExample example);

    Workermanagement selectByPrimaryKey(Integer workerid);

    int updateByExampleSelective(@Param("record") Workermanagement record, @Param("example") WorkermanagementExample example);

    int updateByExample(@Param("record") Workermanagement record, @Param("example") WorkermanagementExample example);

    int updateByPrimaryKeySelective(Workermanagement record);

    int updateByPrimaryKey(Workermanagement record);
}