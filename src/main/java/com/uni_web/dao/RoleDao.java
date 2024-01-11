package com.uni_web.dao;

import com.uni_web.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
