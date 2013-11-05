package gui;

 /*
 *Author: Zach Karp, Ryan Waterer
 *Date: October
 */
/*
import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FrameMain extends JFrame {

	private static final long serialVersionUID = 6388114349693302467L;

	//Declaring the button listeners

	// Auto loaded source for the main image file
	URL backGroundImage = FrameMain.class.getResource("Freelancer Tool/Images/backGroundImage.png");
	URL buttonOne = FrameMain.class.getResource("images/.png");
	URL buttonOneOver = FrameMain.class.getResource("images/.png");
	URL sample = FrameMain.class.getResource("images/.png");
	
	// Background Image
	JLabel background = new JLabel(new ImageIcon(backGroundImage));

	// Buttons
	private JButton buttonMatch;
	
	// Text for ship locations
	private JTextArea shipLocation;
	public final int LINES = 13;
	public final int CHAR_PER_LINE = 45;
	
	
	// My panels
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel shipLocationPanel = new JPanel();
	
	// Window parameters
	private final int WINDOW_WIDTH = 620; // Window Width
	private final int WINDOW_HEIGHT = 350; // Window Height
	
	
	public FrameMain() {

		//Linking the listeners
        
		// Set the title bar text
		setTitle("FreeLancer Tool");

		// Set the size of the window
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Non Resizable
		setResizable(false);

		// Close window when the exit button is clicked
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Make buttons
		buttonMatch = new JButton("");
		
		//No Idea
		background.setLayout(new BorderLayout());
		panel2.setLayout(new BorderLayout());
		
		add(background);
		background.add(panel, BorderLayout.NORTH);
		background.add(shipLocationPanel, BorderLayout.LINE_END);
		add(panel2, BorderLayout.SOUTH);

		panel.add(buttonMatch);

		// Attempt to make it transparent
		panel.setDoubleBuffered(false);
		panel.setOpaque(false);

		shipLocation = new JTextArea(LINES, CHAR_PER_LINE);
		
		
		//buttonMatch.setIcon(new ImageIcon(buttonOne));
		buttonMatch.setOpaque(false);
		buttonMatch.setContentAreaFilled(false);
		buttonMatch.setBorderPainted(false);
		//buttonMatch.setRolloverIcon(new ImageIcon(buttonOneOver));
		
		// Setting the buttons dimensions
		buttonMatch.addActionListener(null);
		
		this.setLocationByPlatform(true);
		this.pack();
				
		//Make the JFrame visable
		setVisible(true);
	}
}
*/
