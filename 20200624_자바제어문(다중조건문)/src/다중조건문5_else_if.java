import java.util.*;
public class �������ǹ�5_else_if {

	public static void main(String[] args) {
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		ch=scan.next().charAt(0);
		
		if(ch>=0 && ch<=9)
		System.out.println("�����Դϴ�.");
		 else if(ch>='A' && ch<='Z'||ch>='a' && ch<='z')
			System.out.println("���ĺ��Դϴ�.");
		 else if(ch>='��' && ch<='�R')
				System.out.println("�ѱ��Դϴ�.");
		

	}

}
