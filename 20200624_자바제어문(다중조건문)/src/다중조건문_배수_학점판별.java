import java.util.*;
public class �������ǹ�_���_�����Ǻ� {
// ������ ���� ��쿡 ��� => ������ �´� ���常 1���� ����(������ �����Ϸ��� ����if�� ���)
	
	public static void main(String[] args) {
		int a=15;
		if(a%3==0)
			System.out.println("3�� ���"); // ��� �� ����
		else if(a%5==0)
			System.out.println("5�� ���"); // ����: ��¾ȵ�>> ����if �����.
		else if(a%7==0)
			System.out.println("7�� ���");
		
		if(a%3==0)
			System.out.println("3�� ���");
		if(a%5==0)
			System.out.println("5�� ���");
		if(a%7==0)
			System.out.println("7�� ���");
		
//���� ���: 3�� ���� �޾Ƽ� ����, ���, ���� ���
		int kor=0, eng=0, math=0;
		int total=0;                     //���������� �ʱⰪ ���� ���� ���̱� 
		double avg=0.0; char grade='A';
		Scanner scan = new Scanner(System.in); //�Է� �޾Ƽ� ������ ����
		System.out.print("�������� �Է�:");
		kor=scan.nextInt();  
		System.out.print("�������� �Է�:");
		eng=scan.nextInt();
		System.out.print("�������� �Է�:");
		math=scan.nextInt();
		
	    total=kor+eng+math;
	    avg=total/3.0;
	    		
	    if(avg>=90) 
	    	grade='A';
	    	else if(avg>=80) 
	    		grade='B';
	    		else if(avg>=70) 
	    			grade='C';
	    			else if(avg>=60) 
	    				grade='D';
	    				else
	    					grade='F';
	   
	    System.out.println("====== ���� ======");
	    System.out.println("��������:"+kor);
	    System.out.println("��������:"+eng);
	    System.out.println("��������:"+math);
	    System.out.println("����:"+total);
	    System.out.printf("���:%.2f\n",avg);
	    System.out.println("����:"+grade);
	 
	}

}
