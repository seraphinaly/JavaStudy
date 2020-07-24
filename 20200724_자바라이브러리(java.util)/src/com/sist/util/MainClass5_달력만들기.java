package com.sist.util;

import java.util.*;

public class MainClass5_�޷¸����{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int year=scan.nextInt();
		System.out.print("�� �Է�:");
		int month=scan.nextInt();

		String[] strWeek={"��", "��", "ȭ", "��", "��", "��", "��"};

		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); //���� 0���� ����
		cal.set(Calendar.DATE, 1);

		//���� ���ϱ�
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		int lastDay=cal.getActualMaximum(Calendar.DATE);

		//���
		System.out.println(year+"�� "+month+"��");
		for(int i=0; i<7; i++){
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		for(int i=1; i<=lastDay; i++){
			if(i==1){
				for(int j=0; j<week; j++){
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i);
			week++;
			if(week>6){
				week=0;
				System.out.println();
			}
		}
	}
}
