/* ������ ����: �迭, Ŭ����
         ���ڿ� ���庯�� => String
         ����) String s="ABCDEF" => ��, ������(��� �����Ͱ� ���ڿ�)
       ==>String: (����)Ŭ���� -- �����ؼ� ���Ұ�
                     ������� => 1. ���ڰ���   s.length() : 6
                    2. ()��° ���ڸ� char�� ���� s.charAt(0) : 'A' */
//����ڰ� ���ڿ� �Է�: ��ҹ��� ���� Ȯ��
import java.util.*;
public class �ݺ���_while3 {

	public static void main(String[] args) {
	String s="ABCDEFG"; //���� ���� �� ����
	System.out.println(s);
	Scanner scan=new Scanner(System.in);
	System.out.print("���ڿ��� �Է��ϼ���>> ");
	s=scan.nextLine();  //���ڿ� �޼ҵ�: next(), nextInt()
	     //nextLine�� ������� �ν�, Scanner���� next() ���� ���� �������� �ν�
	System.out.println(s);
//	System.out.println("����:"+s.length()); 
	
	int a=0, b=0; //a:�ҹ��� ����, b: �빮�� ����
	int i=0; //������ ������ŭ �����ϴ� ����: ��������(������ ��� ���ư����� Ȯ��)
	/* ABCDEFG ������ 7�� 
	   0123456  ��ȣ�� 6������=> Java�� ���� �� �� 0������ ����, �ε�ȣ�� <=�� �ƴ� <�� ��!!! */
	while(i<s.length()) {
		char c=s.charAt(i);
		if(c>='A'&&c<='Z')
			b++; //�빮�� ���� Ȯ��
		if(c>='a'&&c<='z')
			a++; //�ҹ��� ���� Ȯ��
		i++;	 //i�� ���� ������ŭ ����
	}
	System.out.println("�빮�� ����:"+b);
	System.out.println("�ҹ��� ����:"+a);
	

	}

}
