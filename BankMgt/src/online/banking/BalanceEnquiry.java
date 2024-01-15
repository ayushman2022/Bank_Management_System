package online.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RectangularShape;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel label2;
    JButton b1;
    String pin;
    BalanceEnquiry(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Your Current Balance");
        label1.setFont(new Font("System",Font.BOLD,18));
        label1.setForeground(new Color(255,255,255));
        label1.setBounds(530,280,400,35);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setForeground(new Color(255,255,255));
        label2.setBounds(600,320,400,35);
        l3.add(label2);

        b1 = new JButton("BACK");
        b1.setBounds(660,447,180,28);
        b1.setFont(new Font("Ralway",Font.BOLD,15));
        b1.setBackground(new Color(197, 222, 212));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        int balance = 0;
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from Bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);

    }

    public static void main(String[] args) {
        new BalanceEnquiry("");

    }
}
