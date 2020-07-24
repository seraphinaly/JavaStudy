
package com.sist.lang;

class B{
	int x,y;
}

public class MainClass3{
	public static void main(String[] args){
		int x=10;
		int y=20;
		int i=x;
		int j=y;
		
	int temp=i;
	i=j;
	j=temp;
	
	System.out.println("i="+i+",j="+j);
	System.out.println("x="+x+",y="+y);
	
	B b=new B();
	b.x=10;
	b.y=20;
	B c=b; //ÂüÁ¶
	c.x=100;
	c.y=200;
	System.out.println("b="+b);
	System.out.println("c="+c);
	System.out.println(b.x);
	System.out.println(b.y);
	
	}
}
