
public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		
		// �����ٿ� ���
		  System.out.println("Hello");
		  System.out.println("Java");
		  
		// ���� �ٿ��� ���  
		  System.out.print("Hello");
		  System.out.print("Java\n");
	   
	    // ������ �ִ� ���: ĭ ���� ����
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
		   * %5.2f 80.0 �� 5�ڸ�, �Ҽ��� 2�ڸ� ����ϰڴ�
		   * 080.00
		   */
	
	      System.out.printf("%.1f\n",80.55);
	      
	      int a=2;
	      int b=2;
	      System.out.println(a+"*"+b+"="+a*b);
	      System.out.printf("%d*%d=%d",a,b,a*b); 		
	     
	      /*
	       *  %d ����
	       *  %f �Ǽ�
	       *  %c ����
	       *  %s ���ڿ�
	       */
	      
	  	System.out.printf("%d*%d=%d\n",2,2,4);
		System.out.printf("%d*%d=%d\n",2,3,6);  // \n : newLine ���ο� �ٿ� ���
		
		System.out.printf("%d*%d=%d\t",2,2,4);  // \t: tap ��������
		System.out.printf("%d*%d=%d",3,2,6);	
	}

}
