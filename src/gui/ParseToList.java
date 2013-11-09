package gui;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ParseToList {
	
	private static ArrayList<String> shipNames;
	public static ArrayList<String> getNames() {
		
		if(shipNames==null) {
			//read from file and add to list
			shipNames = new ArrayList<String>();
		}
		return shipNames;
	}
	
	@SuppressWarnings("rawtypes")
	DefaultListModel model = MainGUI.NewModel;
	
	public void sendToList(JList list, DefaultListModel model) {
		System.out.println("sendToList Successfull");	
		
		model.addElement("sendToList");
		model.addElement(shipNames);
	}

}
