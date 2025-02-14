package com.example.demo12;

public class Circle extends Shape{
   
	//重新定義Shape中的方法
	@Override
	public void draw() {
		System.out.println("畫圈圈");
	
	}

	//draw1抽象方法一定要重新定義
	@Override
	public void draw1() {
		// TODO Auto-generated method stub
		
	}
  
	
}
