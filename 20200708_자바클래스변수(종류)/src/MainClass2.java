//사용자가 직접 데이터형을 만든다
class MovieInfo{
	//멤버(=인스턴스)변수: new를 통해 메모리 공간을 생성, 클래스 달라도 사용가능
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String site_name;
}
class MainClass2{
//클래스는 여러 개 가능하나, public은 하나만 가능
//public은 공개하겠다는 의미, 없어도 무방함
//public 없을 경우 저장명은 main을 가진 class명 따라감	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		MovieInfo m1=new MovieInfo();
		//m1 메모리에 저장되어 있는 변수의 초기값
		//배열도 가능: MovieInfo[] m=new MovieInfo[50];
		m1.title="#살아있다(2020)";
		m1.director="조일형";
		m1.actor="유아인, 박신혜";
		m1.reserve=17.3;
		m1.rank=1;
		m1.site_name="CGV";
		
		MovieInfo m2=new MovieInfo();
		//m2 메모리에 저장되어 있는 변수의 초기값
		m2.title="밤쉘: 세상을 바꾼 폭탄선언(2019)";
		m2.director="제이 로치";
		m2.actor="샤를리즈 테론, 니콜 키드먼, 마고 로비";
		m2.reserve=12.6;
		m2.rank=2;
		m2.site_name="Lotte Cinema";
		
		MovieInfo m3=new MovieInfo();
		//m3 메모리에 저장되어 있는 변수의 초기값
		m3.title="다크 나이트 라이즈(2012)";
		m3.director="크리스토퍼 놀란";
		m3.actor="크리스찬 베일, 마이클 케인, 게리 올드만, 앤 해서웨이, 톰 하디, 마리옹 꼬띠아르";
		m3.reserve=7.8;
		m3.rank=3;	
		
		//static(공유)변수: 
		//1.객체명을 통해 변경 가능
		m3.site_name="MEGABOX"; //모두 바뀜
		System.out.println("영화관:"+m1.site_name);
		//2.클래스명을 통해 변경 가능
		MovieInfo.site_name="서울극장";
		System.out.println("영화관:"+m1.site_name);
		
		//멤버변수:
		m3.title="원 데이(2011)";
		System.out.println("영화제목:"+m1.title);//그대로
		System.out.println("영화제목:"+m3.title);//자기만 바뀜
				
						

	}

}
