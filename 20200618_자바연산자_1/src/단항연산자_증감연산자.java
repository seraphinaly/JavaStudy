
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
	
		/*증감연산자 ++(--): 무조건 한 개 증가(감소), 메모리에 저장 안해도 단독으로 사용가능(연산자중 유일)
	     *반복문 사용, 게임로직 제작 시 사용
	     * ex) for(int i=1, i<=10, i++) //1에서 하나씩 증가시키다가 10이 되면 멈춰라
		 */
		int a= 10;
		int b= ++a; //전치연산자: 먼저 +1하고 증가된 a 대입
		System.out.println(a); //11
		System.out.println(b); //11
		
		int A= 10;
		int B= A++; //후치연산자: ++는 다음연산으로 넘어갈 때 사용
		System.out.println(A); //11
		System.out.println(B); //10
		
		boolean bCheck=false;
		bCheck=!bCheck;  //선언을 해야 데이터에 저장, 바로 연산 출력만 하면 값이 바뀌지는 않음. 선언은 출력창에서도 가능
		System.out.println(bCheck); //true
		System.out.println(bCheck=!bCheck); //false
		System.out.println(!bCheck); //true
		System.out.println(bCheck); //false

		
		int m=10;
		int n=++m + ++m + ++m + ++m;
		System.out.println("m="+m+",n="+n);
		
		
	}

}
