
public class ���׿�����_���������� {

	public static void main(String[] args) {
	
		/*���������� ++(--): ������ �� �� ����(����), �޸𸮿� ���� ���ص� �ܵ����� ��밡��(�������� ����)
	     *�ݺ��� ���, ���ӷ��� ���� �� ���
	     * ex) for(int i=1, i<=10, i++) //1���� �ϳ��� ������Ű�ٰ� 10�� �Ǹ� �����
		 */
		int a= 10;
		int b= ++a; //��ġ������: ���� +1�ϰ� ������ a ����
		System.out.println(a); //11
		System.out.println(b); //11
		
		int A= 10;
		int B= A++; //��ġ������: ++�� ������������ �Ѿ �� ���
		System.out.println(A); //11
		System.out.println(B); //10
		
		boolean bCheck=false;
		bCheck=!bCheck;  //������ �ؾ� �����Ϳ� ����, �ٷ� ���� ��¸� �ϸ� ���� �ٲ����� ����. ������ ���â������ ����
		System.out.println(bCheck); //true
		System.out.println(bCheck=!bCheck); //false
		System.out.println(!bCheck); //true
		System.out.println(bCheck); //false

		
		int m=10;
		int n=++m + ++m + ++m + ++m;
		System.out.println("m="+m+",n="+n);
		
		
	}

}
