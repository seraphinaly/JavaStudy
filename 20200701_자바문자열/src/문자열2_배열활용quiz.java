import java.util.Scanner;

public class 문자열2_배열활용quiz{

	public static void main(String[] args){

		
		String[] course= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int[] score= {95,88,76,62,55};
		
		Scanner scan=new Scanner(System.in);
		
		while(true){
			boolean bCheck=false;
			System.out.print("과목 입력:");
			String subject=scan.nextLine();
			if(subject.equals("그만")) {
				break;
			}
			for(int i=0;i<course.length;i++) {
				if(subject.equalsIgnoreCase(course[i])) {
					bCheck=true;
					System.out.println("점수:"+score[i]+"\n");
				}	
			}
			if(bCheck==false) {
				System.out.println("없는 과목입니다.\n");
				break;
			}
		}
		
		
		
		
		}
	}
