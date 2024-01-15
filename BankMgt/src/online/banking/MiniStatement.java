package online.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {

    String pin;
    JButton button;

    MiniStatement(String pin){

        this.pin = pin;

        getContentPane().setBackground(new Color(255,255,255));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,200);
        add(label1);

        JLabel label2 = new JLabel("Ayushman's Bank");
        label2.setFont(new Font("System",Font.BOLD,18));
        label2.setBounds(110,20,200,25);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,410,300,20);
        add(label4);

        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from Login where Pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+ resultSet.getString("Card_no").substring(0,4) + "XXXXXXXX"+ resultSet.getString("Card_no").substring(12));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            int balance = 0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from Bank where Pin = '"+pin+"'");
            while (resultSet.next()){
                label1.setText(label1.getText() + "<html>" +resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +resultSet.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ resultSet.getString("amount")+"<br><br><br><html>");

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));

                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));

                }
            }

            label4.setText("Your Total Balance is Rs. "+balance);

        }catch (Exception e){
            e.printStackTrace();
        }
        button = new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
