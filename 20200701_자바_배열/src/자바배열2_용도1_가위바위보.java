//����������
import java.util.*;
public class �ڹٹ迭2_�뵵1_����������{

	public static void main(String[] args){
		//��ǻ��=>����(0~2)
		int com=(int)(Math.random()*3); //0~2
		
		//����� �Է�
		Scanner scan=new Scanner(System.in);
		System.out.print("0(����), 1(����), 2(��):");
		int user=scan.nextInt();
		
		//�Է°�� Ȯ��
		String[] result= {"����","����","��"};
		System.out.println("Computer:"+result[com]);
		System.out.println("Player:"+result[user]);
		
	//	if(com-user==1 || com-user==-2)
		
//		if(com==0)
//			System.out.println("Computer:����");
//		else if(com==1)
//			System.out.println("Computer:����");
//		else if(com==2)
//			System.out.println("Computer:��");
//		
//		if(user==0)
//			System.out.println("Player:����");
//		else if(user==1)
//			System.out.println("Player:����");
//		else if(user==2)
//			System.out.println("Player:��");
		

	}

}
