/*
 * ���� => �б� ����� ������ �б�, ���� �޸𸮿� ����
�б�:getter() => ����� ������ �� �б�
����:setter() => ������ ����

private String name;
//ĸ��ȭ���=>������ ��ȣ����


�ڵ��ο�:lombok (From https://mvnrepository.com)
*/
//1.lombok����

class Student{

	private int hakbun;
	private String name;
	private String sex;
	public int getHakbun(){
		return hakbun;
	}
//2.��Ŭ���� ����
//	��Ŭ��>>Source>>generate Getters and Setters
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
public class ����������{

	public static void main(String[] args){
	

	}

}
