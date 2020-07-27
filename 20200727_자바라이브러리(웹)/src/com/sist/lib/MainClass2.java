package com.sist.lib;
import java.util.*;
public class MainClass2{

	public static void main(String[] args){
		//#List 계열(접근성,속도(동기화) 차이)
		//ArrayList<String> names=new ArrayList<String>();
		//Vector<String> names=new Vector<String>();
		LinkedList<String> names=new LinkedList<String>();
		names.add("김혜성");
		names.add("김하성");
		names.add("서건창");
		names.add("이정후");
		names.add("박병호");
		System.out.println("저장된 개수:"+names.size());
		//출력
		for(int i=0;i<names.size();i++) {
			//데이터 받을 때
			String name=names.get(i); //get:원하는 위치에 저장된 데이터 읽기
			System.out.println(name+":"+i); //index는 자동생성:0번부터!
		}
		System.out.println("=============");
		//원하는 위치에 출력
		//1.add(); => 자동으로 5번에 추가
		//2.add(index,"값"); =>원하는 순서에 추가
		names.add(2,"러셀");
		for(int i=0;i<names.size();i++) {
			String name=names.get(i); 
			System.out.println(name+":"+i);
		}
		System.out.println("=============");
		
		//삭제
		names.remove(3);
		for(int i=0;i<names.size();i++) {
			String name=names.get(i); 
			System.out.println(name+":"+i);
		}
		System.out.println("=============");
		
		//수정
		names.set(0, "서건창");
		for(int i=0;i<names.size();i++) {
			String name=names.get(i); 
			System.out.println(name+":"+i);
		}
		System.out.println("=============");
		
		//전체 삭제
		names.clear();
		System.out.println("저장된 개수:"+names.size());
	}

}
