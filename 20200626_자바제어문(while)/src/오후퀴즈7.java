import java.util.*;

public class 오후퀴즈7 {

	public static void main(String[] args) {
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력:");
		user = scan.nextInt();

		if (user >= 60 && user <= 100)
			System.out.println("합격");
		else if (user >= 0 && user < 60)
			System.out.println("불합격");
		else
			System.out.println("점수를 다시 입력하세요.");

	}

}
