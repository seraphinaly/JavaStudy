import javax.swing.*;
public class MainClass3{
	String name;
	static void aaa(double d) {
		System.out.println(d);
	}

	public static void main(String[] args){
		aaa(10);
		aaa('A');
		aaa(10.5F);
		
/*  ***(오버로딩)
 *               1) 같은 이름의 메소드  
 *               2) 한개의 클래스 안에서 제작
 *               3) 매개변수의 개수나 데이터형이 다르다
 *               4) 리턴형은 상관없다.
 * 	void aaa()
 * 	int aaa(int a)
 * 	double aaa()
 * 	char aaa(char c)
 *    오류===> 1,3번 중복
 *    
 *   생성자=> 매개변수가 없는 경우:초기값을 항상 동일하게 만들 경우
 *   		 매개변수 존재: 초기값 변경해서 사용 가능 
 *      	**완전히 일치하는 데이터형 없는 경우 같거나 큰 데이터형 가진 클래스 선택
 *            aaa(4.5,'A',100) 일때
 *            
 *            void(char d, double d1, int d2)
 *            void(double d, double d1, double d2) =>선택 
 *   
 */
//		JFrame f=new JFrame("aaa");//제목
//		f.setSize(300,200);
//		f.setVisible(true);
		

}
}