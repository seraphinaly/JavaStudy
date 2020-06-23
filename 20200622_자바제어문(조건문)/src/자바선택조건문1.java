import java.util.Scanner;
public class 자바선택조건문1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); // 자바의 모든 클래스,사용자정의 클래스:저장시 반드시 new 이용
		System.out.println("정수 입력(1~100)");
		int a=scan.nextInt(); //입력값 받아서 a라는 메모리 공간에 저장
        if(!(a<1 || a>100)) { //1~100 사이 정수가 입력되지 않았다면
        	System.out.println(a+"이(가) 입력되었습니다.");
        } else { //1~100 사이 정수가 입력됐다면
        	System.out.println("잘못된 입력입니다.\n프로그램을 종료합니다.");
          }
        	
        
	}

}
