package com.sist.string;

import java.io.FileReader;
/* 문자열 결합(빅데이터!)
 * StringBuffer: 동기화(더 느리지만 안정적)
 * StringBuilder: 비동기화 
 */
public class MainClass5{
	public static void main(String[] args)throws Exception{
		long start=System.currentTimeMillis();
//		String data="";
//		StringBuffer sb=new StringBuffer();
		StringBuilder sb=new StringBuilder();
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		int i=0;
		while((i=fr.read())!=-1) {//파일이 끝날때까지(-1:EOF(End Of File))
			//data+=String.valueOf((char)i);
			sb.append(String.valueOf((char)i));
		}
		fr.close();
		long end=System.currentTimeMillis();
		System.out.println("수행시간:"+(end-start));
	}
}
