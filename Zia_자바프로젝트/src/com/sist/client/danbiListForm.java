package com.sist.client;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import com.sist.data.*;
import java.net.*;

public class danbiListForm extends JPanel implements MouseListener{


   // 오늘의 추천작품, 실시간 구매, 인기작품, 신규작품
   JButton b1, b2, b3, b4, b5;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   ClassDetailForm cdf=new ClassDetailForm();
   
   
   /*
    * 기능 => 메소드 ==> 리턴형, 매개변수
    * 
    */
   public danbiListForm()
   {
      setLayout(null); // FlowLayout <-default 
                   // Layout(null) -> 사용자 배치
      b1 = new JButton("오늘의 추천작품");
      b2 = new JButton("실시간 구매");
      b3 = new JButton("인기작품");
      b4 = new JButton("신규작품");
      b5 = new JButton("검색");
 
      tf = new JTextField(20); //TextField 20글자이내로 입력할 수 있게 설정
      //나란히 배치하기 위해서 패널
      JPanel p = new JPanel();
      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);
      p.add(b5);
      p.add(tf);
      p.setBounds(10,25,900,35);
      add(p);
      
      
      String[] col= {"번호"," ","작품명","작가","수량","배송일"};
      Object[][] row=new Object[0][6];
      
      
      //DefaultTableModel => 오버라이딩 할때 메소드가 있다(익명의 클래스 => 내부클래스)
      /*
       *    내부 클래스 => 쓰레드, 네트워크
       *    =======
       *    class A
       *    {
       *       ClassB{
       *          //B클래스는 A클래스의 맴버클래스
       *       }
       *    }
       */
      model = new DefaultTableModel(row,col){
         //편집이 불가능
         @Override
         public boolean isCellEditable(int row, int column) {
            // TODO Auto-generated method stub
            return false;
         }
         // 이미지 첨부
         @Override
         public Class<?> getColumnClass(int columnIndex) {
            // TODO Auto-generated method stub
            return getValueAt(0,columnIndex).getClass();
         }
      };
      //ScrollPane 만드는 방법
      table = new JTable(model);
      table.setRowHeight(35);
      JScrollPane js = new JScrollPane(table);
      
      js.setBounds(10, 70, 700, 600);
      add(js);
      
      cdf.setBounds(715, 70, 800, 650);
      add(cdf);
      
      ClassAllData(1);
      cdf.detailPrint(1);
      
      table.addMouseListener(this);
   }
   public void ClassAllData(int cno)
   {
      //데이터 가지고 오기
      ClassManager m = new ClassManager();
      ArrayList<ClassVO> list = m.classAllData(cno);
      
      //테이블 한번 지우기
      //테이블 단점 : 한번 출력하고  또 출력하면 추가로 붙기때문에 초기화가 필요하다.
      for(int i=model.getRowCount()-1;i>=0;i--)
      {
         //출력된 카운드 getRowCount
         model.removeRow(i);
      }
      
      // ScrollPane에 출력될 데이터 출력
      /*
       *  java.io,java.net ==> CheckException => 반드시 예외처리 
       */
      for(ClassVO vo:list)
      {
         try
         {//URL | IO(inputOput)이 나오면 무조건 try catch 해야한다.         
            URL url = new URL(vo.getPoster()); //http:, c:\\image
            Image img =ClientMainFrame.getImage(new ImageIcon(url) ,50,50); //이미지 축소 (테이블 안에 들어가려면 이미지 축소)
            Object[] data = {
            vo.getMno(),
            new ImageIcon(img), //ScrollPane에다 이미지 추가시 
            vo.getTitle(),
            vo.getName(),
            vo.getQt(),
            vo.getDelivery(),
            vo.getPoint(),
            vo.getScore(),
            vo.getReview()
         };
         model.addRow(data);
         }catch (Exception ex) {}
      }
   }
   public void classFindData(String ss)
   {
      //데이터 가지고 오기
      ClassManager m = new ClassManager();
      ArrayList<ClassVO> list = m.ClassFindData(ss);
      
      //테이블 한번 지우기
      //테이블 단점 : 한번 출력하고  또 출력하면 추가로 붙기때문에 초기화가 필요하다.
      for(int i=model.getRowCount()-1;i>=0;i--)
      {
         //출력된 카운드 getRowCount
         model.removeRow(i);
      }
      
      // ScrollPane에 출력될 데이터 출력
      /*
       *  java.io,java.net ==> CheckException => 반드시 예외처리 
       */
      for(ClassVO vo:list)
      {
         try
         {//URL | IO(inputOput)이 나오면 무조건 try catch 해야한다.         
            URL url = new URL(vo.getPoster()); //http:, c:\\image
            Image img =ClientMainFrame.getImage(new ImageIcon(url) ,50,50); //이미지 축소 (테이블 안에 들어가려면 이미지 축소)
            Object[] data = {
            vo.getMno(),
            new ImageIcon(img), //ScrollPane에다 이미지 추가시 
            vo.getTitle(),
            vo.getName(),
            vo.getQt(),
            vo.getDelivery(),
            vo.getPoint(),
            vo.getScore(),
            vo.getReview()
         };
         model.addRow(data);
         }catch (Exception ex) {}
      }
   }
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==table) {
		if(e.getClickCount()==2) {
			int row=table.getSelectedRow();
			String mno=model.getValueAt(row, 0).toString();
			cdf.detailPrint(Integer.parseInt(mno));
		}
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}