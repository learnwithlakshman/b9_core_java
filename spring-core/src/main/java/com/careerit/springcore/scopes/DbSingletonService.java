package com.careerit.springcore.scopes;

public class DbSingletonService {

	private static DbSingletonService obj = null;

	private DbSingletonService() {

	}

	public DbSingletonService getInstance() {

		if (obj == null) {
			synchronized (DbSingletonService.class) {
				if (obj == null) {
					obj = new DbSingletonService();
				}
			}
		}
		return obj;
	}

}
