
public class 배열_선택정렬{

	public static void main(String[] args){
		/* DESC(내림차순) 50 40 30 20 10 
		 * ASC(오름차순) 10 20 30 40 50
		 * 
		 * ex)오름차순 
		 * 1.선택정렬: 맨 처음 고정, 맨 마지막까지 비교. => (n-1)번 실행
		 * 2.버블정렬: 맨 마지막 고정, 두 자리씩 비교(p.203)
		 */
		
		int[] arr={0, 10, 40, 20, 50}; //ASC =>DESC

		System.out.println("정렬 전:");
		for(int i:arr){
			System.out.print(i+" ");
		}
		//선택 정렬
		//오름차순(ASC)
		System.out.println("\n오름차순 정렬 후:");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {   
					int tmp=arr[i];  //변수값 서로 바꿀때는 tmp에 미리 값 1개 옮겨놓기!
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		
		//내림차순(DESC)
		System.out.println("\n내림차순 정렬 후:");
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){ //j:비교하는 숫자, i번째의 오른쪽=>i+1
				if(arr[i]<arr[j]){   //현재 DESC, 부등호 방향 '>' : ASC
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(int i:arr){
			System.out.print(i+" ");
		}

	}

}
