
public class ���ڿ�4_indexOf{

	public static void main(String[] args){
		String msg="abcde.qwerty.hello.java";
		          //012345
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("Ȯ����:"+msg.substring(msg.lastIndexOf(".")+1));
		                                                       //. �������� �߶��
		System.out.println("Ȯ����:"+msg.substring(msg.indexOf(".")+1));	

		//�� 3���� ��� ���� ��� �߶�??
		
	}

}
