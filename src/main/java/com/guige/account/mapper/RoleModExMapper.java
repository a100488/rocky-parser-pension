package com.guige.account.mapper;


import com.guige.account.pojo.entity.RoleMod;

import java.util.List;

public interface RoleModExMapper {
	
	List<RoleMod> findRoleMods(RoleMod roleMod);
  
}