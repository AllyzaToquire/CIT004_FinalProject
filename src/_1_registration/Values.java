package _1_registration;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Values {
	
	public static ArrayList<String> fn = new ArrayList<String>();
	public static ArrayList<String> ln = new ArrayList<String>();
	public static ArrayList<String> ag = new ArrayList<String>();
	public static ArrayList<String> ge = new ArrayList<String>();
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