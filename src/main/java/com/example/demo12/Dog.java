package com.example.demo12;

public class Dog {
	// 屬性(特徵/特性)宣告: 可被存取的權限(private) 資料型態(String) 變數名稱(name)	
			// 屬性的被存取權限通常都是設定成 private(只專屬於 Dog 這個類別)
			// private String name = "LaLa"； 宣告的屬性後面有用等號賦值，表示給定初始值
			// 若沒有等號給定初始值的話，就會是該資料型態的預設值
			private String name = "LaLa"; // String 是類別(class)，預設值是 null	
			
			private String color;
			
			private int age; // int 的預設值是 0
			
			// 建立建構方法
			// 1. 沒有回傳資料型態 2. 方法名稱一定是類別名稱 
			// 3. 預設建構方法可以不用建立，但只要有帶有參數的建構方法存在時，預設建構方法就一定要建立
			// 建立預設(沒有參數)建構方法
			public Dog() {
				super();
			}
			// 帶有參數的建構方法(小括號中的參數數量可依照需求)
			// 1. 實作內容與 set屬性方法完全一樣 2. 可節省程式碼行數
			public Dog(String name, String color, int age) {
				super();
				this.name = name;
				this.color = color;
				this.age = age;
			}

			public Dog(String name, String color) {
				super();
				this.name = name;
				this.color = color;
			}
			
			public Dog(String name) {
				super();
				this.name = name;
			}
			
			public Dog(int age) {
				super();
				this.age = age;
			}
			// 建立私有屬性的存(set)取(get)方法，存取方法也是一般方法
			public String getName() {
				return name;
			}

			// String 是參數的資料型態，name 是參數的名稱(可自定義，但請取有意義的名稱)
			public void setName(String name) {
				this.name = name;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}
			
			// 定義一般方法(方法的宣告):　
			// 可被存取的權限(public) 該方法的回傳值的資料型態(void，不回傳任何值) 方法名稱(barking，名稱自定義)
			// 小括號(裡面放的是參數，0~多個) 大括號(實作內容)
			public String barking() {
				System.out.println("汪汪叫~~~");
				return "汪汪叫~~~";
			}
			
			public void set(int value, String... strA) {
				for(String str : strA) {
					System.out.println(str);
				}		
			}
			
			public void set(int value) {
					
			}
			
			public void set(String name) {
				
			}

}
