/* 변수 Scope
     1. 지역변수
     2. 멤버변수
     3. 공유변수
    
     public class A {
      	int a; 멤버변수=> class A가 저장될 때마다 생성
      	static int b; 공유변수=> JVM이 class를 로드할 때
      	==========================================
		public static void main(String[] args) {
			int c; 지역변수=> main블록 안에서만 사용 가능
		}	
 */
public class 변수사용범위{

	public static void main(String[] args){
		//		int i=2;
		//		for(i=2; i<=10; i++){
		//			System.out.println("i="+i);
		//		} //i는 삭제
		//		System.out.println("i="+i);
		//		System.gc(); //메모리 회수(가비지 컬렉션)

		
		int i=1;
	  //for문
		for(i=1; i<=5; i++){
			System.out.print(i+" ");
		}
		System.out.println();

	  //while문  
		i=1;
		while(i<=5){
			System.out.print(i+" ");
			i++;
		}
		System.out.println();

	  //do~while문  
		i=1;
		do{
			System.out.print(i+" ");
			i++;
		} while(i<=5);

	}
}
