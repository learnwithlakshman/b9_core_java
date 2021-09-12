package com.careerit.pfmgt.dao;

import com.careerit.pfmgt.domain.AppUser;

public interface UserDao {
	public Long insertUser(AppUser appUser);

	public boolean update(AppUser appUser);

	public boolean deleteUser(Long id);

	public AppUser selectUser(Long id);
	
}
