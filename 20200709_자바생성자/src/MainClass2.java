//����=> ����,����,����
public class MainClass2{
	//��������
	int a=10, b=20;
	MainClass2(){
		a=100; b=200;
	}
	
	//����ڰ� ���� a,b�� �ִ°��
	MainClass2(int c,int d){ //�Ű����� �ٸ��� �ٸ� �޼ҵ�� �ν�:�����ε�
		a=c;
		b=d;
	}
	public static void main(String[] args){
		MainClass2 m=new MainClass2();
		System.out.println(m.a);
		System.out.println(m.b);
		
		MainClass2 m1=new MainClass2(1000,2000);
		System.out.println(m1.a);
		System.out.println(m1.b);
		
		MainClass2 m2=new MainClass2(10000,20000);
		System.out.println(m2.a);
		System.out.println(m2.b);
	
	}

}
