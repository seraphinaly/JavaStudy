//사용자 정수입력 => 짝홀 판별
import java.util.*;
public class 자바메소드3{
	//1:사용자 입력값 받아오기
	static int userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=sc.nextInt();
		return num;
	}
	
	//2:짝홀 판별 출력
	static void judge(int num) {
		if(num%2==0)
			System.out.println(num+"은(는) 짝수입니다.");
		else
			System.out.println(num+"은(는) 홀수입니다.");		
	}
	
	public static void main(String[] args){
		int num=userInput();
		judge(num);						
	}
}