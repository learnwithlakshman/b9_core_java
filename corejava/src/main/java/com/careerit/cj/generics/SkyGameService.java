package com.careerit.cj.generics;

public class SkyGameService implements GameService {

	@Override
	public String gameName() {
		return this.getClass().getSimpleName();
	}

}
