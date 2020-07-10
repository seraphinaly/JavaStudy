
/*
 * 1.3개의 정수 난수발생(중복없이) =>1~9사이
 * 2.사용자 입력
 * 3.비교
 * 4.힌트
 * 5.정답일때 종료
 * 6.조립(프로세서)
 */
import java.util.*;

public class 야구게임_절차적언어{
	public static void main(String[] args){
		// 1.3개의 정수 난수발생(중복없이)
		int[] com=new int[10];
		int su=0; //난수값 저장
		//중복 없으면(false) 저장, 중복되면(true) 난수 다시 발생
		boolean bCheck=false; //2가지 경우의 수 → boolean     

		for(int i=0; i<3; i++){
			//중복여부 확인
			bCheck=true;
			while(bCheck){
				//난수발생
				su=(int)(Math.random()*9)+1;
				//종료 확인
				bCheck=false;
				//비교 → 같은 수가 저장됐는지 확인
				for(int j=0; j<i; j++){
					if(com[j]==su){
						bCheck=true;
						break;
					}
				}
			} //while문 종료
			com[i]=su;
		}
		for(int i:com){
			//System.out.print(i+" ");
		}

		//2.사용자 입력
		int[] user=new int[3];
		//입력
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("세 자리 정수입력:");
			int input=sc.nextInt();

			//오류처리
			//첫번째 오류:3자리 정수가 입력 안된 경우
			if(input<100 || input>999){
				System.out.println("잘못된 입력입니다!");
				continue;
			}
			user[0]=input/100; //백의 자리 수
			user[1]=(input%100)/10; //십의 자리 수
			user[2]=input%10; //일의자리수	

			//두번째 오류
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2]){
				System.out.println("중복된 정수는 사용할 수 없습니다!");
				continue;
			}

			//세번째 오류
			if(user[0]==0 || user[1]==0 || user[2]==0){
				System.out.println("0은 사용할 수 없습니다!");
				continue;
			}
			//비교
			int s=0, b=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
		//힌트
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
		//종료여부	
			if(s==3) {
				System.out.println("Game over!!");
				break;
			}
		}

	}
}