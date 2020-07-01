//임의의 정수 5개 저장 후 최대/최소값 구하는 프로그램
public class 배열_최대최소값{

	public static void main(String[] args){
		int[] arr=new int[5]; //정수 5개 저장공간 만들기
		
		for(int i=0;i<5;i++){
			arr[i]=(int)(Math.random()*100)+1; //난수 1~100 중 5개 배열로 출력
		}
	
		for(int i:arr) {
			System.out.print(i+" "); //출력
		}
		System.out.println("\n===== 결과 ======");
		int min=100;//최소값 저장공간(가장 큰 값으로 초기화)
		int max=1;//최대값 저장공간(가장 작은 값으로 초기화)
		
		for(int i=0;i<5;i++) { 
			if(min>arr[i]) {   //arr[i]가 min보다 작으면
				min=arr[i];    //min값을 arr[i]로 바꿔라 
			}	//최소값
		}
		
		for(int i=0;i<5;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}	//최대값
		}
		System.out.println("최소값:"+min);
		System.out.println("최대값:"+max);
		
	}

}
