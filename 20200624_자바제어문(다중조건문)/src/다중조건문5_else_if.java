import java.util.*;
public class 다중조건문5_else_if {

	public static void main(String[] args) {
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		ch=scan.next().charAt(0);
		
		if(ch>=0 && ch<=9)
		System.out.println("숫자입니다.");
		 else if(ch>='A' && ch<='Z'||ch>='a' && ch<='z')
			System.out.println("알파벳입니다.");
		 else if(ch>='가' && ch<='힣')
				System.out.println("한글입니다.");
		

	}

}
