/*
 * ����� ���� ����ϴ� ������: ����������(++,--), ���������, �񱳿�����, ��������, ���Կ�����
 * 
 * ���׿�����: ����?��1:��2 (=if~else) => ���ӿ��� ���� ����
 *             =>true(��1)
 *             =>false(��2)
 */
import java.util.*; //������ �ҷ���
//import java.lang.*(�Ƚᵵ ��) => System, String, Math
//���� �Է¹޾Ƽ� ¦��/Ȧ�� �Ǻ�
public class ���׿�����_���� {

	public static void main(String[] args) {
		/*
		 * Scanner scan=new Scanner(System.in); //system.in: Ű���� �Է� //System.out: ȭ�� ���
		 * System.out.print("���� �Է�:"); //�Է¹��� ������ ���� int a=scan.nextInt();
		 * 
		 */
		int a=(int)(Math.random()*100)+1; //1~100 �����߻�
		/*     ---- ------------------ ---
		 *       2          1           3  (������ �켱����: ��ȣ>����>����)
		 *        1)0.0~0.99=>0.0~99.0      
		 *        2)0~99
		 *        3)1~100
		 */
		System.out.println(a);    
		System.out.println(a%2==0?"\"¦��\"�Դϴ�!":"\'Ȧ��\'�Դϴ�!");
	} 

}
