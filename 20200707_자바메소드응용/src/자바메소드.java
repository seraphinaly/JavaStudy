/* �޼ҵ�: �� ���� ��ɸ� ���� => ����: �ٸ� ���α׷������� ����, �ݺ��Ǵ� �ڵ� ����
 * 		  ��ȯ��(������) �޼ҵ��(�Ű�����1,2...)
 *                        ============����� ��û�� �����ϴ� ��
 *                        
 *       return; �� ���� ����. �߰������� ��� ����.
 *        		   return(,continue,break) ���� �ؿ��� �ҽ��ڵ� �� �� ����(�����α׷� ����/���� �� ���� �Ұ�)    
 *      
 *       **�����ε�:�߰�(new), �������̵�:����(change,modify)
 */

//����ڰ� ���� �Է��ϸ� ���⿩��
import java.util.*;
public class �ڹٸ޼ҵ�{
	
	//�޼ҵ�1:����� ���� �Է� ��� ��
	static int userInput() { //Scanner�� �޼ҵ� ��ü���� �Է°��� �޴°Ŷ� �Ű����� �ʿ����
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int year=sc.nextInt();
		return year;
	}
	
	//�޼ҵ�2:���⿩�� Ȯ�� ��� �� ����
	static boolean isYear(int year) {
		boolean bCheck=false;
		if((year%4==0&&year%100!=0)||year%400==0) {
			bCheck=true;
		} else {
			bCheck=false;
		}
		return bCheck;
	}

	public static void main(String[] args){
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println(year+"���� �����Դϴ�.");
		else
			System.out.println(year+"���� ������ �ƴմϴ�.");
	}

}
