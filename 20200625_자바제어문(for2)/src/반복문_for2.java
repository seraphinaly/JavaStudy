
public class 반복문_for2 {
   public static void main(String[] args) {
	
	   char c='a';  //영문=> char로 잡기!!
	   for(char ch='A';ch<='Z';ch++) {
		   System.out.print(ch+""+c++);		   
	/*	1. System.out.print(ch+""+(char)(ch+32));
	    2. System.out.print(ch+""+c);	   
	       c++;
	 */		   
       }
	 //조건 주지 말고 1~10 홀수/짝수 출력, 일정간격 주기(\t)
	   System.out.println();
	   for(int i=1;i<=10;i+=2)
		   System.out.print(i+"\t");
	   
	   System.out.println();
	   
	   for(int i=2;i<=10;i+=2)  //초기값 부여의 중요성!
		   System.out.print(i+"\t");
	   
	   System.out.println();    //1,2,3,4,5 출력
	   for(int i=1;i<=5;i++) {
		   System.out.print(i);
		   if(i<5)
			   System.out.print(",");   
	   }
	   //10 ===> 1010 이진법으로 출력
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
