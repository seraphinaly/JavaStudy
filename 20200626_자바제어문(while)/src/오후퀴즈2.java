
public class ��������2 {

	public static void main(String[] args) {
    //for��
		int i=100; int sum=0; int count=0;
		for(i=100; i<=999; i++) {
			if(i%4!=0) {
				count++;
				sum+=i;
			}
		}
		System.out.println("����:"+count);
		System.out.println("��:"+sum);
			
		System.out.println();
	
	// while��	
		i=100; count=0; sum=0;
		while(i<=999) {
			if(i%4!=0) {
				count++;
				sum+=i;	
		    }
		i++;
	}
		System.out.println("����:"+count);
		System.out.println("��:"+sum);	
 }
}