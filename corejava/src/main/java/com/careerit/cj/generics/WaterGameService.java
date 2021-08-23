package com.careerit.cj.generics;

public class WaterGameService implements GameService{

	@Override
	public String gameName() {
		return this.getClass().getSimpleName();
	}

}
