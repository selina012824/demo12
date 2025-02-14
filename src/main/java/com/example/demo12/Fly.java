package com.example.demo12;

//介面

//介面本質是抽象的物件，所以在public後面可以加上關鍵字abstract，但基本都不加
//介面可以繼承多個介面
public interface Fly extends F1{
	
	//介面中不會有建構方法
	
	//一般方法:要加上關鍵字:default，不強制重新定義
	//一般方法若沒有重新定義，則會被Airplain類別繼承(可以直接呼叫這裡的方法)
	public default void fly() {
		System.out.println("飛機準備起飛");
	}
    
	
	//抽象方法:定義用
	// 介面中定義的方法基本上都是抽象方法，但關鍵字abstract可不寫
	public void flying();
	
	
	//靜態(static)方法:一定要有實作內容，因為沒辦法被重新定義
	public static void flying1() {
		System.out.println("static!!");
	}

}
