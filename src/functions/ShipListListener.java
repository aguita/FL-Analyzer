package functions;

import gui.MainFrame;
import gui.ShiplistFrame;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShipListListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
			
		//get arraylist from ship list
		//print out in a selectable list to panel
		System.out.println("ShipList Pushed");
		//this.ShiplistFrame().createAndShowGUI();
		this.addComponentsToPane(addComponentsToPane(pane));

		}
    public void addComponentsToPane(Container pane) {

        JPanel cargoCheck = new JPanel();             
        cargoCheck.add(new JTextField("TextField", 20));

        
    }
}
