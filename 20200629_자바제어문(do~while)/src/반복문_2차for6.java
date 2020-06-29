/* p.163
 	*
	**
	***
	****
	*****
	=>사용자 입력 개수만큼
*/
import java.util.*;
public class 반복문_2차for6{

	public static void main(String[] args){
		int user=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		user=scan.nextInt();
		for(int i=1;i<=user;i++){
			for(int j=1;j<=user+1-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("정수 입력:");
		user=scan.nextInt();
		for(int i=1;i<=user;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5;b++) {
				System.out.printf("[%d,%d]",a,b);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
