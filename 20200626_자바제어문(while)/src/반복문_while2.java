// 사용자가 알파벳을 입력하면 => A부터 입력값까지 출력하도록
// char => scan.next().charAt(0) (문자열next에서 첫번째 값을 갖고 와라)
/* "ABCDE"  ==> scan.next()
    01234       ex) 'B'=> charAt(1) */
import java.util.*;
public class 반복문_while2 {

	public static void main(String[] args) {
		char user=' '; //초기값:공백을 줘야함!
		//while => 조건이 false가 될 때까지 변경하는 변수: 루프변수
		char c='A';
		
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력(대문자):");
		user=scan.next().charAt(0);
		
		if(user<'A'||user>'Z') {
			System.out.println("입력값이 잘못되었습니다.");
		}	
		else {
			while(c<=user) {
				System.out.print(c);
				c++;
			}
		}	
		
	}

}
