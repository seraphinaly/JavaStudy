
public class 자바단일조건문3 {
/*
 * 조건문 제작방법
 *   if(조건문): 조건문은 무조건 결과값이 true/false
 *    =>필요한 경우(조건: true)에만 문장 수행
 *      false일 경우 건너뜀(문장을 수행하지 못한다)
 * 
 */
	public static void main(String[] args) {
		/*
		 * int a=11; System.out.println("1"); System.out.println("2"); if (a%2==0)
		 * System.out.println("3"); //필요한 위치에서만 사용 가능 System.out.println("4");
		 * System.out.println("5");
		 */
    //알파벳 저장 => 대문자 or 소문자
		 char alpha='\t';
		 if(alpha>='A' && alpha<='Z')
			 System.out.println(alpha+"은(는) 대문자입니다.");
		 if(alpha>='a' && alpha<='z')
			 System.out.println(alpha+"은(는) 소문자입니다.");
		 if(alpha>='0' && alpha<='9')
			 System.out.println(alpha+"은(는) 숫자입니다.");
		 if(alpha>='가' && alpha<='힣')
			 System.out.println(alpha+"은(는) 한글입니다.");
		 if(alpha=='\t' || alpha=='\n') //범위 지정이 안되면 or로 각각 연결해줘야함
			 System.out.println(alpha+"은(는) 특수문자입니다.");
	}

}
