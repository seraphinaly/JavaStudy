package com.sist.string;

public class MainClass6{
	public static void main(String[] args){
		String[] arr= {"����â","���ϼ�","������","�ں�ȣ","������"};
		System.out.println(String.join("-", arr));
		
		String str=String.format("%d-%d=%d", 10,2,10-2);
		System.out.println(str);
	}
}
