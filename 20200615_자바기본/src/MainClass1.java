
public class MainClass1 {
    public static void main(String[] args) {
		// �ڹ� ǥ����
    	/*
    	 * ����
    	 *  = 10���� 10,20,...
    	 *  = 8����(0) 
    	 *       011 = 9
    	 *  = 16����(0x)
    	 *       0x10
    	 *  = 2����(0b)
    	 *       0b1010
    	 * �Ǽ�
    	 *  = ���� ũ�� => 4byte(�Ҽ��� ���� 8�ڸ�)   10.5f
    	 *           => 8byte(�Ҽ��� ���� 16�ڸ�)  10.5(d,��������)
    	 * ����
    	 *  = '' =>�� ���ڸ� ����, �ѱ� ��밡�� [Java: Unicode(2byte) ���, C: ASC(�ƽ�Ű, 1byte) ���]
    	 * ���ڿ�
    	 *  = "" =>���� ���� ����
    	 *  
    	 *  UTF-8 : �������� ���  �ƽ�Ű �ڵ� ���, �ѱ��� ������ ?�� ����
    	 */

    	System.out.println('A');
    	System.out.println("Hello");

    	System.out.println(10.0000000005);
    	System.out.println(10.0000000005f);
    	System.out.println(10.0000000005F);  //��ҹ��� ���� ����, d�� ��������
    	
    	System.out.println(10); // ��� ������Ʈ�� 10�� ���
    	System.out.println(0b01010);
    	System.out.println(012);
    	System.out.println(0xA);
    	
    	/*
    	 * 1. �⺻����
    	 *   1)��ҹ��� ����
    	 *    -���̺귯��[Ŭ����: ��ҹ���, �޼ҵ�: �ҹ���, ���: ��� �빮�� (ex.PI=3.14)]
    	 *    -����/���
    	 *     int kor=100;
    	 *     final int KOR=200;
    	 *     
    	 *    2)��ɹ��� ����Ǹ� �ݵ�� ;
    	 *    
    	 *    3)�鿩����
    	 */
    	
    }
}

 