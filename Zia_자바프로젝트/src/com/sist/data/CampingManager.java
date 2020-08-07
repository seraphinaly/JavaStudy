package com.sist.data;
/*
 * 	���α׷� �ۼ�
 * 	= ���� : �и��� �� ���� => ��ü�� ������ ����  =======> AI �о�
 * 		(���Ͽ��� �ۼ���)
 * 		= 1. ��ü ������ �о  �и�  => �޸� ����
 * 								  ======== ArrayList
 * 								
 * 			�ʿ� Ŭ���� : FileReader (��ü ���� �д� Ŭ����)
 * 				       StringTokenizer,split
 * 		= 2. �޸𸮿��� ����
 * 
 *  
 * 	= ����Ŭ : �и��� �Ǿ� �ִ� ����		=========> Web �о�
 * 		= �ʿ�ø��� ����Ŭ�� ���� => �޼ҵ�ȿ��� ó��.
 * 
 */
// ������ ����
import java.util.*;

import com.sun.swing.internal.plaf.metal.resources.metal;

import java.io.*;
public class CampingManager {
	//������ ����
	private static ArrayList<CampingVO> list = new ArrayList<CampingVO>();
	//��� �ڹ����Ͽ��� �������� ��� => �ݵ�� static 
	//***����Ŭ������ static�� �������� �ʴ´�. ����Ŭ ��ü�� static, 
	//���α׷� ���� => ������ ���� => ArrayList�� ������ ����
	static
	{
		try
		{
			/*
			 *  *** 
			 *  ���� �д� ��� 2����
			 *  1. �ѱ��ھ� �д� ���
			 *  	FileInputStream
			 *  	FileReader
			 *  2. ���پ� �д� ���
			 *  	��ü �����͸� �ӽ���������� ������ ���
			 *  	BufferedReader =>  BufferedReader.readLine()
			 *  	
			 */
			//***����� ������ �б� ���� 
			FileInputStream fr = new FileInputStream("C:\\javaDev\\����.txt");
			//�޸𸮿� ��ü�����͸� ��Ƽ� ����
			  BufferedReader in = new BufferedReader(new InputStreamReader(fr));//<-����ȿ� ���°� inputstream�� �����Ѵ�.
			while(true)
			{
				String camping=in.readLine(); //���� �о���� �κ� 
											//�����̶�? \n�� �ִºκб��� ���� 
				
				if(camping==null)break;// ���� ���о����� ���� ��Ų��.
				/*
				 *  �Ѱ��� ����
				 *  
				 *  42|1|���º���(2018)|//img1.daumcdn.net/thumb/C155x225/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%2F6f3736b42bc39deb1139a58cc0335248fe638d78|���� 08 . 9|������|��Ƽ�|���|2020.05.21 ����|110��, ��ü������|11,478|���鸮�� ������ ����������?�� �ٴ帶���� ��� ���� �� �ҳ�, ������ ���� �� �����ϰ� ���� �� �ִ�. �ʵ��л��� �� ������ ���� �ϴ� ��ȭ�� ���� �� �ͼ������� ����� �����ϴ� ������ ���̿��� �ܷο��� ������ �Ǵµ��� �Ҹ��� �Ұ� ���� ����, ������ Ư���� �ҿ��� ���۵ȴ�!
				 *  
				 */
				//�Ѱ��� ��ü�� ���� ������ �߶� MovieVO�� �־��ش�.
				StringTokenizer st = new StringTokenizer(camping,"|"); //  ���� | �� �������� �ڸ���.
				while(st.hasMoreTokens())
				{
					CampingVO vo = new CampingVO();
					vo.setMno(Integer.parseInt(st.nextToken())); //�߶�� ���ڴ� String �� �̹Ƿ� int������ ��ȯ ��������Ѵ�.
					vo.setCno(Integer.parseInt(st.nextToken())); 
					
					
					vo.setTitle(st.nextToken());	//ķ������
					vo.setPoster(st.nextToken());	//ķ��������
				
					vo.setEvent(st.nextToken()); 	//ķ���̺�Ʈ
					
					vo.setStar_value(st.nextToken());//����
					vo.setPrice(st.nextToken());	 //����
					vo.setReview(st.nextToken());	 //����Ƚ��
					String location = st.nextToken();
					if(location.contains("^"))
					{
						location =location.replace("^","|");
						vo.setLocation(location);
					}
					else
					{
						vo.setLocation(location);	 //������ ��ġ			
					}
					vo.setDetail_location(st.nextToken()); //�ڼ��� ��ġ 
					vo.setBoss(st.nextToken());		// ����� �Ѹ���					
					list.add(vo);

				}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public ArrayList<CampingVO> CampingListData(int page)
	{
		ArrayList<CampingVO> camping = new ArrayList<CampingVO>();
		int i=0;
		int j=0;
		//int pagecnt=(page*10)-10;
		int pagecnt = (page*4)-4;
		/*
		 *  1page => 0~9
		 *  2page => 10~19
		 *  3page => 20~29
		 */
		for(CampingVO vo:list)
		{
			//pagecnt => �����ϴ� ��ġ ����
			if(i<4 && j>=pagecnt) //10���� �Ǹ� ���� ������ j�� for ���ư��� Ƚ�� ���� 
			{
				camping.add(vo);
				i++;
			}
			j++;
		}
		return camping;
	}
	
	
	//������ ������ ���
	public int movieTotalPage()
	{
		return (int)Math.ceil(list.size()/10.0); 
		//ceil �Լ��� �ø� �޼ҵ�
	}
	
	
	
	//�󼼺���
	public CampingVO CampingDetailData(int mno)
	{
		return list.get(mno-1);
	}
	
	
	
	
	//ķ�� ��ü �б�
	public ArrayList<CampingVO> CampingAllData(int cno)
	{
		/*
		 * 	���� cno
		 * 	��, 
		 * 		����������ȭ
		 * 		�����ο�ȭ
		 * 		��� cno�� ������ ��ϸ� ����ؼ� �Ѱ��ش�.
		 */
		ArrayList<CampingVO> Camping= new ArrayList<CampingVO>();
		for(CampingVO vo:list)
		{
			if(vo.getCno() ==cno)
			{
				Camping.add(vo);
			}
		}
		return Camping;
		
	}
	//�˻�
	public ArrayList<CampingVO> CampingFindData(String ss)
	{
		ArrayList<CampingVO> Camping = new ArrayList<CampingVO>(); //���� �迭
		//list 
		for(CampingVO vo:list)
		{
			//�Ѱ� ã���� vo�� �Ѱ��ְ�
			//�������� list�ϲ�.?
			if(vo.getTitle().contains(ss))//���Ե� �ܾ�
			{
				Camping.add(vo); 
				/*
				 * �״ϱ� Arraylist�� �ϳ� ���θ���
				 * �˻��� �����͸� ���ͼ�
				 * ���ο� arralist(��¿�)�����Ϳ� �ִ´�.
				 */
			}
		}
		return Camping;
		
	}
	
	   public static void main(String[] args) {
		      Scanner scan=new Scanner(System.in);
		      System.out.print("������ :");
		      int page = scan.nextInt();
		      
		      CampingManager m = new CampingManager();
		      System.out.println(page+" page /"+m.movieTotalPage()+" pages");
		      
		      //������ �б�
		      ArrayList<CampingVO> list = m.CampingListData(page); //�ش� �������� �����͸� �Ѱ��ش�.
		      for(CampingVO vo:list)
		      {
		    	  System.out.println(vo.getTitle());
		      }
//		      for (MovieVO vo : list) {
//		         if(vo.getTitle().contains(ss))
//		         {
//		            System.out.println(vo.getTitle());
//		         }
//		      }
		   }
		}
