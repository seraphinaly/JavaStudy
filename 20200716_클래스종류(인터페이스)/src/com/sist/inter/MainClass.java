package com.sist.inter;
interface 동물{ //상위클래스: 클래스를 여러개 묶어서 사용(추상화)
	void eat();
	default void run() { //jdk1.8부터 구현 가능
		System.out.println("네 발로 걷는다");
	}
}
class 소 implements 동물{ //상속
	public void eat(){
		System.out.println("소같이 먹는다");
	}
}

class 개 implements 동물{
	public void eat() {
		System.out.println("개같이 먹는다");
	}
}
class 사람 implements 동물{

	@Override
	public void eat(){
		System.out.println("수저로 먹는다");
	}

	@Override
	public void run(){
		System.out.println("두 발로 걷는다");
	}
	
	
}
class 돼지 implements 동물{
	public void eat() {
		System.out.println("돼지같이 먹는다");
	}
}
public class MainClass{
	public static void main(String[] args){
		동물 ani=new 소();
		ani.eat();
		ani.run();
		
		ani=new 개();
		ani.eat();
		ani.run();
		
		ani=new 돼지();
		ani.eat();
		ani.run();
		
		ani=new 사람();
		ani.eat();
		ani.run();
	}

}
