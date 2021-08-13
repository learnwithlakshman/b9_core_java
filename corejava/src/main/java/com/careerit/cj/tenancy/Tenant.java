package com.careerit.cj.tenancy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tenant {
	private String tenantName;
	private String username;
	private String password;
	private String dburl;
	private String database;
}
