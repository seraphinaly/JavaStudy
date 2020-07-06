/*	5개의 정수를 보내면 
 *  5개 정수 → SORT → 전송
 *          ====select
 *  메소드 → 반복 제거/재사용 가능/하나의 기능 수행       
 *          select{
 *          	오라클 연결* → 메소드 처리
 *          	select 문장 수행
 *          	오라클 닫기* → 메소드 처리
 *          }
 *          delete{
 *          	오라클 연결*
 *          	delete 문장 수행
 *          	오라클 닫기*
 *          }
 *          update{
 *          	오라클 연결*
 *          	update 문장 수행
 *          	오라클 닫기*
 *          }
 *          find{
 *          	오라클 연결*
 *          	find 문장 수행
 *          	오라클 닫기*
 *          }
 *          insert{
 *          	오라클 연결*
 *          	insert 문장 수행
 *          	오라클 닫기*
 *          }          
 */
public class 자바메소드1{
	static int[] sort(int[] arr,String type) {
		//sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(type.equals("ASC")) {					
					if(arr[i]>arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				if(type.equals("DESC")) {					
					if(arr[i]<arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args){
		// 호출
		int[] arr= {90,60,70,80,10,30,20,40,50}; //sort → 10,20,30,40,50
		System.out.println("정렬 전:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후:");
		int[] result=sort(arr,"ASC");
		for(int i:result) {
			System.out.print(i+" ");
		}
		System.out.println();
		result=sort(arr,"DESC");
		for(int i:result) {
			System.out.print(i+" ");	
		}
	}

}
