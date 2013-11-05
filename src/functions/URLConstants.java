package functions;

import gui.MainFrame;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class URLConstants {

	public static URL backGroundImage = MainFrame.class.getResource("/Images/backGroundImage.png");
	public static JLabel background = new JLabel(new ImageIcon(backGroundImage));
      
	
}
