import javax.swing.*;
import java.awt.*;
public class MainView extends JPanel{
	//image 초기화
	Image back;
	public MainView(){
		//이미지 정보 읽기
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
	}
	//메소드 내용 변경(오버라이딩;재정의)<=상속
	@Override
	protected void paintComponent(Graphics g){
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}
	
}
