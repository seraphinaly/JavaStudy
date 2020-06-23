/*
 * 1. 정수를 입력 받아서 짝수인지 홀수인지 확인=> 10은 짝수다, 11은 홀수다 (if else)
 */
import java.util.Scanner;
public class 자바조건문문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int number = scan.nextInt();
		if(number%2==0) {
			System.out.println(number+"은 짝수다");
		} else {
			System.out.println(number+"은 홀수다");
		}

	}

}
