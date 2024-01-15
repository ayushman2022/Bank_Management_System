package online.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    main_class(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l = new JLabel("PLEASE SELECT YOUR TRANSACTION");
        l.setFont(new Font("System",Font.BOLD,17));
        l.setForeground(Color.WHITE);
        l.setBounds(500,284,400,35);
        l3.add(l);

        b1 = new JButton("EXIT");
        b1.setBounds(660,478,180,28);
        b1.setFont(new Font("Ralway",Font.BOLD,15));
        b1.setBackground(new Color(197, 222, 212));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BALANCE ENQUIRY");
        b2.setBounds(660,447,180,28);
        b2.setFont(new Font("Ralway",Font.BOLD,15));
        b2.setBackground(new Color(197, 222, 212));
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("MINI STATEMENT");
        b3.setBounds(660,416,180,28);
        b3.setFont(new Font("Ralway",Font.BOLD,15));
        b3.setBackground(new Color(197, 222, 212));
        b3.setForeground(Color.BLACK);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("CASH WITHDRAW");
        b4.setBounds(660,386,180,28);
        b4.setFont(new Font("Ralway",Font.BOLD,15));
        b4.setBackground(new Color(197, 222, 212));
        b4.setForeground(Color.BLACK);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("DEPOSIT");
        b5.setBounds(450,386,180,28);
        b5.setFont(new Font("Ralway",Font.BOLD,15));
        b5.setBackground(new Color(197, 222, 212));
        b5.setForeground(Color.BLACK);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("FAST CASH");
        b6.setBounds(450,416,180,28);
        b6.setFont(new Font("Ralway",Font.BOLD,15));
        b6.setBackground(new Color(197, 222, 212));
        b6.setForeground(Color.BLACK);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("PIN CHANGE");
        b7.setBounds(450,447,180,28);
        b7.setFont(new Font("Ralway",Font.BOLD,15));
        b7.setBackground(new Color(197, 222, 212));
        b7.setForeground(Color.BLACK);
        b7.addActionListener(this);
        l3.add(b7);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b5){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b1) {
            System.exit(0);
        } else if (e.getSource() == b4) {
            new withdraw(pin);
            setVisible(false);

        } else if (e.getSource()==b2) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new FastCash(pin);
            setVisible(false);

        } else if (e.getSource()==b7) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new MiniStatement(pin);
            setVisible(false);

        }

    }

    public static void main(String[] args) {

        new main_class("");
    }
}
