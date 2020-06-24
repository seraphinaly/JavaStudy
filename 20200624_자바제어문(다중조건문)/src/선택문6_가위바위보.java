import java.util.*;
public class 선택문6_가위바위보 {

	public static void main(String[] args) {
		int user=0;
		int com=(int)(Math.random()*3); //0,1,2 랜덤발생
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 입력:");
		user=scan.nextInt();
		
//		switch (com) {
//		case 0:
//			switch(user)
//			{
//			case 0:
//				System.out.println("com:가위, user:가위");
//				System.out.println("Draw!!");
//				break;
//			case 1:
//				System.out.println("com:가위, user:바위");
//				System.out.println("You Win!!");
//				break;
//			case 2:
//				System.out.println("com:가위, user:보");
//				System.out.println("Computer Win!!");
//				break;
//			}
//			break;
//		case 1:	
//			switch(user)
//			{
//			case 0:
//				System.out.println("com:바위, user:가위");
//				System.out.println("Computer Win!!");
//				break;
//			case 1:
//				System.out.println("com:바위, user:바위");
//				System.out.println("Draw!!");
//				break;
//			case 2:
//				System.out.println("com:바위, user:보");
//				System.out.println("You Win!!");
//				break;
//			}
//			break;
//		case 2:
//			switch(user)
//			{
//			case 0:
//				System.out.println("com:보, user:가위");
//				System.out.println("You Win!!");
//				break;
//			case 1:
//				System.out.println("com:보, user:바위");
//				System.out.println("Computer Win!!");
//				break;
//			case 2:
//				System.out.println("com:보, user:보");
//				System.out.println("Draw!!");
//				break;
//			}
//			break;
//		
//		}
		
		String[] str= {"가위","바위","보"};
		System.out.println("com:"+str[com]
						  +",user:"+str[user]);
		
		switch (com-user) {
		case 2: case -1:
			System.out.println("You Win!");
			break;
		case -2: case 1:
			System.out.println("Computer Win!");
			break;
		default:
			System.out.println("Draw!");
		}
	}

}
