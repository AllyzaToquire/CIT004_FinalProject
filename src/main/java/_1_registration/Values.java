package _1_registration;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Values {
	
	 
    public Node head = null;
    
    class Node{
        private String data;
        private Node next;
        
        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void addNode(String data) {
        JOptionPane.showMessageDialog(null, " " + data + " is added to the queue");
            Node newNode = new Node(data);
            if (this.head == null) {
                this.head = newNode;
                
            } else {
                newNode.next = this.head;
                this.head = newNode;
        }
    }
    
    
    public String print() {
        String returnValue = "";
    if (this.head == null) {
    
    } else {
        Node cur = this.head;
        while (cur!= null) {
            returnValue += cur.data + "-->";
            returnValue += cur = cur.next;
        }
    }
        return returnValue;
    }
    
    //This method is used to remove or delete a data in remove component
    public void deleteFirst(String data) {
    	//It will show a notification message after the user click the remove data 
        JOptionPane.showMessageDialog(null, " " + data + " is deleted to the queue");
        
        //If there is nothing on the list/data it will show this
        if (this.head == null) {
            JOptionPane.showMessageDialog(null, " The List is empty");
            return;
        }
    }
	
    //Objects of ArrayList
	public static ArrayList<String> fn = new ArrayList<String>();
	public static ArrayList<String> ln = new ArrayList<String>();
	public static ArrayList<String> id = new ArrayList<String>();
	public static ArrayList<String> em = new ArrayList<String>();
	
	// *For the stack* 
	// We use usEmpty() method to tests if the data has no components.
	// If there is data on the program it will display true
	// If the data is zero or there are no input of the user it will display false.
	public boolean isEmpty() {
		return (fn.size() == 0);
	}
	
	// We use size() method to returns the number of components
	// It will show on how many data that the user input 
	public int size() {
		return fn.size();
	}
		public static void main(String[] args) throws Exception {
			GUIclass gui = new GUIclass();
			gui.getContentPane().add(gui.mainPanel());
			gui.repaint();
			gui.revalidate();
		}
	}