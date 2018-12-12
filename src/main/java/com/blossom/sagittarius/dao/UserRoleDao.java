package com.blossom.sagittarius.dao;

import com.blossom.sagittarius.domain.User;
import com.blossom.sagittarius.domain.security.UserRole;

public interface UserRoleDao {

    UserRole insertById(Integer userid,Integer roleid);
}
