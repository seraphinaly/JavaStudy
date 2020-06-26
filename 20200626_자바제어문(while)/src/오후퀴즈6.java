
public class 오후퀴즈6 {

	public static void main(String[] args) {
		int a11 = 0;

		//for문
		for (int i=1; i<=100; i++) {
			if (i%11==0)
				System.out.print(i+" ");
		}

		//while문
		int i=1;
		while(i<=100) {
			if(i%11==0)
				System.out.print(i+" ");
			i++;
		}

	}

}
