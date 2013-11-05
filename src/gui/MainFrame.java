package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import windows.Window1;
import windows.Window2;

public class MainFrame {
		
		static Window1 win1 = new windows.Window1();
		
		static Window2 win2 = new windows.Window2();
		
        private static final String CARD_JBUTTON =  "Card JButton";
        private static final String CARD_JTEXTFIELD = "Card JTextField";    
        
        public void createAndShowGUI() {
        	
            JFrame frame = new JFrame("FreeLancer Analyzer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            // This JPanel is the base for CardLayout for other JPanels.
            final JPanel contentPane = new JPanel();
            contentPane.setLayout(new CardLayout(300, 300));
            contentPane.add(win1, CARD_JBUTTON);
            contentPane.add(win2, CARD_JTEXTFIELD);

            /* We need two JButtons to go to the next Card
             * or come back to the previous Card, as and when
             * desired by the User.
             */
            JPanel buttonPanel = new JPanel(); 
            final JButton cargoCheck = new JButton("Cargo Check");
            cargoCheck.setBackground(Color.BLACK);
            cargoCheck.setForeground(Color.WHITE);
            final JButton shipList = new JButton("Ship List");
            shipList.setBackground(Color.RED);
            shipList.setForeground(Color.WHITE);
            buttonPanel.add(cargoCheck);
            buttonPanel.add(shipList);

            // Adding the ActionListeners to the JButton(s)

            cargoCheck.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                    cardLayout.previous(contentPane);
                }
            });
            shipList.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                    cardLayout.next(contentPane);   
                }
            });

            // Adding the contentPane (JPanel) and buttonPanel to JFrame.
            frame.add(contentPane, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.NORTH);

            frame.pack();
            frame.setVisible(true);
        }
}
        