package online.banking;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4,r5;
    JButton next;

    JTextField textName,textFName,textEmail,textaddress,textCity,textPincode,textState;
    JDateChooser datechooser;
    Random random = new Random();
    long four = (random.nextLong() % 9000L) +1000L;
    String first = "" + Math.abs(four);
    Signup(){
        setTitle("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway", Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1: ");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(310,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(400,70,600,30);
        add(label3);

        // Adding details
        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(110,130,100,30);
        add(labelName);
        textName = new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(310,130,420,30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name:");
        labelFName.setFont(new Font("Ralway",Font.BOLD,20));
        labelFName.setBounds(110,180,200,30);
        add(labelFName);
        textFName = new JTextField();
        textFName.setFont(new Font("Ralway",Font.BOLD,14));
        textFName.setBounds(310,180,420,30);
        add(textFName);

        JLabel labelDOB = new JLabel("Date of Birth:");
        labelDOB.setFont(new Font("Ralway",Font.BOLD,20));
        labelDOB.setBounds(110,230,200,30);
        add(labelDOB);
        datechooser = new JDateChooser();
        datechooser.setForeground(new Color(255, 255, 255));
        datechooser.setBounds(310,230,420,30);
        add(datechooser);

        JLabel labelgender = new JLabel("Gender:");
        labelgender.setFont(new Font("Ralway",Font.BOLD,20));
        labelgender.setBounds(110,280,200,30);
        add(labelgender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(255, 255, 255));
        r1.setBounds(330,285,80,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(255, 255, 255));
        r2.setBounds(460,285,80,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        r3.setBackground(new Color(255, 255, 255));
        r3.setBounds(580,285,80,30);
        add(r3);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        JLabel labelemail = new JLabel("Email Address:");
        labelemail.setFont(new Font("Ralway",Font.BOLD,20));
        labelemail.setBounds(110,330,200,30);
        add(labelemail);
        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textEmail.setBounds(310,330,420,30);
        add(textEmail);

        JLabel labelstatus = new JLabel("Marital Status:");
        labelstatus.setFont(new Font("Ralway",Font.BOLD,20));
        labelstatus.setBounds(110,380,200,30);
        add(labelstatus);
        r4 = new JRadioButton("Married");
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        r4.setBackground(new Color(255, 255, 255));
        r4.setBounds(330,380,80,30);
        add(r4);
        r5 = new JRadioButton("Unmarried");
        r5.setFont(new Font("Ralway",Font.BOLD,14));
        r5.setBackground(new Color(255, 255, 255));
        r5.setBounds(460,380,100,30);
        add(r5);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(r4);
        group2.add(r5);

        JLabel labeladdress = new JLabel("Address:");
        labeladdress.setFont(new Font("Ralway",Font.BOLD,20));
        labeladdress.setBounds(110,430,200,30);
        add(labeladdress);
        textaddress = new JTextField();
        textaddress.setFont(new Font("Ralway",Font.BOLD,14));
        textaddress.setBounds(310,430,420,30);
        add(textaddress);

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Ralway",Font.BOLD,20));
        labelCity.setBounds(110,480,200,30);
        add(labelCity);
        textCity = new JTextField();
        textCity.setFont(new Font("Ralway",Font.BOLD,14));
        textCity.setBounds(310,480,420,30);
        add(textCity);

        JLabel labelaPincode = new JLabel("Pincode:");
        labelaPincode.setFont(new Font("Ralway",Font.BOLD,20));
        labelaPincode.setBounds(110,530,200,30);
        add(labelaPincode);
        textPincode = new JTextField();
        textPincode.setFont(new Font("Ralway",Font.BOLD,14));
        textPincode.setBounds(310,530,420,30);
        add(textPincode);

        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Ralway",Font.BOLD,20));
        labelState.setBounds(110,580,200,30);
        add(labelState);
        textState = new JTextField();
        textState.setFont(new Font("Ralway",Font.BOLD,14));
        textState.setBounds(310,580,420,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(650,640,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(255, 255, 255));
        setLayout(null);
        setSize(880,770);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";

        } else if (r3.isSelected()) {
            gender = "Other";

        }

        String email = textEmail.getText();
        String marital = null;
        if (r4.isSelected()){
            marital = "Married";
        }else{
            marital = "Unmarried";
        }

        String address = textaddress.getText();
        String city = textCity.getText();
        String pin = textPincode.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Fill all Fields");
            }else {
                Con con1 = new Con();
                String q = "Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();

    }
}
