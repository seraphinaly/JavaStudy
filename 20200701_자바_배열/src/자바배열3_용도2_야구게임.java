/*
 *    3 6 9  int[] com={3,6,9}
 *    ===== ��� =====
 *    S: ��
 *    B: �ܡ�
 *    ==============
 *    3 9 6
 */
import java.util.*;
public class �ڹٹ迭3_�뵵2_�߱�����{
	public static void main(String[] args){
		
		int[] com={3,6,9};
		int[] user=new int[3];
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("3�ڸ� ���� �Է�:");
			
			//����1: �߸��� �Է�(100~999 �ƴ� ��)
			int input=scan.nextInt();
			if(input<100 || input>999) {
				System.out.println("�߸��� �Է��Դϴ�!\n"); //=>while�� ó������ ������
				continue; //while���� ���ǽ����� �̵�
			}
			//����2: �߸��� �Է�(�ߺ��߻�)
			user[0]=input/100;  //ex. 123/100=1
			user[1]=(input%100)/10;  //23/10=2
			user[2]=input%10; //ȭ��ż� ���ϱ�
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2]) {
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�.\n");
				continue;
			}
		
			//��
			int s=0,b=0;
			for(int i=0;i<3;i++) { //com
				for(int j=0;j<3;j++) { //user
					if(com[i]==user[j]) { //���� ���� �ִ��� Ȯ��
						if(i==j)
							s++;
						else
							b++;
					}	
				}
			}
		
			//����� ���
			System.out.println("===== ��� =====");
			System.out.print("S:");
			for(int i=0;i<s;i++) {
				System.out.print("��");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++) {
				System.out.print("��");
			}
			System.out.println("\n==============\n");
		
			//while�� ���Ῡ��
			if(s==3) {
				System.out.println("Game Over!");
				break;
			}
		}
		
	}
}
