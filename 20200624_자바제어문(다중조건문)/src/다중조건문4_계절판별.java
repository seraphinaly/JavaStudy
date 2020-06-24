//사용자: 정수입력(1~12)/ 봄/여름/가을/겨울
import java.util.Scanner;
public class 다중조건문4_계절판별 {

	public static void main(String[] args) {
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("월을 입력해주세요(1~12).");
		month=scan.nextInt();
		if(month>12||month<1) {
			System.out.println("잘못된 입력값입니다.");
		}
		else {
		if(month==12 || month==1 || month==2)
			System.out.println("겨울입니다.");
		else if(month>=3 && month<=5)
			System.out.println("봄입니다.");
		else if(month==6 || month==7 || month==8)
			System.out.println("여름입니다.");
		else if(month==9 || month==10 || month==11)
			System.out.println("가을입니다.");
		}	
		

	}

}
