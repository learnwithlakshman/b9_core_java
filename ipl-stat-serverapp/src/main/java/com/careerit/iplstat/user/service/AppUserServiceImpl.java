package com.careerit.iplstat.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.careerit.iplstat.user.domain.AppUser;
import com.careerit.iplstat.user.repo.AppUserRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	private AppUserRepo appUserRepo;
	
	@Override
	@Transactional
	public AppUser register(AppUser appUser) {
		Assert.notNull(appUser,"App user can't be null");
		Assert.hasText(appUser.getUsername(), "User name can't be null or empty");
		
		// Duplicate username
		// Password encode // BcrptEncoder
		appUserRepo.save(appUser);
		log.info("User is registred with id :{}",appUser.getId());
		
		return appUser;
	}

	@Override
	public AppUser getUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser updateUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
