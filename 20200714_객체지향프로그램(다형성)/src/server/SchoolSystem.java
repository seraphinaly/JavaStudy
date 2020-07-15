package server;
import client.Student;
/* 캡슐화 코딩=================================
 * 변수(멤버,공유) =>private(setter/getter 이용)
 * 메소드, 생성자 =>public
 * =========================================
 */
public class SchoolSystem{
	public void display() {
		Student s=new Student();
		s.name="김하성";
		s.setHakbun(2);
		s.setSubject("야구");
		s.setTel("010-2222-2222");
		System.out.println("이름:"+s.name);
		System.out.println("전화:"+s.getTel());
		System.out.println("과목:"+s.getSubject());
		System.out.println("학번:"+s.getHakbun());
	}
	public static void main(String[] args){
		SchoolSystem ss=new SchoolSystem();
		ss.display();
	}
}
