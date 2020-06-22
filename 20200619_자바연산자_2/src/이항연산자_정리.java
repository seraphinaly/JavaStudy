/*
 * 응용시 많이 사용하는 연산자: 증감연산자(++,--), 산술연산자, 비교연산자, 논리연산자, 대입연산자
 * 
 * 삼항연산자: 조건?값1:값2 (=if~else) => 게임에서 많이 나옴
 *             =>true(값1)
 *             =>false(값2)
 */
import java.util.*; //폴더를 불러옴
//import java.lang.*(안써도 됨) => System, String, Math
//정수 입력받아서 짝수/홀수 판별
public class 이항연산자_정리 {

	public static void main(String[] args) {
		/*
		 * Scanner scan=new Scanner(System.in); //system.in: 키보드 입력 //System.out: 화면 출력
		 * System.out.print("정수 입력:"); //입력받은 정수를 저장 int a=scan.nextInt();
		 * 
		 */
		int a=(int)(Math.random()*100)+1; //1~100 난수발생
		/*     ---- ------------------ ---
		 *       2          1           3  (연산자 우선순위: 괄호>단항>이항)
		 *        1)0.0~0.99=>0.0~99.0      
		 *        2)0~99
		 *        3)1~100
		 */
		System.out.println(a);    
		System.out.println(a%2==0?"\"짝수\"입니다!":"\'홀수\'입니다!");
	} 

}
