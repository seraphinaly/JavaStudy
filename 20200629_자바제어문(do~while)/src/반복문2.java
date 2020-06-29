//do~while
//사용자가 입력한 정수에 해당되는 구구단 거꾸로 출력
import java.util.*;
//비슷한 기능 BufferedReader : 예외처리 필요
public class 반복문2{

	public static void main(String[] args){
	  //변수설정 2개
		int user=0; //사용자가 입력한 값 저장 메모리 공간
		int i=9; //1~9까지 변경하는 루프변수: 9번 수행
		Scanner scan=new Scanner(System.in); //모든 클래스는 메모리에 저장할 때 new 이용(동적 메모리 할당)
		                       //예외: Math.random() => static 메소드: 시작과 동시에 메모리에 자동저장
		System.out.print("2~9 사이의 정수 입력:"); //Scanner: 공백, 엔터 누를 때 값을 메모리에 저장
		user=scan.nextInt(); //사용자가 키보드 입력한 정수 읽어와서 저장=> user라는 공간
		do {
			System.out.printf("%d*%d=%d\n",user,i,user*i); //다음 줄 출력: %n(f만), \n(print/f/ln)
			i--;
		}while(i>=1);
		
		
	}

}
