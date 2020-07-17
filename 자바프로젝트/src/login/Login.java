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
		//★★배경화면 → 수정 혹은 삭제 예정
		//back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		setLayout(null);
		//로고
		logo=new JLabel(new ImageIcon("c:\\javaDev\\idus.png"));
		logo.setBounds(900, 100, 131, 77);
		add(logo);
		
		//로그인 라벨
		JLabel title=new JLabel("  ────── LOGIN ──────",JLabel.LEFT);
		title.setFont(new Font("함초롬돋움",Font.BOLD,25));
		title.setBounds(745, 225, 500, 40);
		add(title);	
		
		//아이디창
		tf=new JTextField();
		tf=new HintTextField("  ID");
		tf.setBounds(768, 270, 384, 40);
		add(tf);
		
		//비밀번호창
		pf=new JPasswordField();
		//pf=new HintTextField("PASSWORD");
		pf.setBounds(768, 315, 384, 40);
		add(pf);
		
		//체크박스
		box=new JCheckBox("아이디 저장하기");
		box.setBounds(768, 360, 384, 40);
		box.setOpaque(false);
		add(box);
		
		//로그인 버튼
		b1=new JButton("로그인");
		b1.setBounds(768, 405, 384, 40);
		add(b1);
		b1.setOpaque(false);
		
		//회원가입 버튼
		b2=new JButton("회원가입");
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