
public class �ڹٴ������ǹ�3 {
/*
 * ���ǹ� ���۹��
 *   if(���ǹ�): ���ǹ��� ������ ������� true/false
 *    =>�ʿ��� ���(����: true)���� ���� ����
 *      false�� ��� �ǳʶ�(������ �������� ���Ѵ�)
 * 
 */
	public static void main(String[] args) {
		/*
		 * int a=11; System.out.println("1"); System.out.println("2"); if (a%2==0)
		 * System.out.println("3"); //�ʿ��� ��ġ������ ��� ���� System.out.println("4");
		 * System.out.println("5");
		 */
    //���ĺ� ���� => �빮�� or �ҹ���
		 char alpha='\t';
		 if(alpha>='A' && alpha<='Z')
			 System.out.println(alpha+"��(��) �빮���Դϴ�.");
		 if(alpha>='a' && alpha<='z')
			 System.out.println(alpha+"��(��) �ҹ����Դϴ�.");
		 if(alpha>='0' && alpha<='9')
			 System.out.println(alpha+"��(��) �����Դϴ�.");
		 if(alpha>='��' && alpha<='�R')
			 System.out.println(alpha+"��(��) �ѱ��Դϴ�.");
		 if(alpha=='\t' || alpha=='\n') //���� ������ �ȵǸ� or�� ���� �����������
			 System.out.println(alpha+"��(��) Ư�������Դϴ�.");
	}

}
