//1~100 3배수합, 5배수합, 7배수합
public class 반복문_for6_배수합_개수세기 {
	public static void main(String[] args) {
	
	int a3=0, a5=0, a7=0;
    for(int i=0;i<=100;i++) { //i를 1부터 시작해서 하나씩 증가시키는데
		if(i%3==0)            //3의 배수면 a3에 그 값을 더해라
			a3+=i;
		if(i%5==0)            //5의 배수 -> 3의 배수랑 중복되니까 단일if 써야함!
			a5+=i;
		if(i%7==0)            //7의 배수
			a7+=i;
	}
    	System.out.println("1~100까지 3의 배수 합:"+a3);
    	System.out.println("1~100까지 5의 배수 합:"+a5);
    	System.out.println("1~100까지 7의 배수 합:"+a7);
    	
//100~999까지 7의배수 개수
    int count=0;
    for(int a=100;a<=999;a++) { //a를 0부터 999까지 하나씩 증가시킬건데
    	if(a%7==0)              //7의 배수면 1씩 카운트해라
    		count+=1;
    }
    	System.out.println("100~999까지 7의 배수 개수:"+count);
    
    	
    	
	}
}
