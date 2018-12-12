package com.blossom.sagittarius.domain.security;

import com.blossom.sagittarius.domain.BaseDO;

public class UserRole extends BaseDO {
	
	private Integer userId;
	
	private Integer roleId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
