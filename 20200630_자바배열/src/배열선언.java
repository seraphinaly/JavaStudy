/* 배열
   
   1)같은 타입의 여러 변수를 묶어서 관리(숫자=>double로 통합 가능, 문자열)
  
   2)한 개의 변수명으로 여러개의 변수 제어
       	구분자: 인덱스 번호(0~n-1)로 구분
       	     예) int[] arr={10,20,30,40,50};
       	     
       	   *메모리 주소를 이용해 접근하는 변수 ==> 참조변수(배열, 클래스)
       	  **인덱스 번호는 중간에 끊기지 않는다(순차적)=>for문에 적합
       	            
       	             arr[0] arr[1] arr[2] arr[3] arr[4]
       	    ==arr==  ================================
       	      100       10    20    30    40    50
       	    =======  |======|=====|=====|=====|=====|
       	            100    104   108   112   116
    
    3)배열 선언방식
      	데이터형[] 배열명; (변수명명법 사용)
      	예1)메모리 공간을 미리 만들고 나중에 값을 채우는 방법
      	   =>new를 사용하면 메모리 공간 생성, 0값으로 초기화
      	  	-영화제목 10개 모아서 관리
      	     String[] title=new String[10]; =>'null'
      	  	-10명 학생의 학점 관리
      	     char[] grade=new char[10]; =>'\0'
      	  	-10명 학생의 평균 관리
      	     double[] avg=new double[10]; =>'0.0'
      	  
      	예2)직접 값을 주입하는 방법
      	  	int[] arr={10,20,30,40,50}      
      	
      	주의점) 1.배열의 크기를 초과하면 error: ArrayIndexOutBoundsException
      	        ex)데이터 n개 => 0~n-1 (개수를 모르는 경우: .length 사용)
      	      2.제어문 이용시=> 주로 for문 이용해서 처리(for에서 사용하는 초기값: 0)
 */
 public class 배열선언{
	 public static void main(String[] args) {
		 //5명에 대한 점수 => 저장, 총점, 평균
		 int a=80;
		 int b=90;
		 int c=75;
		 int d=90;
		 int e=85;
		 int total=a+b+c+d+e;
		 double avg=total/3.0;
		 System.out.println("총점:"+total);
		 System.out.println("평균:"+avg);
		 
		 //배열
		 int[] score={80,90,75,90,85}; //80=>score[0]
		 int total2=0;
		 double avg2=0.0;
		 for(int i=0;i<score.length;i++){
			 total2+=score[i];
		 }
		 avg2=total2/3.0;
		 System.out.println("총점:"+total2);
		 System.out.println("평균:"+avg2);
	 }
 }