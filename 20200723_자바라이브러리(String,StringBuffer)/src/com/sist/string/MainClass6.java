package com.sist.string;

public class MainClass6{
	public static void main(String[] args){
		String[] arr= {"서건창","김하성","이정후","박병호","이지영"};
		System.out.println(String.join("-", arr));
		
		String str=String.format("%d-%d=%d", 10,2,10-2);
		System.out.println(str);
	}
}
