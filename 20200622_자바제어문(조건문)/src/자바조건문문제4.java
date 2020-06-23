import java.util.*;
public class 자바조건문문제4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*정수 2개받아서 최대값 최소값 출력하는 프로그램
		System.out.println("정수 2개 입력");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int max, min;
		if(a>b) {
			max=a; min=b;}
			else {
				max=b; min=a;}
		System.out.println("max="+max);
		System.out.println("max="+min);*/
		
		//정수를 입력받아서 절대값 출력하는 프로그램(cf.절대값 메소드:Math.abs)
		System.out.println("정수 입력");
		int a=scan.nextInt();
		if(a<0)
			System.out.println(-1*a);
		else
			System.out.println(a);
	}

}
