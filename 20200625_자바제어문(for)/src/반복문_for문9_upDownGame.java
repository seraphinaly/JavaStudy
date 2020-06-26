/*횟수가 지정된 반복문 => up/down 게임
    =>1. 컴퓨터가 1~100 사이 난수 발생
    =>2. 사용자 입력 
    =>3. 힌트: 높다/낮다
    =>4. 종료여부
*/
import java.util.Scanner;
public class 반복문_for문9_upDownGame {

	public static void main(String[] args) {
		int com=(int)(Math.random()*100)+1; //1~100사이 난수 발생
		Scanner scan=new Scanner(System.in);
		int count=0;
		
		for(;;) { //무한루프 => while(true)
			System.out.print("1~100 사이 정수 입력:");
			int user=scan.nextInt();
				if(user<1 || user>100) {
					System.out.println("잘못된 입력입니다!!");
					continue;  //처음으로 다시 돌아가라
				}
		    count++;//if문 안걸림=>정상적으로 입력된 상태
			if(com>user) {
				System.out.println("Up!");
		    } else if(com<user) {
				System.out.println("Down!");
		    } else {
		    	System.out.println("\n======== Game Over!! =======\n");
		    	System.out.println("입력횟수:"+count);
		    break; 
		      }  	  
		}
		
		System.out.println("\n프로그램을 종료합니다.");	
			
	}
}

  