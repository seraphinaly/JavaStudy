import java.util.Scanner;
public class 자바선택조건문2 {

	public static void main(String[] args) {
		/*윤년여부 확인조건
		 * 1. 4년마다 윤년
		 * 2. 100년마다 제외
		 * 3. 400년마다 윤년
		 */
		int year=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:");
		year=scan.nextInt();
		//윤년여부 확인
		if((year%4==0 && year%100!=0) || (year%400==0)) { //제외: &&
			System.out.println(year+"년은 윤년입니다.");
		} else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		  }

	}

}
