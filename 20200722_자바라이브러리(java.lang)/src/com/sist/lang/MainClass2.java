package com.sist.lang;
class Change{
	int x,y;
}
public class MainClass2{
	public void swap2(Change c) {
		System.out.println("c="+c);
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
	}
	public void swap(int x, int y) {
		int tmp=x;
		x=y;
		y=tmp;
	}
	public static void main(String[] args){
		MainClass2 m=new MainClass2();
		int x=10;
		int y=20;
		System.out.println("변경전:x="+x+",y="+y);
		
		m.swap(x,y);
		System.out.println("변경후:x="+x+",y="+y); //:call by value(메모리 따로)
		
		//주소값 참조: call by reference(일반변수 넘어가면 안바뀜, 클래스 넘어가면 바뀜)
		//단, String은 (클래스지만)일반변수 취급
		/* 매개변수 => class, 배열 => 원본(주소)
		 *       => 기본형데이터, String => 복사본(call by value만 사용)
		 */
		Change cc=new Change();
		System.out.println("cc="+cc);
		cc.x=10;
		cc.y=20;
		System.out.println("변경전:cc.x="+cc.x+",cc.y="+cc.y);
		m.swap2(cc);
		System.out.println("변경후:cc.x="+cc.x+",cc.y="+cc.y);
	}
}
