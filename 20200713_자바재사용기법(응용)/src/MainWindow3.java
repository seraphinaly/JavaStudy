import javax.swing.*;
public class MainWindow3 extends JFrame{
	MainView mv=new MainView(); //Æ÷ÇÔclass
	public MainWindow3() {
		add("Center",mv);
		setSize(800,600);
		setVisible(true);
	}
	public static void main(String[] args){
		new MainWindow3();

	}

}
