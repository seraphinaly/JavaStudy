//가위바위보
import java.util.*;
public class 자바배열2_용도1_가위바위보{

	public static void main(String[] args){
		//컴퓨터=>난수(0~2)
		int com=(int)(Math.random()*3); //0~2
		
		//사용자 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("0(가위), 1(바위), 2(보):");
		int user=scan.nextInt();
		
		//입력결과 확인
		String[] result= {"가위","바위","보"};
		System.out.println("Computer:"+result[com]);
		System.out.println("Player:"+result[user]);
		
	//	if(com-user==1 || com-user==-2)
		
//		if(com==0)
//			System.out.println("Computer:가위");
//		else if(com==1)
//			System.out.println("Computer:바위");
//		else if(com==2)
//			System.out.println("Computer:보");
//		
//		if(user==0)
//			System.out.println("Player:가위");
//		else if(user==1)
//			System.out.println("Player:바위");
//		else if(user==2)
//			System.out.println("Player:보");
		

	}

}
