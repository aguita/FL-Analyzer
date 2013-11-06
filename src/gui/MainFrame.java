package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import windows.Window0;
import windows.Window1;
import windows.Window2;

public class MainFrame {
		
		static Window1 win1 = new windows.Window1();		
		static Window2 win2 = new windows.Window2();	
		static Window0 win0 = new windows.Window0();
		
        private static final String CARD_SHIPLIST =  "Card ShipList";
        private static final String CARD_CARGO = "Card CargoCheck";    
        private static final String MAIN_WINDOW = "Card Main Window";
        
    	// Window parameters
    	private final int WINDOW_WIDTH = 512; // Window Width
    	private final int WINDOW_HEIGHT = 288; // Window Height
        
        public void createAndShowGUI() {
        	
        	final JLabel background = new JLabel(new ImageIcon("C:\\Users\\student\\git\\FL-Analyzer\\Images\\backGroundImage.png"));
        	
            final JFrame frame = new JFrame("FreeLancer Analyzer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.setLocationRelativeTo(null);
            //frame.setResizable(false);
            frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

            // This JPanel is the base for CardLayout for other JPanels.
            final JPanel contentPane = new JPanel();
            contentPane.setLayout(new CardLayout(0, 0));
            contentPane.add(win0, MAIN_WINDOW);
            contentPane.add(win1, CARD_SHIPLIST);
            contentPane.add(win2, CARD_CARGO);
            

           // contentPane.add(background); adds to the buttons
            
            JPanel backgroundPane = new JPanel();
            //backgroundPane.add(background);

            JPanel buttonPanel = new JPanel(); 
            final JButton cargoCheck = new JButton("Cargo Check");
            cargoCheck.setBackground(Color.BLACK);
            cargoCheck.setForeground(Color.WHITE);
            final JButton shipList = new JButton("Ship List");
            shipList.setBackground(Color.RED);
            shipList.setForeground(Color.WHITE);
            final JButton mainWindow = new JButton("Main Window");
            shipList.setBackground(Color.RED);
            shipList.setForeground(Color.WHITE);
            buttonPanel.add(cargoCheck);
            buttonPanel.add(shipList);
            buttonPanel.add(mainWindow);
            buttonPanel.setOpaque(false);
            buttonPanel.setDoubleBuffered(false);
            
            
            // Adding the contentPane (JPanel) and buttonPanel to JFrame.
            contentPane.setLayout(new BorderLayout());
            frame.add(background);
            background.add(contentPane);
            frame.add(buttonPanel, BorderLayout.NORTH);
            
            // Adding the ActionListeners to the JButton(s)

            cargoCheck.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                    cardLayout.show(contentPane, CARD_CARGO);
                }
            });
            shipList.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                    cardLayout.show(contentPane, CARD_SHIPLIST);  
                }
            });
            
            mainWindow.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                    cardLayout.show(contentPane, MAIN_WINDOW);  
                }
            });
            

            frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
           // frame.pack();
            frame.setVisible(true);
        }
        
        public MainFrame rootPane() {
        	return this;
        }
}
        