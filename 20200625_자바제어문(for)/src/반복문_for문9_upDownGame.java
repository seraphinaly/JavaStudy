/*Ƚ���� ������ �ݺ��� => up/down ����
    =>1. ��ǻ�Ͱ� 1~100 ���� ���� �߻�
    =>2. ����� �Է� 
    =>3. ��Ʈ: ����/����
    =>4. ���Ῡ��
*/
import java.util.Scanner;
public class �ݺ���_for��9_upDownGame {

	public static void main(String[] args) {
		int com=(int)(Math.random()*100)+1; //1~100���� ���� �߻�
		Scanner scan=new Scanner(System.in);
		int count=0;
		
		for(;;) { //���ѷ��� => while(true)
			System.out.print("1~100 ���� ���� �Է�:");
			int user=scan.nextInt();
				if(user<1 || user>100) {
					System.out.println("�߸��� �Է��Դϴ�!!");
					continue;  //ó������ �ٽ� ���ư���
				}
		    count++;//if�� �Ȱɸ�=>���������� �Էµ� ����
			if(com>user) {
				System.out.println("Up!");
		    } else if(com<user) {
				System.out.println("Down!");
		    } else {
		    	System.out.println("\n======== Game Over!! =======\n");
		    	System.out.println("�Է�Ƚ��:"+count);
		    break; 
		      }  	  
		}
		
		System.out.println("\n���α׷��� �����մϴ�.");	
			
	}
}

  