import java.util.Scanner;
public class �ڹټ������ǹ�2 {

	public static void main(String[] args) {
		/*���⿩�� Ȯ������
		 * 1. 4�⸶�� ����
		 * 2. 100�⸶�� ����
		 * 3. 400�⸶�� ����
		 */
		int year=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		year=scan.nextInt();
		//���⿩�� Ȯ��
		if((year%4==0 && year%100!=0) || (year%400==0)) { //����: &&
			System.out.println(year+"���� �����Դϴ�.");
		} else {
			System.out.println(year+"���� ������ �ƴմϴ�.");
		  }

	}

}
