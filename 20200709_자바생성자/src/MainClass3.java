import javax.swing.*;
public class MainClass3{
	String name;
	static void aaa(double d) {
		System.out.println(d);
	}

	public static void main(String[] args){
		aaa(10);
		aaa('A');
		aaa(10.5F);
		
/*  ***(�����ε�)
 *               1) ���� �̸��� �޼ҵ�  
 *               2) �Ѱ��� Ŭ���� �ȿ��� ����
 *               3) �Ű������� ������ ���������� �ٸ���
 *               4) �������� �������.
 * 	void aaa()
 * 	int aaa(int a)
 * 	double aaa()
 * 	char aaa(char c)
 *    ����===> 1,3�� �ߺ�
 *    
 *   ������=> �Ű������� ���� ���:�ʱⰪ�� �׻� �����ϰ� ���� ���
 *   		 �Ű����� ����: �ʱⰪ �����ؼ� ��� ���� 
 *      	**������ ��ġ�ϴ� �������� ���� ��� ���ų� ū �������� ���� Ŭ���� ����
 *            aaa(4.5,'A',100) �϶�
 *            
 *            void(char d, double d1, int d2)
 *            void(double d, double d1, double d2) =>���� 
 *   
 */
//		JFrame f=new JFrame("aaa");//����
//		f.setSize(300,200);
//		f.setVisible(true);
		

}
}