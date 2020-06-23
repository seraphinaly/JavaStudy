import java.util.*;
public class 제어문_선택조건문 {
    public static void main(String[] args) {
		// 문자 한 개 입력받아서 알파벳인지 여부 확인
    	char ch='A';
    	Scanner scan=new Scanner(System.in);
    	System.out.print("문자 입력:");
    	//"A(0)B(1)C(2)" ; 자바는 숫자를 0부터 센다
    	ch= scan.next().charAt(0); //첫번째 글자 하나를 갖고 오겠다
    	
    	//간단한 조건을 if에 처리
        if(ch>='0' && ch<='9') {
        	System.out.println(ch+"은(는) 숫자입니다!");
        } else {
        	System.out.println(ch+"은(는) 문자입니다!");
          }
        //알파벳 출력으로 바꿔보면
//        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
//        	System.out.println(ch+"은(는) 알파벳입니다!");
//        }
//        	else {
//        		System.out.println(ch+"은(는) 알파벳이 아닙니다!");
//            }
        	
	}
}
