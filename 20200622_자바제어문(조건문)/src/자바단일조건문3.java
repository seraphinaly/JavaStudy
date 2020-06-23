
public class ÀÚ¹Ù´ÜÀÏÁ¶°Ç¹®3 {
/*
 * Á¶°Ç¹® Á¦ÀÛ¹æ¹ý
 *   if(Á¶°Ç¹®): Á¶°Ç¹®Àº ¹«Á¶°Ç °á°ú°ªÀÌ true/false
 *    =>ÇÊ¿äÇÑ °æ¿ì(Á¶°Ç: true)¿¡¸¸ ¹®Àå ¼öÇà
 *      falseÀÏ °æ¿ì °Ç³Ê¶Ü(¹®ÀåÀ» ¼öÇàÇÏÁö ¸øÇÑ´Ù)
 * 
 */
	public static void main(String[] args) {
		/*
		 * int a=11; System.out.println("1"); System.out.println("2"); if (a%2==0)
		 * System.out.println("3"); //ÇÊ¿äÇÑ À§Ä¡¿¡¼­¸¸ »ç¿ë °¡´É System.out.println("4");
		 * System.out.println("5");
		 */
    //¾ËÆÄºª ÀúÀå => ´ë¹®ÀÚ or ¼Ò¹®ÀÚ
		 char alpha='\t';
		 if(alpha>='A' && alpha<='Z')
			 System.out.println(alpha+"Àº(´Â) ´ë¹®ÀÚÀÔ´Ï´Ù.");
		 if(alpha>='a' && alpha<='z')
			 System.out.println(alpha+"Àº(´Â) ¼Ò¹®ÀÚÀÔ´Ï´Ù.");
		 if(alpha>='0' && alpha<='9')
			 System.out.println(alpha+"Àº(´Â) ¼ýÀÚÀÔ´Ï´Ù.");
		 if(alpha>='°¡' && alpha<='ÆR')
			 System.out.println(alpha+"Àº(´Â) ÇÑ±ÛÀÔ´Ï´Ù.");
		 if(alpha=='\t' || alpha=='\n') //¹üÀ§ ÁöÁ¤ÀÌ ¾ÈµÇ¸é or·Î °¢°¢ ¿¬°áÇØÁà¾ßÇÔ
			 System.out.println(alpha+"Àº(´Â) Æ¯¼ö¹®ÀÚÀÔ´Ï´Ù.");
	}

}
