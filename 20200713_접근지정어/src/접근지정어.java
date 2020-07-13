/*
 * 변수 => 읽기 저장된 데이터 읽기, 쓰기 메모리에 저장
읽기:getter() => 저장된 데이터 값 읽기
쓰기:setter() => 변수값 저장

private String name;
//캡슐화방식=>데이터 보호목적


자동부여:lombok (From https://mvnrepository.com)
*/
//1.lombok사용시

class Student{

	private int hakbun;
	private String name;
	private String sex;
	public int getHakbun(){
		return hakbun;
	}
//2.이클립스 제공
//	우클릭>>Source>>generate Getters and Setters
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public void setHakbun(int hakbun){
		this.hakbun=hakbun;
	}

	
}
public class 접근지정어{

	public static void main(String[] args){
	

	}

}
