package com.sist.method;
/* �޼ҵ�
 * 
 */
public class �޼ҵ�{
	public static void concat(String s,String... s1) { //String...:�迭���
		for(String ss:s1) {
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args){
//		Object o=10;
//		Object o1="aaaa";
//		Object o2='a';
//		Object o3=new �޼ҵ�();
		
		concat("�����Ǽ���:","����â,","���ϼ�,","������,","�ں�ȣ");
		

	}

}
