package com.sist.lang;

import java.util.*;
import java.sql.*;
/*
 * class A{
 * 	int a=10;
 * }
 * 
 * class B extends A{
 *  //int a
 * 	public B(){
 * 		this.a=100; //자신의 클래스
 * 		super.a=200;//상속 내린 클래스
 * 	}
 * }
 * 
 * **상속
 *   extends => class(단일상속)
 *   implements => interface(다중상속)
 *   
 * **클래스
 *    new => 처음부터 시작
 *    참조 => 공동메모리 사용 => 클래스 자체를 매개변수로 전송할 때
 *    복제 => 변경된것부터 시작
 *    
 *    class A{
 *      int aa=10;
 *    }
 *    
 *     A aaa=new A();
 *      =>display(aaa); ==> aaa.aa=1000 : Call By Reference(하나의 메모리공간을 같이 씀)
 *       								  cf. Call By Value(메모리 따로 씀)
 *    
 *    public void display(A a){
 *    	a.aa=1000;
 *    }
 */

class A implements Cloneable{
	int aa=10;
	public A clone() {
		A a=new A();
		try {
			a=(A)super.clone(); //형변환 필수(clone=>Object)
		}catch(Exception e) {}
		return a;
	}
}

public class MainClass{
	public static void main(String[] args){
		A a=new A();
		a.aa=100;
		A b=new A();
		System.out.println(b.aa);

		A c=new A();
		System.out.println("c="+c.aa);
		c.aa=100;
		A d=c;//동일한 저장장소
		System.out.println(d.aa);
		d.aa=1000;
		System.out.println(c.aa);
		
		A e=c.clone();
		System.out.println(c.aa);
	}
}