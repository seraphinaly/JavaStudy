
public class �ݺ���_for2 {
   public static void main(String[] args) {
	
	   char c='a';  //����=> char�� ���!!
	   for(char ch='A';ch<='Z';ch++) {
		   System.out.print(ch+""+c++);		   
	/*	1. System.out.print(ch+""+(char)(ch+32));
	    2. System.out.print(ch+""+c);	   
	       c++;
	 */		   
       }
	 //���� ���� ���� 1~10 Ȧ��/¦�� ���, �������� �ֱ�(\t)
	   System.out.println();
	   for(int i=1;i<=10;i+=2)
		   System.out.print(i+"\t");
	   
	   System.out.println();
	   
	   for(int i=2;i<=10;i+=2)  //�ʱⰪ �ο��� �߿伺!
		   System.out.print(i+"\t");
	   
	   System.out.println();    //1,2,3,4,5 ���
	   for(int i=1;i<=5;i++) {
		   System.out.print(i);
		   if(i<5)
			   System.out.print(",");   
	   }
	   //10 ===> 1010 ���������� ���
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
