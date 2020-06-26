
public class 반복문_for7_패턴있는출력 { //패턴이 있어야 for문 사용 가능
    public static void main(String[] args) {
	
    	int sum=0;
    	for(int i=1; i<=10; i++) {
    		if(i%2==0)    //짝수는 음수로 더해주고
    			sum-=i;
    		else          //홀수는 양수로 더해라
    			sum+=i;
    	}
    	
    	System.out.println("1-2+3-4+5-6+7-8+9-10="+sum);
    	
	
  //★★☆★★☆★★☆★★☆ 출력
  		for(int a=1;a<=12;a++) {
  			if(a%3==0)
  				System.out.print("☆");
  			else
  				System.out.print("★");
  		}
    }
}    
