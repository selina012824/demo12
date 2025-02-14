package com.example.demo12;

import java.util.Scanner;

import org.junit.Test;

public class RegexTest {

	// 正規表達式
	@Test
	public void test() {
		String str = "0912-345-678";

		// \(跳脫符號)在java中屬於特別的符號，無法單獨存在。讓下個有意義符號變成一般字串
		// \d在正規表達式中表示0~9的數字。
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";

		// 判斷字串是否匹配規則(pattern)
		boolean boo = str.matches(pattern);
		System.out.println(boo);

		// 使用大括號表示重覆出現的規則
		pattern = "\\d{4}(-\\d{3})-\\d{3}";
		boolean boo1 = str.matches(pattern);
		System.out.println(boo1);
	}

	@Test
	public void test1() {
		// 小括號在正規表達式是有意義的分組符號
		String str = "(07)7654-321";
		String pattern = "\\(\\d{2}\\)\\d{4}-\\d{3}";
		boolean boo = str.matches(pattern);
		System.out.println(boo);
	}

	// 管道
	@Test
	public void test2() {
		// 規則1
		String pattern1 = "\\(\\d{2}\\)-\\d{8}";
		// 規則2
		String pattern2 = "\\d{2}-\\d{8}";

		// 使用管道與小括號將2個規則合併
		String pattern = "(\\(\\d{2}\\)|\\d{2})-\\d{8}";
		
		String str1 = "(02)-12345678";
		String str2 = "02-12345678";
		System.out.println(str1.matches(pattern));
		System.out.println(str2.matches(pattern));
	
	}
	
	@Test
	public void test3() {
		//減號(-) 表示連續區間，使用連續區間一定要用中括號括弧起來
		String pattern = "[A-Za-z]";
		
		//^放在中括號的開頭，表示不包含。一定要放開頭才會生效
		String pattern1 = "[^A-Z]";//不能是A-Z開頭
		
		//字母A-Z開頭，b結尾
		String pattern2 = "^[A-Z]b$";
	}
	
	@Test
	public void practice() {
		String pattern1 = "\\(\\d{2}\\)\\d{7,8}";
		String pattern2 = "\\d{2}-\\d{7,8}";
		
		String pattern = "(\\(\\d{2}\\)|\\d{2}-)\\d{7,8}";
		
		String str1 = "(02)12345678";
		String str2 = "02-1234567";
		
		System.out.println(str1.matches(pattern));
		System.out.println(str2.matches(pattern));
		
	}
	
	@Test
	public void practice1() {
		String pattern = "0\\d{1,3}-\\d{7,8}";
		String str = "02-12345678";
		
		System.out.println(str.matches(pattern));
	}
	
	@Test
	public void practice2() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("請輸入身分證字號");
		String ID = scan.next();
		
		//身分證字號檢查
		String pattern = "[A-Za-z](1|2)\\d{8}";
		
		System.out.println(ID.matches(pattern));
		
		String pattern1 = "[A-Za-z&&[^ABDEFHabdefh]](1|2)\\d{8}";
		System.out.println(ID.matches(pattern1));
	}
	
}
