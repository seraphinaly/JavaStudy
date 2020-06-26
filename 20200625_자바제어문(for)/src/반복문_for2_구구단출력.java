//2~9 사용자입력 : 각 단의 구구단 출력 - 반복 수행대상의 모양(출력 형태)이 같아야 루프 돌릴 수 있음
import java.util.*;
public class 반복문_for2_구구단출력 {
	public static void main(String[] args) {
		int dan=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력(2~9):");
		dan=scan.nextInt();
		
		for(int i=1;i<=9;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
}