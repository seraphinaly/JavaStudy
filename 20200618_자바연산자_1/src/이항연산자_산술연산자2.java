
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		 System.out.println('신'+'윤'+'수');
// **주의점: 데이터형을 초과하면 error가 아니라 overflow를 발생
		 byte b1=64;
		 byte b2=64;
		 byte b3=(byte)(b1+b2);
		 System.out.println("b3="+b3); //-128(양수끼리 더했는데 음수가 나왔다>>overflow)
		
	// %
		 int a=5;
		 int b=2;
		 System.out.println(a%b);
		 System.out.println(-a%b);
		 System.out.println(a%-b);
		 System.out.println(-a%-b);
		 
		 System.out.println((int)(10.5+10.5));
		 System.out.println((int)10.5+(int)10.5);
	}

}
