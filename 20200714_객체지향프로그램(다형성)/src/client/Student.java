package client;

public class Student{
	private int hakbun;
	public String name;
	String subject;
	protected String tel;
	
	public int getHakbun(){
		return hakbun;
	}

	public void setHakbun(int hakbun){//우선순위:매개변수>멤버변수
		this.hakbun=hakbun; //변수 충돌될때 this 써줘야함(평소에는 생략)
	}

	public String getSubject(){
		return subject;
	}

	public void setSubject(String subject){
		this.subject=subject;
	}

	public String getTel(){
		return tel;
	}

	public void setTel(String tel){
		this.tel=tel;
	}

	public Student() {  //public 안붙이면 다른 패키지에서 못갖다씀
		hakbun=1;
		name="이정후";
		subject="물리";
		tel="010-1111-1111";
	}
}
