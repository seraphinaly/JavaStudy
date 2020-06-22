
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char c='A';
      char cc=(char)(c+32);   //소문자 변환=>형변환
      System.out.println(cc); //a
      
      System.out.println(c>='A' && c<='Z'?"대문자":"소문자");
      /*
       * cc>='A' && cc<='Z': 대문자
       * cc>='a' && cc<='z': 소문자
       */
	}

}
