
public class ��������_�ߺ�x�����߻�{

	public static void main(String[] args){
		int[] com=new int[10];
		for(int i=0;i<10;i++) {
			com[i]=(int)(Math.random()*10)+1; //����	
		}		

		int su=0; //������ ����
		//�ߺ� ������(false) ����, �ߺ��Ǹ�(true) ���� �ٽ� �߻�
		boolean bCheck=false; //2���� ����� �� �� boolean
		for(int i=0;i<10;i++) {
			//�ߺ����� Ȯ��
			bCheck=true;
			while(bCheck) {
				//�����߻�
				su=(int)(Math.random()*10)+1;
				//���� Ȯ��
				bCheck=false;
				//�� �� ���� ���� ����ƴ��� Ȯ��
				for(int j=0;j<i;j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			} //while�� ����
			com[i]=su;
		}
		for(int i:com) {
			System.out.print(i+" ");
		}
		
	}

}
