package com.sist.lib;
import java.util.*;
import java.text.*;

public class MainClass{

	public static void main(String[] args){
		Date date=new Date();
		System.out.println(date.toString());
		//��ȯ(p.544)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//��: h(1~12) H(0~23)
		System.out.println(sdf.format(date));
	}

}