package com.accp.mapper;

import com.accp.domain.Shoppingcartinfo;
import com.accp.domain.ShoppingcartinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingcartinfoMapper {
    int countByExample(ShoppingcartinfoExample example);

    int deleteByExample(ShoppingcartinfoExample example);

    int deleteByPrimaryKey(Integer shoppingcartid);

    int insert(Shoppingcartinfo record);

    int insertSelective(Shoppingcartinfo record);

    List<Shoppingcartinfo> selectByExample(ShoppingcartinfoExample example);

    Shoppingcartinfo selectByPrimaryKey(Integer shoppingcartid);

    int updateByExampleSelective(@Param("record") Shoppingcartinfo record, @Param("example") ShoppingcartinfoExample example);

    int updateByExample(@Param("record") Shoppingcartinfo record, @Param("example") ShoppingcartinfoExample example);

    int updateByPrimaryKeySelective(Shoppingcartinfo record);

    int updateByPrimaryKey(Shoppingcartinfo record);
}