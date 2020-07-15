package com.sist.method;

import java.lang.reflect.Method;

class A{
	public void display1(String name){
		System.out.println("Hello~~\t"+name);
	}

	public void display2(String name){
		System.out.println("Hello~~\t"+name);//원래는 연결이 되어도 따로 만드는게 좋음>>충돌 우려
	}
}

public class 메소드2{

	public static void main(String[] args){
		//		A a=new A();
		//		a.display("홍길동");

		//메모리할당
		try{
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
			//System.out.println(obj);
			//			A a=(A)obj; //항상 형변환 시켜야함
			//			a.display("이정후");
			Method[] method=clsName.getDeclaredMethods();//java.lang.reflect
			//method[0].invoke(obj,"이정후");//다양한 매개변수 가진 어떤 메소드라도 호출할 수 있게
			
			for(Method m : method){
				System.out.println(m.getName());//순서를 알 수 없음->0,1로 구분할수 없음->Annotation 필요
			}
		} catch(Exception ex){
		}
	}

}
