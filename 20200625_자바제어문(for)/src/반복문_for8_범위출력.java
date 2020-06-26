//A-Z 출력
public class 반복문_for8_범위출력 {

	public static void main(String[] args) {
	char ch;
		for(ch='A';ch<='Z';ch++) { //char로도 루프 출력 가능
			System.out.print(ch);
		}
		System.out.println();
		System.out.println();
	    for(ch='a';ch<='z';ch++) { //char로도 루프 출력 가능
	    	System.out.print(ch);
	    }

	    System.out.println("\n");
	    
	    for(int i=10;i>=1;i--) {
	    	System.out.println(i);
	    }
	    
	    System.out.println("==========================");
	    for(int i=1,j=10;i<=10;i++,j--) { //변수 여러 개로 제어할 수도 있음
	    	System.out.println("i="+i+",j="+j);
	    }
	}
}



