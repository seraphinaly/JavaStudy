/* 2. ���� 3�� �Է¹޾Ƽ�
 * ����, ���
 * ����=>���ǹ� 
 *       ��� 60�̻� D
 *          70   
 *          80
 *          90�̻�  A
 *          ��������  F
 * ���� 80, ���� 80, ����:80
 * ���� 240, ��� 80.0, ���� B
 */
import java.util.*;
public class �ڹ����ǹ�����2_����������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�(����, ����, ����)");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		System.out.println("��������:"+kor+", ��������:"+eng+", ��������:"+math);
	    
		int ����=kor+eng+math;
	    double ���= ����/3.0;
	    char score='A';
	
		if(���>=60 && ���<70)
			score='D';
		if(���>=70 && ���<80)
			score='C';
		if(���>=80 && ���<90)
			score='B';
		if(���>=90 && ���<=100)
			score='A';
		if(���<60)
			score='F'; 
		                                   
		System.out.println("����:"+����);
		System.out.printf("���:%.1f%n",���);
        System.out.println("����:"+score);
		
	}

}
