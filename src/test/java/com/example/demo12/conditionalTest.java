package com.example.demo12;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class conditionalTest {
	
	@Test
	public void ifTest() {
		Scanner scan=new Scanner(System.in);//宣告一個新的scanner
		System.out.println("請輸入一個數字:");
		
		int input = scan.nextInt();
		if(input>=20) {
			System.out.println("可以投票");
		}else { 
			System.out.println("不可以投票");
		}
	}
	//=====================
		
	@Test
	public void ifTest2() {
		double price;
		int ticket = 100;
		int age ;
		Scanner scan=new Scanner(System.in);
			
		System.out.println("計算票價");
		System.out.println("請輸入年齡:");
		age=scan.nextInt();
		
		if(age<=6 || age>=80) {
            price=ticket*0.2;
			System.out.println(price);
		}else if(age<=12 || 60<=age) {
			price=ticket*0.5;
			System.out.println(price);
		}else {
			price=ticket;
			System.out.println(price);
		}	
	}
	
	@Test
	public void switchTest() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入成績:");
		
		int score=scan.nextInt();
		switch(score/10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default: //以上都不滿足時
			System.out.println("E");
		}
	}
	
	@Test
	public void switchTest1() {
        String str="今天是星期天,";
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入天數:");
		int days=scan.nextInt();
        switch(days % 7) {
         case 0:
        	 System.out.println(str+days+"天後是星期天");
        	 
        	//另一種寫法
        	//%d 表示參數的佔位符號; \n用來換行
        	 System.out.printf("今天是星期天, %d 天後是星期天\n",days);
        	 break;
         case 1:
        	 System.out.println(str+days+"天後是星期一");
        	 break;
         case 2:
        	 System.out.println(str+days+"天後是星期二");
        	 break;
         case 3:
        	 System.out.println(str+days+"天後是星期三"); 
        	 break;
         case 4:
        	 System.out.println(str+days+"天後是星期四");
        	 break;
         case 5:
        	 System.out.println(str+days+"天後是星期五");
        	 break;
         case 6:
        	 System.out.println(str+days+"天後，是星期六");
        	 break;
        }
	}
	@Test
	public void switchTest2() {
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入今天是星期幾:");
		int today=scan.nextInt();
		
		System.out.println("請輸入天數:");
		int days=scan.nextInt();
        switch((today+days) % 7) {
         case 0:
        	 System.out.println("今天是星期"+today+","+days+"天後是星期天");
        	 break;
         case 1:
        	 System.out.println("今天是星期"+today+","+days+"天後是星期一");
        	 break;
         case 2:
        	 System.out.println("今天是星期"+today+","+days+"天後是星期二");
        	 break;
         case 3:
        	 System.out.println("今天是星期"+today+","+days+"天後是星期三");
        	 break;
         case 4:
        	 System.out.println("今天是星期"+today+","+days+"天後是星期四");
        	 break;
         case 5:
        	 System.out.println("今天是星期"+today+","+days+"天後是星期五");
        	 break;
         case 6:
        	 System.out.println("今天是星期"+today+","+days+"天後是星期六");
        	 break;
        }
	}
	@Test
	public void forlooptest() {
		//99乘法
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				 System.out.printf("%d*%d=%2d ",i,j,(i*j));
			}
			System.out.println();//換行用
		}
		
	}
	
	
 }


