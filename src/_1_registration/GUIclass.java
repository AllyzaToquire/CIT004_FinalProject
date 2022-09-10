package _1_registration;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUIclass extends JFrame{
	
	static JTextField namee1 = new JTextField();
	static JTextField lnamee1 = new JTextField();
	static JTextField agee1 = new JTextField();
	static JTextField genderr1 = new JTextField();
	static JTextField removed = new JTextField();
	static JTextField viewed = new JTextField();
	static JTextField queuee = new JTextField();
	static JTextArea textarea = new JTextArea();
	static JTextArea textarea1 = new JTextArea();
	static JTextArea textarea2 = new JTextArea();
	static JTextArea textarea3 = new JTextArea();


	public static void sortStrings(String[] arr,int n) {
		String temp;
			for (int j = 0; j < n; j++) {
				for (int i = j + 1; i < n; i++) {
					if (arr[j].compareTo(arr[i]) > 0) {
						temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
				}
			}
		}
	}
	
	public GUIclass() {
		getContentPane().setLayout(null);
		setTitle("REGISTRATION");
		setVisible(true);
		setResizable(false);
		setSize(450, 300);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width / 2 - this.getWidth() / 2, dim.height / 2 - this.getHeight() / 2);
	
	}
	
	public JPanel mainPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 444, 271);
		mainPanel.setBackground(new Color(0, 128, 255));
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel background = new JLabel("");
		background.setBounds(-15, -40, 700, 350);
		
		JButton addEntry = new JButton("Add Entry");
		addEntry.setBounds(50, 60, 90, 30);
		addEntry.setBackground(Color.white);

		JButton bubbleSort = new JButton("Bubble");
		bubbleSort.setBounds(50, 100, 90, 30);
		bubbleSort.setBackground(Color.white);	
		
		// add button
		mainPanel.add(addEntry);
		mainPanel.add(bubbleSort);
		// background / images
		mainPanel.add(background);
		
		addEntry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			GUIclass addd = new GUIclass();
			addd.getContentPane().add(addd.panelAdd());
			addd.repaint();
			addd.revalidate();
			}
		});
		
		bubbleSort.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			GUIclass bubble = new GUIclass();
				String[] arr = Values.ln.toArray(new String[Values.ln.size()]);
				String display3 = "";
				
				bubble.getContentPane().add(bubble.panelSort());
				bubble.repaint();
				bubble.revalidate();
				
				textarea2.setText(null);
					int n = arr.length;
					sortStrings(arr, n);
						for (int i = 0; i < n; i++) {
							display3 = display3 + arr[i] + "\n";
						}
						textarea2.append(display3 + "\n");
						revalidate(); // repaint JPanel
				}
			});
		
		return mainPanel;
	}
	public JPanel panelAdd() {
		JPanel panelAdd = new JPanel();
		panelAdd.setBounds(0, 0, 444, 271);
		panelAdd.setBackground(new Color(176, 224, 230));
		getContentPane().add(panelAdd);
		panelAdd.setLayout(null);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(170, 200, 80, 30);
		submit.setBackground(Color.yellow);
		setVisible(true);
		
		namee1.setBounds(150, 60, 150, 20);
		setVisible(true);
		
		lnamee1.setBounds(150, 90, 150, 20);
		setVisible(true);
		
		agee1.setBounds(150, 120, 150, 20);
		setVisible(true);
		
		genderr1.setBounds(150, 150, 150, 20);
		JLabel nameInput = new JLabel("<html><font color='black'>First Name:</font></html>");
		
		nameInput.setBounds(80, 20, 175, 100);
		JLabel lnameInput = new JLabel("<html><font color='black'>Last Name:</font></html>");
		
		lnameInput.setBounds(80, 50, 175, 100);
		JLabel ageInput = new JLabel("<html><font color='black'>ID Number:</font></html>");
		
		ageInput.setBounds(80, 80, 175, 100);
		
		JLabel genderInput = new JLabel("<html><font color='black'>Email:</font></html>");
		genderInput.setBounds(80, 110, 175, 100);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(330, -120, 450, 350);
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons"));
		panelAdd.add(lblIcon);
		
		JLabel background = new JLabel("");
		background.setBounds(20, -10, 650, 300);
		// add button
		panelAdd.add(submit);
		// add jlabel
		panelAdd.add(nameInput);
		panelAdd.add(lnameInput);
		panelAdd.add(ageInput);
		panelAdd.add(genderInput);
		// add jtextfield
		panelAdd.add(namee1);
		panelAdd.add(lnamee1);
		panelAdd.add(agee1);
		panelAdd.add(genderr1);
		panelAdd.add(lblIcon);
		panelAdd.add(background);
	
		submit.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		Registration val = new Registration();
		String[] option = { "Yes", "Cancel" };
			val.fname = namee1.getText();
			val.lname = lnamee1.getText();
			val.age = agee1.getText();
			val.gender = genderr1.getText();
		
			long optionn = JOptionPane.showOptionDialog(null, "Confirm the entry?","Confirmation",
					JOptionPane.WARNING_MESSAGE, 0, null, option,
					option[0]);
			if (optionn == 0) {
				Values.fn.add(val.fname);
				Values.ln.add(val.lname);
				Values.ag.add(val.age);
				Values.ge.add(val.gender);
		
				namee1.setText("");
				lnamee1.setText("");
				agee1.setText("");
				genderr1.setText("");
		
				JOptionPane.showMessageDialog(null, "entry added  successfully", "DATA ADDED",
						JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "entry cancelled",
					"CANCEL", JOptionPane.INFORMATION_MESSAGE);
		
			namee1.setText("");
			lnamee1.setText("");
			agee1.setText("");
			genderr1.setText("");
		}
	}
});
		return panelAdd;
		}
	
	public JPanel panelSort() {
		JPanel panelSort = new JPanel();
		panelSort.setBounds(0, 0, 444, 271);
		panelSort.setBackground(new Color(176, 224, 230));
		getContentPane().add(panelSort);
		panelSort.setLayout(null);
		textarea2.setBounds(90, 75, 250, 150);
		textarea2.setBackground(Color.white);
		textarea2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblText3 = new JLabel("BUBBLE SORT");
		lblText3.setHorizontalAlignment(SwingConstants.CENTER);
		lblText3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblText3.setBounds(95, 5, 250, 100);
		panelSort.add(lblText3);
		
		JLabel lblIcon2 = new JLabel("");
		lblIcon2.setBounds(330, -120, 450, 350);
		panelSort.add(lblIcon2);
		
		JLabel background = new JLabel("");
		background.setBounds(20, -10, 650, 300);
		panelSort.add(lblIcon2);
		panelSort.add(textarea2);
		panelSort.add(background);
		return panelSort;
		}
	
}


