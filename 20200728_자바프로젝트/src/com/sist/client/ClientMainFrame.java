package com.sist.client;

//������� ���õ� Ŭ���� �ҷ���
import javax.swing.*; //JButton ��
import java.awt.*; //Color, Layout
import java.awt.event.*; //interface(��ư ó��)
//������ => JFrame

public class ClientMainFrame extends JFrame implements ActionListener,MouseListener{
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�", JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp;
	int curpage=1;
	int totalpage=16;

	//������ ũ�� ���� �� ������(������ �ƴ� ���� �뵵)
	public ClientMainFrame(){
		cp=new ControlPanel(this); //���� ������(this)�� ������â ����
		setLayout(null); //JFrame(BorderLayout)����� ���Ƿ� ��ġ=>null
		title.setFont(new Font("���ʷҵ���", Font.BOLD, 45));
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
		cp.setBounds(115, 120, 1465, 635);
		add(cp);

		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //x��ư Ŭ���� ����

		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);

		cp.ff.b1.addActionListener(this);//����
		cp.ff.b2.addActionListener(this);//����
		
		cp.df.b2.addActionListener(this);//���

		for(int i=0;i<10;i++) {
			cp.ff.mc[i].addMouseListener(this);
		}
	}

	public static void main(String[] args) throws Exception{
		//�����ڴ� ȣ��� �ݵ�� new
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}

	//��ũ�⿡ ���缭 �̹����� �� �°� �������
	public static Image getImage(ImageIcon ii, int w, int h){
		Image dimg=ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return dimg;
	}

	@Override //��ưó��
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mf.b1){
			cp.card.show(cp, "FF");
		} else if(e.getSource()==mf.b2){
			cp.card.show(cp, "LF");
		} else if(e.getSource()==cp.df.b2){
				cp.card.show(cp, "FF");
		} else if(e.getSource()==cp.ff.b1){ //������ư
			if(curpage>1){
				curpage--;
				cp.ff.p.removeAll(); //JPanel ����� ����
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate(); //JPanel ������� ���ġ
			}
		} else if(e.getSource()==cp.ff.b2){ //������ư
			if(curpage<totalpage){
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e){
		for(int i=0;i<10;i++) {
			if(e.getSource()==cp.ff.mc[i]) { //ControlPanel >> MovieForm
				if(e.getClickCount()==2) {
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF");//ȭ�� ��ȯ
					break;
				}
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e){
		// TODO Auto-generated method stub
		
	}
}
