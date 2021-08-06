package com.careerit.cj.oop.interfaceandabstractclass;

interface One {

	void m1();
}

interface Two {

	void m2();
}

interface Three extends One, Two {
	
	void m3();
	
}



class B1 implements One, Two, Three {
	public void m1() {

	}


	public void m2() {

	}

	public void m3() {

	}
}

public class InterfaceManager {

}
