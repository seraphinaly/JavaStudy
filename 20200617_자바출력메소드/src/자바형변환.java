
public class �ڹ�����ȯ {

	public static void main(String[] args) {
		/*����ȯ: �ڽ��� ���������� �ٸ� ������ ������������ �ٲٴ� �� (boolean ����)
		 * byte < char < int < long < float < double
		 * 
		 * ���� -> �Ǽ�, ����, ����
		 * �Ǽ� -> ����, ����
		 * ���� -> ����, �Ǽ�
		 */
		double d=(double)5/2; //��� �ϳ��� ����ȯ ������� ����� ����.
		System.out.println(d);
		
		System.out.println('a'+1); //�ڵ� ����ȯ
		/*
		 * int ���ϴ� ����� �������  int
		 *  byte+byte => int
		 *  char+char => int
		 *  short+byte => int
		 *  char+byte+short => int
		 */
		
		byte b=10;
		byte c=20;
		int e=b+c;
	 }

}
