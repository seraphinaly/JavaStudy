import java.util.Scanner;

public class 자바출력메소드2 {

	public static void main(String[] args) {
	
	  Scanner scan = new Scanner(System.in);
	  /* Scanner: 데이터형
	   * scan: 변수
	   * new: 메모리에 저장(메모리 크기를 정해줌)
	   * Scanner(System.in):초기화
	   */
	  
	  System.out.print("1' 정수입력:");
	  int a=scan.nextInt(); //입력된 정수값 받아와서 a라는 메모리에 저장
	//  System.out.print("2' 정수입력:"); //이 줄이 없으면 공백으로 입력
	  int b=scan.nextInt();
	  
	  System.out.println("a="+a);
	  System.out.println("b="+b);
	  
	  // Scanner : 도스에서만 사용
	}

}
