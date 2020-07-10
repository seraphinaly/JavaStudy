
/*
 * 1.����ڷκ��� ����,�� �޴´�
 * 2.���� ���Ѵ�=>����ȭ
 * 3.�ش���Ϻ��� �޷� ����Ѵ�                         
 */
import java.util.*;

public class �޷¸����_�޼ҵ���{
	//1:������Է�
��:");
		int num=sc.nextInt();
		return num;
	}

	//2:���ϱ��ϱ�
	static int getWeek(int year, int month){
		//1)���⵵ �� ����
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		//2)���ޱ����� ��
		//		int[] lastDay= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//		if((year%4==0 && year%100!=0) || year%400==0){
		//			lastDay[1]=29;
		//		}
		for(int i=1; i<month-1; i++)
			total+=lastDay(year, month);
		//3)1������ ����
		total++;
		int week=total%7; //1�� 1�� 1��:������
		return week;
	}

	//3:�� ���� ������ ��¥ �˷��ִ� ���
	static int lastDay(int year, int month){
		int[] lastDay= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if(isYear(year)){
			lastDay[1]=29;
		}
		return lastDay[month-1];
	}

	//4:����Ȯ�� �� ���뼺 ����
	static boolean isYear(int year){
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || year%400==0)
			bCheck=true;
		return bCheck;
	}

	//5:�޷����
	static void datePrint(int year, int month, int week){
		int last=lastDay(year, month);
		String[] strWeek= { "��", "��", "ȭ", "��", "��", "��", "��" };
		for(int i=0; i<7; i++){
			System.out.print(strWeek[i]+"\t");
		}

		System.out.println();
		for(int i=1; i<=last; i++){
			//����
			if(i==1){ 
				for(int j=0; j<week; j++){
					System.out.print("\t");
				}
			}
			//1���� ���
			System.out.printf("%2d\t", i);
			//��������
			week++;
			if(week>6){
				week=0;
				System.out.println();
			}
		}
	}

	//6:�޼ҵ� ���� ���� ����(����ο��� �ڵ��ϸ� ���� �Ұ�)
	static void process(){
		int year=userInput("����");
		int month=userInput("��");
		int week=getWeek(year, month);
		datePrint(year, month, week);
	}

	//����(������)
	public static void main(String[] args){
		process(); //���ο����� ȣ�⸸(�ٸ� ������ �����ϱ� ���ؼ�)
	}

}
