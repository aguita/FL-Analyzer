package windows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window2 extends JPanel implements ActionListener {
    private JTextField textField;

    public Window2() 
    {
        init();
    }

    private void init() 
    {
        setLayout(new GridLayout(1, 2));
        JLabel userLabel = new JLabel("Your Name : ");
        textField = new JTextField();
        textField.addActionListener(this);

        add(userLabel);
        add(textField);
    }

    public void actionPerformed(ActionEvent e) 
    {            
        if (textField.getDocument().getLength() > 0)
            JOptionPane.showMessageDialog(null, "Your Name is : " + textField.getText()
                                                                            , "User\'s Name : ", JOptionPane.QUESTION_MESSAGE);
    }
}


