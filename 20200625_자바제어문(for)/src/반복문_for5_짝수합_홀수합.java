//1~100 짝수합, 홀수합
public class 반복문_for5_짝수합_홀수합 {

	public static void main(String[] args) {
		int even=0, odd=0; //저장공간 잡아두기(변수 설정)
		for(int i=1;i<=100;i++) { //i를 100까지 1씩 증가시킬건데
			if(i%2==0)            //짝수면
				even+=i;          //even에 더하고
			else                  //홀수면                
				odd+=i;           //odd에 더해라
		}
		System.out.println("1~100까지 짝수 합:"+even);
		System.out.println("1~100까지 홀수 합:"+odd);	
			

	}

}
