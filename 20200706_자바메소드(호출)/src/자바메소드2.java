//��Ģ����
import java.util.*;
public class �ڹٸ޼ҵ�2{
	static int plus(int a,int b) {
		return a+b;
	}
	
	static int minus(int a,int b) {
		return a-b;
	}
	
	static int gob(int a,int b) {
		return a*b;
	}
	
	static void div(int a,int b) {
		if(b==0)
			System.out.println("0���� ���� �� �����ϴ�.");
		else
			System.out.printf("%d/%d=%d.2f\n",a,b,a/(double)b);
	}
	
	public static void main(String[] args){
		//����� ��û�� �� ����, ����
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�(5 2):");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("������ �Է�(+,-,*,/):");
		String op=sc.next();
		int result=0;
		switch(op) {
		case "+":
			result=plus(a,b);
			System.out.printf("%d+%d=%d\n",a,b,result);
			break;
		case "-":
			result=minus(a,b);
			System.out.printf("%d-%d=%d\n",a,b,result);
			break;
		case "*":
			result=gob(a,b);
			System.out.printf("%d*%d=%d\n",a,b,result);
			break;
		case "/":
			div(a,b);
			System.out.printf("%d/%d=%d\n",a,b,result);
			break;
		default:
			System.out.println("�߸��� �������Դϴ�!");
		}
		

	}

}
