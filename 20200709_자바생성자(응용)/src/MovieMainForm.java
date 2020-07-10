import javax.swing.*; //������ ���� Ŭ����
import java.awt.*; //���̾ƿ�(ȭ�� ��ġ)
import java.awt.event.*; //��ư ������,�ؽ�Ʈ�� ����=>����(�̺�Ʈ)
//�ڹٿ��� �����ϴ� �������� ��� ����� ���=>���:extends JFrame(������)
//�ڹٿ��� ����� �� ���� ����(���� ���)

public class MovieMainForm extends JFrame implements ActionListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("Home");
	JMenuItem find=new JMenuItem("ã��");
	JMenuItem exit=new JMenuItem("����");

	CardLayout card=new CardLayout();//ȭ�� ��ȯ ����(��û�� ȭ���� ���� ���� ����)
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();
	
	MovieFind mf=new MovieFind();
	//���� => ������ �����ش� => ������
	MovieMainForm(){
	
		//�޴� ����
		JMenu menu=new JMenu("�޴�");
		menu.add(home);
		menu.add(find);
		menu.addSeparator();//���м�
		menu.add(exit);
		bar.add(menu);

		//�����쿡 ����
		setJMenuBar(bar);
		//���̾ƿ� ����
		setLayout(card);
		add("ML",ml);
		add("MD",md);
		add("MF",mf);
		
		//������ ũ�� ����
		setSize(1300, 1000);
		//������ �����ش�
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
	}
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm();//�����ڴ� �ݵ�� new�� �ٿ�����
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==home) {
			card.show(getContentPane(), "ML");
		}else if(e.getSource()==find) {
			card.show(getContentPane(), "MF");
		}else if(e.getSource()==exit)
			System.exit(0);
	}

}
