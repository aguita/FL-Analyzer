package windows;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window1 extends JPanel {
	
    private ActionListener action;


    public Window1() 
    {
        init();
    }

    private void init() 
    {
    	
    	//JLabel background = new JLabel(new ImageIcon("/Images/backGroundImage.png"));

        final JButton clickButton = new JButton("CLICK ME");
        final JButton dontClickButton = new JButton("DON\'T CLICK ME");    
        final JLabel background = new JLabel(new ImageIcon("D:\\Users\\Zach\\git\\FL-Analyzer3\\Images\\backGroundImage.png"));
  

        action = new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if (ae.getSource() == clickButton)
                {
                    JOptionPane.showMessageDialog(null, "Hello there dude!"
                                                , "Right Button", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (ae.getSource() == dontClickButton)
                {
                    JOptionPane.showMessageDialog(null, "I told you not to click me!"
                                                        , "Wrong Button", JOptionPane.PLAIN_MESSAGE);
                }
            }
        };

        //add(background);
        clickButton.addActionListener(action);
        dontClickButton.addActionListener(action);

        add(clickButton);
        add(dontClickButton);
        this.add(background);
    }
}
