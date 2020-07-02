
/* 배열: 여러 개 변수를 하나로 묶어서 관리=> 변수이름 한 개(배열명)를 가지고 사용
 *		변수가 여러 개이기 때문에 구분 => 인덱스 번호(0부터 시작)
 * 		개수를 가지고 올 때: 배열명.length
 * 배열 선언-> 초기화 -> 값 변경 -> 값 출력
 *   -선언 및 초기화:
 *    String[] arr=new String[10]; =>new: null로 자동 초기화
 *    ***모든 클래스=>주소를 가지고 있다(없는 경우:null)
 *   -값 변경 ex)7번째 값 변경
 *    arr[6]="안녕"; =>일반 변수와 동일한 취급
 *   -값 출력: 0부터=> for문 사용 용이, while 사용 가능
 *     ┌ for:인덱스 이용=>배열값 변경, 제어
 *     └ for-each:실제 저장값 읽어옴=>주로 출력
 */
//사용자가 연,월,일 입력=>요일 출력
import java.util.*;
public class 자바배열1_요일출력{

	public static void main(String[] args){
		int year=0, month=0, day=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:");
		year=scan.nextInt(); //키보드로 입력한 정수값을 읽어오는 역할
		System.out.print("월 입력:");
		month=scan.nextInt();
		System.out.print("일 입력:");
		day=scan.nextInt();
		
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		/*요일
		1)전년도까지의 총 날수: 1/1/1~2019/12/31
		2)전 달까지의 총 날수: 2020/1/1~2020/06/30
		3)입력된 day까지 총 날수
		=====================================
		=>전체 총 날수%7 =>요일을 구할수 있음
		  0(일)~6(토), 1년도 1월 1일: 월요일로 시작
		*/
		//1)전년도까지 총 날수
		int total=(year-1)*365  //윤년(366일) 고려
				+(year-1)/4		//4년마다
				-(year-1)/100	//100년마다 제외   	
				+(year-1)/400;	//400년마다
		//2)전 달까지의 합
		int[] lastDay={31,28,31,30,31,30,
					   31,31,30,31,30,31};
		//2월=> 28/29
		if((year%4==0&&year%100!=0)||(year%400==0)){
			lastDay[1]=29;
		}else {
			lastDay[1]=28;
		}
		
		for(int i=0;i<month-1;i++) {
			total+=lastDay[i];
		}
		
		//입력된 Day
		total+=day;
		
		//요일 구하기
		int week=total%7;
		char[] strWeek= {'일','월','화','수','목','금','토'};
		System.out.println(strWeek[week]+"요일입니다.");
		
//		switch(week){
//		case 0:
//			System.out.println("일요일입니다.");
//			break;
//		case 1:
//			System.out.println("월요일입니다.");
//			break;
//		case 2:
//			System.out.println("화요일입니다.");
//			break;
//		case 3:
//			System.out.println("수요일입니다.");
//			break;
//		case 4:
//			System.out.println("목요일입니다.");
//			break;
//		case 5:
//			System.out.println("금요일입니다.");
//			break;
//		case 6:
//			System.out.println("토요일입니다.");
//			break;
//		}
		
	
	}
}

