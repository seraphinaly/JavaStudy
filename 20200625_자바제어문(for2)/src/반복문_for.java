//블록설정의 중요성
public class 반복문_for {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello!!");
			System.out.println("Java=>For"); //두 줄이 다섯번씩 수행
		}
		System.out.println("==============");
		
		for(int i=1;i<=5;i++)                //블록 설정 안해서
			System.out.println("Hello!!");   //이것만 다섯번 나옴
			System.out.println("Java=>For");
	
 }
}