package _1_registration;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class GUIclass extends JFrame{
	
	static JTextField namee1 = new JTextField();
	static JTextField lnamee1 = new JTextField();
	static JTextField idTF = new JTextField();
	static JTextField emailTF = new JTextField();
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
	    
	    JPanel panel = new JPanel();
	    getContentPane().add(panel);
	    setTitle("ISCP REGISTRATION");
	    setVisible(true);
	    setResizable(false);
	    setBackground(Color.white);
	    setSize(900, 600);
	    
	}
	
	
	
	public JPanel mainPanel() {
		
		//Main Panel - where all the functions or button is display in this window 
	    JPanel mainPanel = new JPanel();
	    mainPanel.setBounds(0, 0, 900, 600);
	    mainPanel.setBackground(Color.white);
	    getContentPane().add(mainPanel);
	    mainPanel.setLayout(null);
	    
	    //users icon
	    JLabel userIcon = new JLabel("");
	    userIcon.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\users.png"));
	    userIcon.setBounds(79, 56, 81, 63);

	    //users button
	    JButton addEntry = new JButton("ADD ENTRY");
	    addEntry.setBounds(61, 129, 120, 38);
	    addEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
	    addEntry.setBackground(Color.white);
	    addEntry.setForeground(new Color(2, 72, 173));
	    
	    //sort icon
	    JLabel sort = new JLabel("");
	    sort.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\sort.png"));
	    sort.setBounds(78, 205, 72, 70);
	    
	    //bubble Sort button
	    JButton bubbleSort = new JButton("BUBBLE SORT");
	    bubbleSort.setBounds(61, 280, 120, 38);
	    bubbleSort.setFont(new Font("Tahoma", Font.BOLD, 11));
	    bubbleSort.setForeground(new Color(2, 72, 173));
	    bubbleSort.setBackground(Color.white);
	    
	    // stack Icon
	    JLabel stackIcon = new JLabel("");
	    stackIcon.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\stack.png"));
	    stackIcon.setBounds(755, 55, 81, 63);
	    
	    //stack button
	    JButton stack = new JButton("STACK");
	    stack.setBounds(731, 129, 120, 38);
	    stack.setFont(new Font("Tahoma", Font.BOLD, 11));
	    stack.setForeground(new Color(2, 72, 173));
	    stack.setBackground(Color.white);
	    
	    //queue Icon
	    JLabel queueIcon = new JLabel("");
	    queueIcon.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\queue.png"));
	    queueIcon.setBounds(755, 205, 81, 63);
	    
	    //queue button
	    JButton queue = new JButton("QUEUE");
	    queue.setBounds(731, 280, 120, 38);
	    queue.setFont(new Font("Tahoma", Font.BOLD, 11));
	    queue.setForeground(new Color(2, 72, 173));
	    queue.setBackground(Color.white);
	    
	    //view Icon
	    JLabel viewIcon = new JLabel("");
	    viewIcon.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\users-view.png"));
	    viewIcon.setBounds(78, 370, 72, 70);
	    
	    // view button
	    JButton view = new JButton("VIEW");
	    view.setBounds(61, 450, 120, 38);
	    view.setFont(new Font("Tahoma", Font.BOLD, 11));
	    view.setForeground(new Color(2, 72, 173));
	    view.setBackground(Color.white);
	    
	    // remove Icon
	    JLabel removeIcon = new JLabel("");
	    removeIcon.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\trash.png"));
		removeIcon.setBounds(760, 366, 81, 85);
		
		//remove button
	    JButton remove = new JButton("REMOVE");
	    remove.setBounds(731, 450, 120, 38);
	    remove.setFont(new Font("Tahoma", Font.BOLD, 11));
	    remove.setForeground(Color.white);
	    remove.setBackground(new Color(255, 0, 0));
	    
	    JLabel logo = new JLabel("");
	    logo.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\image.gif"));
	    logo.setBounds(156, 35, 501, 449);
	    
	    //panel background
	    JLabel background = new JLabel("");
	    background.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\mainPanelBg.png"));
	    background.setBounds(0, 0, 900, 600);
	    
	    //calling all the buttons and images to display in the main Panel
	    //add button
	    mainPanel.add(addEntry);
	    mainPanel.add(bubbleSort);
	    mainPanel.add(stack);
	    mainPanel.add(queue);
	    mainPanel.add(view);
	    mainPanel.add(remove);
	    
	    //background / images
	    mainPanel.add(removeIcon);
	    mainPanel.add(queueIcon);
	    mainPanel.add(stackIcon);
	    mainPanel.add(viewIcon);
	    mainPanel.add(userIcon);
	    mainPanel.add(sort);
	    mainPanel.add(logo);
	    mainPanel.add(background);
	    
	    //Add Entry Button
	    //It is an action Listener to call the another window 
	    //which is the User Entry
	    addEntry.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        GUIclass addd = new GUIclass();
	        addd.getContentPane().add(addd.panelAdd());
	        addd.repaint();
	        addd.revalidate();
	        }
	    });

	    //bubble Sort Button
	  //It is an action Listener to call the another window 
	    //which is the Bubble sort function
	    bubbleSort.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {

	            GUIclass bubble = new GUIclass();
	            
	            //Getting the objects of Array List from Values Class
	            String[] arr = Values.ln.toArray(new String[Values.ln.size()]);
	            //Defining the variable of "display3" to call and display in the view area
	            String display3 = "";
	            
	        bubble.getContentPane().add(bubble.panelSort());
	        //used to update() method internally that calls the paint() method to repaint the component
	        bubble.repaint();
	        //Telling the layout manager to reset based on the new component list
	        bubble.revalidate();
	        
	        textarea2.setText(null);
	        	
	            int n = arr.length;
	                sortStrings(arr, n);
	            //It prints the array and automatically sort it using a bubble sort algorithm
	            for (int i = 0; i < n; i++) {
	                display3 = display3 + arr[i] + "\n";
	            }
	            
	            // used to append a value to the current sequence
	            //It means whenever we add another user it will also automatically add in the sorting component
	            textarea2.append(display3 + "\n");
	            revalidate(); // repaint JPanel
	        }
	    });
	    
	    //Stack Button
		//It is an action Listener to call the another window 
		//which is the stack function
	    stack.addActionListener(new ActionListener(){
	        @Override
	        
	        public void actionPerformed(ActionEvent e) {
	            GUIclass stacks = new GUIclass();
	            
	            //Calling the Values Class so we can get a method
	            Values stak = new Values();
	           
	            stacks.getContentPane().add(stacks.panelStack());
	            stacks.repaint();
	            stacks.revalidate();
	            
	            //It is where the default data shows
	            textarea2.setText(null);
	            
	            //Calling the is Empty() method from Values Class
	            String str = String.valueOf(stak.isEmpty());
	            //It will print the details of the data by showing if the list is empty and the size of stack
	            textarea2.append("\n The list isEmpty?: " + str + "\n\n Size of stack:" + stak.size());
	        }
	    });
	    
	    //Queue Button
	    //Calling the queue window
	    queue.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	//Getting the objects
	            GUIclass qu = new GUIclass();
	            Values val = new Values();
	            qu.getContentPane().add(qu.panelQueue());
	            qu.repaint();
	            qu.revalidate();
	            
	            //The linked list will display in textarea3
	            textarea3.setText(null);
	            	
	            	//Constructor to create a new node
	                for (String str : Values.ln) {
	                    val.addNode(str);
	                }
	                
	                //Appending the values and automatically print
	                textarea3.append(val.print() + " ");
	                revalidate(); // repaint JPanel
	            }
	        });
	    
	    //VIEW BUTTON
	    view.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            GUIclass viewww = new GUIclass();
	            viewww.getContentPane().add(viewww.panelView());
	            viewww.repaint();
	            viewww.revalidate();
	            
	            //textArea
	            textarea1.setText(null);
	        
	        //Constructor to append the values and here is there need to enter
	        //a value that start with 0 to view the index of an array
	        for (String str1 : Values.ln) {
	            textarea1.append(str1 + "\n");
	        }
	            revalidate(); // repaint JPanel
	        }
	    });
	    
	    //REMOVE BUTTON
	    remove.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	//Calling the window of delete
	            GUIclass deletee = new GUIclass();
	            
	            //getting the panelRemove
	            deletee.getContentPane().add(deletee.panelRemove());
	            deletee.repaint();
	            deletee.revalidate();
	            
	            //As like on the View Algorithm, we also have a 
	            //textarea here, where the user need to input 
	            // a number on the text area that start with 0 to delete the index of an array
	            textarea.setText(null);
	            
	            //Constructor to append the values
	            for (String str : Values.ln) {
	                textarea.append(str + "\n");
	            }

	            revalidate(); // repaint JPanel
	        }
	    });
	    return mainPanel;
	   
	}

	public JPanel panelAdd() {
		
		//panel for Adding User
	    JPanel panelAdd = new JPanel();
	    panelAdd.setBounds(0, 0,900, 600);
	    panelAdd.setBackground(new Color(243, 185, 16));
	    getContentPane().add(panelAdd);
	    panelAdd.setLayout(null);

	    //Submit Button
	    JButton submit = new JButton("SUBMIT");
	    submit.setBounds(115, 400, 100, 38);
	    submit.setForeground(Color.white);
	    submit.setBackground(new Color(2, 72, 173));
	    setVisible(true);
	    
	    //Title text
	    JLabel Addtxt = new JLabel("ADD USER");
	    Addtxt.setFont(new Font("Tahoma", Font.BOLD, 30));
	    Addtxt.setForeground(new Color(0, 74, 173));
	    Addtxt.setBounds(120, 128, 160, 35);
		
	    //titles on the side
	    namee1.setBounds(120, 200, 152, 30);
	    setVisible(true);

	    lnamee1.setBounds(120, 250, 152, 30);
	    setVisible(true);

	    idTF.setBounds(120, 300, 152, 30);
	    setVisible(true);

	    emailTF.setBounds(120, 350, 152, 30);
	    
	    //userInput
	    JLabel nameInput = new JLabel("<html><font color='#004aad'>FIRST NAME:</font></html>");
	    nameInput.setBounds(43, 210, 90, 14);

	    JLabel lnameInput = new JLabel("<html><font color='#004aad'>LAST NAME:</font></html>");
	    lnameInput.setBounds(43, 260, 90, 14);

	    JLabel idInput = new JLabel("<html><font color='#004aad'>ID NUMBER:</font></html>");
	    idInput.setBounds(43, 310, 90, 14);

	    JLabel emailInput = new JLabel("<html><font color='#004aad'>EMAIL:</font></html>");
	    emailInput.setBounds(43, 360, 90, 14);
	    
	    //logo
	    JLabel sideLogo = new JLabel("");
	    sideLogo.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\sideLogo.png"));
	    sideLogo.setBounds(0, 0, 300, 106);
	    
	    //GIF
	    JLabel ads = new JLabel("");
	    ads.setIcon(new ImageIcon("C:\\Users\\Ally\\Downloads\\ezgif.com-gif-maker.gif"));
	    ads.setBounds(374, 106, 445, 381);
	
	    
	    // add button
	    panelAdd.add(submit);
	    // add jlabel
	    panelAdd.add(nameInput);
	    panelAdd.add(lnameInput);
	    panelAdd.add(idInput);
	    panelAdd.add(emailInput);
	    panelAdd.add(Addtxt);
	    
	    // add jtextfield
	    panelAdd.add(namee1);
	    panelAdd.add(lnamee1);
	    panelAdd.add(idTF);
	    panelAdd.add(emailTF);
	    
	    //background picture
	    panelAdd.add(sideLogo);
	    panelAdd.add(ads);
	    
	    //SUBMIT BUTTON
	    submit.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	//getting the components in UserInfo Class
	            UserInfo val = new UserInfo();
	            
	            //Message Dialog after the user click the submit button
	            String[] option = { "Yes", "Cancel" };
	            
	            //Field Text
	            //geText() method is use to get the data of the user input
 	            val.fname = namee1.getText();
	            val.lname = lnamee1.getText();
	            val.id = idTF.getText();
	            val.email = emailTF.getText();
	            
	          //To make sure to the user that they will confirm their input before it save
	            long optionn = JOptionPane.showOptionDialog(null, "Confirm the entry?","Confirmation",
	                JOptionPane.WARNING_MESSAGE, 0, null, option,option[0]);
	            
	        // We make a condition that the user confirm their entry     
	        if (optionn == 0) {

	            Values.fn.add(val.fname);
	            Values.ln.add(val.lname);
	            Values.id.add(val.id);
	            Values.em.add(val.email);

	            namee1.setText("");
	            lnamee1.setText("");
	            idTF.setText("");
	            emailTF.setText("");

	            //it will display here
	            JOptionPane.showMessageDialog(null, "entry added successfully", "DATA ADDED",
	                JOptionPane.INFORMATION_MESSAGE);
	           
	        // If the user click "CANCEL" 
	        } else {
	        	
	        	//it will show this
	            JOptionPane.showMessageDialog(null, "entry cancelled",
	                "CANCEL", JOptionPane.INFORMATION_MESSAGE);

	            namee1.setText("");
	            lnamee1.setText("");
	            idTF.setText("");
	            emailTF.setText("");
	        }
	    }
	});
	    return panelAdd;
	}
	
	
	public JPanel panelSort() {
		//Sort Panel
	    JPanel panelSort = new JPanel();
	    panelSort.setBounds(0, 0, 900, 600);
	    panelSort.setBackground(new Color(243, 185, 16));
	    getContentPane().add(panelSort);
	    panelSort.setLayout(null);
	    
	    //Display Area for sorting method
	    textarea2.setBounds(430, 194, 398, 326);
	    textarea2.setBackground(Color.white);
	    textarea2.setFont(new Font("Tahoma", Font.BOLD, 13));
	    textarea2.setEditable(false);
	    
	    JLabel lblIcon2 = new JLabel("");
	    lblIcon2.setBounds(330, -120, 450, 350);
	    panelSort.add(lblIcon2);

	    //Title Text
	    JLabel Addtxt = new JLabel("BUBBLE SORT");
	    Addtxt.setFont(new Font("Tahoma", Font.BOLD, 30));
	    Addtxt.setForeground(new Color(0, 74, 173));
	    Addtxt.setBounds(350, 129, 250, 35);
	    
	    //GIF Display
	    JLabel pic1 = new JLabel("");
	    pic1.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\ezgif.com-gif-maker (1).gif"));
	    pic1.setBounds(92, 194, 307, 308);
	    
	    //Logo Display
	    JLabel sideLogo = new JLabel("");
	    sideLogo.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\sideLogo.png"));
	    sideLogo.setBounds(0, 0, 300, 106);
	    
	    //add pictures
	    panelSort.add(sideLogo);
	    panelSort.add(pic1);
	    
	    //add text
	    panelSort.add(lblIcon2);
	    panelSort.add(Addtxt);
	    panelSort.add(textarea2);


	    return panelSort;
	    }

	    public JPanel panelStack(){
	    	//Sort Panel
	        JPanel panelSort = new JPanel();
	        panelSort.setBounds(0, 0, 900, 600);
	        panelSort.setBackground(new Color(243, 185, 16));
	        getContentPane().add(panelSort);
	        panelSort.setLayout(null);
	        
	        //Display Area
	        textarea2.setBounds(461, 204, 368, 179);
	        textarea2.setBackground(Color.white);
	        textarea2.setFont(new Font("Tahoma", Font.BOLD, 13));
	        textarea2.setEditable(false);

	        //Title Text
	        JLabel Addtxt = new JLabel("STACK LIST");
		    Addtxt.setFont(new Font("Tahoma", Font.BOLD, 30));
		    Addtxt.setForeground(new Color(0, 74, 173));
		    Addtxt.setBounds(350, 129, 250, 35);

	        //Display GIF
	        JLabel pic1 = new JLabel("");
		    pic1.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\ezgif.com-gif-maker (3).gif"));
		    pic1.setBounds(163, 186, 254, 284);
		    
		    //Display Logo
		    JLabel sideLogo = new JLabel("");
		    sideLogo.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\sideLogo.png"));
		    sideLogo.setBounds(0, 0, 300, 106);
		    	
		    	//add Images
		    	panelSort.add(pic1);
		    	panelSort.add(sideLogo);
		    	
		    	//add text
		    	panelSort.add(Addtxt);
	            panelSort.add(textarea2);
	            
	        return panelSort;
	    }
	    
	    public JPanel panelQueue() {
	    	//Queue Panel
	        JPanel panelQueue = new JPanel();
	        panelQueue.setBounds(0, 0, 900, 600);
	        panelQueue.setBackground(new Color(243, 185, 16));
	        getContentPane().add(panelQueue);
	        panelQueue.setLayout(null);
	        
	        //Display Logo
	        JLabel sideLogo = new JLabel("");
		    sideLogo.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\sideLogo.png"));
		    sideLogo.setBounds(0, 0, 300, 106);

		    //Display Area
	        textarea3.setBounds(40, 218, 818, 179);
	        textarea3.setBackground(Color.white);
	        textarea3.setFont(new Font("Tahoma", Font.BOLD, 13));
	        textarea3.setEditable(false);
	        
	        //Title Text
	        JLabel Addtxt = new JLabel("LINKEDLIST");
		    Addtxt.setFont(new Font("Tahoma", Font.BOLD, 30));
		    Addtxt.setForeground(new Color(0, 74, 173));
		    Addtxt.setBounds(350, 129, 250, 35);
	        
	        //Add Text
	        panelQueue.add(Addtxt);
	        panelQueue.add(textarea3);
	        
	        //Display Logo
	        panelQueue.add(sideLogo);
	       

	        return panelQueue;
	    }
	    
	    public JPanel panelView() {
	        
	    	//View Panel
	        JPanel panelView = new JPanel();
	        panelView.setBounds(0, 0, 900, 600);
	        panelView.setBackground(new Color(243, 185, 16));
	        getContentPane().add(panelView);
	        panelView.setLayout(null);
	        

	        //Display Logo
	        JLabel sideLogo = new JLabel("");
		    sideLogo.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\sideLogo.png"));
		    sideLogo.setBounds(0, 0, 300, 106);

	        //Title Text
	        JLabel Addtxt = new JLabel("VIEW USERS");
		    Addtxt.setFont(new Font("Tahoma", Font.BOLD, 30));
		    Addtxt.setForeground(new Color(0, 74, 173));
		    Addtxt.setBounds(350, 129, 250, 35);
	        
	        //Display Area
	        textarea1.setBounds(325, 210, 250, 250);
	        textarea1.setBackground(Color.white);
	        textarea1.setFont(new Font("Tahoma", Font.BOLD, 13));
	        textarea1.setEditable(false);
	        
	        //text Area for Entering the index number
	        JLabel lblText2 = new JLabel("View the index# (0 - Data size)");
	        lblText2.setHorizontalAlignment(SwingConstants.CENTER);
	        lblText2.setFont(new Font("Tahoma", Font.BOLD, 14));
	        lblText2.setBounds(300, 170, 300, 35);
	        
	        panelView.add(lblText2);
	        
	        //View Button
	        JButton vieww = new JButton("View");
	        vieww.setBounds(420, 500, 80, 30);
	        vieww.setBackground(Color.white);
	        vieww.setForeground(new Color(2, 72, 173));

	        
	        JLabel lblIcon1 = new JLabel("");
	        lblIcon1.setBounds(330, -120, 450, 350);
	        panelView.add(lblIcon1);

	        //Display text for Enter here
	        JLabel here1 = new JLabel("Enter here:");
	        here1.setBounds(380, 475, 80, 20);
	        
	        //Text Area for asking the index#
	        viewed.setBounds(450, 475, 80, 20);
	        
	        //add Texts
	        panelView.add(here1);
	        panelView.add(vieww);
	        panelView.add(Addtxt);
	        
	        //add Text Area
	        panelView.add(viewed);
	        panelView.add(textarea1);
	        
	        //add Images
	        panelView.add(lblIcon1);
	        panelView.add(sideLogo);
	      
	    vieww.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	
	            int valuu = Integer.parseInt(viewed.getText());
	            
	            //Getting the values from registration
	            String nam = Values.fn.get(valuu);
	            String idnum = Values.id.get(valuu);
	            String email = Values.em.get(valuu);
	            
	            //Setting text in text area(It allowed to view all the surnames here)
	            textarea1.setText(null);
	            
	            //Appending the values
	           for (String str1 : Values.ln) {
	                textarea1.append(str1 + "\n");
	            }
	           
	           //After the user input a index# it will show the data of one user 
	           JOptionPane.showMessageDialog(null, "Registrant " + Values.ln.get(valuu)

	            + "'s data\n══════════════════════════════\n First Name: " + nam + "\n ID Number: "

	            + idnum + "\n Gender: " + email + "\n══════════════════════════════");

	        }
	    });
	    return panelView;
	    }
	    
	    
	    public JPanel panelRemove() {
	    	//remove Panel
	        JPanel panelRemove = new JPanel();
	        panelRemove.setBounds(0, 0, 900, 600);
	        panelRemove.setBackground(new Color(243, 185, 16));
	        getContentPane().add(panelRemove);
	        panelRemove.setLayout(null);
	        
	        //Display Logo
	        JLabel sideLogo = new JLabel("");
		    sideLogo.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\sideLogo.png"));
		    sideLogo.setBounds(0, 0, 300, 106);

	        //Title Text
	        JLabel Addtxt = new JLabel("VIEW USERS");
		    Addtxt.setFont(new Font("Tahoma", Font.BOLD, 30));
		    Addtxt.setForeground(new Color(0, 74, 173));
		    Addtxt.setBounds(350, 129, 250, 35);
	        
	        //text Area
	        textarea.setBounds(325, 210, 250, 250);
	        textarea.setBackground(Color.white);
	        textarea.setFont(new Font("Tahoma", Font.BOLD, 13));
	        textarea.setEditable(false);
	        
	        JLabel lblText1 = new JLabel("Remove the index# (0 - Data size)");
	        lblText1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblText1.setFont(new Font("Tahoma", Font.BOLD, 14));
	        lblText1.setBounds(300, 170, 300, 35);

	        JButton remove = new JButton("Remove");
	        remove.setBounds(420, 500, 80, 30);
	        remove.setBackground(Color.white);
	        remove.setForeground(new Color(2, 72, 173));

	        JLabel lblIcon = new JLabel("");
	        lblIcon.setBounds(330, -120, 450, 350);
	        panelRemove.add(lblIcon);
	        
	        JLabel here = new JLabel("Enter here:");
	        here.setBounds(380, 475, 80, 20);

	     
	        removed.setBounds(450, 475, 80, 20);

	        panelRemove.add(Addtxt);
	        panelRemove.add(lblText1);
	        panelRemove.add(here);
	        panelRemove.add(remove);
	        
	        panelRemove.add(removed);
	        
	        panelRemove.add(lblIcon);
	        panelRemove.add(textarea);

	        panelRemove.add(sideLogo);

	        remove.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String[] option = { "Yes", "Cancel" };
	            if (!Values.ln.isEmpty()) {
	                int valu = Integer.parseInt(removed.getText());
	                long optionn = JOptionPane.showOptionDialog(null, "Confirm the deletion?", "Confirmation",

	            JOptionPane.WARNING_MESSAGE, 0, null,option, option[0]);

	            if (optionn == 0) {
	                JOptionPane.showMessageDialog(null, " Registrant " + Values.ln.get(valu) + "'s data is deleted!");

	                Values.fn.remove(valu);
	                Values.ln.remove(valu);
	                Values.id.remove(valu);
	                Values.em.remove(valu);
	                textarea.setText(null);

	                for (String str : Values.ln) {
	                    textarea.append(str + "\n");
	                }
	            } else {
	                JOptionPane.showMessageDialog(null, "entry cancelled", "CANCEL", JOptionPane.INFORMATION_MESSAGE);
	                }
	            } else {
	                JOptionPane.showMessageDialog(null, " THE LIST IS EMPTY !");
	            }
	        }
	    });
	    return panelRemove;
	}
	    
	}
