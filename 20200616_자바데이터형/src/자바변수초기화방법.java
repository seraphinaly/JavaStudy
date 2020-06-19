import java.util.*; //클래스 소환
// String, System, Math ==> java.lang(생략 가능)

public class 자바변수초기화방법 {

	public static void main(String[] args) {
  //(선언과 동시에 초기값 부여) 주로 관리자용(admin)
	// 1)직접 처리
		int a=100;
		System.out.println("a="+a);
	
  //(선언하고 나서 나중에 초기값 부여) 주로 사용자용(user)=>더 많이 쓰임		
   // 2)선언 후 키보드로 데이터 입력 받아서 저장
		int b;
		b=200;
		System.out.println("b="+b);
		
   // 3)임의의 수 저장(랜덤): 게임, 로또
		int c;
		c=(int)(Math.random()*100)+1; //형 전환 (double->int), random은 원래 double
		                              // 0.0~0.99 -> *100: 0.0~99.0 -> int: 0~99 -> +1: int 1~100 :난수발생 가공(연산처리)
		System.out.println("c="+c);
				
   // 4)입력창을 만들어서 값을 받는 방식
		int d;
		Scanner scan=new Scanner(System.in); //System.in: 키보드 입력값을 읽어와라
		System.out.println("정수입력:");
		d=scan.nextInt();
		
		System.out.println("d="+d);
		
	}

}
