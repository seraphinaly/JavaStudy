import java.util.*;
import javax.swing.*;  //window
public class ���ڿ�2_�˻���1_contains{

	public static void main(String[] args){
		String[] title={
				"#����ִ�",
				"���",
				"����� �ð�",
				"ħ����",
				"�¿���: �� �Ϸ��� ����",
				"�߱��ҳ�",
				"�ݵ�",
				"������ ���׽�",
				"��Ʈ�� �����",
				"������ ���"
			};
			String[] actor={
				"������(���ؿ�), �ڽ���(������)",
				"������(����), ������(ȭ��), ����ȣ(�߽���)",
				"������(������), �����(�����), ���ر�(���ر�)",
				"����ȿ(����), �蹫��(����)",
				"�� Ȧ����(�̾� ����Ʈǲ ��Ҹ�), ũ���� ����(�߸� ����Ʈǲ ��Ҹ�)",
				"���ֿ�(�ּ���), ������(������)",
				"������, ������",
				"���ϸ� ��鸮(������), ���̹� ����(��), ���ٽ��� ����(����ũ)",
				"ũ������ ����(��罺 ����/��Ʈ��), ����Ŭ ����(��������)",
				"�� ���(P.T. �ٳ�), �� ������(�ʸ� Į����)"
			};
			//�˻���(Search String)
			String ss=JOptionPane.showInputDialog("�˻��� �Է�");
			
			//System.out.println(ss);
			String tmp="";
			for(String s:title) {
				if(s.contains(ss)) { //contains: ���Ե� ���ڿ�
					//System.out.println(s);
					tmp+=s+"\n";
				}
			}
			//System.out.println(tmp);
			JOptionPane.showMessageDialog(null, tmp);
	}

}
