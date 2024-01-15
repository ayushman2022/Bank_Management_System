package online.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdraw extends JFrame implements ActionListener {

    TextField textField;
    JButton b1,b2;

    String pin;

    withdraw(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("(MAXIMUM WITHDRAWL IS Rs.10,000)");
        label1.setFont(new Font("System",Font.BOLD,15));
        label1.setForeground(new Color(255,255,255));
        label1.setBounds(510,280,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setForeground(new Color(255,255,255));
        label2.setBounds(530,320,400,35);
        l3.add(label2);

        textField = new TextField();
        textField.setBounds(490,360,320,25);
        textField.setFont(new Font("Ralway",Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW CASH");
        b1.setBounds(660,447,180,28);
        b1.setFont(new Font("Ralway",Font.BOLD,15));
        b1.setBackground(new Color(197, 222, 212));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(660,478,180,28);
        b2.setFont(new Font("Ralway",Font.BOLD,15));
        b2.setBackground(new Color(197, 222, 212));
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Con c = new Con();
                    ResultSet resultSet = c.statement.executeQuery("select * from Bank where Pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    }

                    c.statement.executeUpdate("insert into Bank values('" + pin + "','" + date + "','withdraw', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");

                }



            } catch (Exception E) {

            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new main_class(pin);

        }

    }

    public static void main(String[] args) {
        new withdraw("");
    }
}
