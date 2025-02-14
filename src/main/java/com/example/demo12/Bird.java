package com.example.demo12;

public class Bird extends Animal{
	

    
    @Override //重新定義父類別的的註釋
    public void eat() {
   	 System.out.println("鳥兒正在吃~~");
    }
    
    @Override
    public void sleep() {
   	 System.out.println("鳥兒正在睡~~");
    }
    
    public void flying() {
   	 System.out.println("鳥兒正在飛~~");
    }
    
    public Bird() {
    	super();//這邊呼叫的是animal的建構方法
    	System.out.println("呼叫Bird的建構方法");
    }
    
    //因為屬性name是在父類別Animal上，所以要設定name的值就要去呼叫父類別的建構方法(將參數賦予給name)
    public Bird(String name) {
    	super(name);
    }
    
    public Bird(String name, int age) {
    	super.age=age;
    }
}
