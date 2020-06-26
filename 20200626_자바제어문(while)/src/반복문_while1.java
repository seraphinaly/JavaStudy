/* while: 무한루프(데이터베이스(오라클), 파일 읽기, 서버 제작, 게임)
                 ===============           =======
                                    파일:XML,JSON
                  =>break(종료 걸어줘야함)                   */

//정수값 받아서 받은 정수 개수만큼 ★ 출력
import java.util.*;
public class 반복문_while1 {

	public static void main(String[] args) {
		int user=0;  //입력받을 값
		int i=1; //루프변수(보통 i, 어디까지 증가시킬 것인가) 필요
        Scanner scan=new Scanner(System.in); //API
        System.out.print("정수 입력:");
        user=scan.nextInt();
        
        while(i<=user) {
        	System.out.print("★");
        	i++; //user 입력개수까지 루프 실행
        }
		
	}

}
