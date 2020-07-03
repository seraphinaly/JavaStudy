//라이브러리 소환
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainForm extends JFrame implements ActionListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem open=new JMenuItem("열기");
	JMenuItem save=new JMenuItem("저장");
	JMenuItem copy=new JMenuItem("복사");
	JMenuItem close=new JMenuItem("종료");
	
	//생성자 => 클래스 저장
	public MainForm() {
		JMenu file=new JMenu("파일");
		file.add(open);
		file.add(save);
		file.add(copy);
		file.add(close);
		bar.add(file);
		
		//윈도우 올리기
		setJMenuBar(bar);
		//윈도우 크기 결정
		setSize(1024,768);
		setVisible(true); //윈도우를 보여준다
		
		open.addActionListener(this);  //누르면 @override 이하 수행
		save.addActionListener(this);
		copy.addActionListener(this);
		close.addActionListener(this);
	}
	
	public static void main(String[] args){
		new MainForm();
	}

	@Override //if문 사용예시
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==open) {
			JOptionPane.showMessageDialog(this, "파일 열기 선택");
		}
		else if(e.getSource()==save) {
			JOptionPane.showMessageDialog(this, "파일 저장 선택");
		}
		else if(e.getSource()==copy) {
			JOptionPane.showMessageDialog(this, "파일 복사 선택");
		}
		else if(e.getSource()==close) {
			JOptionPane.showMessageDialog(this, "파일 닫기 선택");
		}
		
	}

}
