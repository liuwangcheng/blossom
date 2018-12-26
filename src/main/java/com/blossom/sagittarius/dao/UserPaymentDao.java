package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.UserPayment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserPaymentDao {

    UserPayment findById(@Param("Id") Long id);

    void removeById(@Param("Id") Long id);

}
