//�α��� ó��
//JTattoo �ٿ�ε�>>.jar����, �ҽ��ڵ� sample
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
public class ���ڿ�3 extends JFrame implements ActionListener{
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	JLabel poster=new JLabel();
	final String ID="admin"; //���� DB�� �־����. �ӽ÷� �ο�
	final String PWD="1234";
	public ���ڿ�3() {
		la1=new JLabel("ID");
		la2=new JLabel("PW");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("�α���");
		b2=new JButton("���");
		
		String s="https://search2.kakaocdn.net/argon/0x200_85_hr/L6WvGHhmxoR";
		try {
			poster.setIcon(new ImageIcon(new URL(s)));
		}catch(Exception ex) {}
		setLayout(null);
		
		la1.setBounds(10,15,30,30);
		tf.setBounds(45,15,150,30);
		la2.setBounds(10,50,30,30);
		pf.setBounds(45,50,150,30);
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);
		p.setBounds(10,90,195,35);
		add(la1);add(tf);
		add(la2);add(pf);
		add(p);
		poster.setBounds(50,125,300,250); //setBounds(x, y, width, height)
		add(poster);
		setSize(1024,768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //â ����� ��ӽ��� ��(������)
		//Integer.MAX_VALUE; //21�� 4õ�� �� ���
		b1.addActionListener(this); //�α���
		b2.addActionListener(this); //���
	}
	
	public static void main(String[] args) throws Exception{
		//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ���ڿ�3();
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1) { //�α��� ��ư Ŭ����
			String id=tf.getText(); //�Է��� ���� ����ͼ�
			if(id.trim().length()<1) { //�Է��� �ȵƴٸ�
				JOptionPane.showMessageDialog(this, "ID�� �Է��ϼ���.");
				tf.requestFocus(); //focus �÷���
				return;
			}
			String pwd=String.copyValueOf(pf.getPassword());
			if(pwd.trim().length()<1) { //�Է��� �ȵƴٸ�
				JOptionPane.showMessageDialog(this, "��й�ȣ�� �Է��ϼ���.");
				tf.requestFocus(); //focus �÷���
				return;
		}
			//�Է��� �Ϸ� �� ó��
			if(id.equalsIgnoreCase(ID)) { //equals�� ��� ����
				if(pwd.equals(PWD)) {
					JOptionPane.showMessageDialog(this, id+"�� �α��� �Ǿ����ϴ�.");
				} else {
					JOptionPane.showMessageDialog(this, "�н����尡 Ʋ���ϴ�.");
					pf.setText("");
					pf.requestFocus();
				}
				
			} else {
				JOptionPane.showMessageDialog(this, "�������� �ʴ� ID�Դϴ�.");
				tf.setText("");
				pf.setText("");
				tf.requestFocus();
			}
		}	
		else if(e.getSource()==b2) {
			System.exit(0);
		}
		
	}
}

