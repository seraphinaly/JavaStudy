/* while: ���ѷ���(�����ͺ��̽�(����Ŭ), ���� �б�, ���� ����, ����)
                 ===============           =======
                                    ����:XML,JSON
                  =>break(���� �ɾ������)                   */

//������ �޾Ƽ� ���� ���� ������ŭ �� ���
import java.util.*;
public class �ݺ���_while1 {

	public static void main(String[] args) {
		int user=0;  //�Է¹��� ��
		int i=1; //��������(���� i, ������ ������ų ���ΰ�) �ʿ�
        Scanner scan=new Scanner(System.in); //API
        System.out.print("���� �Է�:");
        user=scan.nextInt();
        
        while(i<=user) {
        	System.out.print("��");
        	i++; //user �Է°������� ���� ����
        }
		
	}

}
