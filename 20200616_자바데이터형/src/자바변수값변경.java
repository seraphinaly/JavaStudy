/*
 * ���� ����
 * ���� �ʱ�ȭ
 * ���� �� ����
 * �ٸ� ������ �� ����
 */

public class �ڹٺ��������� {

	// i, j�� ���������� ������� �ʴ´�
	
	public static void main(String[] args) {
		int a=100;
		System.out.println("a="+a);
		a=200;
		System.out.println("a="+a);
		a=300;
		System.out.println("a="+a);
		
		int b = a; // b��� �޸𸮿� a���� �����ض�
		System.out.println("b="+b);
		int c = a + b;
		System.out.println("c="+c);
		
		int x,y,z;
		x=y=z=100; // z>>y>>x ������� ����(�ڿ������� �б�)
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}

}
