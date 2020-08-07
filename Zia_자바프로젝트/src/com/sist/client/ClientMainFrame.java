
package com.sist.client;
//������ =>JFrame

//������� ���õ� Ŭ������ �о�´�

import javax.swing.*; // ��������� 
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.common.Function;

import java.awt.*; // Color,Layout  
import java.awt.event.*;// interface (��ư)ó�� �Լ�
/*
 *  ����
 *    = ���(is-a)	: ������ Ŭ������ �����ؼ� ���
 *    public class ClientMainFrame extends JFrame
 *    				===============
 *    				JFrame ����� ��ü �����ͼ� �����Ͽ� ���
 *    class A
 *    {`
 *    	O X W
 *    }
 *    class B extned A
 *    {
 *    	O X W
 *    }
 *    = ����(has-a)	: ������ Ŭ������ ������� ���
 *    public class ClientMainFrame 
 *    {
 *    	JFrame f = new JFrame();
 *    
 *    }
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

public class ClientMainFrame extends JFrame implements ActionListener, MouseListener, Runnable {
	/*
	 * �� 1) ������ ũ�� ���� -������ ũ�� ������ ��κ� �����ڿ��� ���
	 */
	//JLabel title = new JLabel("���� ������?", JLabel.CENTER); // JLabel.center�� ��� ���� ��Ų�ٴ� �Ҹ���.
	MenuForm mf = new MenuForm();
	ChatForm cf = new ChatForm();
	ControllPanel cp;
	int curpage = 1;
	int totalpage = 16; // ������ 16�̿��ٰ� 4�� ��������
	Login login = new Login();
	JLabel label;

	
	// ��Ʈ��ũ ���� ���α׷�
	Socket s; // ������
	OutputStream out; // ������ ��û�� ���� => �α���,ä�� ���ڿ�, ����....
	BufferedReader in; // ������ ���� �޿��� Ŭ����
	

	public ClientMainFrame() {
		/*
		 * Ŭ�������� ������ ��� => ������ �ƴ϶� �����Ҷ� ��) �����ͺ��̽� : ����Ŭ ���� ��Ʈ��ũ : ���� => IP,PORT �� : ��Ű����
		 * ���б� => �ڵ��α���
		 */
		cp = new ControllPanel(this); //���ο� â�� �ƴ϶� ���� �������� ������â�� ����
		
		String path = "C:\\javaDev\\logo2.png";
		label = new JLabel(new ImageIcon(path));
		label.setBounds(10,10,114,80);
		// 0 0 114 80
		// 0 10 114 80
		add(label);
		//title.setFont(new Font("���ʷҵ���", Font.BOLD, 55)); // �ü�ü �۾� ���� 55������
		//title.setOpaque(false); // ������� �������带 �ٲ�����Ѵ�.
		//title.setBackground(Color.black); // ������
		setLayout(null); // null�ָ� �츮�� ���� layout����
		//title.setBounds(10, 15, 1570, 70);
		// �߰� => add()
		//add(title);
		
		//logo=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\logo.png");
		
		//label = new JLabel((new ImageIcon(path)));
		//label.setBounds(0,0,getWidth(),getHeight());
		//add(label);
		// �޴���ġ
		mf.setBounds(10, 120, 100, 400);
		mf.setOpaque(false);
		add(mf);
		// ä�÷�
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// ���ȭ��
		cp.setBounds(115, 120, 1465, 650);
		//540-650
		
		add(cp);
		setSize(1600, 1000);
		//setVisible(true); ��Ʈ��ũ������  �ϴ� �ּ� 
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		mf.b5.addActionListener(this);

		cp.ff.b1.addActionListener(this); // ����
		cp.ff.b2.addActionListener(this); // ����
		cp.ff.boyung_b1.addActionListener(this); // ���� ����
		cp.ff.boyung_b2.addActionListener(this); // ���� ����
		cp.ff.danbi_b1.addActionListener(this); // �ܺ� ����
		cp.ff.danbi_b2.addActionListener(this); // �ܺ� ����
		cp.ff.yunsu_b1.addActionListener(this); // ���� ����
		cp.ff.yunsu_b2.addActionListener(this); // ���� ����
		
		
		cp.df.b2.addActionListener(this);
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.tf.addActionListener(this); //�˻��Ҷ� ���� ������ �͵� actionlistener�� ����� �����ϴ�.
		
		//���� ��ư ó��
		cp.ylf.b1.addActionListener(this);
		cp.ylf.b2.addActionListener(this);
		cp.ylf.b3.addActionListener(this);
		cp.ylf.b4.addActionListener(this);
		cp.ylf.b5.addActionListener(this);
		cp.ylf.b6.addActionListener(this);
		cp.ylf.tf.addActionListener(this);
		
		//�ܺ��� ��ư ó��
		cp.dlf.b1.addActionListener(this);
		cp.dlf.b2.addActionListener(this);
		cp.dlf.b3.addActionListener(this);
		cp.dlf.b4.addActionListener(this);
		cp.dlf.b5.addActionListener(this);
		cp.dlf.tf.addActionListener(this);
		//������ ��ư ó��
		cp.blf.b1.addActionListener(this);
		cp.blf.b2.addActionListener(this);
		cp.blf.b3.addActionListener(this);
		cp.blf.b4.addActionListener(this);
		cp.blf.b5.addActionListener(this);
		cp.blf.b6.addActionListener(this);
		cp.blf.tf.addActionListener(this);
		// �α��� ó��
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);

		// ����
		mf.b7.addActionListener(this);

		// ä��
		cf.tf.addActionListener(this);
		/*
		for(int i=0;i<4;i++)
		{
			cp.ff.mc[i].addMouseListener(this);
		}
		*/
	}
