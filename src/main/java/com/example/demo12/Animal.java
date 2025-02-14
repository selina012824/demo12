package com.example.demo12;

public class Animal {
  
	private String name;
	
	protected int age;
	
	//屬性 name的存取方法
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
    public Animal() {
    	super();
    	System.out.println("呼叫Animal的建構方法");
    }
    
    public Animal(String name) {
    	super();
    	this.name=name;
    }
    
    public Animal(String name,int age) {
    	super();
    	this.name=name;
    	this.age=age;
    }
	
	public void eat() {
	    System.out.println("正在吃");
	    
	}
	
	public void sleep() {
	    System.out.println("正在睡");
	    
	}
	
	
}
