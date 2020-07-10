//국어 영어 수학 => 총점,평균,학점
import java.util.*;
public class 자바메소드2{
	//1:입력 → 반복 제거, 재사용
	static int userInput(String subject) {
		Scanner sc=new Scanner(System.in);
		System.out.print(subject+"점수 입력:");
		int score=sc.nextInt();
		return score;
	}
	
	//2:총점  → 평균에 사용하려면 값을 받아두는것이 나을듯
	static int total(int kor,int eng,int math) {
		return kor+eng+math;
	}
	
	//3.평균
	static void avg(int total) {
		System.out.printf("평균:%.2f\n",total/3.0);
	}	
	
	//4.학점
	static void grade(int total) {
		switch(total/30) {
		case 10:
		case 9:	
			System.out.println("학점:A");
			break;
		case 8:
			System.out.println("학점:B");
			break;
		case 7:
			System.out.println("학점:C");
			break;
		case 6:
			System.out.println("학점:D");
			break;
		default:
			System.out.println("학점:F");
			break;
		}
	}
	
	public static void main(String[] args){
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor,eng,math);//변수명=메소드명 가능
		
		//출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		avg(total);
		grade(total);
	}
}
