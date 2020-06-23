
public class 자바단일조건문 {

	public static void main(String[] args) {
		int score=56;
		if (score>=60) { 
            System.out.println("첫번째 if문 수행");		
			System.out.println("Success");
		}
		///별개의 문장(문제점:속도 저하)
		if (score<60) { //else
			System.out.println("두번째 if문 수행");
			System.out.println("Fail");
		}	
		
		/*
		 * 1. 수행문장이 1개일 경우 {} 생략가능
		 * 2. 단일if(각각 수행)와 다중if(1개만 수행) 사용시 주의
		 */

		int a=20; //3배수, 5배수, 7배수
		if(a%3==0) //여기서 세미콜론 찍으면 안됨 - if문 끝나버림!
			System.out.println(a+"는 3의 배수입니다."); //여기까지가 한 문장
		    System.out.println("if(a%3==0) 실행문장");//독립된 실행문장: 바꾸려면 {} 사용
		if(a%5==0) //다중if(else if) 사용시 출력 안됨
			System.out.println(a+"는 5의 배수입니다.");
		if(a%7==0)
			System.out.println(a+"는 7의 배수입니다.");
	}
}