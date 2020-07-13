import javax.swing.*;

import javafx.scene.paint.Color;
public class MainWindow extends JFrame{
	//실행하자마자 윈도우를 생성
	public MainWindow() {
		//윈도우 화면설계
		setSize(800,600);
		setVisible(true);

	}

	public static void main(String[] args){
		//생성자는 반드시 앞에 new!!
		new MainWindow();
	}
}
