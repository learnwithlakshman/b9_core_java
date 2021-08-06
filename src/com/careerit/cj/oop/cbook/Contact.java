package com.careerit.cj.oop.cbook;

import java.util.concurrent.ThreadLocalRandom;

public class Contact {
	
		private Long cid;
		private String name;
		private String email;
		private String mobile;
		
		public Contact( String name, String email, String mobile) {
			this.cid = ThreadLocalRandom.current().nextLong(10001, 100000);
			this.name = name;
			this.email = email;
			this.mobile = mobile;
		}
		public Long getCid() {
			return cid;
		}
		public void setCid(Long cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		
		

}
