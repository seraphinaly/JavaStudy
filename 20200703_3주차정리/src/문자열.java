import javax.swing.*;//������ â�� ���ڴ�
import java.awt.event.*;

public class ���ڿ� extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public ���ڿ�() {
		add("North",tf); //�Է��� �߰�
		add("South",tf1);
//		tf.setText(String.valueOf(20)); //���ڷ� ��ȯ
		setSize(350,300);
		setVisible(true);
		
		tf.addActionListener(this); //tf���� ���� => actionPerformed ȣ��
	}
	public static void main(String[] args){
		new ���ڿ�();
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf) { //tf���� �Է�=>����
		  //tf1.setText(tf.getText().toUpperCase());
			tf1.setText(tf.getText().toLowerCase());
		}
		
	}

}
