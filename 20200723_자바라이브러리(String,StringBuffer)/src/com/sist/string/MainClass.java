package com.sist.string;

public class MainClass{

	public static void main(String[] args){
		String s="background-image: url(' https://mp-seoul-image-production-s3.mangoplate.com/a4283e5725fb56755b9bbeb8f285d0dc.jpg');";
		// String s="01234567"
		// s.substring(3,7) => 3456
		String temp=s.substring(s.indexOf("'")+1, s.lastIndexOf("'"));
		//�ڸ��� trim()���� ��������
		System.out.println(temp.trim());
		
		String ss="���� ���عٴٸ� ���鼭 ���� �����ʹ�Ƽ. ���ĸԴ� �� ���� �䰡 �ÿ����� ������ �ƽ����� �� ���� �� ���ĸ� �����⿡ ������ �ʴ�. ������ġ��";
		if(ss.length()>20) {
			String sss=ss.substring(0,20)+"...������";
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
