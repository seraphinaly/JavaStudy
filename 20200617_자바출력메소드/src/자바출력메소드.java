
public class 자바출력메소드 {

	public static void main(String[] args) {
		
		// 다음줄에 출력
		  System.out.println("Hello");
		  System.out.println("Java");
		  
		// 옆에 붙여서 출력  
		  System.out.print("Hello");
		  System.out.print("Java\n");
	   
	    // 서식이 있는 출력: 칸 간격 지정
		// 80 80 80 240 80.0 B  
		  System.out.println("80 80 80 240 80.0 B");
		  System.out.printf("%-3d%-3d%-3d%-3d%5.1f%2c%n",80,80,80,240,80.0,'B'); 
		
		  /*printf
		   * %5d 80
		   * ---80
		   * 
		   * %-5d
		   * 80---
		   * 
		   * %5.2f 80.0 총 5자리, 소수점 2자리 출력하겠다
		   * 080.00
		   */
	
	      System.out.printf("%.1f\n",80.55);
	      
	      int a=2;
	      int b=2;
	      System.out.println(a+"*"+b+"="+a*b);
	      System.out.printf("%d*%d=%d",a,b,a*b); 		
	     
	      /*
	       *  %d 정수
	       *  %f 실수
	       *  %c 문자
	       *  %s 문자열
	       */
	      
	  	System.out.printf("%d*%d=%d\n",2,2,4);
		System.out.printf("%d*%d=%d\n",2,3,6);  // \n : newLine 새로운 줄에 출력
		
		System.out.printf("%d*%d=%d\t",2,2,4);  // \t: tap 일정간격
		System.out.printf("%d*%d=%d",3,2,6);	
	}

}
