//trim(),replace()
public class ¹®ÀÚ¿­2{

	public static void main(String[] args){
		
		String s=" Hello Java ";
		System.out.println(s);
		System.out.println(s=s.trim());
		s=" Hello Java ";
		System.out.println(s.replace(' ','-'));
		System.out.println(s.replace("Java", "Oracle"));
		System.out.println(s.substring(0,5));
		//System.out.println(s.replaceAll(regex, replacement));

	}

}
