
/* ���ڿ� �� 	 equals(): ��ҹ��� ����
 * (cf.==)	 equalsIgnoreCase():��ҹ��� ����x 	
 * ���� ã��	 contains()
 * ���� ���ڿ� 	 startsWith()
 * �� ���ڿ�    	 endsWith()
 * ���ڿ� �ڸ���   substring()
 * ���� ���� 	 charAt()
 * ���� ���� 	 length()
 * ���� ����	 trim()
 * ���� ��ġã��   indexOf(),lastIndexOf()
 * ����ȯ		 valueOf()
 */
//�α��� ó��
import java.util.*;
import javax.swing.*;

public class ���ڿ�1_�α���_equals{

	public static void main(String[] args){
		//ID,PW
		final String ID="admin";
		final String PW="1234";		
				
		Scanner scan=new Scanner(System.in);
		System.out.print("ID �Է�:");
		String id=scan.nextLine();
		System.out.print("��й�ȣ �Է�:");
		String pw=scan.nextLine();
		
		//���
		if(id.equalsIgnoreCase(ID) && pw.equals(PW)) {
			System.out.println("�α��� �Ϸ�!");
		} else {
			System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�.");
		}

	}

}
