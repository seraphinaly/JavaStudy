package com.sist.string;
//StringBuffer: 문자열 결합시 지우고 다시 만드는게 아니고 바로 뒤에 붙임 => append()
import java.io.*; //checkException=> 반드시 예외처리!!!
public class MainClass4{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			//파일읽기
			//String data="";
			StringBuffer data=new StringBuffer();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read())!=-1) {//파일이 끝날때까지(-1:EOF(End Of File))
				data.append(String.valueOf((char)i));
			}
			fr.close();
			System.out.println(data.toString());
		}catch(Exception ex) {}
	}

}
