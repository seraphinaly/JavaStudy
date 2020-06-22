
public class 이항연산자_산술연산자 {
/*
 * 산술연산자
 *  => 자바에서 제공하는 모든 연산자는 산술로 변환할 수 있다
 *      ex.5<<2 == 5*2^2
 *      10100 ==> 20
 *  주의점
 *    1)형변환: 가장 큰 데이터형으로 변경
 *    2)/
 *      - 0으로 나누면 오류발생
 *      - 정수/정수=정수
 *    3)% : 나누고 나머지, 부호는 왼쪽편 부호를 따라감
 *    4)산술연산자 우선순위는
 *      *, /, % > +, - (잘 모를때는 괄호 이용)  
 *    
 */
	public static void main(String[] args) {
	   int a=10;
	   int b=3;
	   
	   int c=a+b;
	   int d=a-b;
	   int e=a*b;
	   int m=a/b;
	   int n=a%b;
	   
	   System.out.printf("%d+%d=%d%n",a,b,c); // %n=\n
	   System.out.printf("%d-%d=%d%n",a,b,d);
	   System.out.printf("%d*%d=%d%n",a,b,e);
	   System.out.printf("%d/%d=%d%n",a,b,m);
	   System.out.printf("%d%%%d=%d%n",a,b,n);
	   
	}

}
