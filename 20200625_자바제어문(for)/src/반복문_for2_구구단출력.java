//2~9 ������Է� : �� ���� ������ ��� - �ݺ� �������� ���(��� ����)�� ���ƾ� ���� ���� �� ����
import java.util.*;
public class �ݺ���_for2_��������� {
	public static void main(String[] args) {
		int dan=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�(2~9):");
		dan=scan.nextInt();
		
		for(int i=1;i<=9;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
}