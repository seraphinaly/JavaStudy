package com.sist.data;

import java.util.*;
import java.io.*;
import java.lang.*;

public class ClassManager {

	private static ArrayList<ClassVO> list = new ArrayList<ClassVO>();
	static {
		try {
			FileInputStream fr = new FileInputStream("c:\\javaDev\\ClassData(new).txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(fr));
			while (true) {
				String Class = in.readLine();
				if (Class == null)
					break;
				StringTokenizer st = new StringTokenizer(Class, "|");
				while (st.hasMoreTokens()) {
					ClassVO vo = new ClassVO();

					/*
					 * poster; title; name; qt; delivery; point; score; review;
					 */

					vo.setMno(Integer.parseInt(st.nextToken())); //mno
					vo.setCno(Integer.parseInt(st.nextToken())); //cno
					vo.setPoster(st.nextToken());				 //사진
					vo.setTitle(st.nextToken());   	 			 //타이틀
					vo.setName(st.nextToken());					 //이름
					vo.setQt(st.nextToken());					 //수량
					vo.setDelivery(st.nextToken());			     //
					vo.setPoint(st.nextToken());

					String score = st.nextToken();
					score = score.substring(score.indexOf(":") + 1);
					vo.setScore(score.trim());

					vo.setReview(st.nextToken());
					
					list.add(vo);
					
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<ClassVO> ClassListData(int page) {
		ArrayList<ClassVO> classes = new ArrayList<ClassVO>();
		int i = 0;
		int j = 0;
		int pagecnt = (page*4)-4;

		for (ClassVO vo : list) {

			if (i < 4 && j >= pagecnt) {
				classes.add(vo);
				i++;
			}
			j++;
		}
		return classes;
	}

	public int ClassTotalPage() {
		return (int) Math.ceil(list.size() / 10.0);

	}

	public ClassVO ClassDetailData(int mno) {
		return list.get(mno - 1);
	}

	public ArrayList<ClassVO> classAllData(int cno) {
		ArrayList<ClassVO> classes = new ArrayList<ClassVO>();
		for (ClassVO vo : list) {
			if (vo.getCno() == cno) {
				classes.add(vo);
			}
		}
		return classes;
	}

	public ArrayList<ClassVO> ClassFindData(String ss) {
		ArrayList<ClassVO> classes = new ArrayList<ClassVO>();

		for (ClassVO vo : list) {
			if (vo.getTitle().contains(ss)) {
				classes.add(vo);
			}
		}
		return classes;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("페이지 :");
		int page = scan.nextInt();

		ClassManager m = new ClassManager();
		System.out.println(page + " page /" + m.ClassTotalPage() + " pages");

		ArrayList<ClassVO> list = m.ClassListData(page);
		for (ClassVO vo : list) {
			System.out.println(vo.getTitle());
		}
	}
}
