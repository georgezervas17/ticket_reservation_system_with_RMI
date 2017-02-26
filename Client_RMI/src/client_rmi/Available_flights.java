package client_rmi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Available_flights extends JFrame implements Serializable {
    
    
    //***************ΕΤΟΙΜΑ ΠΑΡΑΔΕΙΓΜΑΤΑ*******************
    public String[] id = {"1", "3"};  //new String[1000];
    public String[] arrival = {"Ioannina", "Ioannina"};// new String[1000];
    public String[] departure = {"Athina", "Athina"}; //new String[1000];
    public String[] a1 = {"1", "3"};  //new String[1000];
    public String[] a2 = {"1", "4"}; // new String[1000];
    public String[] a3 = {"1", "1"}; //new String[1000];
    public String[] time = {"12:05", "19:00"}; //new String[1000];
    public String[] seat = {"35", "37"}; //new String[1000];
    
    
    //*********************ΒΓΑΛΤΑ ΑΠΟ ΤΑ ΣΧΟΛΙΑ ΤΟΥΣ ΠΑΡΑΚΑΤΩ ΠΙΝΑΚΕΣ.**********************
    /*
    public String[] id = new String[1000]; 
    public String[] departure = new String[1000];
    public String[] arrival = new String[1000];
    public String[] time= new String[1000];
    public String[] a1= new String[1000];
    public String[] a2= new String[1000];
    public String[] a3= new String[1000];
    public String[] seat= new String[1000] ;*/

    public JButton button = new JButton("Back to Menu");
    public JButton button_1 = new JButton("Seats");

    JLabel name, surname, tele, ar1, ar2, ar3, time_label, id_label, seat_label;

    int ii = 0;
    int ξ = 2;
    int p = 0;
    int number_of_flights=2;
    //Object MyObject m;

    Available_flights() {
        
        
        /*αρχικοποιησε τους 8 πινακες που εστειλες αποτ την check_flights και μετα θα τρεξουν ολα. επισης μην ξεχασεις να σβησεις του ετοιμους
        πινακες που εχω κανει,να αρχικοποιησεις.το number_of_flights και να βγαλεις απο τα σχολια τους κενους.ΔΕΣ ΠΑΡΑΠΑΝΩ ΕΧΩ ΓΡΑΨΕΙ ΠΟΙΟΥΣ ΝΑ ΒΑΛΕΙΣ ΣΕ ΣΧΟΛΙΑ,
        
        ΜΗΝ ΞΕΧΑΣΕΙΣ...........ΒΑΛΕ ΙΔΙΑ ΟΝΟΜΑΤΑ ΣΤΟΥΣ ΠΙΝΑΚΕΣ
        
        */
        
        setSize(900, 200 * number_of_flights);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel[] row = new JPanel[6 + 1]; //DHMIOURGIA GRAMMWN STO PANEL 
        Container pane = getContentPane();
        GridLayout layout = new GridLayout(9, 7, 10, 0);  //n+1 GRAMMES ,7 STHLES ,15,0 TO KENO METAKSY TWN STHLWN
        GridLayout layout1 = new GridLayout(1, 6,20,0); //GIA THN STOIXHSH TOU KATHE GRID
        pane.setLayout(layout);

        if (ii == 0) {
            row[ii] = new JPanel();
            row[ii].setLayout(layout1);
            row[ii].setBackground(Color.LIGHT_GRAY);
            row[ii].add(new JLabel("Flight ID:"));
            row[ii].add(new JLabel("Departure:"));
            row[ii].add(new JLabel("Arrival:"));
            row[ii].add(new JLabel("Time:"));
            row[ii].add(new JLabel("Date:"));
            row[ii].add(new JLabel("Seats:"));
            pane.add(row[ii]);
            p++;
        }

        for (int i = 0; i < number_of_flights; i++) {
            row[i + 1] = new JPanel();
            row[i + 1].setLayout(layout1);

            id_label = new JLabel(id[i]);
            id_label.setFont(new Font("Segoe UI", Font.BOLD, 20));
            id_label.setForeground(Color.black);
            id_label.setBounds(30, 170, 120, 30);

            time_label = new JLabel(time[i]);
            time_label.setFont(new Font("Segoe UI", Font.BOLD, 20));
            time_label.setForeground(Color.yellow);
            time_label.setBounds(30, 170, 120, 30);

            seat_label = new JLabel(seat[i]);
            seat_label.setFont(new Font("Segoe UI", Font.BOLD, 20));
            seat_label.setBounds(30, 170, 120, 30);

            row[i + 1].setBackground(Color.LIGHT_GRAY);
            row[i + 1].add(id_label);
            row[i + 1].add(new JLabel(departure[i]));
            row[i + 1].add(new JLabel(arrival[i]));
            row[i + 1].add(time_label);
            row[i + 1].add(new JLabel(a1[i] + "/" + a2[i] + "/" + a3[i]));
            row[i + 1].add(seat_label);  //ARITHMOS DIATHESIWN THESEWN GIA KATHE DROMOLOGIO
            pane.add(row[i + 1]);
            p++;
        }

        row[p + 1] = new JPanel();
        row[p + 1].setLayout(layout1);
        row[p + 1].setBackground(Color.LIGHT_GRAY);
        row[p + 1].add(button);

        //ACTIONLISTENER GIA TO BUTTON EPISTROFHS STO MENU.
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu();
            }
        });

        pane.add(row[p + 1]);

        //STOIXEIA PARATHUROU KAI EMFANISH AUTOU.
        setVisible(true);
        setContentPane(pane);
        pack();

    }

}
