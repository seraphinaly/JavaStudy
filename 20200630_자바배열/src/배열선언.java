/* �迭
   
   1)���� Ÿ���� ���� ������ ��� ����(����=>double�� ���� ����, ���ڿ�)
  
   2)�� ���� ���������� �������� ���� ����
       	������: �ε��� ��ȣ(0~n-1)�� ����
       	     ��) int[] arr={10,20,30,40,50};
       	     
       	   *�޸� �ּҸ� �̿��� �����ϴ� ���� ==> ��������(�迭, Ŭ����)
       	  **�ε��� ��ȣ�� �߰��� ������ �ʴ´�(������)=>for���� ����
       	            
       	             arr[0] arr[1] arr[2] arr[3] arr[4]
       	    ==arr==  ================================
       	      100       10    20    30    40    50
       	    =======  |======|=====|=====|=====|=====|
       	            100    104   108   112   116
    
    3)�迭 ������
      	��������[] �迭��; (�������� ���)
      	��1)�޸� ������ �̸� ����� ���߿� ���� ä��� ���
      	   =>new�� ����ϸ� �޸� ���� ����, 0������ �ʱ�ȭ
      	  	-��ȭ���� 10�� ��Ƽ� ����
      	     String[] title=new String[10]; =>'null'
      	  	-10�� �л��� ���� ����
      	     char[] grade=new char[10]; =>'\0'
      	  	-10�� �л��� ��� ����
      	     double[] avg=new double[10]; =>'0.0'
      	  
      	��2)���� ���� �����ϴ� ���
      	  	int[] arr={10,20,30,40,50}      
      	
      	������) 1.�迭�� ũ�⸦ �ʰ��ϸ� error: ArrayIndexOutBoundsException
      	        ex)������ n�� => 0~n-1 (������ �𸣴� ���: .length ���)
      	      2.��� �̿��=> �ַ� for�� �̿��ؼ� ó��(for���� ����ϴ� �ʱⰪ: 0)
 */
 public class �迭����{
	 public static void main(String[] args) {
		 //5�� ���� ���� => ����, ����, ���
		 int a=80;
		 int b=90;
		 int c=75;
		 int d=90;
		 int e=85;
		 int total=a+b+c+d+e;
		 double avg=total/3.0;
		 System.out.println("����:"+total);
		 System.out.println("���:"+avg);
		 
		 //�迭
		 int[] score={80,90,75,90,85}; //80=>score[0]
		 int total2=0;
		 double avg2=0.0;
		 for(int i=0;i<score.length;i++){
			 total2+=score[i];
		 }
		 avg2=total2/3.0;
		 System.out.println("����:"+total2);
		 System.out.println("���:"+avg2);
	 }
 }