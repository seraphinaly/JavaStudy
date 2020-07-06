
public class 자바메소드3{

	public static void main(String[] args){
		int a=10; int b=20;
		int result=자바메소드2.plus(a,b);//재사용 가능, 같은 src내에서는 import 필요없음
		System.out.println(result);
		
		int min=자바메소드2.minus(a,b);
		System.out.println(min);

	}

}
