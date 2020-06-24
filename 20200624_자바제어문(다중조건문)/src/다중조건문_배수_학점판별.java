import java.util.*;
public class 다중조건문_배수_학점판별 {
// 조건이 많은 경우에 사용 => 조건이 맞는 문장만 1번만 실행(여러번 수행하려면 단일if문 사용)
	
	public static void main(String[] args) {
		int a=15;
		if(a%3==0)
			System.out.println("3의 배수"); // 출력 후 종료
		else if(a%5==0)
			System.out.println("5의 배수"); // 오류: 출력안됨>> 단일if 써야함.
		else if(a%7==0)
			System.out.println("7의 배수");
		
		if(a%3==0)
			System.out.println("3의 배수");
		if(a%5==0)
			System.out.println("5의 배수");
		if(a%7==0)
			System.out.println("7의 배수");
		
//성적 계산: 3개 점수 받아서 총점, 평균, 학점 출력
		int kor=0, eng=0, math=0;
		int total=0;                     //변수설정시 초기값 설정 습관 들이기 
		double avg=0.0; char grade='A';
		Scanner scan = new Scanner(System.in); //입력 받아서 변수에 저장
		System.out.print("국어점수 입력:");
		kor=scan.nextInt();  
		System.out.print("영어점수 입력:");
		eng=scan.nextInt();
		System.out.print("수학점수 입력:");
		math=scan.nextInt();
		
	    total=kor+eng+math;
	    avg=total/3.0;
	    		
	    if(avg>=90) 
	    	grade='A';
	    	else if(avg>=80) 
	    		grade='B';
	    		else if(avg>=70) 
	    			grade='C';
	    			else if(avg>=60) 
	    				grade='D';
	    				else
	    					grade='F';
	   
	    System.out.println("====== 성적 ======");
	    System.out.println("국어점수:"+kor);
	    System.out.println("영어점수:"+eng);
	    System.out.println("수학점수:"+math);
	    System.out.println("총점:"+total);
	    System.out.printf("평균:%.2f\n",avg);
	    System.out.println("학점:"+grade);
	 
	}

}
