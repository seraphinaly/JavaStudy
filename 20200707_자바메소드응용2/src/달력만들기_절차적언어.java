/*
 * ������ �ڵ�=> ����ȭ �� �ڵ�(�޼ҵ�)
 * ========��ɺ��� ��� ��� ����(����, �ڵ� �ߺ� ����)
 * <�޷¸����>                ====����,�߰��� ���ϰ� ����� ���α׷�
 * 1.����ڷκ��� ����,�� �޴´�
 * 2.���� ���Ѵ�=>����ȭ
 * 3.�ش���Ϻ��� �޷� ����Ѵ�                         
 */
import java.util.*;
public class �޷¸����_���������{ //���ο��ٰ� �ڵ��Ѵ�
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		int year=sc.nextInt();	
		System.out.print("���� �Է��ϼ���.");
		int month=sc.nextInt();
		//���������� �ٸ� �޼ҵ忡�� ����Ϸ���=> �Ű����� �̿�
		
		//2.���� ���ϱ�
		//1)���⵵ �� ����
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//2)���ޱ����� ��
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0&&year%100!=0) || year%400==0) {
			lastDay[1]=29;			
		}
		for(int i=0;i<month-1;i++)
			total+=lastDay[i];
		//3)1������ ����
		total++;
		int week=total%7; //1�� 1�� 1��:������
		
		//�޷� ���
		System.out.println(year+"�� "+month+"��");
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		for(int i=0;i<7;i++) {
				System.out.print(strWeek[i]+"\t");		
		}
		
		System.out.println();
        for(int i=1;i<=lastDay[month-1];i++){
           if(i==1){ //����
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
