
public class 문자열4_indexOf{

	public static void main(String[] args){
		String msg="abcde.qwerty.hello.java";
		          //012345
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("확장자:"+msg.substring(msg.lastIndexOf(".")+1));
		                                                       //. 다음부터 잘라라
		System.out.println("확장자:"+msg.substring(msg.indexOf(".")+1));	

		//점 3개면 가운데 점은 어떻게 잘라??
		
	}

}
