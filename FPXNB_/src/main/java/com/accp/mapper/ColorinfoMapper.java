package com.accp.mapper;

import com.accp.domain.Colorinfo;
import com.accp.domain.ColorinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColorinfoMapper {
    int countByExample(ColorinfoExample example);

    int deleteByExample(ColorinfoExample example);

    int deleteByPrimaryKey(Integer colorid);

    int insert(Colorinfo record);

    int insertSelective(Colorinfo record);

    List<Colorinfo> selectByExample(ColorinfoExample example);

    Colorinfo selectByPrimaryKey(Integer colorid);

    int updateByExampleSelective(@Param("record") Colorinfo record, @Param("example") ColorinfoExample example);

    int updateByExample(@Param("record") Colorinfo record, @Param("example") ColorinfoExample example);

    int updateByPrimaryKeySelective(Colorinfo record);

    int updateByPrimaryKey(Colorinfo record);
}