package com.accp.mapper;

import com.accp.domain.Shoppingcart;
import com.accp.domain.ShoppingcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingcartMapper {
    int countByExample(ShoppingcartExample example);

    int deleteByExample(ShoppingcartExample example);

    int deleteByPrimaryKey(Integer shoppingcartid);

    int insert(Shoppingcart record);

    int insertSelective(Shoppingcart record);

    List<Shoppingcart> selectByExample(ShoppingcartExample example);

    Shoppingcart selectByPrimaryKey(Integer shoppingcartid);

    int updateByExampleSelective(@Param("record") Shoppingcart record, @Param("example") ShoppingcartExample example);

    int updateByExample(@Param("record") Shoppingcart record, @Param("example") ShoppingcartExample example);

    int updateByPrimaryKeySelective(Shoppingcart record);

    int updateByPrimaryKey(Shoppingcart record);
}