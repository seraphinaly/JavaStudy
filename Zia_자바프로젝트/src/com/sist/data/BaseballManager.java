package com.sist.data;

import java.util.*;
import java.io.*;

public class BaseballManager{
	// ������ ����
	private static ArrayList<BaseballVO> list=new ArrayList<BaseballVO>();
	static{
		try{

			// ����� ���� �б�
			FileInputStream fr=new FileInputStream("c:\\javaDev\\naver_baseball.txt");
			// �޸𸮿� ��ü�����͸� ��Ƽ� ����
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
			// pagecnt => ���� ��ġ
			if(i<4 && j>=pagecnt){
				baseballs.add(vo);
				i++;// 10���� �����ִ� ����
			}
			j++;// for���ư��� Ƚ��
		}
		return baseballs;
	}

	public int baseballTotalPage(){
		return (int)(Math.ceil(list.size()/10.0));
		// ceil�� �ø� �޼ҵ�
	}

	// �󼼺���
	public BaseballVO baseballDetailData(int mno){
		return list.get(mno-1);
	}

	// ��ȭ ��ü �б�
	public ArrayList<BaseballVO> baseballAllData(int cno){
		ArrayList<BaseballVO> baseballs=new ArrayList<BaseballVO>();
		for(BaseballVO vo:list){
			if(vo.getCno()==cno){
				baseballs.add(vo);
			}
		}
		return baseballs;
	}

	// �˻�
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
//		System.out.print("������:");
//		int page=scan.nextInt();
//
//		BaseballManager m=new BaseballManager();
//		System.out.println(page+" page / "+m.baseballTotalPage()+" pages");
//		// ������ �б�
//		ArrayList<BaseballVO> list=m.baseballListData(page);
//		for(BaseballVO vo:list){
//			System.out.println(vo.getTeamName());
//		}
//	}

}
