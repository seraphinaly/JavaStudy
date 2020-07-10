/*
 * 순차적 코딩=> 구조화 된 코딩(메소드)
 * ========기능별로 묶어서 사용 가능(재사용, 코드 중복 제거)
 * <달력만들기>                ====수정,추가를 편리하게 만드는 프로그램
 * 1.사용자로부터 연도,월 받는다
 * 2.요일 구한다=>세분화
 * 3.해당요일부터 달력 출력한다                         
 */
import java.util.*;
public class 달력만들기_절차적언어{ //메인에다가 코딩한다
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("연도를 입력하세요.");
		int year=sc.nextInt();	
		System.out.print("월을 입력하세요.");
		int month=sc.nextInt();
		//지역변수를 다른 메소드에서 사용하려면=> 매개변수 이용
		
		//2.요일 구하기
		//1)전년도 총 날수
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//2)전달까지의 합
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0&&year%100!=0) || year%400==0) {
			lastDay[1]=29;			
		}
		for(int i=0;i<month-1;i++)
			total+=lastDay[i];
		//3)1일자의 요일
		total++;
		int week=total%7; //1년 1월 1일:월요일
		
		//달력 출력
		System.out.println(year+"년 "+month+"월");
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0;i<7;i++) {
				System.out.print(strWeek[i]+"\t");		
		}
		
		System.out.println();
        for(int i=1;i<=lastDay[month-1];i++){
           if(i==1){ //공백
             for(int j=0;j<week;j++){
              System.out.print("\t");
             }
           }
           
           System.out.printf("%2d\t",i);
           week++;
           if(week>6) {
               week=0;
               System.out.println();
           }
        }

		
		
	}

}
