
public class ��������1 {

	public static void main(String[] args) {
	 
	  //for��	
		int count=0; int i=100; int sum=0;
		for(i=100;i<=999;i++) {
			if(i%7==0) {
				count++;
			    sum+=i;	        
			}
		}
		System.out.println("7�� ��� ����:"+count);
		System.out.println("7�� ��� ��:"+sum);
		
	  //while��	
		i=100; count=0; sum=0;
		while(i<=999) {
			if(i%7==0) {
				count++;
				sum+=i;
			}
		i++;
		}
		System.out.println("7�� ��� ����:"+count);
		System.out.println("7�� ��� ��:"+sum);
				

	}

}
