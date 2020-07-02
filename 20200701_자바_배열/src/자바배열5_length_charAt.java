/* 배열 = "용도"별로 묶어서 사용!
 *	    byte[] b => File 전송
 *	  String[] s => 문자열이 많은 경우(이름,주소,전화)
 *	     int[] i => 성적 계산, 통계
 *	  double[] d => 통계,빈도수,레이팅
 *	 boolean[] b => 존재 여부
 */
public class 자바배열5_length_charAt{

	public static void main(String[] args){
		String[] s= {
				"peach",
				"tangerine",
				"grapefruit",
				"cherry",
				"watermelon",
				"coconut",
				"pineapple",
		};
		//이름이 가장 긴 과일은?
		System.out.println("===== 전체 과일명 =====");
		for(String ss:s) {  //index가 없다!!! =>값 변경 불가
			System.out.println(ss);
		}
		System.out.println("===================");
		System.out.println("\n가장 긴 과일 이름은?");
		int max=0;
		for(String ss:s) {
			int len=ss.length(); //문자열: 문자 개수=> length()
			if(max<len)
				max=len;
		}
		
		//출력
		for(String ss:s) {
			if(ss.length()==max)
			System.out.println(ss);
		}
		
		System.out.println("\n가장 짧은 과일 이름은?");
		int min=100;
		for(String ss:s) {
			int len=ss.length(); 
			if(min>len)
				min=len;
		}
		
		//출력
		for(String ss:s) {
			if(ss.length()==min)
			System.out.println(ss);
		}
	
	/* 문자개수 확인=> 비밀번호
	 * 문자열
	 * String => char[] 
	 * "Hello Java"
	 *  0123456789
	 */
		System.out.println();
		String msg="Hello Java"; //문자열에서 원하는 문자 추출
		System.out.println("5번째 문자는?");
		System.out.println(msg.charAt(4));
		System.out.println();
		
		for(int i=0;i<msg.length();i++) {
			System.out.printf("%d번째 문자는?"+msg.charAt(i)+"\n",i);			
		}
	}

}
