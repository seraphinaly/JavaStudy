import java.util.*;

public class 배열값주입{
	/* 1.직접 주입 
	 * 2.사용자 입력값(Scanner) 
	 * 3.난수 이용 
	 * ==================== 
	 * 4.File 읽기 
	 * 5.Web에서 읽어서 주입 
	 * 6.Oracle
	 * 
	 * 배열 ==> 1)0번부터 입력 2)맨 뒤부터 입력 */
	public static void main(String[] args){
		//3명 학생 성적관리: 국/영/수 ==> 1.총점, 2.평균, 3.학점, 4.등수(2중for문)
		int[] kor=new int[3]; //변수 kor1,kor2,kor3 선언과 동일
		int[] eng=new int[3];
		int[] math=new int[3]; //종류별로 모아줘야 함!!!

		int[] total=new int[3];
		double[] avg=new double[3];
		char[] grade=new char[3];
		int[] rank=new int[3];
		
		/* x이렇게 하면 틀림x
		 * for(int i=0;i<3;i++){ 
		 * 		Scanner scan=new Scanner(System.in); 
		 *                   ===:새로운 공간 생성
		 * 스캐너는 1개로도 작동하기 때문에 for문에 넣어서 각각 만들 필요없음. } */
		
		Scanner scan=new Scanner(System.in); //for밖으로 빼서 1개만 사용

		for(int i=0; i<3; i++){
			System.out.printf("%d번째 국어점수 입력:", i+1);
			kor[i]=scan.nextInt();

			System.out.printf("%d번째 영어점수 입력:", i+1);
			eng[i]=scan.nextInt();

			System.out.printf("%d번째 수학점수 입력:", i+1);
			math[i]=scan.nextInt();

			total[i]=kor[i]+eng[i]+math[i]; //math[0] => 일반변수
			avg[i]=total[i]/3.0;
		}

		//등록된 점수 출력
		//학점 계산 
		for(int i=0; i<3; i++){
			char c='A';
			switch(total[i]/30) {
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
				break;
			}
			grade[i]=c;
		}

		//등수 계산
		for(int i=0;i<3;i++) {     //i번째 사람
			rank[i]=1;             //일단 1등으로 해놓고
			for(int j=0;j<3;j++) { //총점 비교할건데 혹시 i보다 높은 총점 있으면
				if(total[i]<total[j]) { 
					rank[i]++;     //rank[i]에 1 더해라
				}
			}
		}                 //%-6s: String 6칸 확보, 앞에서부터 채움						  
		System.out.printf("\n%-6s%-6s%-6s%-6s%-10s%-6s%s\n",   
				"국어", "영어", "수학", "총점", "평균", "학점", "등수");
		for(int i=0; i<3; i++){
			System.out.printf("%-5d%-5d%-4d%-5d%-7.2f%-5c%d\n", 
					kor[i], eng[i], math[i], total[i], avg[i], grade[i], rank[i]);

		}

	}

}
