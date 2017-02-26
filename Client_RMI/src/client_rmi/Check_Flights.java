
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

public class Check_Flights extends JFrame implements Serializable {

    public String[] arrival_air ={"Choose","Athens","Samos","Thessaloniki","Ioannina","Irakleion"};
    public String[] departure_air ={"Choose","Hania","Rodos","Samos","Mykonos","Skiathos"};
     
    public JLabel arrival;  
    public JLabel departure;  
    public JLabel message;
    
    
    public JComboBox arr; 
    public JComboBox depar; 
    
    private JLabel arrivallabel; 
    private JLabel arrivallabel_1;
    private JLabel arrivallabel_2;

    private JTextField arrival_1;
    private JTextField arrival_2;
    private JTextField arrival_3;
     
    private JButton search;  
    private JButton clear; 
    private JButton back;
    private JButton exit;
    
    
    private JLabel copyright;
    
    public Check_Flights (){

    super("Check");         
        setSize(750,500); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        setVisible(true); 
        setBackground(Color.YELLOW);
        
        message = new JLabel("Check a Destination.",JLabel.CENTER);
        message.setForeground(Color.ORANGE);
        message.setFont(new Font("Segoe UI", Font.BOLD, 35)); 
        message.setBounds(60, 30, 600, 50);
        
        arrival = new JLabel("Arrival:",JLabel.RIGHT);
        arrival.setFont(new Font("Segoe UI", Font.BOLD, 20)); 
        arrival.setBounds(30, 120, 120, 30);
        arr = new JComboBox(arrival_air);
        arr.setBackground(Color.LIGHT_GRAY);         
        arr.setFont(new Font("Segoe UI", Font.BOLD, 16));         
        arr.setBounds(220, 120, 200, 30); 
        
        
        departure = new JLabel("Departure:",JLabel.RIGHT);
        departure.setFont(new Font("Segoe UI", Font.BOLD, 20)); 
        departure.setBounds(30, 170, 120, 30);
        depar = new JComboBox(departure_air);
        depar.setBackground(Color.LIGHT_GRAY);         
        depar.setFont(new Font("Segoe UI", Font.BOLD, 16));         
        depar.setBounds(220, 170, 200, 30); 
        
        
        
        arrivallabel= new JLabel("Date:", JLabel.RIGHT);         
        arrivallabel.setFont(new Font("Segoe UI", Font.BOLD, 20)); 
        arrivallabel.setBounds(30, 220, 120, 30); 
        
        arrival_1 = new JTextField(2 );        
        arrival_1.setBackground(Color.LIGHT_GRAY);         
        arrival_1.setFont(new Font("Segoe UI", Font.BOLD, 16));         
        arrival_1.setBounds(220, 220, 50, 30); 
        
        arrivallabel_1= new JLabel("/", JLabel.RIGHT);         
        arrivallabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20)); 
        arrivallabel_1.setBounds(235, 220, 50, 30); 
        
        
        arrival_2 = new JTextField(2);        
        arrival_2.setBackground(Color.LIGHT_GRAY);         
        arrival_2.setFont(new Font("Segoe UI", Font.BOLD, 16));  
        arrival_2.setBounds(290, 220, 50, 30); 
        
        arrivallabel_2= new JLabel("/", JLabel.RIGHT);         
        arrivallabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20)); 
        arrivallabel_2.setBounds(305, 220, 50, 30); 
        
        arrival_3 = new JTextField(2);
        arrival_3.setBackground(Color.LIGHT_GRAY);         
        arrival_3.setFont(new Font("Segoe UI", Font.BOLD, 16));         
        arrival_3.setBounds(360, 220, 80, 30); 
        
        search = new JButton("Search"); 
        search.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        search.setBounds(70, 270, 150, 30);  
         //ACTIONLISTENER
        search.addActionListener(new ActionListener () 
        {
            public void actionPerformed(ActionEvent e )
            {
                //PAIRNOUME TA STOIXEIA GIA THN HMEROMHNIA KAI TON PROORISMO ANAXWRHSHS KAI AFIKSHS.
                String day = arrival_1.getText();
                String month =arrival_2.getText();
                String year = arrival_3.getText();
                
                String arrival = arr.getSelectedItem().toString();
                String departure = depar.getSelectedItem().toString();
                
                
                if(!day.equals("") && !month.equals("") && !year.equals("") && !arrival.equals("Choose") && !departure.equals("Choose")){
                   
                    dispose();
                    
                     //APOSTOLH ANTIKEIMENOU STON SERVER ME TA STOIXEIA POU PHRE APO TON XRHSTH.
                     
                     /*στον σερβερ πρεπει να στειλεις τις μεταβλητες arrival,departure,day,monthm,year.
                     ΜΟΛΙΣ ΒΡΕΙΣ ΑΥΤΑ ΠΟΥ ΘΕΛΟΥΜΕ ΣΤΟΝ ΣΕΡΒΕΡ ΤΟΤΕ ΠΡΕΠΕΙ ΝΑ ΣΤΕΛΕΙΣ ΠΙΣΩ ΣΤΟΝ CLIENT 8 ΠΡΑΓΜΑΤΑ ΓΙΑ ΚΑΘΕ ΠΤΗΣΗ. 
                     */
                     
                     /*θα πρεπει μεσα στην κλαση Available_flights να στειλεις flight_id,departure,arrival,time,mera,mhna,etos,και διαθεσιμες θεσεις τον αριθμο δηλαδη
                     των θεσεων. Τον αριθμο θα πρεπει να το μετατρεψεις σε στρινγκ.Τελος πρεπει να στειλεις και τον αριθμο τον αποτελεσματων δηλαδη ποσες πτησεις θα εμφανισεις 
                     ειναι βασικο για να εμφανιστουν σωστα τα γραφικα.
                     */
                     Available_flights k = new Available_flights();
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
                arrival_1.setText("");
                arrival_2.setText("");
                arrival_3.setText("");            
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
         pane.add(message);
         pane.add(arrival);
         pane.add(departure);   
         pane.add(arr);  
         pane.add(depar);    
         pane.add(arrivallabel);        
         pane.add(arrival_1); 
         pane.add(arrivallabel_1);
         pane.add(arrival_2);
         pane.add(arrivallabel_2);
         pane.add(arrival_3);
         pane.add(search);
         pane.add(clear);
         pane.add(back);
         pane.add(exit);
         pane.add(copyright);
         setContentPane(pane); 
       } 


}
    

