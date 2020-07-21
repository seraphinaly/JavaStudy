package com.sist.exception;

public class MainClass2{
	public void disp() {
		
	}
	public static void main(String[] args){
		//임의로 이런 에러가 발생했다고 알려줄 때(테스트용) =>단위테스트
		
		//1==2 같지만, 2는 한번만 사용할때
		//1
		MainClass2 m=new MainClass2();
		m.disp();
		//m.disp1(); 하나에서 갖다쓰지만
		//2
		new MainClass2().disp();
		//new MainClass2().disp2(); 새로운 공간 만들어버림(1!=2)
		try {
			int a=10;
			if(a%2==0) {
				throw new ArithmeticException("로그인 창으로 이동");
			}else {
				throw new Exception("회원가입으로 이동");
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
