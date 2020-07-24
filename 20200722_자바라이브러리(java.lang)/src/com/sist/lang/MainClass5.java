package com.sist.lang;

/* finalized(): 소멸자(메모리 해제)
 */
class C{
	public void display(){
		System.out.println("C:display() Call...");
	}

	@Override
	protected void finalize() throws Throwable{
		System.out.println("메모리 해제");
	}
}

public class MainClass5{
	public static void main(String[] args){
		C c=new C();
		c.display();
		//소멸
		c=null; //GC대상
		System.gc();
	}

}
