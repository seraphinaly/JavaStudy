import java.util.Scanner;

public class �߱�����_�޼ҵ���{
	//1.�ߺ����� �����߻�
	static int[] getRan(){
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
		 	return com;
		}
	

	//2.����� �Է�
	static int[] userInput() {
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
			break;
		}
			return user;
	}
	//3.��, ��Ʈ
	static void hint(int[] com,int[] user) {
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
			System.out.printf("Input Number:%d%d%d,"
					+ "Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
			
			if(isEnd(s)) {
				System.out.println("Game over!!");
				System.exit(0);
			}
	}
	
	//5.�����϶� ����
	static boolean isEnd(int s) {
		if(s==3) 
			return true;
		else
			return false;
		}
	
	//6.����
	static void process(){
		int[] com=getRan();
		while(true) {
			int[] user=userInput();
			hint(com,user);
		}
	}

	//����
	public static void main(String[] args){
		process();
	
	}
}