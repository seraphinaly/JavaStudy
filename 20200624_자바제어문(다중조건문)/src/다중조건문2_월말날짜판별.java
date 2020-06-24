// 각 달의 마지막 날짜 출력 => 28, 30, 31(조건 3개)
// 조건 5개 이상되면 switch~case가 더 편함
import java.util.*;
public class 다중조건문2_월말날짜판별 { //한번만 수행!!

	public static void main(String[] args) {
		 int month=0;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("원하는 월을 입력(1-12)");
		 month=scan.nextInt(); //메모리에 저장
		 //가공(연산자, 제어문)=>메소드
//		 if(month==1)
//			 System.out.println("1월은 31일까지 있습니다.");
//		 else if(month==2)
//			 System.out.println("2월은 28일까지 있습니다.");
//		 else if(month==3)
//			 System.out.println("3월은 31일까지 있습니다.");
//		 else if(month==4)
//			 System.out.println("4월은 30일까지 있습니다.");
//		 else if(month==5)
//			 System.out.println("5월은 31일까지 있습니다.");
//		 else if(month==6)
//			 System.out.println("6월은 30일까지 있습니다.");
//		 else if(month==7)
//			 System.out.println("7월은 31일까지 있습니다.");
//		 else if(month==8)
//			 System.out.println("8월은 31일까지 있습니다.");
//		 else if(month==9)
//			 System.out.println("9월은 30일까지 있습니다.");
//		 else if(month==10)
//			 System.out.println("10월은 31일까지 있습니다.");
//		 else if(month==11)
//			 System.out.println("11월은 30일까지 있습니다.");
//		 else if(month==12)
//			 System.out.println("12월은 31일까지 있습니다.");
		 
         // 하드코딩 ==> 최적화(퍼포먼스, 빠른 속도), 가독성(유지보수)
		 //                           => 소스코딩이 적어야함
		 if(month>12 || month<1) {
			 System.out.println("잘못된 입력값입니다. 다시 입력하세요."); //오류처리: if문
		 } else {
		     if(month==4 || month==6 || month==9 || month==11) {
			   System.out.println(month+"월은 30일까지 있습니다.");
		     } else if(month==2) {
			     System.out.println(month+"월은 28일까지 있습니다.");
		       }  else {
			        System.out.println(month+"월은 31일까지 있습니다.");
		          }
		   }
			 
		 
	}
}

