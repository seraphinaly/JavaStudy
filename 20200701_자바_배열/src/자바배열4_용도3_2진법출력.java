/* �뷡����, ������, �ٹ�, ������, ���� (50��) //����: 250��
 *  50���� ���� �뵵��, 5�� �迭 ���� =>�ٸ� ������ 5�� �迭 �ϳ��� ������ Ŭ����(��������� ��������)
 */

/* ����
 *  ���
 *	�ݺ���= for(Ƚ�� ����)
 *      = while(������� �ݵ�� �Է�): break;
 *  ������=>���������,����
 *  ���ǹ�=>��,����,��(if/for/while����)    
 */
import java.util.*;
public class �ڹٹ迭4_�뵵3_2�������{
	//������Է� ����: 2���� ���
	//16bit => 32767
	//���� 17�� �ʿ�: 16bit(0,1 ������� 16��=> �뵵 ����=> �迭), user(�ٸ� �뵵=> ��������)
	public static void main(String[] args){
		int[] binary=new int[16]; //0,1�� ����
		int user=0; //����� �Է� ����
		int index=15; //�ڿ������� ���=> �迭 ����
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�(0~32767):");
		user=scan.nextInt();
//		System.out.println(Integer.toBinaryString(user)); //lib �̿�
		while(true) { //Ƚ������x, ��������� break)
			binary[index]=user%2; //2�� ���� �������� ������ �ڸ����� �����ϰڴ�
			user=user/2;
			if(user==0) break;
			index--;
		}

		//��� ���
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0) 
				System.out.print(" "); //4�� ��� �� �ϳ� ����
				System.out.print(binary[i]); //������ ���
		}
		
		
		
		
		
	}

}
