import java.util.*;

public class ��������7 {

	public static void main(String[] args) {
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		user = scan.nextInt();

		if (user >= 60 && user <= 100)
			System.out.println("�հ�");
		else if (user >= 0 && user < 60)
			System.out.println("���հ�");
		else
			System.out.println("������ �ٽ� �Է��ϼ���.");

	}

}
