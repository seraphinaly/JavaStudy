package com.sist.temp;

import java.io.*;
import java.util.*;//split, StringTokenizer

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 읽기를 위해서는 예외처리가 필요하다

		//파일읽기 위한 변수
		FileReader fr = null; //파일 읽기
		try {
			//파일 읽기
			//FileReader는 2바이트씩 읽어온다.
			fr = new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; // int i는 한글자씩 읽어오기 위한것, => 문자의 번호 라고 한다.
			StringBuffer sb = new StringBuffer(); //StringBuffer로 문자열 결합을 시켜준다.
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			//출력
			System.out.println(sb.toString());
			//파일에 저장 : FileWriter ==> 문자 스트림(한글 포함) => 2byte
			/*
			 * 	FileInputStream
			 * 	FileOutputStream
			 *  ================= 1byte ( 그림파일(png,jpg...zip)
			 *    
			 */
		} catch (Exception e) {
			//에러처리를 잡아준다 => 디버깅
			/*
			 * 에러 메시지 확인	getMessage()
			 * Trace => 실행과정 => 해당위치 찾기 printStackTrace()
			 * 
			 */
			e.printStackTrace();
		}
		finally {
			//주로 finally 에서 파일닫기, 쓰레드 종료, 네트워크 서버 종료, 오라클 연결 해제
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
