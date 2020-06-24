import java.util.*;
public class 선택문_switch_case {

	public static void main(String[] args) {
		
	 int select=0;
	 Scanner scan=new Scanner(System.in);
	 System.out.print("정수 입력(1~5): ");
	 select=scan.nextInt();
	 
	 switch(select)
	 {
	 case 1: //라벨은 반드시 따로
//		 System.out.println("1번 또는 2번을 입력했습니다.");
//		 break;  //switch문을 종료한다
	 case 2:
		 System.out.println("1번 또는 2번을 입력했습니다.");
		 break;
	 case 3:
		 System.out.println("3번을 입력했습니다.");
		 break;
	 case 4:
		 System.out.println("4번을 입력했습니다.");
		 break;
	 case 5:
		 System.out.println("5번을 입력했습니다.");
		 break;
	 default:
		 System.out.println("1~5 사이 숫자를 입력하세요.");
	 }
	}
}	