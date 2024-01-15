package online.banking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JRadioButton m1,m2,m3,m4;
    JButton Next;
    JTextField textName1,textName2;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    String formno;

    Signup2(String formno){
        setTitle("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        image.setBounds(170,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Ralway",Font.BOLD,25));
        l1.setBounds(300,40,600,40);
        add(l1);

        JLabel l2 = new JLabel("Religion:");
        l2.setFont(new Font("Ralway",Font.BOLD,20));
        l2.setBounds(110,130,100,30);
        add(l2);
        //DropDown Creation through combobox
        String religion[] = {"Hindu", "Muslim","Sikh","Christian","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(255,255,255));
        comboBox.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox.setBounds(360,130,360,22);
        add(comboBox);

        JLabel l3 = new JLabel("Category:");
        l3.setFont(new Font("Ralway",Font.BOLD,20));
        l3.setBounds(110,180,100,30);
        add(l3);
        String category[] = {"General", "OBC","SC","ST","Others"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(255,255,255));
        comboBox2.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox2.setBounds(360,180,360,22);
        add(comboBox2);

        JLabel l4 = new JLabel("Income:");
        l4.setFont(new Font("Ralway",Font.BOLD,20));
        l4.setBounds(110,230,100,30);
        add(l4);
        String income[] = {"Null", "<100000 - 300000","300000 - 500000","500000<"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(255,255,255));
        comboBox3.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox3.setBounds(360,230,360,22);
        add(comboBox3);

        JLabel l5 = new JLabel("Education:");
        l5.setFont(new Font("Ralway",Font.BOLD,20));
        l5.setBounds(110,280,200,30);
        add(l5);
        String edu[] = {"Non-Graduate", "Graduate","Post-Graduate","Other"};
        comboBox4 = new JComboBox(edu);
        comboBox4.setBackground(new Color(255,255,255));
        comboBox4.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox4.setBounds(360,280,360,22);
        add(comboBox4);

        JLabel l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Ralway",Font.BOLD,20));
        l6.setBounds(110,330,200,30);
        add(l6);
        String occ[] = {"Salaried", "Unemployed","Business","Other"};
        comboBox5 = new JComboBox(occ);
        comboBox5.setBackground(new Color(255,255,255));
        comboBox5.setFont(new Font("Ralway",Font.BOLD,18));
        comboBox5.setBounds(360,330,360,22);
        add(comboBox5);

        JLabel l7 = new JLabel("PAN Number:");
        l7.setFont(new Font("Ralway",Font.BOLD,20));
        l7.setBounds(110,380,200,30);
        add(l7);
        textName1 = new JTextField();
        textName1.setFont(new Font("Ralway",Font.BOLD,14));
        textName1.setBounds(360,380,360,30);
        add(textName1);

        JLabel l8 = new JLabel("Aadhar/VID Number:");
        l8.setFont(new Font("Ralway",Font.BOLD,20));
        l8.setBounds(110,430,250,30);
        add(l8);
        textName2 = new JTextField();
        textName2.setFont(new Font("Ralway",Font.BOLD,14));
        textName2.setBounds(360,430,360,30);
        add(textName2);

        JLabel l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Ralway",Font.BOLD,20));
        l9.setBounds(110,480,250,30);
        add(l9);
        m1 = new JRadioButton("Yes");
        m1.setFont(new Font("Ralway",Font.BOLD,14));
        m1.setBackground(new Color(255, 255, 255));
        m1.setBounds(360,480,80,30);
        add(m1);

        m2 = new JRadioButton("No");
        m2.setFont(new Font("Ralway",Font.BOLD,14));
        m2.setBackground(new Color(255, 255, 255));
        m2.setBounds(450,480,80,30);
        add(m2);

        ButtonGroup gp = new ButtonGroup();
        gp.add(m1);
        gp.add(m2);

        JLabel l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Ralway",Font.BOLD,20));
        l10.setBounds(110,530,250,30);
        add(l10);
        m3 = new JRadioButton("Yes");
        m3.setFont(new Font("Ralway",Font.BOLD,14));
        m3.setBackground(new Color(255, 255, 255));
        m3.setBounds(360,530,80,30);
        add(m3);
        m4 = new JRadioButton("No");
        m4.setFont(new Font("Ralway",Font.BOLD,14));
        m4.setBackground(new Color(255, 255, 255));
        m4.setBounds(450,530,80,30);
        add(m4);

        ButtonGroup gp2 = new ButtonGroup();
        gp2.add(m3);
        gp2.add(m4);

        Next = new JButton("Next");
        Next.setFont(new Font("Ralway",Font.BOLD,14));
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.setBounds(638,640,80,30);
        Next.addActionListener(this);
        add(Next);

        JLabel l12 = new JLabel("Form No:  ");
        l12.setFont(new Font("Ralway",Font.BOLD,15));
        l12.setBounds(700,10,200,20);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Ralway",Font.BOLD,14));
        l13.setBounds(775,10,60,20);
        add(l13);


        setLayout(null);
        setSize(880,770);
        setLocation(360,40);
        getContentPane().setBackground(new Color(255, 255, 255));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = textName1.getText();
        String aadr = textName2.getText();

        String scitizen = null;
        if ((m1.isSelected())){
            scitizen = "Yes";
        } else if (m2.isSelected()) {
            scitizen = "No";
        }

        String eacc = null;
        if ((m3.isSelected())){
            eacc = "Yes";
        } else if (m4.isSelected()) {
            eacc = "No";
        }

        try{
            if (textName1.getText().equals("") || textName2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all fields");
            }else {
                Con con1 = new Con();
                String q = "Insert into signup2 values('" + formno + "','" + rel + "','" + cat + "','" + income + "','" + edu + "','" + occ + "','" + pan + "','" + aadr + "','" + scitizen + "','" + eacc + "')";
                con1.statement.executeUpdate(q);                //executeUpdate used to insert values into the table
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Signup2(null);
    }
}
