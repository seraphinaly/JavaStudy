/*
 * 1. ������ �Է� �޾Ƽ� ¦������ Ȧ������ Ȯ��=> 10�� ¦����, 11�� Ȧ���� (if else)
 */
import java.util.Scanner;
public class �ڹ����ǹ����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int number = scan.nextInt();
		if(number%2==0) {
			System.out.println(number+"�� ¦����");
		} else {
			System.out.println(number+"�� Ȧ����");
		}

	}

}
