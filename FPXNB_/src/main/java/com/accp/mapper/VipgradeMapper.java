package com.accp.mapper;

import com.accp.domain.Vipgrade;
import com.accp.domain.VipgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipgradeMapper {
    int countByExample(VipgradeExample example);

    int deleteByExample(VipgradeExample example);

    int deleteByPrimaryKey(Integer vipgradeid);

    int insert(Vipgrade record);

    int insertSelective(Vipgrade record);

    List<Vipgrade> selectByExample(VipgradeExample example);

    Vipgrade selectByPrimaryKey(Integer vipgradeid);

    int updateByExampleSelective(@Param("record") Vipgrade record, @Param("example") VipgradeExample example);

    int updateByExample(@Param("record") Vipgrade record, @Param("example") VipgradeExample example);

    int updateByPrimaryKeySelective(Vipgrade record);

    int updateByPrimaryKey(Vipgrade record);
}