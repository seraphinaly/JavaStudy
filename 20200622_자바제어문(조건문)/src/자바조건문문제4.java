import java.util.*;
public class �ڹ����ǹ�����4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*���� 2���޾Ƽ� �ִ밪 �ּҰ� ����ϴ� ���α׷�
		System.out.println("���� 2�� �Է�");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int max, min;
		if(a>b) {
			max=a; min=b;}
			else {
				max=b; min=a;}
		System.out.println("max="+max);
		System.out.println("max="+min);*/
		
		//������ �Է¹޾Ƽ� ���밪 ����ϴ� ���α׷�(cf.���밪 �޼ҵ�:Math.abs)
		System.out.println("���� �Է�");
		int a=scan.nextInt();
		if(a<0)
			System.out.println(-1*a);
		else
			System.out.println(a);
	}

}
