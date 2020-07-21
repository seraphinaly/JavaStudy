
public class 문자열6_valueOf{
//모든 데이터형을 문자열로 변환
	public static void main(String[] args){
		char[] c= {'H','e','l','l','o'};
		String msg=String.valueOf(c);
		System.out.println(msg);
		
		String ss="Hello Java!!";
		char[] cc=ss.toCharArray();
		
		
		int a=10; int b=20;
		System.out.println(String.valueOf(a)+String.valueOf(b));
	
	}

}


