	package login;
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.FocusAdapter;
	import java.awt.event.FocusEvent;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

	public class HintPwdField extends JPasswordField{
		Font gainFont=new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 15);
		Font lostFont=new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 15);

		public HintPwdField(final String hint){
			setText(hint);
			setFont(lostFont);
			setForeground(Color.GRAY);
			addFocusListener(new FocusAdapter(){

				@Override
				public void focusGained(FocusEvent e){

					if(getText().equals(hint)){
						setText("");
						setFont(gainFont);
					} else{
						setText(getText());
						setFont(gainFont);
					}
				}

				@Override
				public void focusLost(FocusEvent e){
					if(getText().equals(hint) || getText().length()==0){
						setText(hint);
						setFont(lostFont);
						setForeground(Color.GRAY);
					} else{
						setText(getText());
						setFont(gainFont);
						setForeground(Color.BLACK);
					}

				}

			});

		}
	}