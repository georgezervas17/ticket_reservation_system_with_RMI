package client_rmi;

import java.awt.Color;
import static java.awt.Color.YELLOW;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Seats extends JFrame implements Serializable {

    //timer
    public String[] seats = {"true", "true", "true", "true", "true", "true", "false", "false", "false", "false", "true", "true", "true", "false", "false", "false", "false", "true", "true", "true", "true", "true", "true", "false", "false", "false", "false", "true", "true", "true", "true", "true", "true", "false", "false", "false", "false", "true", "true", "true"};
    public String[] temp = new String[seats.length];
    private JLabel seat_1_label;
    private JLabel seat_2_label;
    private JTextField seat1;
    private JTextField seat2;

    private JLabel available1;
    private JLabel available2;
    private JLabel available3;
    private JLabel available4;
    private JLabel[] available = new JLabel[100];

    public JButton book = new JButton("Book");
    public JButton clear = new JButton("Clear");
    public JButton back = new JButton("Back");
    public JButton exit = new JButton("Exit");

    int j = 2;
    int ii = 0;
    int p = 0;

    Seats() {

        setSize(900, 200 * j);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel[] row = new JPanel[5]; //DHMIOURGIA GRAMMWN STO PANEL 

        Container pane = getContentPane();

        GridLayout layout = new GridLayout(0, 1, 0, 0);  //n+1 GRAMMES ,7 STHLES ,15,0 TO KENO METAKSY TWN STHLWN
        GridLayout layout1 = new GridLayout(4, 2, 5, 0); //GIA THN STOIXHSH TOU KATHE GRID
        GridLayout layout2 = new GridLayout(1, 2, 1, 0);
        GridLayout layout3 = new GridLayout(0, 4, 1, 0);

        pane.setLayout(layout);

        if (ii == 0) {
            row[ii] = new JPanel();
            row[ii].setLayout(layout);
            row[ii].setBackground(Color.LIGHT_GRAY);
            row[ii].setFont(new Font("Segoe UI", Font.BOLD, 20));
            JLabel s2 = new JLabel("Available Seats", JLabel.CENTER);
            s2.setFont(new Font("Segoe UI", Font.BOLD, 20));
            row[ii].add(s2);
            pane.add(row[ii]);
            ii++;

        }

        if (ii == 1) {
            int num = 1;
            int num2 = 1;
            int m = 0;
            int position = 0;
            int temp1 = 0;

            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == "true") {
                    temp[temp1] = Integer.toString(i);
                    temp1++;

                }
            }

            for (int i = 0; i < seats.length; i = i + 4) {

                for (int j = 0; j < 4; j++) {
                    if (seats[num - 1].equals("true") && (position == 0 || position == 2)) {
                        available[j] = new JLabel(Integer.toString(num), JLabel.CENTER);
                        available[j].setBackground(Color.LIGHT_GRAY);
                        available[j].setForeground(Color.GREEN);
                        available[j].setFont(new Font("Segoe UI", Font.BOLD, 16));
                        num++;
                        position++;

                    } else if (seats[num - 1].equals("true") && position == 1) {
                        available[j] = new JLabel(Integer.toString(num), JLabel.LEFT);
                        available[j].setBackground(Color.LIGHT_GRAY);
                        available[j].setForeground(Color.GREEN);
                        available[j].setFont(new Font("Segoe UI", Font.BOLD, 16));
                        num++;
                        position++;

                    } else if (seats[num - 1].equals("true") && position == 3) {
                        available[j] = new JLabel(Integer.toString(num), JLabel.LEFT);
                        available[j].setBackground(Color.LIGHT_GRAY);
                        available[j].setForeground(Color.GREEN);
                        available[j].setFont(new Font("Segoe UI", Font.BOLD, 16));
                        num++;
                        position++;

                    } else if (seats[num - 1].equals("false") && (position == 0 || position == 2)) {
                        available[j] = new JLabel(Integer.toString(num), JLabel.CENTER);
                        available[j].setBackground(Color.LIGHT_GRAY);
                        available[j].setForeground(Color.RED);
                        available[j].setFont(new Font("Segoe UI", Font.BOLD, 16));
                        num++;
                        position++;

                    } else if (seats[num - 1].equals("false") && position == 1) {
                        available[j] = new JLabel(Integer.toString(num), JLabel.LEFT);
                        available[j].setBackground(Color.LIGHT_GRAY);
                        available[j].setForeground(Color.RED);
                        available[j].setFont(new Font("Segoe UI", Font.BOLD, 16));
                        num++;
                        position++;

                    } else if (seats[num - 1].equals("false") && position == 3) {
                        available[j] = new JLabel(Integer.toString(num), JLabel.LEFT);
                        available[j].setBackground(Color.LIGHT_GRAY);
                        available[j].setForeground(Color.RED);
                        available[j].setFont(new Font("Segoe UI", Font.BOLD, 16));
                        num++;

                    }
                }
                position = 0;
                row[ii] = new JPanel();
                row[ii].setLayout(layout3);
                row[ii].setBackground(Color.LIGHT_GRAY);
                row[ii].add(available[0]);
                row[ii].add(available[1]);
                row[ii].add(available[2]);
                row[ii].add(available[3]);

                pane.add(row[ii]);
            }

        }

        ii = ii + 1; //GIA NA EMFANISTOUN OI THESEIS.

        if (ii == 2) {
            row[ii] = new JPanel();
            row[ii].setLayout(layout2);
            row[ii].setBackground(Color.LIGHT_GRAY);
            JLabel s1 = new JLabel("Seat 1");
            s1.setFont(new Font("Segoe UI", Font.BOLD, 20));
            row[ii].add(s1);

            seat1 = new JTextField(2);
            seat1.setBackground(Color.LIGHT_GRAY);
            seat1.setCaretColor(Color.DARK_GRAY);
            seat1.setFont(new Font("Segoe UI", Font.BOLD, 20));
            row[ii].add(seat1);

            pane.add(row[ii]);
            p++;
        }

        ii = ii + 1;

        if (ii == 3) {
            row[ii] = new JPanel();
            row[ii].setLayout(layout2);
            row[ii].setBackground(Color.LIGHT_GRAY);
            JLabel s2 = new JLabel("Seat 2");
            s2.setFont(new Font("Segoe UI", Font.BOLD, 20));
            row[ii].add(s2);

            seat2 = new JTextField(2);
            seat2.setBackground(Color.LIGHT_GRAY);
            seat2.setCaretColor(Color.DARK_GRAY);
            seat2.setFont(new Font("Segoe UI", Font.BOLD, 20));
            row[ii].add(seat2);

            pane.add(row[ii]);
            p++;
        }

        ii = ii + 1;

        if (ii == 4) {
            row[ii] = new JPanel();
            row[ii].setLayout(layout2);
            row[ii].setBackground(Color.LIGHT_GRAY);
            row[ii].add(book);
            row[ii].add(clear);
            row[ii].add(back);
            row[ii].add(exit);

            book.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("mphke");
                    boolean flag1 = false, flag2 = false;

                    for (int i = 0; i < temp.length; i++) {
                        if (seat1.getText().equals(temp[i])) {
                            System.out.println("mphke1");
                            flag1 = true;
                        }
                        if (seat2.getText().equals(temp[i])) {
                            System.out.println("mphke2");
                            flag2 = true;
                        }
                        if(seat1.getText().equals(seat2.getText())){
                            flag1=false;
                            flag2=false;
                        }
                    }

                    if (flag1 == true && flag2 == true) {
                        dispose();
                        After_Seats s = new After_Seats();
                    } else if (flag1 == true && flag2 == false) {
                        JPanel panel = new JPanel();
                        JOptionPane.showMessageDialog(panel, "Choose again second seat,try again! Try again.", "Error!",
                                JOptionPane.INFORMATION_MESSAGE);
                        seat2.setText("");
                    } else if (flag1 == false && flag2 == true) {
                        JPanel panel = new JPanel();
                        JOptionPane.showMessageDialog(panel, "Choose again first seat,try again! Try again.", "Error!",
                                JOptionPane.INFORMATION_MESSAGE);
                        seat1.setText("");
                    } else if (flag1 == false && flag2 == false) {
                        JPanel panel = new JPanel();
                        JOptionPane.showMessageDialog(panel, "You have not choosen the right seat,try again! Try again.", "Error!",
                                JOptionPane.INFORMATION_MESSAGE);
                        seat1.setText("");
                        seat2.setText("");
                    }

                }
            });
            pane.add(row[ii]);

            clear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    seat1.setText("");
                    seat2.setText("");

                }
            });
            pane.add(row[ii]);

            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();
                    Menu menu = new Menu();
                }
            });
            pane.add(row[ii]);

            exit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();

                }
            });
            pane.add(row[ii]);

        }

        setVisible(true);
        setContentPane(pane);
        pack();

    }
}
