
public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*����(boolean, ��:true/false) 
		 *  : if(���ǹ�) ���� �ַ� ���
		 *   ex. 2�ο���� �� , �α���
		 */
         boolean b=false; //�ݵ�� �ҹ���, 1byte(�������� �ٲ� �� ����)
         System.out.println("b="+b);
         b=true;
         System.out.println("b="+b);
			
	     byte a=10; 
		 byte B=30; 
		 byte c=(byte)(a*B); 
		 System.out.println(c); //���� 300�ε� 4bit �տ��� �׳� �߶����(overflow)
		 
		System.out.println((int)'A');
		System.out.println((int)'��');
		
		System.out.println((char)12619); //�� ���ڴ� ���ڹ�ȣ�� ������ ����(char�� ���������� �ν�)
		
	}

	     
}
