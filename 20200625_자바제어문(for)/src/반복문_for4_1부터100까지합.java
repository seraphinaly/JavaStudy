//1~100 합
public class 반복문_for4_1부터100까지합 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {  //i를 1부터 100까지 1씩 증가시킬건데
			sum+=i; //sum=sum+i    //1씩 증가하는 수를 계속 더해라
			System.out.printf("1부터 %d까지의 합:%d\n",i,sum);
		}
			

	}

}
