//do~while문: 반드시 한 번 이상을 수행
public class 반복문1{

	public static void main(String[] args){
		int i=1; //루프변수 i: 횟수 지정
		do {
			System.out.print(i);   //반복 실행문장
			System.out.print("고 "); //여러 문장 가능
			i++; //i가 5가 될때까지 증가
		}while(i<=5); //i=6
		
		System.out.println("\n====== while ======");
		i=1;
		while(i<=5) {
			System.out.print(i+"고 ");
			i++; //i=6
		}
		
		System.out.println("\n======= for =======");
		for(i=1;i<=5;i++) {
			System.out.print(i+"고 ");
		}
		
	}

}
