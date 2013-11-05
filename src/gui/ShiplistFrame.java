package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import functions.ShipListListener;

public class ShiplistFrame {

    public static void addComponentsToPane(Container pane) {
    		JPanel panel = new JPanel();
    		pane.add(panel, BorderLayout.CENTER);
    }
    
    class ImagePanel extends JPanel {

		private static final long serialVersionUID = 2282769986257542800L;
		private Image img;

    	  public ImagePanel(String img) {
    	    this(new ImageIcon(img).getImage());
    	  }

    	  public ImagePanel(Image img) {
    	    this.img = img;
    	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    	    setPreferredSize(size);
    	    setMinimumSize(size);
    	    setMaximumSize(size);
    	    setSize(size);
    	    setLayout(null);
    	  }

    	  public void paintComponent(Graphics g) {
    	    g.drawImage(img, 0, 0, null);
    	  }

    	}

    public void createAndShowGUI() {
    	
    	JFrame frame = new JFrame();
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
    }

}
