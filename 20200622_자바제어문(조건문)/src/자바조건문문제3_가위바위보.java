/* 사용자 입력=> 0, 1, 2
 * 0이면: 가위
 * 1이면: 바위
 * 2면:   보
 */
import java.util.*;
public class 자바조건문문제3_가위바위보 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 중 하나 입력:");
		int user=scan.nextInt();
		
		if(user==0)
			System.out.println("player:가위");
		if(user==1)
			System.out.println("player:바위");
		if(user==2)
			System.out.println("player:보");
		if(!(user>=0 && user<3))
			System.out.println("입력값이 올바르지 않습니다. 다시 입력하세요.");
		
		//컴퓨터
		int com=(int)(Math.random()*3);
                     //0~2 사이의 난수 발생
		if(com==0)
            System.out.println("computer:가위");
		if(com==1)
			System.out.println("computer:바위");
		if(com==2)
			System.out.println("computer:보");
			
		if(com==user)
			System.out.println("Draw!");
		if((com==1 && user==2)||(com==2 && user==0)||(com==0&&user==1))
			System.out.println("You WIN!");
		if((com==2 && user==1)||(com==0 && user==2)||(com==1&&user==0))
			System.out.println("Computer WIN!");

		/* 더 간단하게 줄이기(뺄셈 이용)
		 * if(com-user==-2 || com-user==1)
		 * System.out.println("Computer WIN!");
		 * if(com-user==-1 || com-user==2)
		 * System.out.println("You WIN!");
		 * if(com==user)
		 * System.out.println("Draw!");
		 */
		//주의: 정수, 실수, 문자(기본형)는 ==으로 비교 가능, 문자열(참조형)은 불가=>equals()사용
	}

}
