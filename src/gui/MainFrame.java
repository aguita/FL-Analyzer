package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame {
	public static void addComponentsToPane(Container pane) {
		pane.setLayout(null);

		JButton b1 = new JButton("one");
		JButton b2 = new JButton("two");
		pane.add(b1);
		pane.add(b2);

		Insets insets = pane.getInsets();
		Dimension size = b1.getPreferredSize();
		b1.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);
		size = b2.getPreferredSize();
		b2.setBounds(55 + insets.left, 40 + insets.top, size.width, size.height);

	}

	public static void addBackgroundToPane(JFrame frame) {
		// JLabel background = new JLabel(new
		// ImageIcon(constants.URLConstants.backGroundImage));
		frame.setContentPane(new JLabel(new ImageIcon(
				functions.URLConstants.backGroundImage)));
		// pane.add(background);
	}

	public void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("AbsoluteLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set up the content pane.
		addComponentsToPane(frame.getContentPane());
		addBackgroundToPane(frame);

		// Size and display the window.
		Insets insets = frame.getInsets();
		// Set the size of the window
		frame.setSize(600 + insets.left + insets.right, 400 + insets.top
				+ insets.bottom);
		frame.setVisible(true);
	}

}
