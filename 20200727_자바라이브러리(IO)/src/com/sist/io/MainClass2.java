package com.sist.io;
/* ���Ͽ� ���� => ȸ������,���,�Խ��� =>����� �������� �����͸� �Ҿ������ ����
 * 	���� => ���� => ArrayList
 * 	������=> ArrayList�� ��Ƽ� ����
 */
import java.io.*;
public class MainClass2{
	/* ���� �����
	 * 	r(read)
	 * 	w(write)
	 * 	a(append)
	 * FileOutputStream(1byte)
	 * 	������ 
	 *  new FileOutputStream("��θ�")
	 *  new FileOutputStream("��θ�",true/false) : false�� ����Ʈ
	 * FileWriter(2byte)
	 */
	public static void main(String[] args){
		//FileOutputStream fos=null;
		FileWriter fos=null;
		try {
			//����
			//fos=new FileOutputStream("c:\\javaDev\\temp.txt",true);
			fos=new FileWriter("c:\\javaDev\\temp.txt",true);
			//false:�����, true:append���, �������뿡 ���̱�
			//����
			String str="ABCDEFGHIK";
			//fos.write('L');
			//fos.write('M');
			//fos.write('N');
			//fos.write(str.getBytes());//���ڿ��� ����Ʈ �迭�� �����Ҷ�
			fos.write(str+"\r\n");
			System.out.println("���� �Ϸ�!");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			//���� �ݱ�, ���� �ݱ�, ����Ŭ ���� ����
			try {
			fos.close();
			}catch(Exception ex) {}
		}

	}

}
