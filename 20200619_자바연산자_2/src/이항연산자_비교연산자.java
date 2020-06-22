
public class 이항연산자_비교연산자 {
    
	public static void main(String[] args) {
	  //비교연산자: 모든 비교값은 true/false로 출력(boolean)
		int a=10;
		int b=9;
		System.out.println(b++==a); //9==10, false
		b=9;
		System.out.println(++b==a); //10==10, true
		
		char c='A';
		System.out.println(c++);  //A
		System.out.println(++c);  //C
		
		System.out.println(10!=20); //true
		System.out.println(10<10);  //false
		System.out.println(10>10);  //false
		System.out.println(10<=10); //true
		System.out.println(10>=10); //true
		
		System.out.println('A'==65); //true; char는 연산수행시 정수로 변환
		
	}
}
