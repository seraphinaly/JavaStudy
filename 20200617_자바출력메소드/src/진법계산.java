
public class 진법계산 {
    public static void main(String[] args) {
    	
		System.out.println(Integer.toBinaryString(240)); //11110000, 2진법		
		System.out.println(Integer.toHexString(240));    //f0, 16진법
		int hex=0xf0; System.out.println(hex);  //240 확인
		System.out.println(Integer.toOctalString(240));  //8진법
		
		System.out.println(0xf0);
		System.out.println(0360);
		System.out.println(0b11110000); 
	    System.out.println(~100); //음수표현
		
    }
}
