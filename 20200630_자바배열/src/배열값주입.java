import java.util.*;

public class �迭������{
	/* 1.���� ���� 
	 * 2.����� �Է°�(Scanner) 
	 * 3.���� �̿� 
	 * ==================== 
	 * 4.File �б� 
	 * 5.Web���� �о ���� 
	 * 6.Oracle
	 * 
	 * �迭 ==> 1)0������ �Է� 2)�� �ں��� �Է� */
	public static void main(String[] args){
		//3�� �л� ��������: ��/��/�� ==> 1.����, 2.���, 3.����, 4.���(2��for��)
		int[] kor=new int[3]; //���� kor1,kor2,kor3 ����� ����
		int[] eng=new int[3];
		int[] math=new int[3]; //�������� ������ ��!!!

		int[] total=new int[3];
		double[] avg=new double[3];
		char[] grade=new char[3];
		int[] rank=new int[3];
		
		/* x�̷��� �ϸ� Ʋ��x
		 * for(int i=0;i<3;i++){ 
		 * 		Scanner scan=new Scanner(System.in); 
		 *                   ===:���ο� ���� ����
		 * ��ĳ�ʴ� 1���ε� �۵��ϱ� ������ for���� �־ ���� ���� �ʿ����. } */
		
		Scanner scan=new Scanner(System.in); //for������ ���� 1���� ���

		for(int i=0; i<3; i++){
			System.out.printf("%d��° �������� �Է�:", i+1);
			kor[i]=scan.nextInt();

			System.out.printf("%d��° �������� �Է�:", i+1);
			eng[i]=scan.nextInt();

			System.out.printf("%d��° �������� �Է�:", i+1);
			math[i]=scan.nextInt();

			total[i]=kor[i]+eng[i]+math[i]; //math[0] => �Ϲݺ���
			avg[i]=total[i]/3.0;
		}

		//��ϵ� ���� ���
		//���� ��� 
		for(int i=0; i<3; i++){
			char c='A';
			switch(total[i]/30) {
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
				break;
			}
			grade[i]=c;
		}

		//��� ���
		for(int i=0;i<3;i++) {     //i��° ���
			rank[i]=1;             //�ϴ� 1������ �س���
			for(int j=0;j<3;j++) { //���� ���Ұǵ� Ȥ�� i���� ���� ���� ������
				if(total[i]<total[j]) { 
					rank[i]++;     //rank[i]�� 1 ���ض�
				}
			}
		}                 //%-6s: String 6ĭ Ȯ��, �տ������� ä��						  
		System.out.printf("\n%-6s%-6s%-6s%-6s%-10s%-6s%s\n",   
				"����", "����", "����", "����", "���", "����", "���");
		for(int i=0; i<3; i++){
			System.out.printf("%-5d%-5d%-4d%-5d%-7.2f%-5c%d\n", 
					kor[i], eng[i], math[i], total[i], avg[i], grade[i], rank[i]);

		}

	}

}
