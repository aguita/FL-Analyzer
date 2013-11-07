package gui;

import javax.swing.DefaultListModel;

@SuppressWarnings({ "rawtypes", "serial" })
public class testList extends DefaultListModel{
	
	public static DefaultListModel listModel;
	
	@SuppressWarnings("unchecked")
	public static void ListModel() {
	DefaultListModel listModel;
    listModel = new DefaultListModel();
    listModel.addElement("Jane Doe");
    listModel.addElement("John Smith");
    listModel.addElement("Kathy Green");
	}

	public int indexOf(Object elem) {
		return 0;
		
	}
	
	public void removeElementAt(int index) {
		
	}
	
	public void copyInto(Object[] anArray) {
		
	}
	
	public void trimToSize() {
		
	}
	
}
