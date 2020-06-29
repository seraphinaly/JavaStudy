//up-down게임 ==>잘못된 입력:continue
//입력관련: continue, 종료: continue
//숫자를 맞출 때까지 게임 계속: while
import java.util.*;
public class 반복제어문_break_continue{

	public static void main(String[] args){ //main: 재사용 불가
		//프로그램은 프로그래머가 명령한 순서로 한 줄씩 수행
		//임의의 숫자 저장=> 난수(com)
		int com=(int)(Math.random()*100)+1; 
		//맞출때까지=> 무한루프 =>횟수가 지정되지 않았을 때
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("1~100 사이 정수 입력:");
			int user=scan.nextInt();
			
			if(user<1 || user>100) {
				System.out.println("잘못된 입력값입니다.");
				continue; //처음부터 다시 수행
			}
			if(user>com) {
				System.out.println("Down!");
			}else if(user<com){
				System.out.println("Up!");
			}else {
				System.out.println("Game over!!");
				break;//System.exit(0)
			}
		}
					
	}

}
