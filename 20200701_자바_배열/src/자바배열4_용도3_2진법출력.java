/* 노래제목, 가수명, 앨범, 포스터, 순위 (50곡) //변수: 250개
 *  50개씩 같은 용도별, 5개 배열 만듬 =>다른 종류의 5개 배열 하나로 모으면 클래스(사용자정의 데이터형)
 */

/* 사용법
 *  제어문
 *	반복문= for(횟수 지정)
 *      = while(종료시점 반드시 입력): break;
 *  연산자=>산술연산자,대입
 *  조건문=>비교,부정,논리(if/for/while조건)    
 */
import java.util.*;
public class 자바배열4_용도3_2진법출력{
	//사용자입력 정수: 2진법 출력
	//16bit => 32767
	//변수 17개 필요: 16bit(0,1 저장공간 16개=> 용도 같음=> 배열), user(다른 용도=> 개별변수)
	public static void main(String[] args){
		int[] binary=new int[16]; //0,1만 저장
		int user=0; //사용자 입력 정수
		int index=15; //뒤에서부터 출력=> 배열 제어
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(0~32767):");
		user=scan.nextInt();
//		System.out.println(Integer.toBinaryString(user)); //lib 이용
		while(true) { //횟수지정x, 종료시점에 break)
			binary[index]=user%2; //2로 나눈 나머지를 마지막 자리부터 저장하겠다
			user=user/2;
			if(user==0) break;
			index--;
		}

		//결과 출력
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0) 
				System.out.print(" "); //4개 출력 후 하나 띄어라
				System.out.print(binary[i]); //무조건 출력
		}
		
		
		
		
		
	}

}
