
public class ¹Ýº¹¹®_for2 {
   public static void main(String[] args) {

	   System.out.println();
	   int su=10;
	   String s="";
	   for(;;) {
		   int a=su%2;
		   s+=a+"";
		   su=su/2; 
		   if(su==0)
			   break;
	   }
	   for(int i=s.length()-1;i>=0;i--) {
		   System.out.print(s.charAt(i));
	   }   
   }
}
