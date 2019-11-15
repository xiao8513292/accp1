package com.accp.mapper;

import com.accp.domain.Rechargeinfo;
import com.accp.domain.RechargeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeinfoMapper {
    int countByExample(RechargeinfoExample example);

    int deleteByExample(RechargeinfoExample example);

    int deleteByPrimaryKey(Integer rechargeinfoid);

    int insert(Rechargeinfo record);

    int insertSelective(Rechargeinfo record);

    List<Rechargeinfo> selectByExample(RechargeinfoExample example);

    Rechargeinfo selectByPrimaryKey(Integer rechargeinfoid);

    int updateByExampleSelective(@Param("record") Rechargeinfo record, @Param("example") RechargeinfoExample example);

    int updateByExample(@Param("record") Rechargeinfo record, @Param("example") RechargeinfoExample example);

    int updateByPrimaryKeySelective(Rechargeinfo record);

    int updateByPrimaryKey(Rechargeinfo record);
}