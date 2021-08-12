package com.careerit.cj.collections.login;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserProfile {

		private String username;
		private String password;
		private String email;
}
