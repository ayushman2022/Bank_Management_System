package online.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    FastCash(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l = new JLabel("SELECT WITHDRAWL AMOUNT");
        l.setFont(new Font("System",Font.BOLD,20));
        l.setForeground(Color.WHITE);
        l.setBounds(500,284,400,35);
        l3.add(l);

        b1 = new JButton("BACK");
        b1.setBounds(660,478,180,28);
        b1.setFont(new Font("Ralway",Font.BOLD,15));
        b1.setBackground(new Color(197, 222, 212));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("500");
        b2.setBounds(660,447,180,28);
        b2.setFont(new Font("Ralway",Font.BOLD,15));
        b2.setBackground(new Color(197, 222, 212));
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("1000");
        b3.setBounds(660,416,180,28);
        b3.setFont(new Font("Ralway",Font.BOLD,15));
        b3.setBackground(new Color(197, 222, 212));
        b3.setForeground(Color.BLACK);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("2000");
        b4.setBounds(660,386,180,28);
        b4.setFont(new Font("Ralway",Font.BOLD,15));
        b4.setBackground(new Color(197, 222, 212));
        b4.setForeground(Color.BLACK);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("5000");
        b5.setBounds(450,386,180,28);
        b5.setFont(new Font("Ralway",Font.BOLD,15));
        b5.setBackground(new Color(197, 222, 212));
        b5.setForeground(Color.BLACK);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("10000");
        b6.setBounds(450,416,180,28);
        b6.setFont(new Font("Ralway",Font.BOLD,15));
        b6.setBackground(new Color(197, 222, 212));
        b6.setForeground(Color.BLACK);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("100");
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
        if (e.getSource()==b1){
            setVisible(false);
            new main_class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText();
            Con c = new Con();
            Date date = new Date();
            try {
                ResultSet resultSet = c.statement.executeQuery("Select * from Bank where Pin = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));

                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));

                    }
                }

                if (e.getSource() != b1 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into Bank values('"+pin+"','"+date+"','withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null,""+amount+" Debited Successfully");

            }catch (Exception E){
                E.printStackTrace();
            }

            setVisible(false);
            new main_class(pin);
        }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
