package windows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import functions.CheckBoxListener;
import gui.MainFrame;

public class Window2 extends JPanel implements ActionListener {
    JTextField locationField;
    JTextField cargoField;
    public static JCheckBox chinButton;
    public static JCheckBox glassesButton;
    public static JCheckBox hairButton;
    public static JCheckBox teethButton;
    CheckBoxListener boxListener = new CheckBoxListener();
    
    String  threeJumps = "";

    public Window2() 
    {
        init();
    }

    private void init() 
    {
    	final JLabel background = new JLabel(new ImageIcon("D:\\Users\\Zach\\git\\FL-Analyzer3\\Images\\backGroundImage.png"));
        setLayout(new GridLayout(2, 1));
        JLabel locationLabel = new JLabel("Your Location : ");
        JLabel cargoLabel = new JLabel("Commoditty : ");
        locationField = new JTextField();
        locationField.addActionListener(this);
        cargoField = new JTextField();
        cargoField.addActionListener(this);
        //cargoField.setRowSelectionInterval(0, 0);

        final JPanel contentPane = new JPanel();
		contentPane.add(background);
        add(locationLabel);
        add(locationField);
        add(cargoLabel);
        add(cargoField);
        add(locationLabel);
        add(locationField);
        
        JRadioButton threeJumpsButton = new JRadioButton(threeJumps);
        threeJumpsButton.setActionCommand(threeJumps);

        ButtonGroup group = new ButtonGroup();
        group.add(threeJumpsButton);
     
        threeJumpsButton.setActionCommand(threeJumps);   
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}


