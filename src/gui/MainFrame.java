package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(null);

        JButton b1 = new JButton("Cargo Checker");
        JButton b2 = new JButton("Ship List");
        pane.add(b1);
        pane.add(b2);

        Insets insets = pane.getInsets();
        Dimension size = b1.getPreferredSize();
        b1.setBounds(15 + insets.left, 5 + insets.top, size.width, size.height);
        size = b2.getPreferredSize();
        b2.setBounds(15 + insets.left, 40 + insets.top, size.width, size.height);
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
    	
        //Create and set up the window.
        JFrame frame = new JFrame("Freelancer Analyzer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        //Create the background panel
        ImagePanel panel = new ImagePanel(new ImageIcon("images/backgroundimage.png").getImage());
        

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        frame.getContentPane().add(panel);
        
        //Size and display the window.
        Insets insets = frame.getInsets();
    	// Set the size of the window
     	frame.setSize(600 + insets.left + insets.right,
                     400 + insets.top + insets.bottom);
     	frame.setResizable(false);
        frame.setVisible(true);
    }

}
