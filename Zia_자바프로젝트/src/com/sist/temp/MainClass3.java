package com.sist.temp;

import java.io.*;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//단점 1바이트씩 읽어와서 한글이 깨질수 있다
			//**Buffer에 값을 다 채우고 한줄씩 읽어오는 방법.
			FileInputStream fis = new FileInputStream("c:\\javaDev\\daum_movie.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			//InputStreamReader => 1byte => 2byte 로 변환 
			// 네트워크, 메모리, 파일, 
			while(true)
			{
				String data=br.readLine();
				if(data==null)break;
				System.out.println(data);
			}
			fis.close();
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
