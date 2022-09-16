
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

    JPanel mainPanel = new JPanel();
    mainPanel.setBounds(0, 0, 900, 600);
    mainPanel.setBackground(Color.white);
    getContentPane().add(mainPanel);
    mainPanel.setLayout(null);

    JLabel background = new JLabel("");
    background.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\logo.png"));
    background.setBounds(500, 26, 400, 400);
    
    JLabel userIcon = new JLabel("");
    userIcon.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\users.png"));
    userIcon.setBounds(84, 53, 88, 65);

    JButton addEntry = new JButton("ADD ENTRY");
    addEntry.setBounds(66, 129, 100, 38);
    addEntry.setForeground(Color.white);
    addEntry.setBackground(new Color(2, 72, 173));

    JLabel sort = new JLabel("");
    sort.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\sort.png"));
    sort.setBounds(78, 205, 72, 70);
    
    JButton bubbleSort = new JButton("BUBBLE SORT");
    bubbleSort.setBounds(61, 280, 120, 38);
    bubbleSort.setForeground(Color.white);
    bubbleSort.setBackground(new Color(2, 72, 173));
    
    JButton stack = new JButton("STACK");
    stack.setBounds(250, 129, 100, 38);
    stack.setForeground(Color.white);
    stack.setBackground(new Color(2, 72, 173));
    
    JButton queue = new JButton("QUEUE");
    queue.setBounds(250, 280, 100, 38);
    queue.setForeground(Color.white);
    queue.setBackground(new Color(2, 72, 173));
    
    JButton view = new JButton("VIEW");
    view.setBounds(75, 450, 100, 38);
    view.setForeground(Color.white);
    view.setBackground(new Color(2, 72, 173));
    
    JButton remove = new JButton("REMOVE");
    remove.setBounds(250, 450, 100, 38);
    remove.setForeground(Color.white);
    remove.setBackground(new Color(2, 72, 173));
    
    // add button
    mainPanel.add(addEntry);
    mainPanel.add(bubbleSort);
    mainPanel.add(stack);
    mainPanel.add(queue);
     mainPanel.add(view);
    mainPanel.add(remove);
    
    // background / images
    mainPanel.add(background);
    mainPanel.add(userIcon);
    mainPanel.add(sort);
    
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
            String[] arr = Values.ln.toArray(new 
            String[Values.ln.size()]);
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
    
    stack.addActionListener(new ActionListener(){
        @Override
        
        public void actionPerformed(ActionEvent e) {
            GUIclass stacks = new GUIclass();
            Values stak = new Values();
            

            stacks.getContentPane().add(stacks.panelStack());
            stacks.repaint();
            stacks.revalidate();
            
            textarea2.setText(null);
            String str = String.valueOf(stak.isEmpty());
            textarea2.append("\n The list isEmpty?: " + str + "\n\n Size of stack:" + stak.size());
        }
    });
    
    
    
    queue.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            GUIclass qu = new GUIclass();
            Values val = new Values();
            qu.getContentPane().add(qu.panelQueue());
            qu.repaint();
            qu.revalidate();

            textarea3.setText(null);

                for (String str : Values.ln) {
                    val.addNode(str);
                }
            
                textarea3.append(val.print() + " ");
                revalidate(); // repaint JPanel
            }
        });
    
    view.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            GUIclass viewww = new GUIclass();
            viewww.getContentPane().add(viewww.panelView());
            viewww.repaint();
            viewww.revalidate();
            textarea1.setText(null);
            
        for (String str1 : Values.ln) {
            textarea1.append(str1 + "\n");
        }
            revalidate(); // repaint JPanel
        }
    });
    
    remove.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            GUIclass deletee = new GUIclass();

            deletee.getContentPane().add(deletee.panelRemove());
            deletee.repaint();
            deletee.revalidate();
            textarea.setText(null);
           
            for (String str : Values.ln) {
                textarea.append(str + "\n");
            }

            revalidate(); // repaint JPanel
        }
    });
    return mainPanel;
   
}

