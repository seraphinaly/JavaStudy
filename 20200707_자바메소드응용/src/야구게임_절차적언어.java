
/*
 * 1.3���� ���� �����߻�(�ߺ�����) =>1~9����
 * 2.����� �Է�
 * 3.��
 * 4.��Ʈ
 * 5.�����϶� ����
 * 6.����(���μ���)
 */
import java.util.*;

public class �߱�����_���������{
	public static void main(String[] args){
		// 1.3���� ���� �����߻�(�ߺ�����)
		int[] com=new int[10];
		int su=0; //������ ����
		//�ߺ� ������(false) ����, �ߺ��Ǹ�(true) ���� �ٽ� �߻�
		boolean bCheck=false; //2���� ����� �� �� boolean     

		for(int i=0; i<3; i++){
			//�ߺ����� Ȯ��
			bCheck=true;
			while(bCheck){
				//�����߻�
				su=(int)(Math.random()*9)+1;
				//���� Ȯ��
				bCheck=false;
				//�� �� ���� ���� ����ƴ��� Ȯ��
				for(int j=0; j<i; j++){
					if(com[j]==su){
						bCheck=true;
						break;
					}
				}
			} //while�� ����
			com[i]=su;
		}
		for(int i:com){
			//System.out.print(i+" ");
		}

		//2.����� �Է�
		int[] user=new int[3];
		//�Է�
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("�� �ڸ� �����Է�:");
			int input=sc.nextInt();

			//����ó��
			//ù��° ����:3�ڸ� ������ �Է� �ȵ� ���
			if(input<100 || input>999){
				System.out.println("�߸��� �Է��Դϴ�!");
				continue;
			}
			user[0]=input/100; //���� �ڸ� ��
			user[1]=(input%100)/10; //���� �ڸ� ��
			user[2]=input%10; //�����ڸ���	

			//�ι�° ����
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2]){
				System.out.println("�ߺ��� ������ ����� �� �����ϴ�!");
				continue;
			}

			//����° ����
			if(user[0]==0 || user[1]==0 || user[2]==0){
				System.out.println("0�� ����� �� �����ϴ�!");
				continue;
			}
			//��
			int s=0, b=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
		//��Ʈ
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
		//���Ῡ��	
			if(s==3) {
				System.out.println("Game over!!");
				break;
			}
		}

	}
}