
public class 단항연산자_형변환연산자 {
/*
 * 필요시 데이터형을 변경해서 사용:강제 형변환
 */
	public static void main(String[] args) {
		// 자동형변환
		int a='A'; //a=65
	    double d=10; //d=10.0
		char c=65; //c=A
		
	    System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//강제형변환
		int i=(int)10.5;
		int ii=(int)'A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
	}

}
