// �� ���� ������ ��¥ ��� => 28, 30, 31(���� 3��)
// ���� 5�� �̻�Ǹ� switch~case�� �� ����
import java.util.*;
public class �������ǹ�2_������¥�Ǻ� { //�ѹ��� ����!!

	public static void main(String[] args) {
		 int month=0;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("���ϴ� ���� �Է�(1-12)");
		 month=scan.nextInt(); //�޸𸮿� ����
		 //����(������, ���)=>�޼ҵ�
//		 if(month==1)
//			 System.out.println("1���� 31�ϱ��� �ֽ��ϴ�.");
//		 else if(month==2)
//			 System.out.println("2���� 28�ϱ��� �ֽ��ϴ�.");
//		 else if(month==3)
//			 System.out.println("3���� 31�ϱ��� �ֽ��ϴ�.");
//		 else if(month==4)
//			 System.out.println("4���� 30�ϱ��� �ֽ��ϴ�.");
//		 else if(month==5)
//			 System.out.println("5���� 31�ϱ��� �ֽ��ϴ�.");
//		 else if(month==6)
//			 System.out.println("6���� 30�ϱ��� �ֽ��ϴ�.");
//		 else if(month==7)
//			 System.out.println("7���� 31�ϱ��� �ֽ��ϴ�.");
//		 else if(month==8)
//			 System.out.println("8���� 31�ϱ��� �ֽ��ϴ�.");
//		 else if(month==9)
//			 System.out.println("9���� 30�ϱ��� �ֽ��ϴ�.");
//		 else if(month==10)
//			 System.out.println("10���� 31�ϱ��� �ֽ��ϴ�.");
//		 else if(month==11)
//			 System.out.println("11���� 30�ϱ��� �ֽ��ϴ�.");
//		 else if(month==12)
//			 System.out.println("12���� 31�ϱ��� �ֽ��ϴ�.");
		 
         // �ϵ��ڵ� ==> ����ȭ(�����ս�, ���� �ӵ�), ������(��������)
		 //                           => �ҽ��ڵ��� �������
		 if(month>12 || month<1) {
			 System.out.println("�߸��� �Է°��Դϴ�. �ٽ� �Է��ϼ���."); //����ó��: if��
		 } else {
		     if(month==4 || month==6 || month==9 || month==11) {
			   System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�.");
		     } else if(month==2) {
			     System.out.println(month+"���� 28�ϱ��� �ֽ��ϴ�.");
		       }  else {
			        System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�.");
		          }
		   }
			 
		 
	}
}

