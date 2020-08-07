package com.sist.data;
/*
 *    ���α׷� �ۼ�
 *    = ���� : �и��� �� ���� => ��ü�� ������ ����  =======> AI �о�
 *       (���Ͽ��� �ۼ���)
 *       = 1. ��ü ������ �о  �и�  => �޸� ����
 *                           ======== ArrayList                
 *          �ʿ� Ŭ���� : FileReader (��ü ���� �д� Ŭ����)
 *                    StringTokenizer,split
 *       = 2. �޸𸮿��� ����
 *    = ����Ŭ : �и��� �Ǿ� �ִ� ����      =========> Web �о�
 *       = �ʿ�ø��� ����Ŭ�� ���� => �޼ҵ�ȿ��� ó��.
 */
// ������ ����
import java.util.*;

import java.io.*;

public class MovieManager {
	// ������ ����
	private static ArrayList<MovieVO> list = new ArrayList<MovieVO>();
	// ��� �ڹ����Ͽ��� �������� ��� => �ݵ�� static
	// ***����Ŭ������ static�� �������� �ʴ´�. ����Ŭ ��ü�� static,
	// ���α׷� ���� => ������ ���� => ArrayList�� ������ ����
	static {
		try {
			/*
			 * *** ���� �д� ��� 2���� 1. �ѱ��ھ� �д� ��� FileInputStream FileReader 2. ���پ� �д� ��� ��ü
			 * �����͸� �ӽ���������� ������ ��� BufferedReader => BufferedReader.readLine()
			 * 
			 */
			// ***����� ������ �б� ����
			FileInputStream fr = new FileInputStream("c:\\javaDev\\matzip.txt");
			// �޸𸮿� ��ü�����͸� ��Ƽ� ����
			BufferedReader in = new BufferedReader(new InputStreamReader(fr));// <-����ȿ� ���°� inputstream�� �����Ѵ�.
			while (true) {
				String movie = in.readLine(); // ���� �о���� �κ�
				// �����̶�? \n�� �ִºκб��� ����

				if (movie == null)
					break;// ���� ���о����� ���� ��Ų��.
				/*
				 * �Ѱ��� ����
				 * 
				 * 42|1|���º���(2018)|//img1.daumcdn.net/thumb/C155x225/?fname=https%3A%2F%2Ft1.
				 * daumcdn.net%2Fmovie%2F6f3736b42bc39deb1139a58cc0335248fe638d78|���� 08 .
				 * 9|������|��Ƽ�|���|2020.05.21 ����|110��, ��ü������|11,478|���鸮�� ������ ����������?�� �ٴ帶���� ��� ����
				 * �� �ҳ�, ������ ���� �� �����ϰ� ���� �� �ִ�. �ʵ��л��� �� ������ ���� �ϴ� ��ȭ�� ���� �� �ͼ������� ����� �����ϴ� ������
				 * ���̿��� �ܷο��� ������ �Ǵµ��� �Ҹ��� �Ұ� ���� ����, ������ Ư���� �ҿ��� ���۵ȴ�!
				 * 
				 */
				// �Ѱ��� ��ü�� ���� ������ �߶� MovieVO�� �־��ش�.
				StringTokenizer st = new StringTokenizer(movie, "|"); // ���� | �� �������� �ڸ���.
				while (st.hasMoreTokens()) {
					MovieVO vo = new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken())); // �߶�� ���ڴ� String �� �̹Ƿ� int������ ��ȯ ��������Ѵ�.
					vo.setCno(Integer.parseInt(st.nextToken()));

					vo.setTitle(st.nextToken()); // ��ȭ����
					vo.setPoster(st.nextToken()); // ��ȭ������
					
					vo.setAddress(st.nextToken()); // ����
					// ����
					vo.setScore(st.nextToken()); // �������� trim()
					
					vo.setTelephone(st.nextToken()); //�ּ�
					
					vo.setCategory(st.nextToken()); // ���� ����
					vo.setCost(st.nextToken()); //���ݴ�
					vo.setNickname(st.nextToken()); // �г���
					vo.setStory(st.nextToken()); // �ٰŸ�
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
			// pagecnt => �����ϴ� ��ġ ����
			if (i < 4 && j >= pagecnt) // 10���� �Ǹ� ���� ������ j�� for ���ư��� Ƚ�� ����
			{
				movies.add(vo);
				i++;
			}
			j++;
		}
		return movies;
	}

	// ������ ������ ���
	public int movieTotalPage() {
		return (int) Math.ceil(list.size() / 10.0);
		// ceil �Լ��� �ø� �޼ҵ�
	}

	// �󼼺���
	public MovieVO movieDetailData(int mno) {
		return list.get(mno-1);
	}
	//��ȭ ��ü �б�
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
	//�˻�
	public ArrayList<MovieVO> movieFindData(String ss)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>(); //���� �迭
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
		System.out.print("������ :");
		int page = scan.nextInt();

		MovieManager m = new MovieManager();
		System.out.println(page + " page /" + m.movieTotalPage() + " pages");

		// ������ �б�
		ArrayList<MovieVO> list = m.movieListData(page); // �ش� �������� �����͸� �Ѱ��ش�.
		for (MovieVO vo : list) {
			System.out.println("========================");
			System.out.println("title �κ� :"+vo.getTitle());
			System.out.println("img �κ�     :"+vo.getPoster());
//            for (MovieVO vo : list) {
//               if(vo.getTitle().contains(ss))
//               {
//                  System.out.println(vo.getTitle());
//               }
//            }
	}
}
}