/* Ŭ����:���� ���� ���� ������ ��(�������� ���� ������)
 * 
 * ������ ����
 * 	1.�������(�ν��Ͻ�����):new�� ����� ������ ���� ����Ǵ� ����
 * 					   =>new ���� heap(���α׷��Ӱ� ����;����ó��,GC)�� �޸� ���� 
 * 	2.��������(��������):�޸𸮰� �Ѱ�=>�������� ���Ǵ� ����
 * 					  =>�����Ϸ��� ������ �� �� �ڵ����� �޸� ����
 * 	3.��������=>��������,�Ű�����
 * 				=>�޼ҵ� ȣ��� �޸� ����
 * 				=>����: �޸� ��ü ����, {} ����� �ڵ� ȸ��(LIFO)
 * 					int a;  c>>b>>a ������� ����
 * 					int b; 
 * 					int c;
 * 
 * ������:��������� �ʱⰪ �ο�
 * 	-��� �̿��ϰų� ���� �б�
 * 	-�����ϰ� ������ �� ������ �� ��, ����
 * 	-���� ����, �ڵ����� �����Ϸ��� default ������ �߰�(������ڴ� �ݵ�� �ʿ�)
 * 	-new ������() => �ѹ��� ȣ���Ѵ� =>this ���
 * 
 * �޼ҵ�
 * 	-�ν��Ͻ� �޼ҵ�:Ŭ�������� ���� ����ϴ� �޼ҵ�
 * 	-���� �޼ҵ�:static=>��� Ŭ���� �������� ���Ǵ� �޼ҵ�
 * 	-�߻� �޼ҵ�:����θ� ����(������ �� �� �޼ҵ�=>���α׷��Ӱ� ���� �� ���) p.377
 */
class Student{
	//�л� 1�� ���� ����=>�޸� ���� ���� �� ���� �� ����(new)
	String name;
	String subject;
	int year;
	static String school;
	//�ʱⰪ ����:null,null,0
}
public class MainClass{

	public static void main(String[] args){
		Student.school="SIST";
		Student s=new Student(); //name,year,subject=>����(s�� �ּ�)
		System.out.println(s);//Student@15db9742
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		s.name="������";
		s.subject="���߰�";
		s.year=3;
		//�޼ҵ嵵 ����
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);
		
		Student s1=new Student();
		System.out.println(s1);//Student@6d06d69c
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		s1.name="������";
		s1.subject="�İ���";
		s1.year=2;
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		ss.replace('H','k');
		String ss1="1234567890";
		String.valueOf(10);
		
		
	}

}
