//�����: �����Է�(1~12)/ ��/����/����/�ܿ�
import java.util.Scanner;
public class �������ǹ�4_�����Ǻ� {

	public static void main(String[] args) {
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է����ּ���(1~12).");
		month=scan.nextInt();
		if(month>12||month<1) {
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
		else {
		if(month==12 || month==1 || month==2)
			System.out.println("�ܿ��Դϴ�.");
		else if(month>=3 && month<=5)
			System.out.println("���Դϴ�.");
		else if(month==6 || month==7 || month==8)
			System.out.println("�����Դϴ�.");
		else if(month==9 || month==10 || month==11)
			System.out.println("�����Դϴ�.");
		}	
		

	}

}
