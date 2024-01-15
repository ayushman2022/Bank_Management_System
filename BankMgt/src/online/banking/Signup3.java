package online.banking;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JButton s,c;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String formno;


    Signup3( String formno){

        this.formno = formno;

        setTitle("Account Details");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        image.setBounds(170,5,100,100);
        add(image);



        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Ralway",Font.BOLD,25));
        l1.setBounds(300,40,600,40);
        add(l1);

        JLabel l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Ralway",Font.BOLD,20));
        l2.setBounds(110,130,200,30);
        add(l2);
        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(255,255,255));
        r1.setBounds(110,170,200,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(255,255,255));
        r2.setBounds(380,170,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        r3.setBackground(new Color(255,255,255));
        r3.setBounds(110,210,200,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        r4.setBackground(new Color(255,255,255));
        r4.setBounds(380,210,300,30);
        add(r4);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        JLabel l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Ralway",Font.BOLD,20));
        l3.setBounds(110,260,200,30);
        add(l3);
        JLabel l4 = new JLabel("(Your 16-digit Card Number)");
        l4.setFont(new Font("Ralway",Font.BOLD,12));
        l4.setBounds(110,290,200,20);
        add(l4);

        JLabel l5 = new JLabel("XXXX-XXXX-XXXX-4841");
        l5.setFont(new Font("Ralway",Font.BOLD,20));
        l5.setBounds(380,260,250,30);
        add(l5);
        JLabel l6 = new JLabel("(It can be seen on ATM Card or Bank statement)");
        l6.setFont(new Font("Ralway",Font.BOLD,12));
        l6.setBounds(380,290,300,20);
        add(l6);

        JLabel l7 = new JLabel("PIN:");
        l7.setFont(new Font("Ralway",Font.BOLD,20));
        l7.setBounds(110,330,100,30);
        add(l7);
        JLabel l8 = new JLabel("(4-digit pin)");
        l8.setFont(new Font("Ralway",Font.BOLD,12));
        l8.setBounds(110,360,100,20);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Ralway",Font.BOLD,20));
        l9.setBounds(380,330,100,30);
        add(l9);

        JLabel l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Ralway",Font.BOLD,20));
        l10.setBounds(110,400,200,30);
        add(l10);

        c1 = new JCheckBox(" ATM Card");
        c1.setFont(new Font("Ralway",Font.BOLD,18));
        c1.setBackground(new Color(255,255,255));
        c1.setBounds(110,450,200,20);
        add(c1);

        c2 = new JCheckBox(" Internet Banking");
        c2.setFont(new Font("Ralway",Font.BOLD,18));
        c2.setBackground(new Color(255,255,255));
        c2.setBounds(380,450,200,20);
        add(c2);

        c3 = new JCheckBox(" UPI");
        c3.setFont(new Font("Ralway",Font.BOLD,18));
        c3.setBackground(new Color(255,255,255));
        c3.setBounds(110,500,200,20);
        add(c3);

        c4 = new JCheckBox(" Email Alerts");
        c4.setFont(new Font("Ralway",Font.BOLD,18));
        c4.setBackground(new Color(255,255,255));
        c4.setBounds(380,500,200,20);
        add(c4);

        c5 = new JCheckBox(" Cheque Book");
        c5.setFont(new Font("Ralway",Font.BOLD,18));
        c5.setBackground(new Color(255,255,255));
        c5.setBounds(110,550,200,20);
        add(c5);

        c6 = new JCheckBox(" E-Statement");
        c6.setFont(new Font("Ralway",Font.BOLD,18));
        c6.setBackground(new Color(255,255,255));
        c6.setBounds(380,550,200,20);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declared that the above details are correct to the best of my knowledge.",true);
        c7.setFont(new Font("Ralway",Font.BOLD,12));
        c7.setBackground(new Color(255,255,255));
        c7.setBounds(150,600,1000,20);
        add(c7);

        s = new JButton("Submit");
        s.setFont(new Font("Ralway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(260,660,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Ralway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(450,660,100,30);
        c.addActionListener(this);
        add(c);

        JLabel l12 = new JLabel("Form No:  ");
        l12.setFont(new Font("Ralway",Font.BOLD,15));
        l12.setBounds(700,10,200,20);
        add(l12);
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Ralway",Font.BOLD,14));
        l13.setBounds(775,10,60,20);
        add(l13);



        setLayout(null);
        setSize(900,770);
        setLocation(360,40);
        getContentPane().setBackground(new Color(255, 255, 255));
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Savings Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);


        String fac = "";
        if (c1.isSelected()){
            fac = fac + "ATM Card";
        } else if (c2.isSelected()) {
            fac = fac + "Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac + "UPI";
        } else if (c4.isSelected()) {
            fac = fac + "Email Alerts";
        } else if (c5.isSelected()) {
            fac = fac + "Cheque Book";
        } else if (c6.isSelected()) {
            fac = fac + "E-Statement";
        }

        try {
            if (e.getSource()==s){
                if (atype.equals(null)){
                    JOptionPane.showMessageDialog(null,"Fill all fields");
                }else {
                    Con con1 = new Con();
                    String q1 = "Insert into signup3 values('" + formno + "','" + atype + "','" + cardno + "','" + pin + "','" + fac + "')";
                    String q2 = "Insert into Login values('" + formno + "','" + cardno + "','" + pin + "')";
                    con1.statement.executeUpdate(q1);
                    con1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);

                }
            }
            else if (e.getSource()==c) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Signup3(null);

    }
}
