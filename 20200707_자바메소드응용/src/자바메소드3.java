//����� �����Է� => ¦Ȧ �Ǻ�
import java.util.*;
public class �ڹٸ޼ҵ�3{
	//1:����� �Է°� �޾ƿ���
	static int userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=sc.nextInt();
		return num;
	}
	
	//2:¦Ȧ �Ǻ� ���
	static void judge(int num) {
		if(num%2==0)
			System.out.println(num+"��(��) ¦���Դϴ�.");
		else
			System.out.println(num+"��(��) Ȧ���Դϴ�.");		
	}
	
	public static void main(String[] args){
		int num=userInput();
		judge(num);						
	}
}