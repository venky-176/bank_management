package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup2 extends JFrame {

   JComboBox combobox, combobox2, combobox3, combobox4, combobox5;

    String formno;

    Signup2(String first) {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details:");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String[] religion={"Hindu","Muslim","Sikh","Christian","Other"};
        combobox= new JComboBox(religion);
        combobox.setBackground(new Color(252,208,76));
        combobox.setFont(new Font("Raleway",Font.BOLD,14));
        combobox.setBounds(350,120,320,30);
        add(combobox);

        JLabel l4= new JLabel("category:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String[] category={"general","OBC","SC","ST"};
        combobox2= new JComboBox(category);
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setFont(new Font("raleway",Font.BOLD,14));
        combobox2.setBounds(350,170,320,20);
        add(combobox2);

        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String[] income={"null","<1,50,000","<2,50,000","5,00,000","upto 10,00,000","above 10,00,000"};
        combobox3= new JComboBox(income);
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setFont(new Font("raleway",Font.BOLD,14));
        combobox3.setBounds(350,220,320,20);
        add(combobox3);

        JLabel l6 = new JLabel("Education:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String[] education={"non-graduate","graduate","pg","Doctorate","Other"};
        combobox4= new JComboBox(education);
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setFont(new Font("raleway",Font.BOLD,14));
        combobox4.setBounds(350,270,320,20);
        add(combobox4);

        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String[] occupation={"salaried","self-employed","Business","student","retired"};
        combobox5= new JComboBox(occupation);
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setFont(new Font("raleway",Font.BOLD,14));
        combobox5.setBounds(350,320,320,20);
        add(combobox5);

        JLabel l8 = new JLabel("PAN no:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);




        getContentPane().setBackground(new Color(141, 149, 61));
        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        setVisible(true);

    }

//    public Signup2() {
//
//    }

    static void main(String[] args) {
        new Signup2("dfg");
    }
}
