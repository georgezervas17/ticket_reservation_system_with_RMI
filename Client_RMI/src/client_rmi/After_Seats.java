package client_rmi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class After_Seats extends JFrame implements Serializable {

    public JLabel name_label;
    public JLabel surname_label;
    public JLabel id;
    private JLabel message;

    private JTextField name;
    private JTextField surname;
    private JTextField personal_id;

    private JButton complete;
    private JButton cancel;
    private JButton clear;
    private JButton back;
    private JButton exit;

    private JLabel copyright;

    public After_Seats() {
        super("Person Details");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.YELLOW);

        message = new JLabel("Fill the Gaps, with your personal information", JLabel.CENTER);
        message.setForeground(Color.ORANGE);
        message.setFont(new Font("Segoe UI", Font.BOLD, 27));
        message.setBounds(60, 30, 600, 50);

        name_label = new JLabel("Name", JLabel.CENTER);
        name_label.setFont(new Font("Segoe UI", Font.BOLD, 20));
        name_label.setBounds(30, 120, 120, 30);
        name = new JTextField(20);
        name.setBackground(Color.LIGHT_GRAY);
        name.setFont(new Font("Segoe UI", Font.BOLD, 16));
        name.setBounds(220, 120, 200, 30);

        surname_label = new JLabel("Surname", JLabel.CENTER);
        surname_label.setFont(new Font("Segoe UI", Font.BOLD, 20));
        surname_label.setBounds(30, 170, 120, 30);
        surname = new JTextField(20);
        surname.setBackground(Color.LIGHT_GRAY);
        surname.setFont(new Font("Segoe UI", Font.BOLD, 16));
        surname.setBounds(220, 170, 200, 30);

        id = new JLabel("Personal ID", JLabel.CENTER);
        id.setFont(new Font("Segoe UI", Font.BOLD, 20));
        id.setBounds(30, 220, 120, 30);

        personal_id = new JTextField(20);
        personal_id.setScrollOffset(10);
        personal_id.setBackground(Color.LIGHT_GRAY);
        personal_id.setFont(new Font("Segoe UI", Font.BOLD, 16));
        personal_id.setBounds(220, 220, 200, 30);

        complete = new JButton("Complete");
        complete.setFont(new Font("Segoe UI", Font.BOLD, 20));
        complete.setBounds(20, 270, 150, 30);
        //ACTIONLISTENER
        complete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //PAIRNOUME TA STOIXEIA GIA THN HMEROMHNIA KAI TON PROORISMO ANAXWRHSHS KAI AFIKSHS.
                String n = name.getText();
                String s = surname.getText();
                String f = personal_id.getText();

                if (!n.equals("") && !s.equals("") && !f.equals("")) {
                    dispose();

                    //APOSTOLH ANTIKEIMENOU STON SERVER ME TA STOIXEIA POU PHRE APO TON XRHSTH.
                    //KALOUME THN SUNARTHSH DETAILS GIA NA DOUME TA STOIXEIA.
                } else {
                    JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel, "One or more fields are empty! Try again.", "Error!",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                //APOSTOLH ANTIKEIMENOU STON SERVER ME TA STOIXEIA POU PHRE APO TON XRHSTH.
            }
        });

        clear = new JButton("Clear All");
        clear.setFont(new Font("Segoe UI", Font.BOLD, 20));
        clear.setBounds(160, 270, 150, 30);
        //ACTIONLISTENER
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                surname.setText("");
                personal_id.setText("");
            }
        });

        //BUTTON BACK.
        back = new JButton("Back");
        back.setFont(new Font("Segoe UI", Font.BOLD, 20));
        back.setBounds(300, 270, 150, 30);
        //ACTIONLISTENER
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu m = new Menu();
            }
        });

        //BUTTON EXIT.
        exit = new JButton("Exit");
        exit.setFont(new Font("Segoe UI", Font.BOLD, 20));
        exit.setBounds(440, 270, 150, 30);
        //ACTIONLISTENER
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        cancel = new JButton("Exit");
        cancel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        cancel.setBounds(440, 270, 150, 30);
        //ACTIONLISTENER
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        copyright = new JLabel("@Copyright 2015-2016", JLabel.RIGHT);
        copyright.setFont(new Font("Segoe UI", Font.BOLD, 10));
        copyright.setBounds(280, 420, 120, 30);

        Container pane = getContentPane();

        pane.setLayout(null);
        pane.add(name_label);
        pane.add(message);
        pane.add(surname_label);
        pane.add(id);
        pane.add(name);
        pane.add(surname);
        pane.add(personal_id);
        pane.add(complete);
        pane.add(clear);
        pane.add(back);
        pane.add(exit);
        pane.add(copyright);
        setContentPane(pane);
    }
}
