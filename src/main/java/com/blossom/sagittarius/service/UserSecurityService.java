package com.blossom.sagittarius.service;


import com.blossom.sagittarius.dao.UserDao;
import com.blossom.sagittarius.domain.UserDO;
import com.blossom.sagittarius.domain.security.Authority;
import com.blossom.sagittarius.domain.security.UserPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserSecurityService implements UserDetailsService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserSecurityService.class);
	
	@Autowired
	private UserDao userDao;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserPrincipal userDetail = new UserPrincipal();
		UserDO userDO = null;
		if (username != null && username.length() > 0) {
			userDO = userDao.getByUsername(username);
		} else {
			logger.info("username is empty!");
		}
		userDetail.setUserDO(userDO);

		Set<Authority> authorities = new HashSet<>();
		userDetail.setAuthorities(authorities);
		return userDetail;
	}

}
