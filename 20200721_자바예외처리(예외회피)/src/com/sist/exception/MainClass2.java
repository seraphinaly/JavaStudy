package com.sist.exception;

public class MainClass2{
	public void disp() {
		
	}
	public static void main(String[] args){
		//���Ƿ� �̷� ������ �߻��ߴٰ� �˷��� ��(�׽�Ʈ��) =>�����׽�Ʈ
		
		//1==2 ������, 2�� �ѹ��� ����Ҷ�
		//1
		MainClass2 m=new MainClass2();
		m.disp();
		//m.disp1(); �ϳ����� ���پ�����
		//2
		new MainClass2().disp();
		//new MainClass2().disp2(); ���ο� ���� ��������(1!=2)
		try {
			int a=10;
			if(a%2==0) {
				throw new ArithmeticException("�α��� â���� �̵�");
			}else {
				throw new Exception("ȸ���������� �̵�");
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
