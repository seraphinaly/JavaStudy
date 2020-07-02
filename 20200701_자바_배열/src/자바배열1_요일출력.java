
/* �迭: ���� �� ������ �ϳ��� ��� ����=> �����̸� �� ��(�迭��)�� ������ ���
 *		������ ���� ���̱� ������ ���� => �ε��� ��ȣ(0���� ����)
 * 		������ ������ �� ��: �迭��.length
 * �迭 ����-> �ʱ�ȭ -> �� ���� -> �� ���
 *   -���� �� �ʱ�ȭ:
 *    String[] arr=new String[10]; =>new: null�� �ڵ� �ʱ�ȭ
 *    ***��� Ŭ����=>�ּҸ� ������ �ִ�(���� ���:null)
 *   -�� ���� ex)7��° �� ����
 *    arr[6]="�ȳ�"; =>�Ϲ� ������ ������ ���
 *   -�� ���: 0����=> for�� ��� ����, while ��� ����
 *     �� for:�ε��� �̿�=>�迭�� ����, ����
 *     �� for-each:���� ���尪 �о��=>�ַ� ���
 */
//����ڰ� ��,��,�� �Է�=>���� ���
import java.util.*;
public class �ڹٹ迭1_�������{

	public static void main(String[] args){
		int year=0, month=0, day=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		year=scan.nextInt(); //Ű����� �Է��� �������� �о���� ����
		System.out.print("�� �Է�:");
		month=scan.nextInt();
		System.out.print("�� �Է�:");
		day=scan.nextInt();
		
		System.out.println(year+"�� "+month+"�� "+day+"��");
		
		/*����
		1)���⵵������ �� ����: 1/1/1~2019/12/31
		2)�� �ޱ����� �� ����: 2020/1/1~2020/06/30
		3)�Էµ� day���� �� ����
		=====================================
		=>��ü �� ����%7 =>������ ���Ҽ� ����
		  0(��)~6(��), 1�⵵ 1�� 1��: �����Ϸ� ����
		*/
		//1)���⵵���� �� ����
		int total=(year-1)*365  //����(366��) ���
				+(year-1)/4		//4�⸶��
				-(year-1)/100	//100�⸶�� ����   	
				+(year-1)/400;	//400�⸶��
		//2)�� �ޱ����� ��
		int[] lastDay={31,28,31,30,31,30,
					   31,31,30,31,30,31};
		//2��=> 28/29
		if((year%4==0&&year%100!=0)||(year%400==0)){
			lastDay[1]=29;
		}else {
			lastDay[1]=28;
		}
		
		for(int i=0;i<month-1;i++) {
			total+=lastDay[i];
		}
		
		//�Էµ� Day
		total+=day;
		
		//���� ���ϱ�
		int week=total%7;
		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
		System.out.println(strWeek[week]+"�����Դϴ�.");
		
//		switch(week){
//		case 0:
//			System.out.println("�Ͽ����Դϴ�.");
//			break;
//		case 1:
//			System.out.println("�������Դϴ�.");
//			break;
//		case 2:
//			System.out.println("ȭ�����Դϴ�.");
//			break;
//		case 3:
//			System.out.println("�������Դϴ�.");
//			break;
//		case 4:
//			System.out.println("������Դϴ�.");
//			break;
//		case 5:
//			System.out.println("�ݿ����Դϴ�.");
//			break;
//		case 6:
//			System.out.println("������Դϴ�.");
//			break;
//		}
		
	
	}
}

