// ����ڰ� ���ĺ��� �Է��ϸ� => A���� �Է°����� ����ϵ���
// char => scan.next().charAt(0) (���ڿ�next���� ù��° ���� ���� �Ͷ�)
/* "ABCDE"  ==> scan.next()
    01234       ex) 'B'=> charAt(1) */
import java.util.*;
public class �ݺ���_while2 {

	public static void main(String[] args) {
		char user=' '; //�ʱⰪ:������ �����!
		//while => ������ false�� �� ������ �����ϴ� ����: ��������
		char c='A';
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� �Է�(�빮��):");
		user=scan.next().charAt(0);
		
		if(user<'A'||user>'Z') {
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}	
		else {
			while(c<=user) {
				System.out.print(c);
				c++;
			}
		}	
		
	}

}
