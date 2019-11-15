package com.accp.mapper;

import com.accp.domain.Suppliers;
import com.accp.domain.SuppliersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppliersMapper {
    int countByExample(SuppliersExample example);

    int deleteByExample(SuppliersExample example);

    int deleteByPrimaryKey(Integer suppliersid);

    int insert(Suppliers record);

    int insertSelective(Suppliers record);

    List<Suppliers> selectByExample(SuppliersExample example);

    Suppliers selectByPrimaryKey(Integer suppliersid);

    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByPrimaryKeySelective(Suppliers record);

    int updateByPrimaryKey(Suppliers record);
}