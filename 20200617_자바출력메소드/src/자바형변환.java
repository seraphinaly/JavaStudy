
public class 자바형변환 {

	public static void main(String[] args) {
		/*형변환: 자신의 데이터형을 다른 형태의 데이터형으로 바꾸는 것 (boolean 제외)
		 * byte < char < int < long < float < double
		 * 
		 * 정수 -> 실수, 문자, 정수
		 * 실수 -> 정수, 문자
		 * 문자 -> 정수, 실수
		 */
		double d=(double)5/2; //적어도 하나를 형변환 시켜줘야 제대로 나옴.
		System.out.println(d);
		
		System.out.println('a'+1); //자동 형변환
		/*
		 * int 이하는 연산시 결과값이  int
		 *  byte+byte => int
		 *  char+char => int
		 *  short+byte => int
		 *  char+byte+short => int
		 */
		
		byte b=10;
		byte c=20;
		int e=b+c;
	 }

}
