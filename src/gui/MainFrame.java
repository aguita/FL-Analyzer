package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import asd.main.ShowNextAction;
import asd.main.ShowPreviousAction;
import asd.main.ShowTwoCardAction;
import functions.ShipListListener;

public class MainFrame {
	
	private final String[] CARD_LABELS = { "ShipList", "Cargo Check" };
	private CardLayout cardlayout = new CardLayout();
	private JPanel cardHolder = new JPanel(cardlayout);
	private Action[] actions = { new CargoCheck(), new ShipListView() };
	    
    public void addComponentsToPane(Container pane) {

        pane.setLayout(null);
        
        //ContentPanes
        JPanel shipList = new JPanel();
        JPanel cargoCheck = new JPanel();             
        cargoCheck.add(new JTextField("TextField", 20));

        //Buttons
        JButton b1 = new JButton("Cargo Checker");
        JButton b2 = new JButton("Ship List");
        pane.add(b1);
        pane.add(b2);
        b1.ShipListView(ccListener);
        b2.addActionListener(slListener);

        //Position of buttons
        Insets insets = pane.getInsets();
        Dimension size = b1.getPreferredSize();
        b1.setBounds(190 + insets.left, 5 + insets.top, size.width, size.height);
        size = b2.getPreferredSize();
        b2.setBounds(310 + insets.left, 5 + insets.top, size.width, size.height);
        
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
                     600 + insets.top + insets.bottom);
     	frame.setResizable(false);
        frame.setVisible(true);
    }

    private class ShipListView extends AbstractAction {
		private static final long serialVersionUID = -4625275527975389375L;

		public ShipListView() {
           super("Ship List");
        }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			cardlayout.show(cardHolder, CARD_LABELS[1]);
			
		}
    
}
    
    private class CargoCheck extends AbstractAction {
		private static final long serialVersionUID = 8977543766578472372L;

		public CargoCheck() {
           super("Cargo Check");
        }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			cardlayout.show(cardHolder, CARD_LABELS[2]);
			
		}
    
}
}
