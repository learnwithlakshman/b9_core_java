package com.careerit.iplstat.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.iplstat.user.domain.AppUser;
import com.careerit.iplstat.user.service.AppUserService;

@RestController
@RequestMapping("api/user")
public class UserController {

		@Autowired
		private AppUserService appUserService;
	
		@PostMapping("/register")
		public AppUser register(@RequestBody AppUser appUser) {
			return appUserService.register(appUser);
		}
		@PutMapping("/updateuser")
		public AppUser updateUser(@RequestBody AppUser appUser) {
			return appUserService.updateUser(appUser);
		}
		@DeleteMapping("/{id}")
		public boolean deleteUser(@PathVariable("id")long id) {
			return appUserService.deleteUser(id);
		}
		
		@GetMapping("/{id}")
		public AppUser getUser(@PathVariable("id")long id) {
			return appUserService.getUser(id);
		}
}
