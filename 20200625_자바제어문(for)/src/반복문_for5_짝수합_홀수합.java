//1~100 ¦����, Ȧ����
public class �ݺ���_for5_¦����_Ȧ���� {

	public static void main(String[] args) {
		int even=0, odd=0; //������� ��Ƶα�(���� ����)
		for(int i=1;i<=100;i++) { //i�� 100���� 1�� ������ų�ǵ�
			if(i%2==0)            //¦����
				even+=i;          //even�� ���ϰ�
			else                  //Ȧ����                
				odd+=i;           //odd�� ���ض�
		}
		System.out.println("1~100���� ¦�� ��:"+even);
		System.out.println("1~100���� Ȧ�� ��:"+odd);	
			

	}

}
