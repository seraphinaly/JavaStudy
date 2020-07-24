package com.sist.util;
import java.util.*;
public class MainClass3_��¥�������_�ڸ���{

	public static void main(String[] args){
	Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; //���೯¥ �����߻�(5~14)
		
		String day="";
		for(int i=0;i<resDay.length;i++) {
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0, day.lastIndexOf("|")); //�Ǹ����� | �ϳ� �����
		System.out.println(day);
		
		//��¥�� �и�
		//split���
		String[] resdays=day.split("\\|"); 
		//split�� ���Խ� ������ ��, �ͼ����� ������ StringTokenizer ������
		/*���Խ� ��ȣ: ^ : ���۹��� 
		  				^[A-Za-z}:���ĺ����� �����ϴ� ����
		  				^[��-�R]:�ѱ۷� �����ϴ� ��� �� //cf.[^��-�R]:�ѱ��� ������
		  				^[0-9]:���ڷ� �����ϴ� ����
		 				<���Ϲ���> 3���: [^��-�R] =>3
		 						 1�ϰ�: [^0-9] =>�ϰ�
					$ : ������ 
					 ex)A$ :A�� ������ �ܾ�
					. : ������ �ѱ���(������) => \\.
					| : ����
					? : ������ ���, ������ �����
		*/			
		for(String s:resdays)
		System.out.println(s);
		
		System.out.println("===StringTokenizer===");
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
