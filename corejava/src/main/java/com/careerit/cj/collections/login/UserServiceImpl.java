package com.careerit.cj.collections.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

	private List<UserProfile> userList;
	private Map<String, UserProfile> userMap;

	public UserServiceImpl() {
		userList = getInitUsers();
		userMap = new HashMap<>();

		for (UserProfile userProfile : userList) {
			userMap.put(userProfile.getEmail(), userProfile);
		}

	}

	@Override
	public UserProfile login(String email, String password) {
		// input validation

		UserProfile user = userMap.get(email);

		if (user != null) {
			if (user.getPassword().equals(password)) {
				return user;
			}
		}

		throw new IllegalArgumentException("Invalid email or password");
	}

	private List<UserProfile> getInitUsers() {
		List<UserProfile> userList = new ArrayList<>();
		userList.add(UserProfile.builder().username("Krish").email("krish@gmail.com").password("krish@123").build());
		userList.add(UserProfile.builder().username("Manoj").email("manoj@gmail.com").password("Manoj@123").build());
		userList.add(UserProfile.builder().username("Rajesh").email("rajesh@gmail.com").password("Rajesh@123").build());
		userList.add(UserProfile.builder().username("Jayesh").email("jayesh@gmail.com").password("Jayesh@123").build());
		userList.add(UserProfile.builder().username("Suresh").email("suresh@gmail.com").password("Suresh@123").build());
		userList.add(UserProfile.builder().username("Sai").email("sai@gmail.com").password("Sai@123").build());
		userList.add(UserProfile.builder().username("Tanvi").email("tanvi@gmail.com").password("Tanvi@123").build());
		return userList;
	}

}
