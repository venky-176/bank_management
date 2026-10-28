package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

   JComboBox combobox, combobox2, combobox3, combobox4, combobox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
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
        combobox2.setBounds(350,170,320,30);
        add(combobox2);

        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String[] income={"null","<1,50,000","<2,50,000","5,00,000","upto 10,00,000","above 10,00,000"};
        combobox3= new JComboBox(income);
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setFont(new Font("raleway",Font.BOLD,14));
        combobox3.setBounds(350,220,320,30);
        add(combobox3);

        JLabel l6 = new JLabel("Education:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String[] education={"non-graduate","graduate","pg","Doctorate","Other"};
        combobox4= new JComboBox(education);
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setFont(new Font("raleway",Font.BOLD,14));
        combobox4.setBounds(350,270,320,30);
        add(combobox4);

        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String[] occupation={"salaried","self-employed","Business","student","retired"};
        combobox5= new JComboBox(occupation);
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setFont(new Font("raleway",Font.BOLD,14));
        combobox5.setBounds(350,320,320,30);
        add(combobox5);

        JLabel l8 = new JLabel("PAN no:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);

        textPan= new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,370,150,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar no:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,410,180,30);
        add(l9);

        textAadhar= new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar.setBounds(350,410,150,30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1= new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2= new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l11 = new JLabel("Existing account:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Ralewaay",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2=new JRadioButton("NO");
        e2.setFont(new Font("Ralewaay",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,540,100,30);
        add(e2);

        ButtonGroup bgp= new ButtonGroup();
        bgp.add(e1);
        bgp.add(e2);

        JLabel l12 = new JLabel("FORM NO");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(760,10,60,30);
        add(l13);

        next= new JButton("Next");
        next.setFont(new Font("Ralewaay",Font.BOLD,18));
        next.setBackground(new Color(227, 221, 221));
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(141, 149, 61));
        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    //    public Signup2() {
//
//    }

    static void main(String[] args) {
        new Signup2("1");
    }
}
