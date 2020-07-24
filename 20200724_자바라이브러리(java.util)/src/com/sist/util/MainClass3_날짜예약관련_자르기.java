package com.sist.util;
import java.util.*;
public class MainClass3_³¯Â¥¿¹¾à°ü·Ã_ÀÚ¸£±â{

	public static void main(String[] args){
	Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; //¿¹¾à³¯Â¥ ·£´ı¹ß»ı(5~14)
		
		String day="";
		for(int i=0;i<resDay.length;i++) {
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0, day.lastIndexOf("|")); //¸Ç¸¶Áö¸· | ÇÏ³ª Áö¿ì±â
		System.out.println(day);
		
		//³¯Â¥º° ºĞ¸®
		//split»ç¿ë
		String[] resdays=day.split("\\|"); 
		//splitÀº Á¤±Ô½Ä ÆĞÅÏÀÌ µé¾î°¨, ÀÍ¼÷ÇÏÁö ¾ÊÀ¸¸é StringTokenizer »ç¿ë±ÇÀå
		/*Á¤±Ô½Ä ±âÈ£: ^ : ½ÃÀÛ¹®ÀÚ 
		  				^[A-Za-z}:¾ËÆÄºªÀ¸·Î ½ÃÀÛÇÏ´Â ¸ğµç°Í
		  				^[°¡-ÆR]:ÇÑ±Û·Î ½ÃÀÛÇÏ´Â ¸ğµç °Í //cf.[^°¡-ÆR]:ÇÑ±ÛÀ» Á¦¿ÜÇÑ
		  				^[0-9]:¼ıÀÚ·Î ½ÃÀÛÇÏ´Â ¸ğµç°Í
		 				<Áö´Ï¹ÂÁ÷> 3»ó½Â: [^°¡-ÆR] =>3
		 						 1ÇÏ°­: [^0-9] =>ÇÏ°­
					$ : ³¡¹®ÀÚ 
					 ex)A$ :A·Î ³¡³ª´Â ´Ü¾î
					. : ÀÓÀÇÀÇ ÇÑ±ÛÀÚ(¸ğµç±ÛÀÚ) => \\.
					| : ¼±ÅÃ
					? : ÀÖÀ¸¸é Ãâ·Â, ¾øÀ¸¸é ¹ÌÃâ·Â
		*/			
		for(String s:resdays)
		System.out.println(s);
		
		System.out.println("===StringTokenizer===");
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
