/*1)break: �ݺ��� ����
  2)continue: Ư���κ� ����
   - ���ǹ�(if)�� ���� ���
   - �� ���� �ݺ����� ����
     break:�ݺ��� ��ü(for, do~while, while), switch
     continue: �ݺ��������� ��� ����
     return: ����(�޼ҵ� ����) => ���� ��� JVM�� �ڵ����� �߰� */
public class �ݺ����_break{

	public static void main(String[] args){
	    //1~10 ���, 5�� �� ����
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");			
			if(i==5) 
			break; //i==5�� ����(while,for,do~while ����)
		}

		//1~10 ���� Ȧ���� ���
		System.out.println("\n======= ���ǹ� =======");
		//���ǹ�
		for(int i=1;i<=10;i++) {
			if(i%2!=0) // (i%2==1) or !(i%2==0) 
				System.out.print(i+" ");			
		}
		//����: 2��
		System.out.println("\n======= 2�� ���� =======");
		for(int i=1;i<=10;i+=2) {
				System.out.print(i+" ");			
		}
		//continue ��� => while:���ǽ�, for:���������� �̵�
		System.out.println("\n====== continue ======");
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				continue; //¦���� ����=>: ������ i++�� �̵�
			System.out.print(i+" ");
		}
		
	}

}
