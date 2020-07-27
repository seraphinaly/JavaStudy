package com.sist.io;
import java.io.*;
public class MainClass{
	public static void main(String[] args){
		//FileInputStream fis=null; //반드시 초기값 필요 =>png,jpg,zip
		//모든 클래스의 초기값=>null
		FileReader fis=null; //한글이 포함된 파일
		try{
			//파일 읽기
			//fis=new FileInputStream("c:\\javaDev\\news1.txt");
			fis=new FileReader("c:\\javaDev\\news1.txt");//저장시 Ansi로 저장
			//파일 읽어서 도스창에 출력
			int i=0;//한글자씩 읽는다 => 한글자씩 가지고 온다, 문자번호로 받음(int)
			while((i=fis.read())!=-1) { //-1:EndOfFile
				System.out.print((char)i);
				
			}
		} catch(Exception ex){
			//에러 처리
			System.out.println(ex.getMessage());
		} finally {
			//파일 닫기
			try {
			fis.close(); //반드시 예외처리 필요
			} catch(Exception ex) {}
		}

	}

}
