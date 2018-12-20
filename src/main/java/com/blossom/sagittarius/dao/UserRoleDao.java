package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.security.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRoleDao {

    UserRole insertById(@Param("userId")Integer userid, @Param("roleId") Integer roleid);
}
