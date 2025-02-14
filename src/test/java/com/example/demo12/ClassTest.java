package com.example.demo12;

import org.junit.Test;

public class ClassTest {
	@Test
	public void dogTest() {
		// 宣告: 建立 Dog 類別(將 Dog 實例化)
		Dog dog = new Dog("ABC", "yellow", 2);
		// 設定新物件的屬性值
		dog.setName("ABC");
		dog.setColor("yellow");
		dog.setAge(2);
		System.out.println(dog); // 印出dog記憶體位址
		
		// 取出物件 Dog 對應的屬性值
		System.out.printf("我養了一隻 %s 顏色的柴犬，姓名叫 %s， 今年 %d 歲\n", //
				dog.getColor(), dog.getName(), dog.getAge());
		String str = dog.barking();
		System.out.println(str);
		System.out.println("==================");
		Dog dogA = new Dog();
		Dog dogB = new Dog();
		Dog dogC = new Dog();
		Dog dogD = dogB;
		System.out.println(dogA == dogB); // false
		System.out.println(dogB == dogC); // false
		System.out.println(dogB == dogD); // true
	}
	
	@Test
	public void test() {
		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
			return; // 程式執行到這行時，會跳出整個 test 方法，不再繼續往下執行
		}
		System.out.println("=================");
	}
	
	@Test
	public void test1() {
		String str = "ABC";
		System.out.println(str);
		System.out.println("ABC");
		System.out.println(str.equals("ABC"));
		
		System.out.println("===============");
		Dog dog = new Dog();
		System.out.println(dog);
	}
	
	@Test
	public void tBankTest() {
		TaipeiBank tBank = new TaipeiBank();
		int balance = tBank.save(-1000);
		System.out.println("帳戶餘額: " + balance);
		
	}
	

}
