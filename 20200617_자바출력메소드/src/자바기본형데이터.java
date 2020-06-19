
public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*논리형(boolean, 값:true/false) 
		 *  : if(조건문) 사용시 주로 사용
		 *   ex. 2인용게임 턴 , 로그인
		 */
         boolean b=false; //반드시 소문자, 1byte(데이터형 바꿀 수 없음)
         System.out.println("b="+b);
         b=true;
         System.out.println("b="+b);
			
	     byte a=10; 
		 byte B=30; 
		 byte c=(byte)(a*B); 
		 System.out.println(c); //원래 300인데 4bit 앞에는 그냥 잘라버림(overflow)
		 
		System.out.println((int)'A');
		System.out.println((int)'신');
		
		System.out.println((char)12619); //각 문자는 숫자번호를 가지고 있음(char는 정수형으로 인식)
		
	}

	     
}
