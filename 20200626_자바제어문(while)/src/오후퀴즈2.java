
public class 오후퀴즈2 {

	public static void main(String[] args) {
    //for문
		int i=100; int sum=0; int count=0;
		for(i=100; i<=999; i++) {
			if(i%4!=0) {
				count++;
				sum+=i;
			}
		}
		System.out.println("개수:"+count);
		System.out.println("합:"+sum);
			
		System.out.println();
	
	// while문	
		i=100; count=0; sum=0;
		while(i<=999) {
			if(i%4!=0) {
				count++;
				sum+=i;	
		    }
		i++;
	}
		System.out.println("개수:"+count);
		System.out.println("합:"+sum);	
 }
}