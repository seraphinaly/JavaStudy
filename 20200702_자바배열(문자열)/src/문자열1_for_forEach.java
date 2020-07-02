
public class 문자열1_for_forEach{
	//정수 5개 저장해서 평균내기
	public static void main(String[] args){
		
		//1.for:정수 5개 저장하는 메모리 공간 설정(연속적으로 사용)
		int[] arr={30,50,70,90,10};

		int total=0;
		for(int i=0;i<5;i++) {
			total+=arr[i];//total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		}
		System.out.println("저장된 정수의 평균:"+total/5.0);
		
		//2.향상된 for
		total=0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("저장된 정수의 평균:"+total/5.0);
		
		
		}
}
