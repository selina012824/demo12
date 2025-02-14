package com.example.demo12;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo12ApplicationTests {

	@Test
	void contextLoads() {
	}

	

//==================================================
@Test
public void test() {
	int a=5;
	System.out.println("a:"+a);
	
	int b=a++*10; //運算子放變數後面，先執行運算式再執行a++.(b=a*10;a=a+1)
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	
	int c=++b*5; //運算子放變數前面，先執行b++再執行運算式.(b=b+1;c=b*5)
	System.out.println("b:"+b);
	System.out.println("c:"+c);
 }
}