
public class 이항연산자_쉬프트연산자 {
 /* <<  , >> :쉬프트 연산자=비트이동 연산자
  * <<: 왼쪽으로 이동=>공백에 0을 채운다
  *  ex. 10<<2    // 산술연산: X<<Y => X*2^Y 
  *      1010 10
  *    101000 10*2^2=40
  *    
  * <<: 오른쪽으로 이동=>비트를 제거
  *  ex. 10>>2  // 산술연산: X<<Y => X/2^Y(나머지 버리기!!)
  *      1010 10
  *        10  2  
  */  
	public static void main(String[] args) {
		System.out.println(10<<2); //10*4=40
		System.out.println(10>>2); //10/4=2
	}

}
