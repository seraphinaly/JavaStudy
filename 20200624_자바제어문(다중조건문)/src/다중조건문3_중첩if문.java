//���� �Է°� 2�� �޾� ��Ģ����
import java.util.*;
public class �������ǹ�3_��øif�� {

	public static void main(String[] args) {
		int a=0, b=0;
		char op='+';
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� ���� �Է�:(90 100)");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("������ �Է�(+,-,*,/):");
		op=scan.next().charAt(0); //char�� �����ν��� �ȵǱ� ������ ù�� �߶� ��ȯ
		
		if(op=='+') {
			System.out.printf("%d+%d=%d\n",a,b,a+b);}
		else if(op=='-') {
			System.out.printf("%d-%d=%d\n",a,b,a-b);}
		else if(op=='*') {
			System.out.printf("%d*%d=%d\n",a,b,a*b);}
		else if(op=='/') {
				if(b==0) {
					System.out.println("0���� ���� �� �����ϴ�."); //��øif��
				} 
				else {
					System.out.printf("%d/%d=%2f\n",a,b,a/(double)b);
				}
		}
	    else {  //������ �ܿ� �ٸ� ���ڸ� �Է����� �� ����ó��
		  System.out.println("�߸��� �Է°��Դϴ�.");
	    }
		}		  

	}


