package com.blossom.sagittarius.service.serviceImpl;

import com.blossom.sagittarius.dao.RoleDao;
import com.blossom.sagittarius.dao.UserDao;
import com.blossom.sagittarius.dao.UserRoleDao;
import com.blossom.sagittarius.domain.security.User;
import com.blossom.sagittarius.domain.security.UserRole;
import com.blossom.sagittarius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserRoleDao userRoleDao;


    @Override
    public User createUser(User user, Set<UserRole> userRoles) {
        User user1 = userDao.saveUser(user);
        for (UserRole userRole : userRoles) {
            userRoleDao.insertById(userRole.getUserId(), userRole.getRoleId());
        }

        return user1;
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

   @Override
    public User save(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }


}
