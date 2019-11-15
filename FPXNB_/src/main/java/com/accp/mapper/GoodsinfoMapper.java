package com.accp.mapper;

import com.accp.domain.Goodsinfo;
import com.accp.domain.GoodsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsinfoMapper {
    int countByExample(GoodsinfoExample example);

    int deleteByExample(GoodsinfoExample example);

    int deleteByPrimaryKey(Integer goodid);

    int insert(Goodsinfo record);

    int insertSelective(Goodsinfo record);

    List<Goodsinfo> selectByExample(GoodsinfoExample example);

    Goodsinfo selectByPrimaryKey(Integer goodid);

    int updateByExampleSelective(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByExample(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByPrimaryKeySelective(Goodsinfo record);

    int updateByPrimaryKey(Goodsinfo record);
}