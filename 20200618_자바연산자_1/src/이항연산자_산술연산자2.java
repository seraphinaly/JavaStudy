
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		 System.out.println('��'+'��'+'��');
// **������: ���������� �ʰ��ϸ� error�� �ƴ϶� overflow�� �߻�
		 byte b1=64;
		 byte b2=64;
		 byte b3=(byte)(b1+b2);
		 System.out.println("b3="+b3); //-128(������� ���ߴµ� ������ ���Դ�>>overflow)
		
	// %
		 int a=5;
		 int b=2;
		 System.out.println(a%b);
		 System.out.println(-a%b);
		 System.out.println(a%-b);
		 System.out.println(-a%-b);
		 
		 System.out.println((int)(10.5+10.5));
		 System.out.println((int)10.5+(int)10.5);
	}

}
