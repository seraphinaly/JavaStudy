import java.util.*;

//성적 계산
//학생 정보 데이터형 제작 → 사용자 정의 데이터형
class Student{ //new → 초기화
	String name;//null → 모든 클래스는 주소를 지님, 없는 경우 null
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
}
public class MainClass{
	static void process() {
		Student s=null;
		for(int i=0;i<10;i++) {
			s=new Student();
			System.out.println(s);
		}
	}
//		Student[] std=new Student[3]; //3명
//		//입력 → 초기값
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<std.length;i++) {
//			//메모리할당
//			std[i]=new Student();
//			System.out.print("이름 입력:");
//			std[i].name=scan.next();
//			
//			System.out.print("국어점수 입력:");
//			std[i].kor=scan.nextInt();
//			
//			System.out.print("영어점수 입력:");
//			std[i].eng=scan.nextInt();
//			
//			System.out.print("수학점수 입력:");
//			std[i].math=scan.nextInt();
//			
//			std[i].total=std[i].kor+std[i].eng+std[i].math;
//			std[i].avg=std[i].total/3.0;
//		}
//		//출력
//		for(Student s:std) {
//			System.out.println("이름:"+s.name+" "+s.kor+" "+s.eng+" "+s.math+" "+s.total+" "+s.avg);
//		}
//	}
	public static void main(String[] args){
		process();
	}
}
