import java.util.*;
public class ���ù�6_���������� {

	public static void main(String[] args) {
		int user=0;
		int com=(int)(Math.random()*3); //0,1,2 �����߻�
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2) �Է�:");
		user=scan.nextInt();
		
//		switch (com) {
//		case 0:
//			switch(user)
//			{
//			case 0:
//				System.out.println("com:����, user:����");
//				System.out.println("Draw!!");
//				break;
//			case 1:
//				System.out.println("com:����, user:����");
//				System.out.println("You Win!!");
//				break;
//			case 2:
//				System.out.println("com:����, user:��");
//				System.out.println("Computer Win!!");
//				break;
//			}
//			break;
//		case 1:	
//			switch(user)
//			{
//			case 0:
//				System.out.println("com:����, user:����");
//				System.out.println("Computer Win!!");
//				break;
//			case 1:
//				System.out.println("com:����, user:����");
//				System.out.println("Draw!!");
//				break;
//			case 2:
//				System.out.println("com:����, user:��");
//				System.out.println("You Win!!");
//				break;
//			}
//			break;
//		case 2:
//			switch(user)
//			{
//			case 0:
//				System.out.println("com:��, user:����");
//				System.out.println("You Win!!");
//				break;
//			case 1:
//				System.out.println("com:��, user:����");
//				System.out.println("Computer Win!!");
//				break;
//			case 2:
//				System.out.println("com:��, user:��");
//				System.out.println("Draw!!");
//				break;
//			}
//			break;
//		
//		}
		
		String[] str= {"����","����","��"};
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
