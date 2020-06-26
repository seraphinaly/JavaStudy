
public class 오후퀴즈1 {

	public static void main(String[] args) {
	 
	  //for문	
		int count=0; int i=100; int sum=0;
		for(i=100;i<=999;i++) {
			if(i%7==0) {
				count++;
			    sum+=i;	        
			}
		}
		System.out.println("7의 배수 개수:"+count);
		System.out.println("7의 배수 합:"+sum);
		
	  //while문	
		i=100; count=0; sum=0;
		while(i<=999) {
			if(i%7==0) {
				count++;
				sum+=i;
			}
		i++;
		}
		System.out.println("7의 배수 개수:"+count);
		System.out.println("7의 배수 합:"+sum);
				

	}

}
