package com.sist.io;
import java.io.*;
public class MainClass{
	public static void main(String[] args){
		//FileInputStream fis=null; //�ݵ�� �ʱⰪ �ʿ� =>png,jpg,zip
		//��� Ŭ������ �ʱⰪ=>null
		FileReader fis=null; //�ѱ��� ���Ե� ����
		try{
			//���� �б�
			//fis=new FileInputStream("c:\\javaDev\\news1.txt");
			fis=new FileReader("c:\\javaDev\\news1.txt");//����� Ansi�� ����
			//���� �о ����â�� ���
			int i=0;//�ѱ��ھ� �д´� => �ѱ��ھ� ������ �´�, ���ڹ�ȣ�� ����(int)
			while((i=fis.read())!=-1) { //-1:EndOfFile
				System.out.print((char)i);
				
			}
		} catch(Exception ex){
			//���� ó��
			System.out.println(ex.getMessage());
		} finally {
			//���� �ݱ�
			try {
			fis.close(); //�ݵ�� ����ó�� �ʿ�
			} catch(Exception ex) {}
		}

	}

}
