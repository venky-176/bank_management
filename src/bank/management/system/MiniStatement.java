package bank.management.system;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {

    String pin;
    JButton button;
   // String pin;
    MiniStatement(String pin){
        this.pin=pin;
//        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
//        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
//        ImageIcon i3= new ImageIcon(i2);
//        JLabel l3= new JLabel(i3);
//        l3.setBounds(0,0,1550,830);
//        add(l3);

        getContentPane().setBackground(new Color(0xE3814B));
        setSize(400,600);
        setLayout(null);
        setLocation(20,20);

        JLabel label1= new JLabel();
        label1.setBounds(20,140,400,200);
        add(label1);

        JLabel label2 = new JLabel("TechCoder A.V");
        label2.setFont(new Font("System", Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try{
            DatabaseConnection db= new DatabaseConnection();
            ResultSet rs = db.statement.executeQuery("select * from login where pin='"+pin+"'");
            while(rs.next()){
                label3.setText("Card Number: "+rs.getString("card_number").substring(0,4)+"XXXXXXXX"+rs.getString("card_number").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            DatabaseConnection db= new DatabaseConnection();
            int balance=0;
            ResultSet rs= db.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while(rs.next()){

                label1.setText(label1.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+ "<br><br><html>");

                if(rs.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(rs.getString("amount"));
                }else{
                    balance-=Integer.parseInt(rs.getString("amount"));

                }
            }
            label4.setText("your total balance is: Rs."+balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        button= new JButton("exit");
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

    static void main(String[] args) {
        new MiniStatement("");
    }
}
