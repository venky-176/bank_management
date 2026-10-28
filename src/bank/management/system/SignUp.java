package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JTextField jtext,jtextF,jtextE, jtextA, jtextC, jtextS,jtextP;

    JButton next;

    JRadioButton r1,r2,m1,m2,m3;

    JDateChooser dateChooser;

    Random rand= new Random();
    long first4=(rand.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);


    SignUp(){
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));// to load the image
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);// used Image for scaling the image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);// to add the image in frame
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1= new JLabel("APPLICATION FORM NO:"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290,100,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,38));
        add(label3);

        JLabel labelName= new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        jtext= new JTextField();
        jtext.setFont(new Font("Raleway",Font.BOLD,14));
        jtext.setBounds(300,190,400,30);
        add(jtext);

        JLabel FlabelName = new JLabel("Father Name:");
        FlabelName.setFont(new Font("Raleway",Font.BOLD,20));
        FlabelName.setBounds(100,240,150,30);
        add(FlabelName);

        jtextF= new JTextField();
        jtextF.setFont(new Font("Raleway",Font.BOLD,14));
        jtextF.setBounds(300,240,400,30);
        add(jtextF);

        JLabel DOB = new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser= new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,100,30);
        add(labelG);

        r1= new JRadioButton("Male");
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        r1.setBounds(300,290,100,30);
        add(r1);

        r2= new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBounds(400,290,130,30);
        add(r2);

        ButtonGroup bgrp= new ButtonGroup();
        bgrp.add(r1);
        bgrp.add(r2);

        JLabel jmail= new JLabel("Email:");
        jmail.setFont(new Font("raleway",Font.BOLD,20));
        jmail.setBounds(100,390,400,30);
        add(jmail);

        jtextE= new JTextField();
        jtextE.setBounds(300,390,150,30);
        jtextE.setFont(new Font("Raleway",Font.BOLD,20));
        add(jtextE);

        JLabel jmarry= new JLabel("Married status");
        jmarry.setFont(new Font("raleway",Font.BOLD,20));
        jmarry.setBounds(100,440,200,30);
        add(jmarry);

        m1= new JRadioButton("Married");
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,20));
        m1.setBounds(300,440,110,30);
        add(m1);

        m2= new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,20));
        m2.setBounds(450,440,150,30);
        add(m2);

        m3= new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,20));
        m3.setBounds(600,440,150,30);
        add(m3);

        ButtonGroup mbgrp = new ButtonGroup();
        mbgrp.add(m1);
        mbgrp.add(m2);
        mbgrp.add(m3);

//        jtextM= new JTextField();
//        jtextM.setBounds(300,440,400,30);
//        jtextM.setFont(new Font("Raleway",Font.BOLD,20));
//        add(jtextM);

        JLabel jaddress = new JLabel("address:");
        jaddress.setFont(new Font("raleway",Font.BOLD,20));
        jaddress.setBounds(100,490,200,30);
        add(jaddress);

        jtextA= new JTextField();
        jtextA.setBounds(300,490,400,30);
        jtextA.setFont(new Font("Raleway",Font.BOLD,20));
        add(jtextA);

        JLabel jcity = new JLabel("City:");
        jcity.setFont(new Font("raleway",Font.BOLD,20));
        jcity.setBounds(100,540,200,30);
        add(jcity);

        jtextC= new JTextField();
        jtextC.setBounds(300,540,400,30);
        jtextC.setFont(new Font("Raleway",Font.BOLD,20));
        add(jtextC);

        JLabel jpin = new JLabel("PinCode:");
        jpin.setFont(new Font("raleway",Font.BOLD,20));
        jpin.setBounds(100,590,200,30);
        add(jpin);

        jtextP= new JTextField();
        jtextP.setBounds(300,590,400,30);
        jtextP.setFont(new Font("Raleway",Font.BOLD,20));
        add(jtextP);

        JLabel jstate = new JLabel("State:");
        jstate.setFont(new Font("raleway",Font.BOLD,20));
        jstate.setBounds(100,650,200,30);
        add(jstate);

        jtextS= new JTextField();
        jtextS.setBounds(300,650,400,30);
        jtextS.setFont(new Font("Raleway",Font.BOLD,20));
        add(jtextS);

        next= new JButton("Next:");
        next.setFont(new Font("Raleway", Font.BOLD,20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,100,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);// 222,255,228 new Color(20)
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // JTextField jtext,jtextF,jtextE, jtextA, jtextC, jtextS,jtextP;

        String formno=first;
        String name=jtext.getText();
        String fname=jtextF.getText();
        String dob= ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender =null;
        if(r1.isSelected()){
            gender="male";
        }else if(r2.isSelected()){
            gender="female";
        }
        String email= jtextE.getText();
        String martial=null;
        if(m1.isSelected()){
            martial="Married";
        } else if (m2.isSelected()) {
            martial="Unmarried";
        }else if(m3.isSelected()){
            martial="Other";
        }
        String address= jtextA.getText();
        String city=jtextC.getText();
        String pincode=jtextP.getText();
        String State= jtextS.getText();

        try{
            if(jtext.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                DatabaseConnection con1= new DatabaseConnection();
                String q="insert into signup values('"
                        + formno + "','"
                        + name + "','"
                        + fname + "','"
                        + dob + "','"
                        + gender + "','"
                        + email + "','"
                        + martial + "','"
                        + address + "','"
                        + city + "','"
                        + pincode + "','"
                        + State + "')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    static void main(String[] args) {
        SwingUtilities.invokeLater(SignUp::new);
    }
}
