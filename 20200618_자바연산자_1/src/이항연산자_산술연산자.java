
public class ���׿�����_��������� {
/*
 * ���������
 *  => �ڹٿ��� �����ϴ� ��� �����ڴ� ����� ��ȯ�� �� �ִ�
 *      ex.5<<2 == 5*2^2
 *      10100 ==> 20
 *  ������
 *    1)����ȯ: ���� ū ������������ ����
 *    2)/
 *      - 0���� ������ �����߻�
 *      - ����/����=����
 *    3)% : ������ ������, ��ȣ�� ������ ��ȣ�� ����
 *    4)��������� �켱������
 *      *, /, % > +, - (�� �𸦶��� ��ȣ �̿�)  
 *    
 */
	public static void main(String[] args) {
	   int a=10;
	   int b=3;
	   
	   int c=a+b;
	   int d=a-b;
	   int e=a*b;
	   int m=a/b;
	   int n=a%b;
	   
	   System.out.printf("%d+%d=%d%n",a,b,c); // %n=\n
	   System.out.printf("%d-%d=%d%n",a,b,d);
	   System.out.printf("%d*%d=%d%n",a,b,e);
	   System.out.printf("%d/%d=%d%n",a,b,m);
	   System.out.printf("%d%%%d=%d%n",a,b,n);
	   
	}

}
