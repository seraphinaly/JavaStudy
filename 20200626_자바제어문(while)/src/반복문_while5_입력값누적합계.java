//사용자에게 정수 입력받아서 그 값까지의 누적합계 구하기
/* for(;;) == while(true), 언제나 변환 가능!
 * 예시)
     for(int i=0;i<10;i++)
     == int i=0;
        while(i<10){
        i++;
        }               */
import java.util.*;
public class 반복문_while5_입력값누적합계 {

	public static void main(String[] args) {
		int user=0; //사용자에게 요청한 변수
		int i=1;    //사용자가 요청한 변수까지 증가(루프변수)
		int sum=0;  //누적(합)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		user=scan.nextInt();
		
		while(i<=user) {
			sum+=i;
			i++; 
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
//변수 초기값 설정 및 설정 위치의 중요성
		i=1; //i값 초기화:블록 밖에서 선언, 재사용 가능
		while(i<=10) {
			System.out.print(i);
			i+=5; // += , -= 연산 사용 
		} //i=6
		System.out.println();
		
		i=5; //초기값 재설정
		while(i>=1) {
			System.out.print(i);
			i--; // -- 사용
		} //i=0
		
	}

}
