package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGUI {

	private JFrame frmFreelancerAnalyzer;
	private JTextField textField;
	@SuppressWarnings("rawtypes")
	static DefaultListModel listModel;
	ShipListListener shipListListener;

	//Launch the application.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frmFreelancerAnalyzer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	//Create the application.

	public MainGUI() {
		initialize();
	}


	//Initialize the contents of the frame.
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frmFreelancerAnalyzer = new JFrame();
		frmFreelancerAnalyzer.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Users\\Zach\\git\\FL-Analyzer\\Images\\icon.png"));
		frmFreelancerAnalyzer.setTitle("FreeLancer Analyzer");
		frmFreelancerAnalyzer.getContentPane().setMaximumSize(new Dimension(600, 600));
		frmFreelancerAnalyzer.setBounds(100, 100, 600, 600);
		frmFreelancerAnalyzer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFreelancerAnalyzer.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(10, 11, 107, 540);
		frmFreelancerAnalyzer.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 25, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setForeground(Color.WHITE);
		lblSearch.setBounds(10, 11, 46, 14);
		panel.add(lblSearch);
		
		listModel = new DefaultListModel();
		
		final JList list = new JList(listModel);
		list.setBounds(10, 117, 86, 423);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		panel.add(list);
		
		final JRadioButton rdbtnShips = new JRadioButton("Ships");
		rdbtnShips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnShips.isSelected()){
				    listModel.addElement("Ship One");
			        listModel.addElement("Ship Two");
			        listModel.addElement("Ship Three");
			        list.repaint();
			        
					}else {
						listModel.removeAllElements();
			}
		}});
		rdbtnShips.setForeground(Color.WHITE);
		rdbtnShips.setOpaque(false);
		rdbtnShips.setBounds(6, 52, 109, 23);
		panel.add(rdbtnShips);
		
		JRadioButton rdbtnItems = new JRadioButton("Items");
		rdbtnItems.setForeground(Color.WHITE);
		rdbtnItems.setOpaque(false);
		rdbtnItems.setBounds(6, 70, 109, 23);
		panel.add(rdbtnItems);
		
		JRadioButton rdbtnLocations = new JRadioButton("Locations");
		rdbtnLocations.setForeground(Color.WHITE);
		rdbtnLocations.setOpaque(false);
		rdbtnLocations.setBounds(6, 88, 109, 23);
		panel.add(rdbtnLocations);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(165, 201, 337, 320);
		frmFreelancerAnalyzer.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(MainGUI.class.getResource("/images/bgAwesome.png")));
		lblNewLabel_1.setBounds(0, 0, 584, 562);
		frmFreelancerAnalyzer.getContentPane().add(lblNewLabel_1);
	}
}
