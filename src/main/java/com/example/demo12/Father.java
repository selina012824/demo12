package com.example.demo12;

public class Father {
	
	protected String name;
	
	public Father() {
		super();
	}
	
	public Father(String name) {
		this.name=name;
	}
	
	
	public void walk() {
	System.out.printf("%s is walking!",name); 
	}

}
