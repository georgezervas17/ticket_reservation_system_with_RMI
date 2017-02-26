
package client_rmi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Booking extends JFrame implements Serializable {
    private JLabel flight_id_label;     
    private JTextField flight_id;  
    
    private JLabel message;
    private JLabel copyright;
    
    private JButton book;  
    private JButton clear; 
    private JButton back;
    private JButton exit;
    
    public Booking(){     //DHMIOURGIA CONSTRUCTOR.    
        
        
        //DHLWSH TWN STOIXEIWN TOU PARATHUROU.
        super("Booking Form");         
        setSize(750,300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        setVisible(true); 
        setBackground(Color.YELLOW);

        message = new JLabel("Fill the Flight ID:");      
        message.setForeground(Color.ORANGE);
        message.setFont(new Font("Segoe UI", Font.BOLD, 30));         
        message.setBounds(160, 20, 400, 45);  
        

        flight_id_label = new JLabel("Flight ID:");         
        flight_id_label.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        flight_id_label.setBounds(120, 100, 200, 30);  
        
        flight_id = new JTextField(20); 
        flight_id.setBackground(Color.LIGHT_GRAY); 
        flight_id.setFont(new Font("Segoe UI", Font.BOLD, 16)); 
        flight_id.setBounds(220, 100, 200, 30); 
        
        
        book = new JButton("Book Flight"); 
        book.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        book.setBounds(50, 180, 150, 30);  
         //ACTIONLISTENER
        book.addActionListener(new ActionListener () 
        {
            public void actionPerformed(ActionEvent e )
            {
                dispose();
             Seats s = new Seats();  
                        
            }
        });
        
        clear = new JButton("Clear All"); 
        clear.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        clear.setBounds(220, 180, 150, 30);  
         //ACTIONLISTENER
        clear.addActionListener(new ActionListener () 
        {
            public void actionPerformed(ActionEvent e )
            {
                flight_id.setText("");
                        
            }
        });
        
        //BUTTON BACK.
        back = new JButton("Back");
        back.setFont(new Font("Segoe UI", Font.BOLD, 20));         
        back.setBounds(390, 180, 150, 30); 
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
        exit.setBounds(560, 180, 150, 30); 
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
        copyright.setBounds(280, 220, 120, 30);

        
        
        Container pane=getContentPane(); 
        
         pane.setLayout(null); 
         pane.add(message);
         pane.add(flight_id_label);
         pane.add(flight_id);   
         pane.add(book);
         pane.add(clear);
         pane.add(back);
         pane.add(exit);
         pane.add(copyright);
         setContentPane(pane); 
       } 
        
        
        
        
        
    }
    
