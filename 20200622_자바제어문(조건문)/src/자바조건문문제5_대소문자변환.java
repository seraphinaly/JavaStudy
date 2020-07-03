public class 자바조건문문제5_대소문자변환 {
  //대소문자 변환
	public static void main(String[] args) {
		char alpha='J';
		if(alpha>='A' && alpha<='Z')
			System.out.println((char)(alpha+32));
		if(alpha>='a' && alpha<='z')
			System.out.println((char)(alpha-32));
	}

} 