import java.util.*; //Ŭ���� ��ȯ
// String, System, Math ==> java.lang(���� ����)

public class �ڹٺ����ʱ�ȭ��� {

	public static void main(String[] args) {
  //(����� ���ÿ� �ʱⰪ �ο�) �ַ� �����ڿ�(admin)
	// 1)���� ó��
		int a=100;
		System.out.println("a="+a);
	
  //(�����ϰ� ���� ���߿� �ʱⰪ �ο�) �ַ� ����ڿ�(user)=>�� ���� ����		
   // 2)���� �� Ű����� ������ �Է� �޾Ƽ� ����
		int b;
		b=200;
		System.out.println("b="+b);
		
   // 3)������ �� ����(����): ����, �ζ�
		int c;
		c=(int)(Math.random()*100)+1; //�� ��ȯ (double->int), random�� ���� double
		                              // 0.0~0.99 -> *100: 0.0~99.0 -> int: 0~99 -> +1: int 1~100 :�����߻� ����(����ó��)
		System.out.println("c="+c);
				
   // 4)�Է�â�� ���� ���� �޴� ���
		int d;
		Scanner scan=new Scanner(System.in); //System.in: Ű���� �Է°��� �о�Ͷ�
		System.out.println("�����Է�:");
		d=scan.nextInt();
		
		System.out.println("d="+d);
		
	}

}
