
package client_rmi;


/* GEORGIOS ZERVAS
    ICSD 13055 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.io.Serializable;
import javax.swing.*;

public class Menu extends JFrame implements Serializable {

    private JButton check; //DHLWSH BUTTON GIA THN EFARMOGH 
    private JButton booking;
    private JButton show;
    private JButton search;
    private JButton exit;
    private JLabel copyright;
    private String user;

    public Menu() { //CONSTRUCTOR

        super("Main Menu"); //DHLWSH TOU ONOMATOS TOU PARATHUROU        
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        check = new JButton("Check the Availability");  //1o BUTTON 'NEW RESERVATION'
        check.setFont(new Font("Segoe UI", Font.BOLD, 15));
        check.setBounds(220, 70, 200, 30);
        //ACTIONLISTENER GIA THN DIAXEIRHSH TOU KOUMPIOU.
        check.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) //OTAN KLIKARW STO BUTTON TI GINETAI...
            {
               //GIA NA KLEISEI TO PARATHURO PRIN EMFANISTEI KAPOIO NEO
               dispose();
               Check_Flights chk = new Check_Flights();
            }
        });

        booking = new JButton("Book a seat");  //1o BUTTON 'NEW RESERVATION'
        booking.setFont(new Font("Segoe UI", Font.BOLD, 15));
        booking.setBounds(220, 120, 200, 30);
        //ACTIONLISTENER GIA THN DIAXEIRHSH TOU KOUMPIOU.
        booking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) //OTAN KLIKARW STO BUTTON TI GINETAI...
            {
                dispose(); //GIA NA KLEISEI TO PARATHURO PRIN EMFANISTEI KAPOIO NEO
                Booking book = new Booking(); //DHMIOURGIA ANTIKEIMENOU GIA THN EMFANISH THS FORMAS WSTE NA SUMPLHRWTHOUN 
                // TA STOIXEIA TOU PELATH.
            }
        });

        show = new JButton("Show Booking Details");  //2o BUTTON 'EMFANISH TWN PELATWN'.
        show.setFont(new Font("Segoe UI", Font.BOLD, 15));
        show.setBounds(220, 170, 200, 30);
        //ACTIONLISTENER GIA THN DIAXEIRHSH TOU KOUMPIOU.
        show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)//OTAN KLIKARW STO BUTTON TI GINETAI...
            {
                dispose();
                Show s = new Show();
            }
        });
        
        exit = new JButton("Exit"); //3o BUTTON 'EXIT'.
        exit.setFont(new Font("Segoe UI", Font.BOLD, 20));
        exit.setBounds(220, 220, 200, 30);
        //ACTIONLISTENER GIA THN DIAXEIRHSH TOU KOUMPIOU.
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) //OTAN KLIKARW STO BUTTON TI GINETAI...
            {
                dispose(); //GIA NA KLEISEI TO PARATHURO.
                
            }
        });
        copyright = new JLabel("@Copyright 2015-2016", JLabel.RIGHT);
        copyright.setFont(new Font("Segoe UI", Font.BOLD, 12));
        copyright.setBounds(220, 370, 160, 30);
        //SUNTHESH TOU PARATHUROU.
        Container pane = getContentPane();

        pane.setLayout(null);
        pane.add(check);
        pane.add(booking);
        pane.add(show);
        pane.add(exit);
        pane.add(copyright);
        setContentPane(pane);
    }
}
