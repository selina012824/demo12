package com.example.demo12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;



public class StringTest {
	
	@Test
	public void stringtest() {
		
		//計算字串長度str.length()
		String str ="";
		String str1 ="  ";//空白字串有算長度
		String str2 ="abc";
		System.out.println("str1的長度為:"+str1.length());
		
		//判斷是否為空字串
		//isEmpty():判斷長度是否0
		//isBlank():判斷長度是否0，或至少包含一個非空白字串
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str1.isEmpty());
		System.out.println(str1.isBlank());//判斷為空字串
		
		//字串為null時，無法用以上兩個方法判斷
		
		//要用StringUtils類方法:1.has.Legnth(),2.hasText()
		//hasLegnth():判斷字串不為null或長度大於0
		//hasText():判斷字串不為null及isBlank為False
		//可以在前面加個驚嘆號表示與原本結果相反的意思
		System.out.println("str1是否有長度:"+StringUtils.hasLength(str1));
		System.out.println("str1是否有字:"+StringUtils.hasText(str1));
		System.out.println("str2是否有長度:"+StringUtils.hasLength(str2));
		System.out.println("str2是否有字:"+StringUtils.hasText(str2));
	}
	
	@Test
	public void stringtest2() {
		//習題4
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String target = "小龍女";
		int firstIndex = str.indexOf(target);
		System.out.println("小龍女第一次出現的位置:"+firstIndex);
		int lastIndex =str.lastIndexOf(target);
		System.out.println("小龍女最後一次出現的位置:"+lastIndex);
		int index =0;
		int count=0;
		while(true) {
			index = str.indexOf(target,index);//indexOf("目標值",從哪裡開始搜尋)
			if(index != -1) {
				count++;
				index=index+target.length();
			}else {
				break;//找不到目標值時indexOf會回傳-1
			}
		}
		System.out.println("小龍女出現過"+count+"次");
	}
	
	@Test
	public void stringtest3() {
		//擷取
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		
		
		String subStr = str.substring(8);//數字8是擷取開始的地方
		System.out.println(subStr);
		
		subStr = str.substring(0,8);//擷取0到7的位置
		System.out.println(subStr);	
		
		
	}
	
	@Test
	public void stringtest4() {
		//取代
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String newStr=str.replace("小龍女","小龍包");//取代全部
		System.out.println(newStr);	
		
		String newStr1=str.replaceAll("小龍女","小龍包");//取代全部，但用於正規表達式
		System.out.println(newStr1);	
		
		String newStr2=str.replaceFirst("小龍女","小龍包");//只取代第一個
		System.out.println(newStr2);
		
		//刪除
		String str2 = " 神 雕 俠 侶 ";
		String newStr3 = str2.trim();//刪除字串前後空白
		System.out.println(newStr3);
		
		String newStr4 = str2.replace(" ", "");//刪除空白字串(用replace)
		System.out.println(newStr4);
	 }
	
	@Test
	public void stringtest5(){
		//分割
		String str2 = "神雕俠侶";
		String[] array = str2.split("雕");//放空字串會分割出每一個字
		for(String item: array) {
					System.out.println(item+"長度:"+item.length());	
		}	
	}
	@Test
	public void stringtest6() {
		//神雕俠侶-->神:雕:俠:侶
		String str = "神雕俠侶";
		String[] array =str.split("");
		String newStr = "";
		
		
		//使用for迴圈
		for(int i =0; i < array.length; i++) {
			newStr = newStr + array[i];
			if(i != array.length-1) {
				newStr= newStr + ":";
			}
		}
	 System.out.println(newStr);	
	 
	 //使用join方法
	 newStr=String.join(":", array);
	 System.out.println(newStr);
	}
	
	@Test
	public void stringbuffer() {
		//StringBuffer:常更改內容的字串用這個方法，因為不會新增記憶體
		//這方法出來的資料型態不是String，而是StringBuffer
		StringBuffer strBuff = new StringBuffer();//()裡面放初始字串
		
		//字串串接
		strBuff.append("A").append("B").append("C");
		
		//轉成String型態
		String newStr = strBuff.toString();
		System.out.println(newStr);	
		
		//轉成StringBuffer型態
		strBuff = new StringBuffer(newStr);
		
		//反轉字串
		String reverseStr = strBuff.reverse().toString();
		System.out.println(reverseStr);		
			
	}
	@Test
	public void practice1() {
		//把一個字串ABACADEF的最後一個A換成W
		StringBuffer strBuff = new StringBuffer("ABACADEF");
		String reverseStr = strBuff.reverse().toString();
		String reverseNewStr= reverseStr.replaceFirst("A","W");
		StringBuffer newStrBuff = new StringBuffer(reverseNewStr);
		String targetStr = newStrBuff.reverse().toString();
		
		System.out.println(targetStr);
	}
	
	@Test
	public void practice2() {
		String str = "AABCCDCDACBDA";
		
		while(str.length()!=0){
			//把A全部替換成空字串
			String subStr = str.substring(0,1);
			String newstr = str.replace(subStr,"");
			
			//利用 str 與 newStr 的長度差得到第一個字母出現的次數
			//%s是字串的佔位符;%d是述職的佔位符
			System.out.printf("%s 出現的次數:%d次\n",subStr,(str.length()-newstr.length()));
			str = newstr;
		}
		
	}
	
	@Test
	public void practice3() {
		//若字串是任意輸入的值,計算字串中每個字母出現的次數
		String str = "AABCBDCDACBDA";
		//切字串
		String[] strArray = str.split("");
		
		//使用Map:key-value 1對1的組合
        //Map<String , Integer>:String是 key是出現的字的資料型態，Integer是 value(次數)的資料型態
		Map<String , Integer>map = new HashMap<>();
		
		//計算每個出現的字及對應的次數
		for(String item :strArray) {
			//把字母及次數放進map
			//判斷map中的key值是否已存在
			if(map.containsKey(item)) {
				int count = map.get(item)+1;
				map.put(item, count);
		 }else {
			 map.put(item, 1);//把新出現的字及次數放進map中，因為是第一次出現所以次數是1次
		 }
		}
	System.out.println(map);
	}
	
	@Test
	public void practice3_2(){
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入字串，輸入完請按ENTER!!");
		
		String str = scan.next();
		//切字串
		String[] strArray = str.split("");
		
		//利用Set的特性來取不同的字
		Set<String> set=  new HashSet<>();
		
		//把元素加到set中，最後在set中都只會保留不同的元素各一個
		for(String item:strArray) {
			set.add(item);
		}
		
		for(String item:set) {
			//將出現的元素用空字串取代
			String newStr = str.replace(item,"");
			//利用原本的字串與新字串兩者的長度差來取得item的出現次數
			int count =str.length()-newStr.length();
			System.out.printf("%s出現的次數:%d\n",item,count);
			
			str=newStr;
		}
		
	} 
	
	
}
