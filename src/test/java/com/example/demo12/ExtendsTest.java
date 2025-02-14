package com.example.demo12;

import org.junit.Test;

public class ExtendsTest {
	@Test
	public void test() {
		Animal ani = new Animal();

		ani.setName("Ani");
		System.out.println(ani.getName());

		Bird bird = new Bird();

		// 因為Bird繼承Animal，所以Animal 中的屬性 name 和 方法 getName/setName 方法 Bird 都可以使用
		bird.setName("Bird");
		System.out.println(bird.getName());

		// 呼叫方法
		ani.eat();
		ani.sleep();
		bird.eat();
		bird.sleep();
	}

	@Test
	public void test1() {
		Animal ani = new Animal("Ani");
		Bird bird = new Bird("Bird");
		System.out.println("");
	}

	@Test
	public void test2() {
		Father fa = new Father("Father");

		Son son = new Son("son");
		son.playBall();
		
		// new 出的實例(instance)是子類別，可以用父類別接
		Father son1 = new Son("son");
		//son1.play()會出錯，因為已用父類別去承接就無法使用子自帶的方法
		
		//即便用父類別去承接，本質上還是子類別，依然會執行子類別的實作內容
		son1.walk();

	}
}
