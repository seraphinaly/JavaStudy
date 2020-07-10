import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import javax.swing.*;

public class MovieFind extends JPanel{
	JLabel la=new JLabel("��ȭ�� �˻��Ͻÿ�.", JLabel.CENTER);
	JLabel la2=new JLabel("Search");
	JTextField tf=new JTextField();
	JTable table;
	DefaultTableModel model;
	TableColumn column;

	MovieFind(){
		//setBackground(Color.GRAY);
		setLayout(null);
		la.setFont(new Font("�ü�",Font.BOLD,35));
		la.setBounds(10, 15, 1260, 50);
		add(la);
		
		la2.setBounds(150, 75, 100, 35);
		add(la2);
		tf.setBounds(205, 75, 300, 35);
		add(tf);
		
		String[] col= {"����","��ȭ��","����","�帣","�⿬"};
		String[][] row=new String[0][5];
		
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		table.setRowHeight(40);
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane js=new JScrollPane(table);//��ũ�ѹ�
		
		MovieVO[] movies=MovieManager.movieFindData(1);
		
		for(MovieVO vo:movies) {
			String[] temp= {
				String.valueOf(vo.mno),
				vo.title,
				vo.director,
				vo.genre,
				vo.actor
			};
			model.addRow(temp);
 		}
		js.setBounds(10, 120, 1260, 750);
		add(js);
		
		for(int i=0;i<5;i++) {
			column=table.getColumnModel().getColumn(i);
			//TableCellRenderer render=column.getCellRenderer();
			if(i==0) {
				column.setPreferredWidth(50);
			}else if(i==1) {
				column.setPreferredWidth(150);
			}else if(i==2) {
				column.setPreferredWidth(120);
			}else if(i==3) {
				column.setPreferredWidth(100);
			}else if(i==4) {
				column.setPreferredWidth(350);
			}
		}
	}
}
