
package client_rmi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Show extends JFrame implements Serializable {
    public JLabel name_label;  
    public JLabel surname_label;
    public JLabel flight_id_label;
    private JLabel message;
    
    private JTextField name_text;
    private JTextField surname_text;
    private JTextField flight_id_text;
    
    private JButton search;  
    private JButton clear; 
    private JButton back;
    private JButton exit;
    
     private JLabel copyright;
    
    public Show()
    {
        super("Show Booking Details");    
        setSize(750,500); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        setVisible(true); 
        setBackground(Color.YELLOW);
        
        message = new JLabel("Fill the Gaps, to see Booking Details",JLabel.CENTER);
        message.setForeground(Color.ORANGE);
        message.setFont(new Font("Segoe UI", Font.BOLD, 35)); 
        message.setBounds(60, 30, 600, 50);
        
        name_label = new JLabel("Name",JLabel.CENTER);
        name_label.setFont(new Font("Segoe UI", Font.BOLD, 20)); 
        name_label.setBounds(30, 120, 120, 30);
        name_text= new JTextField(20);
        name_text.setBackground(Color.LIGHT_GRAY);         
        name_text.setFont(new Font("Segoe UI", Font.BOLD, 16));         
        name_text.setBounds(220, 120, 200, 30); 
        
        
        surname_label = new JLabel("Surname",JLabel.CENTER);
        surname_label.setFont(new Font("Segoe UI", Font.BOLD, 20)); 
        surname_label.setBounds(30, 170, 120, 30);
        surname_text = new JTextField(20);
        surname_text.setBackground(Color.LIGHT_GRAY);         
        surname_text.setFont(new Font("Segoe UI", Font.BOLD, 16));         
        surname_text.setBounds(220, 170, 200, 30); 
        
        
        
        flight_id_label= new JLabel("Flight ID", JLabel.CENTER);         
        flight_id_label.setFont(new Font("Segoe UI", Font.BOLD, 20)); 
        flight_id_label.setBounds(30, 220, 120, 30); 
        
        flight_id_text = new JTextField(10);        
        flight_id_text.setScrollOffset(10);
        flight_id_text.setBackground(Color.LIGHT_GRAY);         
        flight_id_text.setFont(new Font("Segoe UI", Font.BOLD, 16));         
        flight_id_text.setBounds(220, 220, 120, 30); 
    
        search = new JButton("View"); 
        search.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        search.setBounds(70, 270, 150, 30);  
         //ACTIONLISTENER
        search.addActionListener(new ActionListener () 
        {
            public void actionPerformed(ActionEvent e )
            {
                //PAIRNOUME TA STOIXEIA GIA THN HMEROMHNIA KAI TON PROORISMO ANAXWRHSHS KAI AFIKSHS.
                String name = name_text.getText();
                String surname =surname_text.getText();
                String flight_id = flight_id_text.getText();
                
                
                if(!name.equals("") && !surname.equals("") && !flight_id.equals("")){
                    dispose();
                    
                     //APOSTOLH ANTIKEIMENOU STON SERVER ME TA STOIXEIA POU PHRE APO TON XRHSTH.
                     
                     /* ΣΤΟΝ ΣΕΡΒΕΡ ΠΡΕΠΕΙ ΝΑ ΣΤΕΙΛΕΙΣ ΤΙΣ ΜΕΤΑΒΛΗΤΕΣ name.surname,flight_id θα πρεπει να ψαξεις με βαση αυτα τα 3 στοιχεια 
                            και μετα να επιστρεψεις οτι ακριβως επεστρεφες και στο available_flights. */
                     /*θα πρεπει μεσα στην κλαση Available_flights να στειλεις flight_id,departure,arrival,time,mera,mhna,etos,και διαθεσιμες θεσεις τον αριθμο δηλαδη
                     των θεσεων. Τον αριθμο θα πρεπει να το μετατρεψεις σε στρινγκ.Τελος πρεπει να στειλεις και τον αριθμο τον αποτελεσματων δηλαδη ποσες πτησεις θα εμφανισεις 
                     ειναι βασικο για να εμφανιστουν σωστα τα γραφικα.
                     */
                     
                     Available_flights available = new Available_flights();
                }
                else{
                    JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "One or more fields are empty! Try again.", "Error!",
                    JOptionPane.INFORMATION_MESSAGE);      
                }
                
                //APOSTOLH ANTIKEIMENOU STON SERVER ME TA STOIXEIA POU PHRE APO TON XRHSTH.
                
            }
        });
        
        
        clear = new JButton("Clear All"); 
        clear.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        clear.setBounds(220, 270, 150, 30);  
         //ACTIONLISTENER
        clear.addActionListener(new ActionListener () 
        {
            public void actionPerformed(ActionEvent e )
            {
                name_text.setText("");
                surname_text.setText("");
                flight_id_text.setText("");            
            }
        });
        
        //BUTTON BACK.
        back = new JButton("Back");
        back.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        back.setBounds(370, 270, 150, 30); 
        //ACTIONLISTENER
        back.addActionListener (new ActionListener() 
        {
            public void actionPerformed(ActionEvent e )
            {
            dispose();
            Menu m = new Menu();
            }
        });
        
        //BUTTON EXIT.
        exit = new JButton("Exit");
        exit.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        exit.setBounds(520, 270, 150, 30); 
        //ACTIONLISTENER
        exit.addActionListener (new ActionListener() 
        {
            public void actionPerformed(ActionEvent e )
            {
            dispose();
            }
        });
        
        
        copyright = new JLabel("@Copyright 2015-2016",JLabel.RIGHT);
        copyright.setFont(new Font("Segoe UI", Font.BOLD, 10)); 
        copyright.setBounds(280, 420, 120, 30);

        
        
        Container pane=getContentPane(); 
        
         pane.setLayout(null); 
         pane.add(name_label);
         pane.add(message);
         pane.add(surname_label);
         pane.add(flight_id_label);
         pane.add(name_text);
         pane.add(surname_text);   
         pane.add(flight_id_text);  
         pane.add(search);
         pane.add(clear);
         pane.add(back);
         pane.add(exit);
         pane.add(copyright);
         setContentPane(pane); 
       } 
    }
    

