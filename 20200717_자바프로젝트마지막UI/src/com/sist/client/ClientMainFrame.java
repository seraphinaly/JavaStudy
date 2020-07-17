package com.sist.client;
//������� ���õ� Ŭ���� �ҷ���
import javax.swing.*; //JButton ��
import java.awt.*; //Color, Layout
import java.awt.event.*; //interface(��ư ó��)
//������ => JFrame
public class ClientMainFrame extends JFrame implements ActionListener{
	JLabel title=new JLabel("������&���� ��õ ����Ʈ",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp=new ControlPanel();
	
	//������ ũ�� ���� �� ������(������ �ƴ� ���� �뵵)
	public ClientMainFrame() {	
		setLayout(null); //JFrame(BorderLayout)����� ���Ƿ� ��ġ=>null
		title.setFont(new Font("���ʷҵ���",Font.BOLD,45));
		title.setOpaque(false); //true:������
		//title.setBackground(Color.red);
		title.setBounds(10, 15, 1570, 100);
		add(title);//�߰�
		//�޴� ��ġ
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		//ä����
		cf.setBounds(115, 760, 1460, 200);
		add(cf);
		//���ȭ��
		cp.setBounds(115, 120, 1465, 755);
		add(cp);
		
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //x��ư Ŭ���� ����
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
	}
	public static void main(String[] args)throws Exception{	
		//�����ڴ� ȣ��� �ݵ�� new
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); 
		new ClientMainFrame();
	}
	@Override//��ưó��
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mf.b1) {
			cp.card.show(cp,"DF");
		}else if(e.getSource()==mf.b2) {
			cp.card.show(cp,"LF");
		}
		
	}

	
}
