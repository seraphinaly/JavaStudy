import java.util.*;
public class 주말quiz{

	public static void main(String[] args){
		//제어문
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
			
			
			System.out.println("1과 100사이 값을 입력하세요.");
			input=sc.nextInt();
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else{
				System.out.println("맞췄습니다.");
				break;
			}
		}while(true);
			System.out.printf("시도횟수는 %d번입니다.",count);
			
		
			
			
			
	}
}