public JPanel panelAdd() {

    JPanel panelAdd = new JPanel();
    panelAdd.setBounds(0, 0,900, 600);
    panelAdd.setBackground(new Color(243, 185, 16));
    getContentPane().add(panelAdd);
    panelAdd.setLayout(null);


    JButton submit = new JButton("SUBMIT");
    submit.setBounds(373, 280, 100, 38);
    submit.setForeground(Color.white);
    submit.setBackground(new Color(2, 72, 173));
    setVisible(true);

    namee1.setBounds(350, 86, 149, 20);
    setVisible(true);

    lnamee1.setBounds(350, 129, 149, 20);
    setVisible(true);

    idTF.setBounds(350, 172, 149, 20);
    setVisible(true);

    emailTF.setBounds(350, 218, 149, 20);
    JLabel nameInput = new JLabel("<html><font color='black'>First Name:</font></html>");
    nameInput.setBounds(273, 89, 67, 14);

    JLabel lnameInput = new JLabel("<html><font color='black'>Last Name:</font></html>");
    lnameInput.setBounds(273, 132, 67, 14);

    JLabel idInput = new JLabel("<html><font color='black'>ID Number:</font></html>");
    idInput.setBounds(273, 175, 67, 14);

    JLabel emailInput = new JLabel("<html><font color='black'>Email:</font></html>");
    emailInput.setBounds(273, 218, 67, 14);

    JLabel lblIcon = new JLabel("");
    lblIcon.setIcon(new 
    ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\StickerEntry.png"));
    lblIcon.setBounds(10, 86, 300, 184);
    panelAdd.add(lblIcon);

    JLabel background1 = new JLabel("");
    //background1.setIcon(new ImageIcon("C:\\Users\\Ally\\Desktop\\icons\\bh.png"));
    background1.setBounds(20, -10, 650, 300);
    // add button
    panelAdd.add(submit);
    // add jlabel
    panelAdd.add(nameInput);
    panelAdd.add(lnameInput);
    panelAdd.add(idInput);
    panelAdd.add(emailInput);
    // add jtextfield
    panelAdd.add(namee1);
    panelAdd.add(lnamee1);
    panelAdd.add(idTF);
    panelAdd.add(emailTF);
    panelAdd.add(lblIcon);
    panelAdd.add(background1);
    
    submit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Registration val = new Registration();

            String[] option = { "Yes", "Cancel" };

            val.fname = namee1.getText();
            val.lname = lnamee1.getText();
            val.id = idTF.getText();
            val.email = emailTF.getText();

            long optionn = JOptionPane.showOptionDialog(null, "Confirm the entry?","Confirmation",
                JOptionPane.WARNING_MESSAGE, 0, null, option,option[0]);
            
        if (optionn == 0) {

            Values.fn.add(val.fname);
            Values.ln.add(val.lname);
            Values.id.add(val.id);
            Values.em.add(val.email);

            namee1.setText("");
            lnamee1.setText("");
            idTF.setText("");
            emailTF.setText("");

            JOptionPane.showMessageDialog(null, "entry added successfully", "DATA ADDED",
                JOptionPane.INFORMATION_MESSAGE);

        } else {
        
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

    JPanel panelSort = new JPanel();
    panelSort.setBounds(0, 0, 900, 600);
    panelSort.setBackground(new Color(243, 185, 16));
    getContentPane().add(panelSort);
    panelSort.setLayout(null);
    
    textarea2.setBounds(90, 75, 250, 150);
    textarea2.setBackground(Color.white);
    textarea2.setFont(new Font("Tahoma", Font.BOLD, 13));
    textarea2.setEditable(false);

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

    public JPanel panelStack(){
        JPanel panelSort = new JPanel();
        panelSort.setBounds(0, 0, 900, 600);
        panelSort.setBackground(new Color(176, 224, 230));
        getContentPane().add(panelSort);
        panelSort.setLayout(null);

        textarea2.setBounds(90, 75, 250, 150);
        textarea2.setBackground(Color.white);
        textarea2.setFont(new Font("Tahoma", Font.BOLD, 13));


        JLabel lblText3 = new JLabel("STACK LIST");
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
    
    public JPanel panelQueue() {
        JPanel panelQueue = new JPanel();
        panelQueue.setBounds(0, 0, 900, 600);
        panelQueue.setBackground(new Color(176, 224, 230));
        getContentPane().add(panelQueue);
        panelQueue.setLayout(null);
        
        textarea3.setBounds(200, 75, 400, 100);
        textarea3.setBackground(Color.white);
        textarea3.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        JLabel lblText4 = new JLabel("LinkedList");
        lblText4.setHorizontalAlignment(SwingConstants.CENTER);
        lblText4.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblText4.setBounds(95, 5, 250, 100);
        panelQueue.add(lblText4);

        JLabel lblIcon1 = new JLabel("");
        lblIcon1.setBounds(330, -120, 450, 350);
        panelQueue.add(lblIcon1);
        
        JLabel background = new JLabel("");
        background.setBounds(20, -10, 650, 300);
        queuee.setBounds(195, 185, 80, 20);

        panelQueue.add(lblIcon1);
        panelQueue.add(textarea3);
        panelQueue.add(background);

        return panelQueue;
    }
    
    public JPanel panelView() {
        
        JPanel panelView = new JPanel();
        panelView.setBounds(0, 0, 900, 600);
        panelView.setBackground(new Color(176, 224, 230));
        getContentPane().add(panelView);
        panelView.setLayout(null);
        
        textarea1.setBounds(90, 75, 250, 100);
        textarea1.setBackground(Color.white);
        textarea1.setFont(new Font("Tahoma", Font.BOLD, 13));

        JLabel lblText2 = new JLabel("View the index# (0 - Data size)");

        lblText2.setHorizontalAlignment(SwingConstants.CENTER);
        lblText2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblText2.setBounds(95, 5, 250, 100);

        panelView.add(lblText2);

        JButton vieww = new JButton("View");
        vieww.setBounds(170, 210, 80, 30);
        vieww.setBackground(Color.yellow);

        JLabel lblIcon1 = new JLabel("");
        lblIcon1.setBounds(330, -120, 450, 350);
        panelView.add(lblIcon1);

        JLabel here1 = new JLabel("Enter here:");
        here1.setBounds(130, 185, 80, 20);

        JLabel background = new JLabel("");
        background.setBounds(20, -10, 650, 300);
        viewed.setBounds(195, 185, 80, 20);

        panelView.add(here1);
        panelView.add(vieww);
        panelView.add(viewed);
        panelView.add(lblIcon1);
        panelView.add(textarea1);
        panelView.add(background);
        
    vieww.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int valuu = Integer.parseInt(viewed.getText());

            String nam = Values.fn.get(valuu);
            String idnum = Values.id.get(valuu);
            String email = Values.em.get(valuu);
            
            textarea1.setText(null);

           for (String str1 : Values.ln) {
                textarea1.append(str1 + "\n");
            }
        
           JOptionPane.showMessageDialog(null, "Registrant " + Values.ln.get(valuu)

            + "'s data\n═══════┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄════════\n First Name: " + nam + "\n ID Number: "

            + idnum + "\n Gender: " + email + "\n═══════┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄═┄════════");

        }
    });
    return panelView;
    }
    
    public JPanel panelRemove() {
        JPanel panelRemove = new JPanel();
        panelRemove.setBounds(0, 0, 900, 600);
        panelRemove.setBackground(new Color(176, 224, 230));
        getContentPane().add(panelRemove);
        panelRemove.setLayout(null);

        textarea.setBounds(90, 75, 250, 100);
        textarea.setBackground(Color.white);
        textarea.setFont(new Font("Tahoma", Font.BOLD, 13));
        
        JLabel lblText1 = new JLabel("Remove the index# (0 - Data size)");
        lblText1.setHorizontalAlignment(SwingConstants.CENTER);
        lblText1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblText1.setBounds(95, 5, 250, 100);
        panelRemove.add(lblText1);

        JButton remove = new JButton("Remove");
        remove.setBounds(170, 210, 80, 30);
        remove.setBackground(Color.yellow);

        JLabel lblIcon = new JLabel("");
        lblIcon.setBounds(330, -120, 450, 350);
        panelRemove.add(lblIcon);
        
        JLabel here = new JLabel("Enter here:");
        here.setBounds(130, 185, 80, 20);

        JLabel background = new JLabel("");
        background.setBounds(20, -10, 650, 300);
        removed.setBounds(195, 185, 80, 20);

        panelRemove.add(here);
        panelRemove.add(remove);
        panelRemove.add(removed);
        panelRemove.add(lblIcon);
        panelRemove.add(textarea);
        panelRemove.add(background);

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
