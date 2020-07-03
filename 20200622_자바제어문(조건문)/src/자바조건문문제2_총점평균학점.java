/* 2. Á¤¼ö 3°³ ÀÔ·Â¹Þ¾Æ¼­
 * ÃÑÁ¡, Æò±Õ
 * ÇÐÁ¡=>Á¶°Ç¹® 
 *       Æò±Õ 60ÀÌ»ó D
 *          70   
 *          80
 *          90ÀÌ»ó  A
 *          ³ª¸ÓÁö´Â  F
 * ±¹¾î 80, ¿µ¾î 80, ¼öÇÐ:80
 * ÃÑÁ¡ 240, Æò±Õ 80.0, ÇÐÁ¡ B
 */
import java.util.*;
public class ÀÚ¹ÙÁ¶°Ç¹®¹®Á¦2_ÃÑÁ¡Æò±ÕÇÐÁ¡ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Á¡¼ö ÀÔ·Â(±¹¾î, ¿µ¾î, ¼öÇÐ)");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		System.out.println("±¹¾îÁ¡¼ö:"+kor+", ¿µ¾îÁ¡¼ö:"+eng+", ¼öÇÐÁ¡¼ö:"+math);
	    
		int ÃÑÁ¡=kor+eng+math;
	    double Æò±Õ= ÃÑÁ¡/3.0;
	    char score='A';
	
		if(Æò±Õ>=60 && Æò±Õ<70)
			score='D';
		if(Æò±Õ>=70 && Æò±Õ<80)
			score='C';
		if(Æò±Õ>=80 && Æò±Õ<90)
			score='B';
		if(Æò±Õ>=90 && Æò±Õ<=100)
			score='A';
		if(Æò±Õ<60)
			score='F'; 
		                                   
		System.out.println("ÃÑÁ¡:"+ÃÑÁ¡);
		System.out.printf("Æò±Õ:%.1f%n",Æò±Õ);
        System.out.println("ÇÐÁ¡:"+score);
		
	}

}
