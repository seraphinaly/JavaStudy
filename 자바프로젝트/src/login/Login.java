package login;
import javax.swing.*;
import java.awt.*;

public class Login extends JPanel{
	//private Image back;
	JLabel logo,login;
	JTextField tf;
	JPasswordField pf;
	JCheckBox box;
	JButton b1,b2;
	
	//Login
	//MainForm
	public Login(){
		//�ڡڹ��ȭ�� �� ���� Ȥ�� ���� ����
		//back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		setLayout(null);
		//�ΰ�
		logo=new JLabel(new ImageIcon("c:\\javaDev\\idus.png"));
		logo.setBounds(900, 100, 131, 77);
		add(logo);
		
		//�α��� ��
		JLabel title=new JLabel("  ������������ LOGIN ������������",JLabel.LEFT);
		title.setFont(new Font("���ʷҵ���",Font.BOLD,25));
		title.setBounds(745, 225, 500, 40);
		add(title);	
		
		//���̵�â
		tf=new JTextField();
		tf=new HintTextField("  ID");
		tf.setBounds(768, 270, 384, 40);
		add(tf);
		
		//��й�ȣâ
		pf=new JPasswordField();
		//pf=new HintTextField("PASSWORD");
		pf.setBounds(768, 315, 384, 40);
		add(pf);
		
		//üũ�ڽ�
		box=new JCheckBox("���̵� �����ϱ�");
		box.setBounds(768, 360, 384, 40);
		box.setOpaque(false);
		add(box);
		
		//�α��� ��ư
		b1=new JButton("�α���");
		b1.setBounds(768, 405, 384, 40);
		add(b1);
		b1.setOpaque(false);
		
		//ȸ������ ��ư
		b2=new JButton("ȸ������");
		b2.setBounds(768, 450, 384, 40);
		add(b2);
		b2.setOpaque(false);
	}

//	@Override
//	protected void paintComponent(Graphics g){
//		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
//	}
//
}