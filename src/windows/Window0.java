package windows;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Window0 extends JPanel {

	public Window0() 
    {
        init();
    }

    private void init() 
    {
    	
    	System.out.println("Main window");
    	final JLabel background = new JLabel(new ImageIcon("D:\\Users\\Zach\\git\\FL-Analyzer3\\Images\\backGroundImage.png"));
    	add(background);
    	JTextArea textArea = new JTextArea();
    	
    	add(textArea);

    }
}
