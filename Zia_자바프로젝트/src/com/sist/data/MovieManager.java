package com.sist.data;
/*
 *    프로그램 작성
 *    = 파일 : 분리할 수 없다 => 전체를 통으로 저장  =======> AI 분야
 *       (파일에서 작성시)
 *       = 1. 전체 파일을 읽어서  분리  => 메모리 저장
 *                           ======== ArrayList                
 *          필요 클래스 : FileReader (전체 파일 읽는 클래스)
 *                    StringTokenizer,split
 *       = 2. 메모리에서 제어
 *    = 오라클 : 분리가 되어 있는 상태      =========> Web 분야
 *       = 필요시마다 오라클에 연결 => 메소드안에서 처리.
 */
// 데이터 관리
import java.util.*;

import java.io.*;

public class MovieManager {
	// 데이터 저장
	private static ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	// 모든 자바파일에서 공통으로 사용 => 반드시 static
	// ***오라클에서는 static을 선언하지 않는다. 오라클 자체가 static,
	// 프로그램 시작 => 데이터 수집 => ArrayList에 저장후 시작
	static {
		try {
			/*
			 * *** 파일 읽는 방법 2가지 1. 한글자씩 읽는 방법 FileInputStream FileReader 2. 한줄씩 읽는 방법 전체
			 * 데이터를 임시저장공간에 저장후 사용 BufferedReader => BufferedReader.readLine()
			 * 
			 */
			// ***저장된 파일을 읽기 시작
			FileInputStream fr = new FileInputStream("c:\\javaDev\\matzip.txt");
			// 메모리에 전체데이터를 모아서 관리
			BufferedReader in = new BufferedReader(new InputStreamReader(fr));// <-여기안에 들어가는건 inputstream이 들어가야한다.
			while (true) {
				String movie = in.readLine(); // 한줄 읽어오는 부분
				// 한줄이란? \n이 있는부분까지 한줄

				if (movie == null)
					break;// 파일 다읽었으면 종료 시킨다.
				/*
				 * 한개의 정보
				 * 
				 * 42|1|나는보리(2018)|//img1.daumcdn.net/thumb/C155x225/?fname=https%3A%2F%2Ft1.
				 * daumcdn.net%2Fmovie%2F6f3736b42bc39deb1139a58cc0335248fe638d78|평점 08 .
				 * 9|김진유|김아송|드라마|2020.05.21 개봉|110분, 전체관람가|11,478|“들리지 않으면 가까워질까요?” 바닷마을에 사는 열한
				 * 살 소녀, 보리는 가족 중 유일하게 들을 수 있다. 초등학생이 된 보리는 말로 하는 대화가 점점 더 익숙해지고 수어로 소통하는 가족들
				 * 사이에서 외로움을 느끼게 되는데… 소리를 잃고 싶은 아이, 보리의 특별한 소원이 시작된다!
				 * 
				 */
				// 한개의 전체에 대한 정보를 잘라서 MovieVO에 넣어준다.
				StringTokenizer st = new StringTokenizer(movie, "|"); // 문자 | 을 기준으로 자른다.
				while (st.hasMoreTokens()) {
					MovieVO vo = new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken())); // 잘라온 문자는 String 형 이므로 int형으로 변환 시켜줘야한다.
					vo.setCno(Integer.parseInt(st.nextToken()));

					vo.setTitle(st.nextToken()); // 영화제목
					vo.setPoster(st.nextToken()); // 영화포스터
					
					vo.setAddress(st.nextToken()); // 감독
					// 평점
					vo.setScore(st.nextToken()); // 공백제거 trim()
					
					vo.setTelephone(st.nextToken()); //주소
					
					vo.setCategory(st.nextToken()); // 음식 종료
					vo.setCost(st.nextToken()); //가격대
					vo.setNickname(st.nextToken()); // 닉네임
					vo.setStory(st.nextToken()); // 줄거리
					list.add(vo);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<MovieVO> movieListData(int page) {
		ArrayList<MovieVO> movies = new ArrayList<MovieVO>();
		int i = 0;
		int j = 0;
		int pagecnt =(page*4)-4;
		/*
		 * 1page => 0~9 2page => 10~19 3page => 20~29
		 */
		for (MovieVO vo : list) {
			// pagecnt => 저장하는 위치 지정
			if (i < 4 && j >= pagecnt) // 10개가 되면 빠져 나가고 j는 for 돌아가는 횟수 지정
			{
				movies.add(vo);
				i++;
			}
			j++;
		}
		return movies;
	}

	// 페이지 나누는 방법
	public int movieTotalPage() {
		return (int) Math.ceil(list.size() / 10.0);
		// ceil 함수는 올림 메소드
	}

	// 상세보기
	public MovieVO movieDetailData(int mno) {
		return list.get(mno-1);
	}
	//영화 전체 읽기
	public ArrayList<MovieVO> movieAllData(int cno)
	
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		for(MovieVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	//검색
	public ArrayList<MovieVO> movieFindData(String ss)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>(); //가변 배열
		for(MovieVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("페이지 :");
		int page = scan.nextInt();

		MovieManager m = new MovieManager();
		System.out.println(page + " page /" + m.movieTotalPage() + " pages");

		// 데이터 읽기
		ArrayList<MovieVO> list = m.movieListData(page); // 해당 페이지에 데이터만 넘겨준다.
		for (MovieVO vo : list) {
			System.out.println("========================");
			System.out.println("title 부분 :"+vo.getTitle());
			System.out.println("img 부분     :"+vo.getPoster());
//            for (MovieVO vo : list) {
//               if(vo.getTitle().contains(ss))
//               {
//                  System.out.println(vo.getTitle());
//               }
//            }
	}
}
}