import java.util.Scanner;
public class �ڹټ������ǹ�1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); // �ڹ��� ��� Ŭ����,��������� Ŭ����:����� �ݵ�� new �̿�
		System.out.println("���� �Է�(1~100)");
		int a=scan.nextInt(); //�Է°� �޾Ƽ� a��� �޸� ������ ����
        if(!(a<1 || a>100)) { //1~100 ���� ������ �Էµ��� �ʾҴٸ�
        	System.out.println(a+"��(��) �ԷµǾ����ϴ�.");
        } else { //1~100 ���� ������ �Էµƴٸ�
        	System.out.println("�߸��� �Է��Դϴ�.\n���α׷��� �����մϴ�.");
          }
        	
        
	}

}
