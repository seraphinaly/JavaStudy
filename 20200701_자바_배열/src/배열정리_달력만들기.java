
import java.util.Scanner;

/*���α׷�
 * ������ ����:����=>�迭, Ŭ����
 * ��ɹ�:��ɹ� ����=>�޼ҵ�
 *  =======================
 *  ��ü���� ���α׷�(Web)
 * 
 *  ������ ����
 *   -�� ��: ����/���
 *   -���� ��:�迭
 *  ������ ó��(����� ��û)
 *   -���, ������
 *   -����� ����=> ����, ������, ������, �ڵ���
 *               ===�׽�Ʈ
 *   ===============================Ŭ����  
 *   =>�׽�Ʈ, ����� �Է°��� �߸��Ǹ�=> ���� ����
 *   =>���� ����: �߰��� ���α׷�
 *              1)if
 *              2)����ó��
 */
public class �迭����_�޷¸����{

	public static void main(String[] args){
		int year=0, month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		year=scan.nextInt();
		System.out.println("�� �Է�:");
		month=scan.nextInt();

		//���
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		System.out.println(year+"�� "+month+"��");
		for(String week:strWeek) {
			System.out.print(week+"\t");
		}
		
		//���� ���ϱ�
		/* ���⵵ �� ����(1��~2019.12.31)
		 * �� �ޱ����� ��(2020.1.1~6.30)
		 * +1(1�Ϻ��� ���)
		 */
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		
		//�� ��
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0&&year%100!=0)||(year%400==0)){
			lastDay[1]=29;
		}else {
			lastDay[1]=28;
		}
		
		for(int i=0;i<month-1;i++) {
			total+=lastDay[i];
		}
		
		//1������ ����
		total++;
		int week=total%7;
		
		//�޷� ���
		for(int i=0;i<month-1;i++) {
			total+=lastDay[i];
		}
		
		//�Էµ� Day
	      System.out.println();
	      for(int i=1;i<=lastDay[month-1];i++){
	         if(i==1){
	           for(int j=0;j<week;j++){
	            System.out.print("\t");
	           }
	         }
	         System.out.printf("%2d\t",i);
	         week++;
	         if(week>6) {
	        	 week=0;
	        	 System.out.println();
	         }
	      }
	}
}