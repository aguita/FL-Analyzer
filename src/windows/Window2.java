package windows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import functions.CheckBoxListener;

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
        setLayout(new GridLayout(2, 1));
        JLabel locationLabel = new JLabel("Your Location : ");
        JLabel cargoLabel = new JLabel("Commoditty : ");
        locationField = new JTextField();
        locationField.addActionListener(this);
        cargoField = new JTextField();
        cargoField.addActionListener(this);
        //cargoField.setRowSelectionInterval(0, 0);

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
        //Register a listener for the check boxes.
       // threeJumpsButton.addActionListener(boxListener);
       // glassesButton.addItemListener((ItemListener) boxListener);
        //hairButton.addItemListener((ItemListener) boxListener);
        //teethButton.addItemListener((ItemListener) boxListener);
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}


