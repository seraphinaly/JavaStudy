import java.util.*;
public class 아침퀴즈 {

	public static void main(String[] args) {
		/* 1
		 * int a; int b; a=3; b=a+5; System.out.printf("a의 값:%d \n",a);
		 * System.out.printf("b의 값:%d \n",b);
		 */
		
		/* 2
		 * int a,b; a=6; b=2; System.out.printf("덧셈 연산 결과: %d \n", a+b);
		 * System.out.printf("뺄셈 연산 결과: %d \n", a-b);
		 * System.out.printf("곱셈 연산 결과: %d \n", a*b);
		 * System.out.printf("나누기 연산 결과: %d \n", a/b);
		 * System.out.printf("나머지 연산 결과: %d \n", a%b);
		 */
		
		/* 3 
		 * int num1=10/3; int num2=10%3; 
		 * System.out.printf("%d \n",num1);
		 * System.out.printf("%d \n",num2);
		 */
		
		/* 4
		 * int num1=1; int num2=2; int num3=3; int num4=4; int num5=5; num1=num1+num2;
		 * num2=num2-2; num3=num3*2; num4=num4/2; num5=num5%2;
		 * System.out.printf("%d,%d,%d,%d,%d \n",num1,num2,num3,num4,num5);
		 */
		
		/* 5
		 * int num1=10; System.out.printf("%d \n",num1); num1++;
		 * System.out.printf("%d \n",num1); ++num1; System.out.printf("%d \n",num1);
		 * --num1; System.out.printf("%d \n",num1); num1--;
		 * System.out.printf("%d \n",num1);
		 */
		
		/* 6
		 * int num1=10, num2=10; int a,b; a=++num1; b=num2++;
		 * System.out.printf("%d,%d \n", b,num2);
		 */
		
		/* 7
		 * int num1=10,num2=10; int a, b; num1=num1+1; a=num1;
		 * System.out.printf("%d,%d \n",a,num1); b=num2; num2=num2+1;
		 * System.out.printf("%d,%d \n",b,num2);
		 */
		
		/* 8=9
		 * int a=10; int b=10; System.out.println(++a); System.out.println(a);
		 * System.out.println(b++); System.out.println(b);
		 */
		
		/* 10
		  int a=2; int b=7; int c, d; a++; c=--a; --b; d=b++;
		  System.out.printf("%d,%d,%d,%d \n",a,b,c,d);
		  /
		 
		/* 11
		  int i=0; int re=0; i=3; re=++i; System.out.println("re="+re+",i="+i); i=3;
		  re=i++; System.out.println("re="+re+",i="+i);
		 
		
		/* 12
		 * Scanner scan=new Scanner(System.in); 
		 * System.out.print("정수 2개 입력:"); 
		 * int a=scan.nextInt(); int b=scan.nextInt(); 
		 * System.out.println("뺄셈 결과:"+(a-b));
		 * System.out.println("곱셈 결과:"+a*b);
		 */
		
		/* 13
		 * Scanner scan=new Scanner(System.in); System.out.print("정수 3개 입력:"); int
		 * a=scan.nextInt(); int b=scan.nextInt(); int c=scan.nextInt();
		 * System.out.println(a*b+c);
		 */
		
		/* 14
		 * Scanner scan=new Scanner(System.in); System.out.print("정수 2개 입력:"); int
		 * a=scan.nextInt(); int b=scan.nextInt(); System.out.println(a%b);
		 */
		
		// 15
		Scanner scan=new Scanner(System.in); 
		System.out.print("2자리 정수 입력(10~99):");
		int a=scan.nextInt();
		if (a>99 || a<10)
			System.out.println("2자리 정수가 아닙니다. 다시 입력해주세요.");
		else {
		if(a/10==a-(a/10)*10)  //선생님: if(a%11==0)
			                   //if(a.charAt(0)==a.charAt(1))
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else 
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");}
	}

}
