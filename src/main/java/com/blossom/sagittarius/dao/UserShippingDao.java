package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.UserShipping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserShippingDao {

    UserShipping findById(@Param("Id") Long id);

    void removeById(@Param("Id") Long id);

}
