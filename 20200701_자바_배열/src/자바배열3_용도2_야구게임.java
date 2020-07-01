/*
 *    3 6 9  int[] com={3,6,9}
 *    ===== 결과 =====
 *    S: ●
 *    B: ●●
 *    ==============
 *    3 9 6
 */
import java.util.*;
public class 자바배열3_용도2_야구게임{
	public static void main(String[] args){
		
		int[] com={3,6,9};
		int[] user=new int[3];
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수 입력:");
			
			//조건1: 잘못된 입력(100~999 아닐 때)
			int input=scan.nextInt();
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다!\n"); //=>while문 처음으로 가야함
				continue; //while문의 조건식으로 이동
			}
			//조건2: 잘못된 입력(중복발생)
			user[0]=input/100;  //ex. 123/100=1
			user[1]=(input%100)/10;  //23/10=2
			user[2]=input%10; //화폐매수 구하기
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다.\n");
				continue;
			}
		
			//비교
			int s=0,b=0;
			for(int i=0;i<3;i++) { //com
				for(int j=0;j<3;j++) { //user
					if(com[i]==user[j]) { //같은 수가 있는지 확인
						if(i==j)
							s++;
						else
							b++;
					}	
				}
			}
		
			//결과값 출력
			System.out.println("===== 결과 =====");
			System.out.print("S:");
			for(int i=0;i<s;i++) {
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++) {
				System.out.print("●");
			}
			System.out.println("\n==============\n");
		
			//while문 종료여부
			if(s==3) {
				System.out.println("Game Over!");
				break;
			}
		}
		
	}
}
