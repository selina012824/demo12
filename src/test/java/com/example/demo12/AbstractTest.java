package com.example.demo12;

import org.junit.Test;

public class AbstractTest {

	  @Test
	  public void test() {
		  //Shape是抽象類別，無法new
	  }
	  
	  @Test
	  public void test1() {
		  //Fly是介面，所以也是抽象物件，無法new
		  Airplain airplain = new Airplain();
		  airplain.fly();
	  }
}
