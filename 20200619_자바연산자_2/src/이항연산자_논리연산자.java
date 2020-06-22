
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
	    /*논리연산자: 조건 (&&, ||) 조건
		 *jumsu>=90 && jumsu<=100 //사이
		 *jumsu<=0 || jumsu>100    //범위 벗어날 때
		 */
		
        /*   조건 1  조건 2  |  &&     ||
         * -----------------------------
         *   true  true  | true   true
         *   true  false | false  true 
         *   false true  | false  true
         *   false false | false  false
         */
	     System.out.println(6<5 && 10==10); //false
	
	     int a=10;
	     int b=9;
	     
	   //효율적인 연산: 조건2 아예 연산X
	   //&&: 조건1 false일때
	     System.out.println(a<b && ++b==a); //false 
	     System.out.println(b);             //b=9
	     
	     char c1='A';
	     int i=65;
	     char c2='B';

	     boolean bCheck=c1==i && ++c1==c2;
	     System.out.println(bCheck);  //true
	     System.out.println(c1);      //B, 1 증가; 둘다 true면 모두 연산
	       
	   //||: 조건1 true일때
		 System.out.println(a>b || ++b==a); //true 
		 System.out.println(b); //b=9
	}

}
