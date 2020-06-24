//3개 정수 입력받아서 학점계산
import java.util.*;
public class 선택문3 {

	public static void main(String[] args) {
		int kor=0, eng=0, math=0;
		char score='A';  //프로그렘에 필요한 메모리 저장공간 확보
		
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 3개 입력하세요.(90 90 90) ");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		
		switch((kor+eng+math)/30) {
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
		    default:
		    	score='F';		
		}
		
			System.out.println("=====결과=====");
			System.out.println("학점:"+score);
		

	}

}
