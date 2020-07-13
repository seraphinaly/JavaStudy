import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{
    Image back,rocket;
    int x=15,y=15;
    public GameView()
    {
    	back=Toolkit.getDefaultToolkit().
    			getImage("c:\\javaDev\\back.jpg");
    	rocket=Toolkit.getDefaultToolkit().
    			getImage("c:\\javaDev\\rocket.png");
    			
    }
    //이미지출력
    public void paint(Graphics g)
    {
    	g.drawImage(back,0,0,getWidth(),getHeight(),this);
    	g.drawImage(rocket,x,y,150,150,this);
    }
    
    
}
