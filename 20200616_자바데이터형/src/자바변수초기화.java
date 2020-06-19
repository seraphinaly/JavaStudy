
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=78;
        int eng=85;
        int math=96;
        
        System.out.println("총점:"+(kor+eng+math)); //괄호 계산 우선
        
        //문자열 결합시 주의!!!
        System.out.println("총점:"+kor+eng+math); //총점:788596
        /*
         *   7+7+"1"+7+7
         *   =14+"1"+7+7
         *   ="141"+7+7
         *   ="1417"+7
         *   ="14177"
         */
	    
	    int a=65;
	    char c=65; //char=> 문자, 숫자 모두 가능하지만 결과값은 문자로 나옴
	    System.out.println("a="+a);
	    System.out.println("c="+c);
	
	    int A=97;
	    char C=97;
	    System.out.println("A="+A);
	    System.out.println("C="+C);
	    
	    int d=1;
	    int e='1';
	    System.out.println("d="+d);
	    System.out.println("e="+e);
	    
	    /* long = int 가능
	     *  8      4 
	     * int = long ===>error: 작은 것에 큰 것을 넣을 수 없음
	     *  4      8
	     *  
	     *  double = int, long, float
	     *  int = double (x)
	     *  예외 ) char = int
	     */
	    // byte < char < int < long < float < double
	    
	    System.out.println(100); //100: int
	    System.out.println(10.8); // 10.8: double
	    		
	    long i=21400000000l; //or double
	    System.out.println(i);
	    
	}

}
