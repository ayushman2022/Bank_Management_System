package online.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    JButton b1,b2;
    TextField textField;
    JPasswordField p1,p2;
    String pin;

    Pin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System",Font.BOLD,20));
        label1.setForeground(new Color(255,255,255));
        label1.setBounds(550,270,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN: ");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setForeground(new Color(255,255,255));
        label2.setBounds(460,310,400,35);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBounds(460,340,210,30);
        p1.setFont(new Font("Ralway",Font.BOLD,22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re- Enter New PIN: ");
        label3.setFont(new Font("System",Font.BOLD,15));
        label3.setForeground(new Color(255,255,255));
        label3.setBounds(460,400,400,35);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBounds(460,430,210,30);
        p2.setFont(new Font("Ralway",Font.BOLD,22));
        l3.add(p2);





        b1 = new JButton("SUBMIT");
        b1.setBounds(700,447,150,28);
        b1.setFont(new Font("Ralway",Font.BOLD,15));
        b1.setBackground(new Color(197, 222, 212));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,478,150,28);
        b2.setFont(new Font("Ralway",Font.BOLD,15));
        b2.setBackground(new Color(197, 222, 212));
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        l3.add(b2);


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }

            if (e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Con c = new Con();
                String q1 = "update Bank set Pin = '"+pin1+"' where Pin = '"+pin2+"' ";
                String q2 = "update Login set Pin = '"+pin1+"' where Pin = '"+pin2+"' ";
                String q3 = "update Signup3 set Pin = '"+pin1+"' where Pin = '"+pin2+"' ";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);
                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new main_class(pin);
            } else if (e.getSource()==b2) {
                new main_class(pin);
                setVisible(false);

            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Pin("");
    }
}
