/*1)break: 반복문 종료
  2)continue: 특정부분 제외
   - 조건문(if)과 같이 사용
   - 한 개의 반복문만 제어
     break:반복문 전체(for, do~while, while), switch
     continue: 반복문에서만 사용 가능
     return: 보류(메소드 종료) => 없는 경우 JVM이 자동으로 추가 */
public class 반복제어문_break{

	public static void main(String[] args){
	    //1~10 출력, 5일 때 종료
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");			
			if(i==5) 
			break; //i==5면 종료(while,for,do~while 동일)
		}

		//1~10 사이 홀수만 출력
		System.out.println("\n======= 조건문 =======");
		//조건문
		for(int i=1;i<=10;i++) {
			if(i%2!=0) // (i%2==1) or !(i%2==0) 
				System.out.print(i+" ");			
		}
		//증가: 2씩
		System.out.println("\n======= 2씩 증가 =======");
		for(int i=1;i<=10;i+=2) {
				System.out.print(i+" ");			
		}
		//continue 사용 => while:조건식, for:증가식으로 이동
		System.out.println("\n====== continue ======");
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				continue; //짝수는 제외=>: 증가식 i++로 이동
			System.out.print(i+" ");
		}
		
	}

}
