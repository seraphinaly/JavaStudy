import java.util.Scanner;

public class ���ڿ�2_�迭Ȱ��quiz{

	public static void main(String[] args){

		
		String[] course= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int[] score= {95,88,76,62,55};
		
		Scanner scan=new Scanner(System.in);
		
		while(true){
			boolean bCheck=false;
			System.out.print("���� �Է�:");
			String subject=scan.nextLine();
			if(subject.equals("�׸�")) {
				break;
			}
			for(int i=0;i<course.length;i++) {
				if(subject.equalsIgnoreCase(course[i])) {
					bCheck=true;
					System.out.println("����:"+score[i]+"\n");
				}	
			}
			if(bCheck==false) {
				System.out.println("���� �����Դϴ�.\n");
				break;
			}
		}
		
		
		
		
		}
	}
