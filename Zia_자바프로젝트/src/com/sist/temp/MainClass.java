package com.sist.temp;

import java.io.*;
import java.util.*;//split, StringTokenizer

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �б⸦ ���ؼ��� ����ó���� �ʿ��ϴ�

		//�����б� ���� ����
		FileReader fr = null; //���� �б�
		try {
			//���� �б�
			//FileReader�� 2����Ʈ�� �о�´�.
			fr = new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; // int i�� �ѱ��ھ� �о���� ���Ѱ�, => ������ ��ȣ ��� �Ѵ�.
			StringBuffer sb = new StringBuffer(); //StringBuffer�� ���ڿ� ������ �����ش�.
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			//���
			System.out.println(sb.toString());
			//���Ͽ� ���� : FileWriter ==> ���� ��Ʈ��(�ѱ� ����) => 2byte
			/*
			 * 	FileInputStream
			 * 	FileOutputStream
			 *  ================= 1byte ( �׸�����(png,jpg...zip)
			 *    
			 */
		} catch (Exception e) {
			//����ó���� ����ش� => �����
			/*
			 * ���� �޽��� Ȯ��	getMessage()
			 * Trace => ������� => �ش���ġ ã�� printStackTrace()
			 * 
			 */
			e.printStackTrace();
		}
		finally {
			//�ַ� finally ���� ���ϴݱ�, ������ ����, ��Ʈ��ũ ���� ����, ����Ŭ ���� ����
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
