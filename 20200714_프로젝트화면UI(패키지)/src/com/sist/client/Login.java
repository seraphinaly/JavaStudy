package com.sist.client;
/*	������Ʈ: ��Ʈ��ũ �帧�ľ�
 * 	1.�α���=>������ ����
 * 	2.ȸ������
 * =================
 * 	3.��� ���
 *  4.�󼼺���
 *  5.����,��ٱ���
 *  6.����������,������������
 *  7.ä��
 */
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
	//��Ų
	private Image back1;
	private JLabel la1,la2; //id,pw
	//Login
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	//MainForm
	public Login() {
		//�̹��� �����б�
		back1=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back1.jpg");
		//���� ��ġ
		setLayout(null);
		la1=new JLabel("���̵�",JLabel.RIGHT);
		la1.setBounds(745, 775, 80, 30);
		tf=new JTextField();
		tf.setBounds(830, 775, 150, 30);
		add(la1); add(tf);
		
		la2=new JLabel("��й�ȣ",JLabel.RIGHT);
		la2.setBounds(745, 810, 80, 30);
		pf=new JPasswordField();
		pf.setBounds(830, 810, 150, 30);
		add(la2); add(pf);
		
		b1=new JButton("�α���");
		b2=new JButton("ȸ������");
		JPanel p=new JPanel();//�гι�ġ, ��� ��� �ѹ��� ��ġ
		p.add(b1); p.add(b2);
		p.setOpaque(false);//������
		p.setBounds(745,850,235,35);
		add(p);
	}
	@Override
	protected void paintComponent(Graphics g){
		g.drawImage(back1,0,0,getWidth(),getHeight(),this);
	}
	
}
