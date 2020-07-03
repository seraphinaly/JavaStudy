import javax.swing.*;//윈도우 창을 띄우겠다
import java.awt.event.*;

public class 문자열 extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public 문자열() {
		add("North",tf); //입력줄 추가
		add("South",tf1);
//		tf.setText(String.valueOf(20)); //문자로 변환
		setSize(350,300);
		setVisible(true);
		
		tf.addActionListener(this); //tf에서 엔터 => actionPerformed 호출
	}
	public static void main(String[] args){
		new 문자열();
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf) { //tf에서 입력=>엔터
		  //tf1.setText(tf.getText().toUpperCase());
			tf1.setText(tf.getText().toLowerCase());
		}
		
	}

}
