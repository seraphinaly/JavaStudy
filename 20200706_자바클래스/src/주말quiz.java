import java.util.*;
public class �ָ�quiz{

	public static void main(String[] args){
		//���
		System.out.println("===== 4-2 ====================");
		int sum=0;
			for(int i=1;i<=20;i++) {
				if(!(i%2==0 || i%3==0)) {
				sum+=i;
				}
			}
		System.out.println(sum);
			
		System.out.println("===== 4-3 ====================");
//		for(int i=1;i<=10;i++) {
//			for(int j=1)
//		}
//		
		
		System.out.println("===== 4-14 ====================");
		int answer=(int)(Math.random()*100)+1;
		int input=0, count=0; 
		Scanner sc=new Scanner(System.in);
		
		do{
			count++;
			
			
			System.out.println("1�� 100���� ���� �Է��ϼ���.");
			input=sc.nextInt();
			if(answer>input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if(answer<input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else{
				System.out.println("������ϴ�.");
				break;
			}
		}while(true);
			System.out.printf("�õ�Ƚ���� %d���Դϴ�.",count);
			
		
			
			
			
	}
}
