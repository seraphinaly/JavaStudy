//do~while
//����ڰ� �Է��� ������ �ش�Ǵ� ������ �Ųٷ� ���
import java.util.*;
//����� ��� BufferedReader : ����ó�� �ʿ�
public class �ݺ���2{

	public static void main(String[] args){
	  //�������� 2��
		int user=0; //����ڰ� �Է��� �� ���� �޸� ����
		int i=9; //1~9���� �����ϴ� ��������: 9�� ����
		Scanner scan=new Scanner(System.in); //��� Ŭ������ �޸𸮿� ������ �� new �̿�(���� �޸� �Ҵ�)
		                       //����: Math.random() => static �޼ҵ�: ���۰� ���ÿ� �޸𸮿� �ڵ�����
		System.out.print("2~9 ������ ���� �Է�:"); //Scanner: ����, ���� ���� �� ���� �޸𸮿� ����
		user=scan.nextInt(); //����ڰ� Ű���� �Է��� ���� �о�ͼ� ����=> user��� ����
		do {
			System.out.printf("%d*%d=%d\n",user,i,user*i); //���� �� ���: %n(f��), \n(print/f/ln)
			i--;
		}while(i>=1);
		
		
	}

}
