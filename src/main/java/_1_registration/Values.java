
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

    public void deleteFirst(String data) {
        JOptionPane.showMessageDialog(null, " " + data + " is deleted to the queue");
        
        if (this.head == null) {
            JOptionPane.showMessageDialog(null, " The List is empty");
            return;
        }
    }
    
    public static ArrayList<String> fn = new ArrayList<String>();
    public static ArrayList<String> ln = new ArrayList<String>();
    public static ArrayList<String> id = new ArrayList<String>();
    public static ArrayList<String> em = new ArrayList<String>();
    
    public boolean isEmpty() {
    
        return (fn.size() == 0);
    }
    
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
