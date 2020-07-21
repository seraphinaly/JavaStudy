
public class ¹®ÀÚ¿­3_substring{
	public static void main(String[] args){
	
		String msg="Hello Java";
		          //0123456789
		System.out.println(msg.substring(5));
		System.out.println(msg.substring(4));
		System.out.println(msg.substring(3,6));
		System.out.println(msg.substring(0,4));
		
		String num="100-010";
		          //0123456
		System.out.print(num.substring(0,3)+"-");
		System.out.println(num.substring(4));
		
		
	}
}