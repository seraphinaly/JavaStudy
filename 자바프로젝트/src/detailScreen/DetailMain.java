package detailScreen;

import javax.swing.*;

public class DetailMain extends JPanel{
	JButton b1=new JButton("장바구니");
	JButton b2=new JButton("구매하기");
	JButton b3=new JButton("선물하기");
	JPanel p=new JPanel();

	public DetailMain(){
		p.setBounds(1000, 90, 195, 20);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.setOpaque(false);
		add(p);
	}
}
