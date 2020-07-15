package com.sist.method;
class AA{
	public void AA() { //리턴형(void) 붙어서 생성자 아니고 일반 인스턴스 메소드!!(∵void)
		System.out.println("AA() Call...");
	}
//	//리턴형X:특수메소드=>메모리에 저장
//	public AA() {
//		System.out.println("AA() Call...");
//	}
	public AA(int a) {
		System.out.println("AA() Call...");
	}

}
public class MainClass{

	public static void main(String[] args){
		AA a=new AA(10);
		a.AA();
	}

}
