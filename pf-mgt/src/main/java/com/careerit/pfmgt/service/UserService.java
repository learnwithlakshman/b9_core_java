package com.careerit.pfmgt.service;

import com.careerit.pfmgt.domain.AppUser;

public interface UserService {

	
		public Long register(AppUser appUser);
		public boolean update(AppUser appUser);
		public boolean deleteUser(Long id);
		public AppUser getAppUser(Long id);
}
