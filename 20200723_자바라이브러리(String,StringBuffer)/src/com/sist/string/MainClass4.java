package com.sist.string;
//StringBuffer: ���ڿ� ���ս� ����� �ٽ� ����°� �ƴϰ� �ٷ� �ڿ� ���� => append()
import java.io.*; //checkException=> �ݵ�� ����ó��!!!
public class MainClass4{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			//�����б�
			//String data="";
			StringBuffer data=new StringBuffer();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read())!=-1) {//������ ����������(-1:EOF(End Of File))
				data.append(String.valueOf((char)i));
			}
			fr.close();
			System.out.println(data.toString());
		}catch(Exception ex) {}
	}

}
