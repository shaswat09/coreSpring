package com.abc;

public class ChildA implements ParentInterface{

	@Override
	public void sum(int a, int b) {
		System.out.println("ChildA"+a+b);
		
	}
	
	private static void letsSee(){
		System.out.println("Static method called");
	}

}
