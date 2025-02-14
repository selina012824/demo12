package com.example.demo12;

public abstract class Shape {
	
	//抽象，使用關鍵字abstract
	//不能建立物件(new)，
	//目的在定義方法，不寫實作
	
	//抽象類別可以包含一般方法與、建構方法與抽象方法
	
	//建構方法
	public Shape() {
		super();
	}
	
	
	//一般方法
	public void draw() {
		System.out.println("===========");
	}
	
	//抽象方法，不能有大括號
	//抽象方法只能存在於抽象類別中
	public abstract void draw1();

}
