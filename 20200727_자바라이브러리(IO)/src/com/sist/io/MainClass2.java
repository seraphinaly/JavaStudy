package com.sist.io;
/* 파일에 쓰기 => 회원가입,댓글,게시판 =>지우기 전까지는 데이터를 잃어버리지 않음
 * 	파일 => 저장 => ArrayList
 * 	데이터=> ArrayList에 모아서 저장
 */
import java.io.*;
public class MainClass2{
	/* 파일 입출력
	 * 	r(read)
	 * 	w(write)
	 * 	a(append)
	 * FileOutputStream(1byte)
	 * 	생성자 
	 *  new FileOutputStream("경로명")
	 *  new FileOutputStream("경로명",true/false) : false가 디폴트
	 * FileWriter(2byte)
	 */
	public static void main(String[] args){
		//FileOutputStream fos=null;
		FileWriter fos=null;
		try {
			//생성
			//fos=new FileOutputStream("c:\\javaDev\\temp.txt",true);
			fos=new FileWriter("c:\\javaDev\\temp.txt",true);
			//false:덮어쓰기, true:append모드, 기존내용에 붙이기
			//저장
			String str="ABCDEFGHIK";
			//fos.write('L');
			//fos.write('M');
			//fos.write('N');
			//fos.write(str.getBytes());//문자열을 바이트 배열로 변경할때
			fos.write(str+"\r\n");
			System.out.println("저장 완료!");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			//파일 닫기, 서버 닫기, 오라클 연결 해제
			try {
			fos.close();
			}catch(Exception ex) {}
		}

	}

}
