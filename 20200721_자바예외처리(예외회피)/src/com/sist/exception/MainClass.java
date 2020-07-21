package com.sist.exception;

public class MainClass{
	public int div(int a, int b) throws Exception{
		return a/b; //0으로 나누면 에러가 발생할 수 있다
	}
	public static void main(String[] args){
		MainClass m=new MainClass();
		int res=0;
		try{
			res=m.div(10, 0);
		} catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res);
	}

}
