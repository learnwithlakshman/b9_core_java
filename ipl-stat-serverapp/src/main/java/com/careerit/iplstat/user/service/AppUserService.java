package com.careerit.iplstat.user.service;

import com.careerit.iplstat.user.domain.AppUser;

public interface AppUserService {

	AppUser register(AppUser appUser);

	AppUser getUser(Long id);

	AppUser updateUser(AppUser appUser);

	boolean deleteUser(Long id);

}
