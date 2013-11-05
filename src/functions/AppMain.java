/*


package main;

/*
 *Author: Zach Karp, Ryan Waterer
 *Date: October
 */
/*
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.DownloadButtonListener;
import listeners.GetFileSizeButtonListener;
import functions.GetFileSize;
import functions.ProgressBar;
import functions.VersionCheck;

public class AppMain extends JFrame {

	private static final long serialVersionUID = 6388114349693302467L;

	// Declaring the button listeners
	DownloadButtonListener downloadButtonListener;
	GetFileSizeButtonListener getFileSizeButtonListener;

	// Auto loaded source for the main image file
	URL iconLogo = AppMain.class.getResource("images/iconLogo.png");
	URL dButtonImg = AppMain.class.getResource("images/installButton.png");
	URL dButtonImgOver = AppMain.class
			.getResource("images/installButtonOver.png");
	URL backGround2 = AppMain.class.getResource("images/bgOrange.png");

	// Public var's
	int sizeCheck = GetFileSize.size;
	String versionText = VersionCheck.getVersion();

	// Background Image

	JLabel background = new JLabel(new ImageIcon(backGround2));
	JLabel version = new JLabel();

	// Buttons
	private JButton testDownload;
	private JButton testSize;

	// My panels
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();

	// Window parameters
	private final int WINDOW_WIDTH = 512; // Window Width
	private final int WINDOW_HEIGHT = 288; // Window Height

	public AppMain() {

		// Linking the listeners
		downloadButtonListener = new DownloadButtonListener();
		getFileSizeButtonListener = new GetFileSizeButtonListener();

		// Set the title bar text
		setTitle("KarpCode Launcher");

		// Set the size of the window
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// Non Resizable
		setResizable(false);

		// Close window when the exit button is clicked
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		version.setText(String.valueOf(versionText));
		version.setForeground(Color.RED);

		// Make buttons
		testDownload = new JButton("");
		testSize = new JButton("Get Size");

		// No Idea
		background.setLayout(new BorderLayout());
		// panel.setLayout(new BorderLayout());
		panel2.setLayout(new BorderLayout());

		add(background);
		background.add(panel, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		background.add(version, BorderLayout.PAGE_END);

		// add(ProgressBar.barProgress(), BorderLayout.SOUTH);

		// testDownload.setPreferredSize(new Dimension(200, 50));

		panel.add(testDownload);
		panel.add(testSize);

		panel2.add(ProgressBar.barProgress());

		// Attempt to make it transparent
		panel.setDoubleBuffered(false);
		panel.setOpaque(false);

		testDownload.setIcon(new ImageIcon(dButtonImg));
		// testDownload.setMargin(new Insets(0, 0, 0, 0));
		testDownload.setOpaque(false);
		testDownload.setContentAreaFilled(false);
		testDownload.setBorderPainted(false);
		testDownload.setRolloverIcon(new ImageIcon(dButtonImgOver));
		testSize.setBorderPainted(false);

		// Setting the buttons dimensions
		testDownload.addActionListener(downloadButtonListener);
		testSize.addActionListener(getFileSizeButtonListener);

		this.setLocationByPlatform(true);
		this.pack();

		AppMain.setIconImage(iconLogo);

		// Make the JFrame visable
		setVisible(true);
	}
	

	private static void setIconImage(URL image) {
		URL url;
		Image iconLogo;

	}

	private JFrame AppMain() {
		return this;

	}

}
*/