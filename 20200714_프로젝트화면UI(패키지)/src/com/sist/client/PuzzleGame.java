package com.sist.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//윈도우창
public class PuzzleGame extends JFrame implements ActionListener{
	JButton b1, b2;
	JButton[][] pan=new JButton[3][3];
	int[][] panCount=new int[3][3];
	int brow=0;
	int bcol=0;

	//0~8까지 중복없이 난수 발생
	public void getRand(){
		int[] com=new int[9];//중복없는 난수값 저장
		int su=0;//발생한 난수 저장
		boolean bCheck=false;//중복여부 확인
		for(int i=0; i<9; i++){
			//난수발생
			bCheck=true;
			while(bCheck){
				su=(int)(Math.random()*9);//0~8
				bCheck=false;
				//검색=>저장된 데이터의 중복여부
				for(int j=0; j<i; j++){
					if(com[j]==su){
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
			panCount[i/3][i%3]=su;
			if(su==8){
				brow=i/3;
				bcol=i%3;
			}
		}
	}

	//배치메소드
	public void display(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i==brow && j==bcol){
					pan[i][j].setText("");
					pan[i][j].setEnabled(false);//비활성화
				} else{
					pan[i][j].setText(String.valueOf(panCount[i][j]+1));
					pan[i][j].setEnabled(true);//활성화
				}
			}
		}
	}

	//버튼 클릭
	public PuzzleGame(){ //생성자: 클래스를 메모리에 저장할때 가장 먼저 호출
		b1=new JButton("시작");
		b2=new JButton("종료");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		add("South", p);

		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(3, 3, 5, 5));
		int k=1;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				pan[i][j]=new JButton(String.valueOf(k));
				pan[i][j].setFont(new Font("함초롬돋움", Font.BOLD, 50));
				p2.add(pan[i][j]);
				pan[i][j].addActionListener(this);
				k++;
			}
		}
		add("Center", p2);

		getRand();
		display();

		setSize(350, 400);
		setVisible(true);

		b1.addActionListener(this);//이벤트 등록
		b2.addActionListener(this);
	}

	public static void main(String[] args){
		new PuzzleGame();
		//생성자 호출시 반드시 앞에 new 붙여서!
	}

	//종료여부 확인
	public boolean isEnd(){
		int k=0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
		return true;
	}

	@Override //버튼 처리
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			getRand();
			display();
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(e.getSource()==pan[i][j]){
					panCount[brow][bcol]=panCount[i][j];
					panCount[i][j]=8;
					brow=i;
					bcol=j;
					display();
					if(isEnd()){
						JOptionPane.showMessageDialog(this, "Game Over!!");
						System.exit(0);
					}
				}
			}
		}
		if(e.getSource()==b2){
			System.exit(0);
		}
	}

}
