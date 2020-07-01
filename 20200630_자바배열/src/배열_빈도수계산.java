
public class 배열_빈도수계산{

	public static void main(String[] args){
		int[] arr=new int[10]; //10자리: 0~9 난수발생 시킬것
		int[] count=new int[10];

		//초기값
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*10); //arr[i]는 0~9 중 하나
		}

		//출력 => 빈도수 계산할 데이터
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println("\n========결과========");
		for(int i=0; i<arr.length; i++){  
			count[arr[i]]++;  //arr[i]=0~9, count[0~9]에 1 증가시켜라
		}
		//출력
		for(int i=0; i<arr.length; i++){
			if(count[i]!=0){ //count가 0이 아니면 출력
				System.out.println(i+"의 개수:"+count[i]);
			}
		}

	}
}