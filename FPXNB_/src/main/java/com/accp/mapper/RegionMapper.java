package com.accp.mapper;

import com.accp.domain.Region;
import com.accp.domain.RegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    int countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int deleteByPrimaryKey(Integer regionid);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);

    Region selectByPrimaryKey(Integer regionid);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}