package com.accp.mapper;

import com.accp.domain.Storelist;
import com.accp.domain.StorelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorelistMapper {
    int countByExample(StorelistExample example);

    int deleteByExample(StorelistExample example);

    int deleteByPrimaryKey(Integer storeid);

    int insert(Storelist record);

    int insertSelective(Storelist record);

    List<Storelist> selectByExample(StorelistExample example);

    Storelist selectByPrimaryKey(Integer storeid);

    int updateByExampleSelective(@Param("record") Storelist record, @Param("example") StorelistExample example);

    int updateByExample(@Param("record") Storelist record, @Param("example") StorelistExample example);

    int updateByPrimaryKeySelective(Storelist record);

    int updateByPrimaryKey(Storelist record);
}