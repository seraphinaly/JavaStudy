import java.util.*;
public class ���ù�_switch_case {

	public static void main(String[] args) {
		
	 int select=0;
	 Scanner scan=new Scanner(System.in);
	 System.out.print("���� �Է�(1~5): ");
	 select=scan.nextInt();
	 
	 switch(select)
	 {
	 case 1: //���� �ݵ�� ����
//		 System.out.println("1�� �Ǵ� 2���� �Է��߽��ϴ�.");
//		 break;  //switch���� �����Ѵ�
	 case 2:
		 System.out.println("1�� �Ǵ� 2���� �Է��߽��ϴ�.");
		 break;
	 case 3:
		 System.out.println("3���� �Է��߽��ϴ�.");
		 break;
	 case 4:
		 System.out.println("4���� �Է��߽��ϴ�.");
		 break;
	 case 5:
		 System.out.println("5���� �Է��߽��ϴ�.");
		 break;
	 default:
		 System.out.println("1~5 ���� ���ڸ� �Է��ϼ���.");
	 }
	}
}	