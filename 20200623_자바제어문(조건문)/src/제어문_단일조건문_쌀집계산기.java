import java.util.Scanner;
public class ���_�������ǹ�_�������� {
//���� 2��, char 1(+,-,*,/) ��Ģ����
	public static void main(String[] args) {
		int a, b, c; //a,b: ������Է�, c:������ ����
		char op='+';
		Scanner scan=new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�");
		a=scan.nextInt();
		System.out.print("�� ��° ���� �Է�");
		b=scan.nextInt();
		System.out.print("������(+,-,*,/):");
		op=scan.next().charAt(0); //Scanner: char�� ó�� ����:charAt���� ��ȯ
		                          //System.in:����ó���� �ؾ���
        if(op=='+') {
        	System.out.printf("%d+%d=%d\n",a,b,a+b);
        }
        if(op=='-') {
        	System.out.printf("%d-%d=%d\n",a,b,a-b);
        }
        if(op=='*') {
        	System.out.printf("%d*%d=%d\n",a,b,a*b);
        }
        if(op=='/') {
        	if(b==0) {
        		System.out.println("0���� ���� �� �����ϴ�.");
        	} else
        	System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);
        }
        System.out.println("���α׷� ����"); //main:���α׷� ����, ���� �޼ҵ�
	}   

}
