import java.util.*;
public class 메소드_재사용{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//전체 사용
		//달력만들기_메소드사용.process();
		
		//부분적으로 사용=>세분화의 필요성!
		int year=달력만들기_메소드사용.userInput("년도");
		boolean bCheck=달력만들기_메소드사용.isYear(year);
		if(bCheck==true)
			System.out.println("윤년이다.");
		else
			System.out.println("윤년이 아니다.");
	}

}
