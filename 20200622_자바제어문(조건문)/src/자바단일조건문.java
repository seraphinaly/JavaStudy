
public class �ڹٴ������ǹ� {

	public static void main(String[] args) {
		int score=56;
		if (score>=60) { 
            System.out.println("ù��° if�� ����");		
			System.out.println("Success");
		}
		///������ ����(������:�ӵ� ����)
		if (score<60) { //else
			System.out.println("�ι�° if�� ����");
			System.out.println("Fail");
		}	
		
		/*
		 * 1. ���๮���� 1���� ��� {} ��������
		 * 2. ����if(���� ����)�� ����if(1���� ����) ���� ����
		 */

		int a=20; //3���, 5���, 7���
		if(a%3==0) //���⼭ �����ݷ� ������ �ȵ� - if�� ��������!
			System.out.println(a+"�� 3�� ����Դϴ�."); //��������� �� ����
		    System.out.println("if(a%3==0) ���๮��");//������ ���๮��: �ٲٷ��� {} ���
		if(a%5==0) //����if(else if) ���� ��� �ȵ�
			System.out.println(a+"�� 5�� ����Դϴ�.");
		if(a%7==0)
			System.out.println(a+"�� 7�� ����Դϴ�.");
	}
}