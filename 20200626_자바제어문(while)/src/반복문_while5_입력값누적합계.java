//����ڿ��� ���� �Է¹޾Ƽ� �� �������� �����հ� ���ϱ�
/* for(;;) == while(true), ������ ��ȯ ����!
 * ����)
     for(int i=0;i<10;i++)
     == int i=0;
        while(i<10){
        i++;
        }               */
import java.util.*;
public class �ݺ���_while5_�Է°������հ� {

	public static void main(String[] args) {
		int user=0; //����ڿ��� ��û�� ����
		int i=1;    //����ڰ� ��û�� �������� ����(��������)
		int sum=0;  //����(��)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		user=scan.nextInt();
		
		while(i<=user) {
			sum+=i;
			i++; 
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
//���� �ʱⰪ ���� �� ���� ��ġ�� �߿伺
		i=1; //i�� �ʱ�ȭ:��� �ۿ��� ����, ���� ����
		while(i<=10) {
			System.out.print(i);
			i+=5; // += , -= ���� ��� 
		} //i=6
		System.out.println();
		
		i=5; //�ʱⰪ �缳��
		while(i>=1) {
			System.out.print(i);
			i--; // -- ���
		} //i=0
		
	}

}
