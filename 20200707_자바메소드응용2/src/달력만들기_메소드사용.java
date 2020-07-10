
/*
 * 1.사용자로부터 연도,월 받는다
 * 2.요일 구한다=>세분화
 * 3.해당요일부터 달력 출력한다                         
 */
import java.util.*;

public class 달력만들기_메소드사용{
	//1:사용자입력
력:");
		int num=sc.nextInt();
		return num;
	}

	//2:요일구하기
	static int getWeek(int year, int month){
		//1)전년도 총 날수
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		//2)전달까지의 합
		//		int[] lastDay= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//		if((year%4==0 && year%100!=0) || year%400==0){
		//			lastDay[1]=29;
		//		}
		for(int i=1; i<month-1; i++)
			total+=lastDay(year, month);
		//3)1일자의 요일
		total++;
		int week=total%7; //1년 1월 1일:월요일
		return week;
	}

	//3:각 달의 마지막 날짜 알려주는 기능
	static int lastDay(int year, int month){
		int[] lastDay= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if(isYear(year)){
			lastDay[1]=29;
		}
		return lastDay[month-1];
	}

	//4:윤년확인 → 재사용성 목적
	static boolean isYear(int year){
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || year%400==0)
			bCheck=true;
		return bCheck;
	}

	//5:달력출력
	static void datePrint(int year, int month, int week){
		int last=lastDay(year, month);
		String[] strWeek= { "일", "월", "화", "수", "목", "금", "토" };
		for(int i=0; i<7; i++){
			System.out.print(strWeek[i]+"\t");
		}

		System.out.println();
		for(int i=1; i<=last; i++){
			//공백
			if(i==1){ 
				for(int j=0; j<week; j++){
					System.out.print("\t");
				}
			}
			//1부터 출력
			System.out.printf("%2d\t", i);
			//요일증가
			week++;
			if(week>6){
				week=0;
				System.out.println();
			}
		}
	}

	//6:메소드 여러 개를 조립(∵메인에서 코딩하면 재사용 불가)
	static void process(){
		int year=userInput("연도");
		int month=userInput("월");
		int week=getWeek(year, month);
		datePrint(year, month, week);
	}

	//메인(시작점)
	public static void main(String[] args){
		process(); //메인에서는 호출만(다른 곳에서 재사용하기 위해서)
	}

}
