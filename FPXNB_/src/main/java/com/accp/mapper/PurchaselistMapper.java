package com.accp.mapper;

import com.accp.domain.Purchaselist;
import com.accp.domain.PurchaselistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaselistMapper {
    int countByExample(PurchaselistExample example);

    int deleteByExample(PurchaselistExample example);

    int deleteByPrimaryKey(Integer purchaselistid);

    int insert(Purchaselist record);

    int insertSelective(Purchaselist record);

    List<Purchaselist> selectByExample(PurchaselistExample example);

    Purchaselist selectByPrimaryKey(Integer purchaselistid);

    int updateByExampleSelective(@Param("record") Purchaselist record, @Param("example") PurchaselistExample example);

    int updateByExample(@Param("record") Purchaselist record, @Param("example") PurchaselistExample example);

    int updateByPrimaryKeySelective(Purchaselist record);

    int updateByPrimaryKey(Purchaselist record);
}