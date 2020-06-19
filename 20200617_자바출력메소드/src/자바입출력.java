import java.util.*; // 이전에 만들어진 자바파일을 읽어온다
/* import =
 * class Scanner{
 * } 
 */
public class 자바입출력 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("실수 입력:"); // println("실수 입력:\n");과 동일
		double a=scan.nextDouble(); //정수면 int, nextInt()로 받음
		System.out.println("a="+a);
		
	
		
	}
}
