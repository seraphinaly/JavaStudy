/*    배열 선언        ->  배열 초기화(메모리 안에 값 주입)    ->  출력
      :몇 개 저장?     	1.int[] arr={10,20,30,40,50}; :선언과 동시에 초기값 부여
 					2.int[] arr=new int[5]; :메모리 공간만 제작=>나중에 값 채움
 					3.int[] arr;
 					  arr[0]=10; arr[1]=20; ...
 	    
 	    활용: 제어문(for, while)
 	    for=>제어, for~each=>출력
 */
public class 배열초기화{

	public static void main(String[] args){
		String[] names= {"서건창","김하성","이정후","박병호","박동원"};
		
		System.out.println("== for-each==");	
		for(String name:names) { //변경 불가: 화면 출력만 담당
			System.out.println(name);
		}
		
		System.out.println("\n==== for ====");	
		for(int i=0;i<names.length;i++) {
			names[1]="김혜성"; //데이터값 변경 가능
			System.out.println(names[i]); //name[0]~name[4]
		}

	}
}
