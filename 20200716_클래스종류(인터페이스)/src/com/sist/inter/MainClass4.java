//익명의 클래스
package com.sist.inter;
interface A{
	public void display();
}
public class MainClass4{

	public static void main(String[] args){
		//익명의 클래스 => 인터페이스를 이용한 다형성(오버라이딩)
		//class=> implements 없이 인터페이스 구현 가능
		//꼭 implements로 안받아도 됨. main 안에서 메모리 할당하고 메소드 구현하는 것도 가능.
		//다만, 메소드가 많을 경우 복잡할 수 있어서 특별한 경우가 아니면 implements로 구현 권장
		A a=new A() {
			public void display() {
				System.out.println("A:displayCall...");
			}
		};
		a.display();
	}

} //더 짧게쓰는 방법: 람다식(나중에 배움)
