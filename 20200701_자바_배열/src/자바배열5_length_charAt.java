/* �迭 = "�뵵"���� ��� ���!
 *	    byte[] b => File ����
 *	  String[] s => ���ڿ��� ���� ���(�̸�,�ּ�,��ȭ)
 *	     int[] i => ���� ���, ���
 *	  double[] d => ���,�󵵼�,������
 *	 boolean[] b => ���� ����
 */
public class �ڹٹ迭5_length_charAt{

	public static void main(String[] args){
		String[] s= {
				"peach",
				"tangerine",
				"grapefruit",
				"cherry",
				"watermelon",
				"coconut",
				"pineapple",
		};
		//�̸��� ���� �� ������?
		System.out.println("===== ��ü ���ϸ� =====");
		for(String ss:s) {  //index�� ����!!! =>�� ���� �Ұ�
			System.out.println(ss);
		}
		System.out.println("===================");
		System.out.println("\n���� �� ���� �̸���?");
		int max=0;
		for(String ss:s) {
			int len=ss.length(); //���ڿ�: ���� ����=> length()
			if(max<len)
				max=len;
		}
		
		//���
		for(String ss:s) {
			if(ss.length()==max)
			System.out.println(ss);
		}
		
		System.out.println("\n���� ª�� ���� �̸���?");
		int min=100;
		for(String ss:s) {
			int len=ss.length(); 
			if(min>len)
				min=len;
		}
		
		//���
		for(String ss:s) {
			if(ss.length()==min)
			System.out.println(ss);
		}
	
	/* ���ڰ��� Ȯ��=> ��й�ȣ
	 * ���ڿ�
	 * String => char[] 
	 * "Hello Java"
	 *  0123456789
	 */
		System.out.println();
		String msg="Hello Java"; //���ڿ����� ���ϴ� ���� ����
		System.out.println("5��° ���ڴ�?");
		System.out.println(msg.charAt(4));
		System.out.println();
		
		for(int i=0;i<msg.length();i++) {
			System.out.printf("%d��° ���ڴ�?"+msg.charAt(i)+"\n",i);			
		}
	}

}
