package client_rmi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Booking_Details extends JFrame {

    public String[] id = {"1","2"}; //new String[1000];
    public String[] arrival = {"Ioannina","Mykonos"};// new String[1000];
    public String[] departure = {"Athina","Thessaloniki"}; //new String[1000];
    public String[] day = {"1","3"};  //new String[1000];
    public String[] month = {"1","4"}; // new String[1000];
    public String[] year =  {"1","1"}; //new String[1000];
    public String[] time = {"12:05","19:00"}; //new String[1000];

    public JButton button = new JButton("Back to Menu");

    int j = 2;
    int ii = 0;
    int p = 1;

    Booking_Details() {

        super("Details");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel[] row = new JPanel[5]; //DHMIOURGIA GRAMMWN STO PANEL 
        Container pane = getContentPane();
        GridLayout layout = new GridLayout(1*j+2, 5,0, 5);  //n+1 GRAMMES ,7 STHLES ,15,0 TO KENO METAKSY TWN GRAMMWN
        GridLayout layout1 = new GridLayout(1,5); //GIA THN STOIXHSH TOU KATHE GRID
        pane.setLayout(layout);

        if (ii == 0) {
            row[ii] = new JPanel();
            row[ii].setLayout(layout1);
            row[ii].setBackground(Color.LIGHT_GRAY);
            row[ii].setFont(new Font("Segoe UI", Font.BOLD, 35));
            row[ii].add(new JLabel("Flight ID"));
            row[ii].add(new JLabel("Arrival"));
            row[ii].add(new JLabel("Departure"));
            row[ii].add(new JLabel("Date"));
            row[ii].add(new JLabel("Time"));
            pane.add(row[ii]);
        }

        for (int i = 0; i < 2; i++) {

            row[p] = new JPanel();
            row[p].setLayout(layout1);
            row[p].setBackground(Color.LIGHT_GRAY);
            row[p].add(new JLabel(id[i]));
            row[p].add(new JLabel(arrival[i]));
            row[p].add(new JLabel(departure[i]));
            row[p].add(new JLabel(day[i] + "/" + month[i] + "/" + year[i]));
            row[p].add(new JLabel(time[i]));
            pane.add(row[p]);
            p++;
        }
         p=p+1;
         row[p] = new JPanel();
         row[p].setLayout(layout1);
         row[p].setBackground(Color.LIGHT_GRAY);
         row[p].add( button);

        //ACTIONLISTENER GIA TO BUTTON EPISTROFHS STO MENU.
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu();
            }
        });
        

        pane.add(row[p]);
        
        setVisible(true);
        setContentPane(pane);
        pack();
    }

}
