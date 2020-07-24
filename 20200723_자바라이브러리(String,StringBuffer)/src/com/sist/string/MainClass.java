package com.sist.string;

public class MainClass{

	public static void main(String[] args){
		String s="background-image: url(' https://mp-seoul-image-production-s3.mangoplate.com/a4283e5725fb56755b9bbeb8f285d0dc.jpg');";
		// String s="01234567"
		// s.substring(3,7) => 3456
		String temp=s.substring(s.indexOf("'")+1, s.lastIndexOf("'"));
		//자르고 trim()으로 공백제거
		System.out.println(temp.trim());
		
		String ss="예쁜 서해바다를 보면서 즐기는 애프터눈티. 조식먹는 곳 보다 뷰가 시원하지 않은게 아쉽지만 날 좋은 때 오후를 보내기에 나쁘지 않다. 샌드위치는";
		if(ss.length()>20) {
			String sss=ss.substring(0,20)+"...더보기";
			System.out.println(sss);
		}
		
		String s1="hello";
		String s2="Hello";
		String s3=new String("hello");
		if(s1==s3) {
			System.out.println("s1==s3");
		} else {
			System.out.println("s1!=s3");
		}
		
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2==s3");
		}else {
			System.out.println("s2!=s3");
		}
	}

}
