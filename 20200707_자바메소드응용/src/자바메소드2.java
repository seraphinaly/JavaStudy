//���� ���� ���� => ����,���,����
import java.util.*;
public class �ڹٸ޼ҵ�2{
	//1:�Է� �� �ݺ� ����, ����
	static int userInput(String subject) {
		Scanner sc=new Scanner(System.in);
		System.out.print(subject+"���� �Է�:");
		int score=sc.nextInt();
		return score;
	}
	
	//2:����  �� ��տ� ����Ϸ��� ���� �޾Ƶδ°��� ������
	static int total(int kor,int eng,int math) {
		return kor+eng+math;
	}
	
	//3.���
	static void avg(int total) {
		System.out.printf("���:%.2f\n",total/3.0);
	}	
	
	//4.����
	static void grade(int total) {
		switch(total/30) {
		case 10:
		case 9:	
			System.out.println("����:A");
			break;
		case 8:
			System.out.println("����:B");
			break;
		case 7:
			System.out.println("����:C");
			break;
		case 6:
			System.out.println("����:D");
			break;
		default:
			System.out.println("����:F");
			break;
		}
	}
	
	public static void main(String[] args){
		int kor=userInput("����");
		int eng=userInput("����");
		int math=userInput("����");
		int total=total(kor,eng,math);//������=�޼ҵ�� ����
		
		//���
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
		System.out.println("��������:"+math);
		System.out.println("����:"+total);
		avg(total);
		grade(total);
	}
}
