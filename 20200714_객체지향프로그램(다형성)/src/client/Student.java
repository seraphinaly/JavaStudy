package client;

public class Student{
	private int hakbun;
	public String name;
	String subject;
	protected String tel;
	
	public int getHakbun(){
		return hakbun;
	}

	public void setHakbun(int hakbun){//�켱����:�Ű�����>�������
		this.hakbun=hakbun; //���� �浹�ɶ� this �������(��ҿ��� ����)
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

	public Student() {  //public �Ⱥ��̸� �ٸ� ��Ű������ �����پ�
		hakbun=1;
		name="������";
		subject="����";
		tel="010-1111-1111";
	}
}
