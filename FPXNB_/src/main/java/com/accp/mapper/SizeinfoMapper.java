package com.accp.mapper;

import com.accp.domain.Sizeinfo;
import com.accp.domain.SizeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SizeinfoMapper {
    int countByExample(SizeinfoExample example);

    int deleteByExample(SizeinfoExample example);

    int deleteByPrimaryKey(Integer sizeid);

    int insert(Sizeinfo record);

    int insertSelective(Sizeinfo record);

    List<Sizeinfo> selectByExample(SizeinfoExample example);

    Sizeinfo selectByPrimaryKey(Integer sizeid);

    int updateByExampleSelective(@Param("record") Sizeinfo record, @Param("example") SizeinfoExample example);

    int updateByExample(@Param("record") Sizeinfo record, @Param("example") SizeinfoExample example);

    int updateByPrimaryKeySelective(Sizeinfo record);

    int updateByPrimaryKey(Sizeinfo record);
}