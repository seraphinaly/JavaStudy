/* ����� �Է�=> 0, 1, 2
 * 0�̸�: ����
 * 1�̸�: ����
 * 2��:   ��
 */
import java.util.*;
public class �ڹ����ǹ�����3_���������� {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2) �� �ϳ� �Է�:");
		int user=scan.nextInt();
		
		if(user==0)
			System.out.println("player:����");
		if(user==1)
			System.out.println("player:����");
		if(user==2)
			System.out.println("player:��");
		if(!(user>=0 && user<3))
			System.out.println("�Է°��� �ùٸ��� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
		
		//��ǻ��
		int com=(int)(Math.random()*3);
                     //0~2 ������ ���� �߻�
		if(com==0)
            System.out.println("computer:����");
		if(com==1)
			System.out.println("computer:����");
		if(com==2)
			System.out.println("computer:��");
			
		if(com==user)
			System.out.println("Draw!");
		if((com==1 && user==2)||(com==2 && user==0)||(com==0&&user==1))
			System.out.println("You WIN!");
		if((com==2 && user==1)||(com==0 && user==2)||(com==1&&user==0))
			System.out.println("Computer WIN!");

		/* �� �����ϰ� ���̱�(���� �̿�)
		 * if(com-user==-2 || com-user==1)
		 * System.out.println("Computer WIN!");
		 * if(com-user==-1 || com-user==2)
		 * System.out.println("You WIN!");
		 * if(com==user)
		 * System.out.println("Draw!");
		 */
		//����: ����, �Ǽ�, ����(�⺻��)�� ==���� �� ����, ���ڿ�(������)�� �Ұ�=>equals()���
	}

}
