
public class 변수설정_영화정보 {

	public static void main(String[] args) {
/*		#살아있다(2020)상영중
		평점 06 . 7
		한국
		2020.06.24
		98분, 15세이상관람가
		감독 조일형 주연 유아인, 박신혜
		예매 1위 누적관객 357,068명
		
       	위대한 쇼맨(2017)상영중
                평점 09 . 9
		뮤지컬/드라마
		미국
		2017.12.20 개봉 2020.05.21 (재개봉)
		104분, 12세이상관람가
		감독 마이클 그레이시 주연 휴 잭맨, 잭 에프론
		예매 5위 누적관객1,667,104명
*/
		String title="#살아있다(2020)";
		boolean isOpen=true;
		double score=6.7;
		String nara="한국";
		String genre="";
		String regdate="2020.06.24";;
		String director="조일형";
		String actor="유아인,박신혜";
		int time=98;
		int grade=15;
		int rank=1;
		int showUser=357068;
		
		System.out.println("======== 영화정보 ========");
		System.out.print("영화명:"+title);
		System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
		System.out.println("기타:"+nara+" / "+grade+"세 관람가");
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate+" 개봉");
		System.out.println("감독:"+director);
		System.out.println("출연:"+actor);
		System.out.println("순위:"+rank+"위");
		System.out.println("누적관객:"+showUser+"명");
		
		title="위대한 쇼맨(2017)";
		isOpen=true;
		score=9.9;
		nara="미국";
		genre="뮤지컬/드라마";
		regdate="2017.12.20";;
		director="마이클 그레이시";
		actor="휴 잭맨,잭 에프론";
		time=104;
		grade=12;
		rank=5;
		showUser=1667104;
		
		System.out.println("======== 영화정보 ========");
		System.out.print("영화명:"+title);
		System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
		System.out.println("기타:"+nara+" / "+grade+"세 관람가");
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate+" 개봉");
		System.out.println("감독:"+director);
		System.out.println("출연:"+actor);
		System.out.println("순위:"+rank+"위");
		System.out.println("누적관객:"+showUser+"명");
	}

}
