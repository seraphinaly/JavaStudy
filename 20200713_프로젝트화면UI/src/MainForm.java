import javax.swing.*;//������ ���
import java.awt.*;//���̾ƿ�
public class MainForm extends JFrame{ //���:�����ؼ� ���
	private CardLayout card=new CardLayout(); //����Ŭ����:�ִ� �״��
	//ȭ�� UI: ������ �� �����ϸ� �ٷ� �����ش�
	//������: 1���� ȣ���� �����ϰ�, ���۰� ���ÿ� ȣ��Ǵ� �޼ҵ�
	//�����ڴ� ��� Ŭ�������� ȣ���� �����ؾ��� �� public
	Login login=new Login();
	public MainForm() {
		//layout ����
		setLayout(card);
		add("LOGIN",login);
		setLayout(card);
		/* JFrame,JWindow,JDialog ��BorderLayout
		 * JPanel ��FlowLayout
		 * ���������: setLayout(null) �ְ� �����ؾ���!!!!!
		 */
		setBounds(400, 60, 1024, 950);
		setVisible(true);
	}
	public static void main(String[] args){
		new MainForm();

	}

}
