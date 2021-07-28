package com.careerit.cj.singleton;

public class IIBAndStaticBlock {
	
	private static int count = 0;

	static {
		System.out.println("Hello");
	}

	{
		System.out.println("IIB");
		count++;
	}
	public IIBAndStaticBlock() {
		System.out.println("0-args");
	}
	
	public IIBAndStaticBlock(String name) {
		System.out.println("1-args");
		
	}
	public IIBAndStaticBlock(String fname,String lname) {
		System.out.println("2-args");
		
	}
	
	public IIBAndStaticBlock(String fname,String lname,int version) {
		System.out.println("2-args");
		
	}

	public static void main(String[] args) {
		IIBAndStaticBlock obj1 = new IIBAndStaticBlock();
		System.out.println("Main");
		IIBAndStaticBlock obj2 = new IIBAndStaticBlock("Hello");
		IIBAndStaticBlock obj3 = new IIBAndStaticBlock("Demo");
		System.out.println(count);
	}

	static {
		System.out.println("Hello how are you?");
	}
}
