package com.sist.data;

import java.util.*;
import java.io.*;

public class BaseballManager{
	// 데이터 저장
	private static ArrayList<BaseballVO> list=new ArrayList<BaseballVO>();
	static{
		try{

			// 저장된 파일 읽기
			FileInputStream fr=new FileInputStream("c:\\javaDev\\naver_baseball.txt");
			// 메모리에 전체데이터를 모아서 관리
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true){
				String baseball=in.readLine();
				if(baseball==null)
					break;

				StringTokenizer st=new StringTokenizer(baseball,"|");
				while(st.hasMoreTokens()){
					BaseballVO vo=new BaseballVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTeamName(st.nextToken());
					vo.setPoster(st.nextToken());
					vo.setGameNo(Integer.parseInt(st.nextToken()));
					vo.setWin(Integer.parseInt(st.nextToken()));
					vo.setLose(Integer.parseInt(st.nextToken()));
					vo.setDraw(Integer.parseInt(st.nextToken()));
					vo.setWinRatio(Double.parseDouble(st.nextToken()));
					vo.setGap(Double.parseDouble(st.nextToken()));
					vo.setContinuity(st.nextToken());
					vo.setOutBase(Double.parseDouble(st.nextToken()));
					vo.setLongHit(Double.parseDouble(st.nextToken()));
					vo.setCurrentTen(st.nextToken());
					list.add(vo);
				}
			}

		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public ArrayList<BaseballVO> baseballListData(int page){
		ArrayList<BaseballVO> baseballs=new ArrayList<BaseballVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*4)-4;
		/*(
		 * 1page => 0~9 2page => 10~19 3page => 20~29
		 */
		for(BaseballVO vo:list){
			// pagecnt => 저장 위치
			if(i<4 && j>=pagecnt){
				baseballs.add(vo);
				i++;// 10개씩 나눠주는 변수
			}
			j++;// for돌아가는 횟수
		}
		return baseballs;
	}

	public int baseballTotalPage(){
		return (int)(Math.ceil(list.size()/10.0));
		// ceil는 올림 메소드
	}

	// 상세보기
	public BaseballVO baseballDetailData(int mno){
		return list.get(mno-1);
	}

	// 영화 전체 읽기
	public ArrayList<BaseballVO> baseballAllData(int cno){
		ArrayList<BaseballVO> baseballs=new ArrayList<BaseballVO>();
		for(BaseballVO vo:list){
			if(vo.getCno()==cno){
				baseballs.add(vo);
			}
		}
		return baseballs;
	}

	// 검색
	public ArrayList<BaseballVO> baseballFindData(String ss){
		ArrayList<BaseballVO> baseballs=new ArrayList<BaseballVO>();
		for(BaseballVO vo:list){
			if(vo.getTeamName().contains(ss)){
				baseballs.add(vo);
			}
		}
		return baseballs;
	}


//	public static void main(String[] args){
//		Scanner scan=new Scanner(System.in);
//		System.out.print("페이지:");
//		int page=scan.nextInt();
//
//		BaseballManager m=new BaseballManager();
//		System.out.println(page+" page / "+m.baseballTotalPage()+" pages");
//		// 데이터 읽기
//		ArrayList<BaseballVO> list=m.baseballListData(page);
//		for(BaseballVO vo:list){
//			System.out.println(vo.getTeamName());
//		}
//	}

}
