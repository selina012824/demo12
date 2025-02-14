package com.example.demo12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class collectionTest {
	
	@Test
	public void arrayTest() {
		//new int[5]:數字5代表陣列的長度
		int[] a= new int[3];//長度固定
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
	}
	
	@Test
	public void listTest() {
		long x=20; //長整數預設值0
		Long y =20L; //長整數類別資料型態，預設值是null
		
		//類別名稱 變數 =new 類別名稱();小括號裡是否要放東西看狀況
		Scanner scan =new Scanner(System.in);
		
		//List宣告方式-List<類別型態的資料格式> 變數名稱 =new ArrayList<>();
		//List 是interface型態，不能new
		List<Integer> list =new ArrayList<>();//長度是可變的
       
		//新增資料到list中
		list.add(10);
		list.add(20);
		list.add(30);
		
		//取資料;使用get(index)
		System.out.println(list.get(0));
		
		//foreach
		for(int item: list) {
			System.out.println(item);
		}
	}
	
	@Test
	public void listTest1() {
		//接收的資料型態是介面:只能使用介面(List)的方法，無法使用類別自有的方法
		List<String> strList = new LinkedList<>(List.of("A","B","C","D"));
		
		//因為資料型態是介面，沒有addFirst方法
		//新增元素到第一個
		strList.add(0,"E");
		
		//新增元素到最後一個
		strList.add(strList.size(),"E");
		System.out.println(strList);
		System.out.println(strList.size());
		
		//接收的資料型態是類別本身:可以使用類別自有的方法
		LinkedList<String> strList1 = new LinkedList<>(List.of("A","B","C","D"));
		
		//新增元素到第一個
		strList1.addFirst("E");
		//新增元素到最後一個
		strList1.addLast("E");
		System.out.println(strList1);
	}
  
	@Test
	public void listTestPractice1() {
		int x =56;
		List<Integer> list =new ArrayList<>();
		for(int i=1; i<=x; i++) {
			if(x%i==0) {
				list.add(i);
				System.out.printf("56因數有:%2d\n",i);
			}
		}
		System.out.print("56因數有:"+list);
	}
	
	@Test
	public void whiletest() {
		int chicken=0;
		int rabbit=35;
		int i;
		
		//弄成無窮迴圈
		while(true) {
			if(2*chicken+4*rabbit==100 && chicken+rabbit==35) {
				System.out.printf("雞有 %2d 隻,兔子有 %2d 隻",chicken,rabbit);
				break;
			}
			chicken++;
			rabbit--;
		}
	}
	
	@Test
	public void guessnumber() {
		//生成一個亂數
		//Math.random()*((區間上限值-區間下限值+1)+區間下限值)
		double ran = Math.random()*((99-1+1)+1);
		
		//強制轉型
		int random=(int)ran;
		System.out.println(random);
		System.out.printf("請在1~99間猜一個數字");
		Scanner scan=new Scanner(System.in);
		int guessN=scan.nextInt();
		int lower=1;
		int topper=99;
		
		while(true) {
		
		if( guessN > random && topper>guessN) {
			System.out.printf("請在%2d~%2d間猜一個數字，輸入:",lower,guessN);
			topper=guessN;
		 }else if(guessN < random && lower<guessN) {
			 System.out.printf("請在%2d~%2d間猜一個數字，輸入:",guessN,topper);
			 lower=guessN;
		 }else if(guessN==random) {
			 System.out.printf("你答對了");
			 break;
		 }else {
			 System.out.printf("請在%2d~%2d間猜數字，輸入:",lower,topper);
		 }
		 guessN=scan.nextInt();
		}
			
		}
	
	@Test
	public void setTest() {
		//宣告List的格式，因為List是介面(interface)，無法透過new來產生
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		
		//List的特性:多個相同元素會被保留
		System.out.println(list);
		
		//宣告Set的格式
		Set<String> set = new HashSet<>();
		//使用add方法來新增元素到set中
		set.add("A");
		set.add("B");
		set.add("A");
		set.add("C");
		//Set的特性:相同元素只有一個會被保留
		System.out.println(set);
		
		//===============================
		for(String item:list) {
			System.out.println(item);
		}
		
		//forEach:lambda
		list.forEach(item->{
			System.out.println(item);
		});
		
		set.forEach(item->{
			System.out.println(item);
		});
	}
	
	@Test
	public void setTest1() {
		Random ran = new Random();
		TreeSet<Integer> set = new TreeSet<>();
		
		int number;
		
		//產生5個1~10 不重覆的數字
		while(set.size()<5) {		
		number = ran.nextInt(1,11);
		set.add(number);	
		}
		
		System.out.println("min:"+set.getFirst());
		System.out.println("max:"+set.getLast());
		System.out.println(set);
		System.out.println(set.reversed());
	}
	
	@Test
	public void MapTest() {
		Map<String,Integer> map = new HashMap<>();
		map.put("beef", 200);
		map.put("pork", 150);
		map.put("chicken", 180);
		map.put("fish", 220);
		
		//forEach:對象轉成entrySet，單一元素(item)就會包含了 key 和 value
		for(Entry<String, Integer> item : map.entrySet()) {
			System.out.println(item.getKey()+":"+item.getValue());
		}
		
		//forEach:對象轉成keySet，單一元素(item)只包含了 key 
		for(String item: map.keySet()) {
			//透過get(key)來取得map中對應的value
			int value = map.get(item);
			System.out.println(item+":"+value);
		}
		
		//forEach:lambda
		map.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		
	}
	
	@Test
	public void SortTest() {
		List<Integer> list = new ArrayList<>(List.of(3,5,2,9,7,8));
		
		list.sort(new Comparator<Integer>() {
			//由小排到大:o1.compareTo(o2) 或者o1-o2
			//由大排到小:o2.compareTo(o1) 或者o2-o1
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		
		//Lambda寫法
		list.sort((o1,o2)->{
			return o2.compareTo(o1);
		});
		System.out.println(list);	
	}
	
}
