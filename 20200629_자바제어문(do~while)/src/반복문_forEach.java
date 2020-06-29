
public class 반복문_forEach{
	public static void main(String[] args){
		int[] arr= {1,2,3,4,5};  //arr => arr[x]: (x-1)번째 숫자
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		

		System.out.println();
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}
}