//	public void mouselistnener(int curpage)
//	{
//		for(int i=0;i<10;i++)
//		{
//		cp.ff.mc[i].addMouseListener(this);
//		}
//	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel"); // win
		new ClientMainFrame();
	}

	// ȭ�� �̹��� ���
	public static Image getImage(ImageIcon ii, int w, int h) {
		Image dimg = ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return dimg;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == mf.b1) {
			cp.card.show(cp, "FF"); // ��ư�������� card ���̾ƿ��� �������� �г��� �ٲ۴ٴ� �Ҹ��� *�߿�
		} else if (e.getSource() == mf.b2) {			
			cp.card.show(cp, "LF");
		} else if (e.getSource() == mf.b3) {
			cp.card.show(cp,"BLF");
			System.out.println("������ư Ŭ��");
		}else if (e.getSource() == mf.b4) {
			cp.card.show(cp,"YLF");
			System.out.println("������ư Ŭ��");
		}else if (e.getSource() == mf.b5) {
			cp.card.show(cp,"DLF");
		}
		else if (e.getSource() == cp.df.b2){
			cp.card.show(cp,"FF");
		}
		else if (e.getSource() == mf.b5){
			cp.card.show(cp,"NF");
		}else if (e.getSource() == cp.ff.b1) {
			//������ư
			if(curpage >1)
			{
				curpage--;
				cp.ff.p.removeAll();
				cp.ff.CampingPrint(curpage);
				cp.ff.repaint();	//
				cp.ff.p.validate(); // �г��� ���� ������� ���ġ.
				//mouselistnener(curpage);
			}
		} else if (e.getSource() == cp.ff.b2) {
			//���� ��ư
			if(curpage < totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.CampingPrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
				//mouselistnener(curpage);
				
				cp.df.b2.addActionListener(this);
				cp.df.b1.addActionListener(this);
			}
		} 
		//���� ���� �ѱ��  
		else if (e.getSource() == cp.ff.yunsu_b1) {
			//������ư
			if(curpage > 1)
			{
				curpage--;
				cp.ff.yp.removeAll();
				cp.ff.yunsuPrint(curpage);
				cp.ff.repaint();	//
				cp.ff.yp.validate(); // �г��� ���� ������� ���ġ.
				//mouselistnener(curpage);
			}
		} else if (e.getSource() == cp.ff.yunsu_b2) {
			//���� ��ư
			if(curpage < totalpage)
			{
				curpage++;
				cp.ff.yp.removeAll();
				cp.ff.yunsuPrint(curpage);
				cp.ff.repaint();
				cp.ff.yp.validate();
				//mouselistnener(curpage);
				
				//cp.df.b2.addActionListener(this);
				//cp.df.b1.addActionListener(this);
			}
		} 
		//���� ���� �ѱ��
		else if (e.getSource() == cp.ff.boyung_b1) {
			//������ư
			if(curpage >1)
			{
				curpage--;
				cp.ff.bp.removeAll();
				cp.ff.boyungPrint(curpage);
				cp.ff.repaint();	//
				cp.ff.bp.validate(); // �г��� ���� ������� ���ġ.
				//mouselistnener(curpage);
			}
		} else if (e.getSource() == cp.ff.boyung_b2) {
			//���� ��ư
			if(curpage < totalpage)
			{
				curpage++;
				cp.ff.bp.removeAll();
				cp.ff.boyungPrint(curpage);
				cp.ff.repaint();
				cp.ff.bp.validate();
				//mouselistnener(curpage);
				
				//cp.df.b2.addActionListener(this);
				//cp.df.b1.addActionListener(this);
			}
		} 
		//�ܺ� ���� �ѱ��
		else if (e.getSource() == cp.ff.danbi_b1) {
			//������ư
			if(curpage >1)
			{
				curpage--;
				cp.ff.dp.removeAll();
				cp.ff.danbiPrint(curpage);
				cp.ff.repaint();	//
				cp.ff.dp.validate(); // �г��� ���� ������� ���ġ.
				//mouselistnener(curpage);
			}
		} else if (e.getSource() == cp.ff.danbi_b2) {
			//���� ��ư
			if(curpage < totalpage)
			{
				curpage++;
				cp.ff.dp.removeAll();
				cp.ff.danbiPrint(curpage);
				cp.ff.repaint();
				cp.ff.dp.validate();
				//mouselistnener(curpage);
				
				//cp.df.b2.addActionListener(this);
				//cp.df.b1.addActionListener(this);
			}
		} 
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.CampingAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.CampingAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			System.out.println("b3��ư Ŭ��");
			cp.lf.CampingAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.CampingAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.CampingAllData(5);
		}
		//������ ����Ʈ ���� �������
		else if(e.getSource() == cp.ylf.b1)
		{
			cp.ylf.movieAllData(1);
		}
		else if(e.getSource() == cp.ylf.b2)
		{
			cp.ylf.movieAllData(2);
		}
		else if(e.getSource() == cp.ylf.b3)
		{
			cp.ylf.movieAllData(3);
		}
		else if(e.getSource() == cp.ylf.b4)
		{
			cp.ylf.movieAllData(4);
		}	
		else if(e.getSource() == cp.ylf.b5)
		{
			cp.ylf.movieAllData(5);
		}
		//�ܺ��ܲ� ����Ʈ ����!!
		else if(e.getSource() == cp.dlf.b1)
		{
			cp.dlf.ClassAllData(1);
		}
		else if(e.getSource() == cp.dlf.b2)
		{
			cp.dlf.ClassAllData(2);
		}
		else if(e.getSource() == cp.dlf.b3)
		{
			cp.dlf.ClassAllData(3);
		}
		else if(e.getSource() == cp.dlf.b4)
		{
			cp.dlf.ClassAllData(4);
		}
		//������ ����Ʈ �� #@!#%%^&*%$#
		else if(e.getSource() == cp.blf.b1)
		{
			cp.blf.movieAllData(1);
		}
		else if(e.getSource() == cp.blf.b2)
		{
			cp.blf.movieAllData(2);
		}
		else if(e.getSource() == cp.blf.b3)
		{
			cp.blf.movieAllData(3);
		}
		else if(e.getSource() == cp.blf.b4)
		{
			cp.blf.movieAllData(4);
		}
		else if(e.getSource() == cp.blf.b5)
		{
			cp.blf.movieAllData(5);
		}
	
			
			
		// ���±� �� �˻��ϸ� ������ �κ�
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			// �˻���ư�� �����ų� ���͸� ������
			// 1.�Էµ� �� �б�
			String ss=cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this,"�˻�� �Է��ϼ���");
				cp.lf.tf.requestFocus();//Ŀ�� ������ 
				return; //�޼ҵ� ����
			}
			cp.lf.CampingFindData(ss);
		}
		
		// ���� �� �˻��ϸ� ������ �κ�
		else if(e.getSource()==cp.ylf.b6 || e.getSource()==cp.ylf.tf)
		{
			// �˻���ư�� �����ų� ���͸� ������
			// 1.�Էµ� �� �б�
			String ss=cp.ylf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this,"�˻�� �Է��ϼ���");
				cp.ylf.tf.requestFocus();//Ŀ�� ������ 
				return; //�޼ҵ� ����
			}
			cp.ylf.movieFindData(ss);
		}
		// ������ �˻��ϸ� ������ �κ�
		else if(e.getSource()==cp.blf.b6 || e.getSource()==cp.blf.tf)
		{
			// �˻���ư�� �����ų� ���͸� ������
			// 1.�Էµ� �� �б�
			String ss=cp.blf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this,"�˻�� �Է��ϼ���");
				cp.blf.tf.requestFocus();//Ŀ�� ������ 
				return; //�޼ҵ� ����
			}
			cp.blf.movieFindData(ss);
		}
		
		//�ܺ��� �˻��ϸ� ������ �κ�
		else if(e.getSource()==cp.dlf.b5 || e.getSource()==cp.dlf.tf)
		{
			// �˻���ư�� �����ų� ���͸� ������
			// 1.�Էµ� �� �б�
			String ss=cp.dlf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this,"�˻�� �Է��ϼ���");
				cp.dlf.tf.requestFocus();//Ŀ�� ������ 
				return; //�޼ҵ� ����
			}
			cp.dlf.classFindData(ss);
		}
		///////////////////
		
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)// ID�� �Է����� ���� ���
			{
				JOptionPane.showMessageDialog(this, "���̵� �Է��ϼ���");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "��ȭ���� �Է��ϼ���");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="����";
			else
				sex="����";
			
			// ������ �Է¹��� ������ ���� 
			try
			{
				// ����  => ������ ���� ������ ������ �ִ� 
				s=new Socket("211.238.142.184",3355);
				// �ۼ��� ��ġ Ȯ��
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				// �α��� ��û (������ ���۵Ǵ� �κ�)
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex){}
			    
			    //�������� �����ϴ� �����͸� �о ��� 
			    new Thread(this).start();
			    // run()�� ��ġ Ȯ�� ==> �ڽ��� Ŭ�����ȿ� ���� => (this)
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)// ä�� 
		{
			String color=cf.box.getSelectedItem().toString();
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			// �����͸� ������ ���� 
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}
			
			    cf.tf.setText("");
		}
		else if(e.getSource()==mf.b7)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				System.out.println("Ŭ��");
				if(e.getClickCount()==2) //����Ŭ���� �߻������ÿ�
				{
					int a=(i+1)+((curpage*4)-4);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF");
					break;
				}
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// �������� ������ �����͸� �޾Ƽ� ó�� 
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=
						  new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				   case Function.MYLOG:
				   {
					   setTitle(st.nextToken());
					   login.setVisible(false);// �α���â
					   setVisible(true);// ��ȭâ (Main) 
				   }
				   break;
				   case Function.LOGIN:
				   {
					   // ���̺� ��� 
					   String[] data= {
						  st.nextToken(), // id
						  st.nextToken(), // name
						  st.nextToken() // sex
					   };
					   cf.model.addRow(data);
				   }
				   break;
				   case Function.CHAT:
				   {
					     initStyle();
					     append(st.nextToken(),st.nextToken());
				   }
				   break;
				   case Function.EXIT:
				   {
					   String id=st.nextToken();
					   for(int i=0;i<cf.model.getRowCount();i++)
					   {
						   String mid=cf.model.getValueAt(i,0).toString();
						   if(id.equals(mid))
						   {
							   cf.model.removeRow(i);
							   break;
						   }
					   }
				   }
				   break;
				   case Function.MYEXIT:
				   {
					   dispose();// ������ �޸� ���� 
					   System.exit(0);// ���α׷� ���� 
				   }
				   break;
				}
			}
		}catch(Exception ex) {}
	}
    public void initStyle()
    {
    	Style def=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
    	Style red=cf.ta.addStyle("red", def);
    	StyleConstants.setForeground(red, Color.red);
    	
    	Style blue=cf.ta.addStyle("blue", def);
    	StyleConstants.setForeground(blue, Color.blue);
    	
    	Style green=cf.ta.addStyle("green", def);
    	StyleConstants.setForeground(green, Color.green);
    	
    	Style yellow=cf.ta.addStyle("yellow", def);
    	StyleConstants.setForeground(yellow, Color.yellow);
    	
    	Style gray=cf.ta.addStyle("gray", def);
    	StyleConstants.setForeground(gray, Color.gray);
    	
    	Style cyan=cf.ta.addStyle("cyan", def);
    	StyleConstants.setForeground(cyan, Color.cyan);
    }
    public void append(String msg,String color)
    {
    	try
    	{
    		Document doc=cf.ta.getDocument();
    		doc.insertString(doc.getLength(), msg+"\n", cf.ta.getStyle(color));
    	}catch(Exception ex) {}
    }
}


