import java.util.*;
public class ´ÙÁßÁ¶°Ç¹®5_else_if {

	public static void main(String[] args) {
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("¹®ÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		ch=scan.next().charAt(0);
		
		if(ch>=0 && ch<=9)
		System.out.println("¼ýÀÚÀÔ´Ï´Ù.");
		 else if(ch>='A' && ch<='Z'||ch>='a' && ch<='z')
			System.out.println("¾ËÆÄºªÀÔ´Ï´Ù.");
		 else if(ch>='°¡' && ch<='ÆR')
				System.out.println("ÇÑ±ÛÀÔ´Ï´Ù.");
		

	}

}
