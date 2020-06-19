/*
 * 변수 선언
 * 변수 초기화
 * 변수 값 변경
 * 다른 변수에 값 전달
 */

public class 자바변수값변경 {

	// i, j는 변수명으로 사용하지 않는다
	
	public static void main(String[] args) {
		int a=100;
		System.out.println("a="+a);
		a=200;
		System.out.println("a="+a);
		a=300;
		System.out.println("a="+a);
		
		int b = a; // b라는 메모리에 a값을 대입해라
		System.out.println("b="+b);
		int c = a + b;
		System.out.println("c="+c);
		
		int x,y,z;
		x=y=z=100; // z>>y>>x 순서대로 대입(뒤에서부터 읽기)
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}

}
