//up-down���� ==>�߸��� �Է�:continue
//�Է°���: continue, ����: continue
//���ڸ� ���� ������ ���� ���: while
import java.util.*;
public class �ݺ����_break_continue{

	public static void main(String[] args){ //main: ���� �Ұ�
		//���α׷��� ���α׷��Ӱ� ����� ������ �� �پ� ����
		//������ ���� ����=> ����(com)
		int com=(int)(Math.random()*100)+1; 
		//���⶧����=> ���ѷ��� =>Ƚ���� �������� �ʾ��� ��
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("1~100 ���� ���� �Է�:");
			int user=scan.nextInt();
			
			if(user<1 || user>100) {
				System.out.println("�߸��� �Է°��Դϴ�.");
				continue; //ó������ �ٽ� ����
			}
			if(user>com) {
				System.out.println("Down!");
			}else if(user<com){
				System.out.println("Up!");
			}else {
				System.out.println("Game over!!");
				break;//System.exit(0)
			}
		}
					
	}

}
