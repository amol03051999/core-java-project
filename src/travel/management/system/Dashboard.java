
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage;
    JButton viewpackage,viewhotels,destination,bookhotel,viewbookedhotel,payment,calculator,notepad;
    JButton about,deletePersonalDetails;
   Dashboard(String username){
       this.username = username;
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLayout(null);
       
       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(new Color(0, 0, 102));
       p1.setBounds(0, 0, 1600, 65);
       add(p1);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dash5.png"));
       Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel Icon = new JLabel(i3);
       Icon.setBounds(25, 5, 30, 50);
       p1.add(Icon);
       
       JLabel heading = new JLabel("Dashboard");
       heading.setBounds(80, 10, 300, 40);
       p1.add(heading);
       heading.setForeground(Color.WHITE);
       heading.setFont( new Font ("Tahoma",Font.BOLD, 30));
       p1.add(heading);
       
        JPanel p2 = new JPanel();
       p2.setLayout(null);
       p2.setBackground(new Color(0, 0, 102));
       p2.setBounds(0, 65, 300, 900);
       add(p2);
       
       addPersonalDetails = new JButton("Add Person Details");
       addPersonalDetails.setBounds(0, 0, 300,35);
       addPersonalDetails.setBackground( new Color(0, 0, 102));
       addPersonalDetails.setForeground(Color.WHITE);
       addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       addPersonalDetails.setMargin(new Insets(0, 0, 0,48));
       addPersonalDetails.addActionListener(this);
       p2.add(addPersonalDetails);
       
       updatePersonalDetails = new JButton("Update Personal Details");
       updatePersonalDetails.setBounds(0, 50, 300,35);
       updatePersonalDetails.setBackground( new Color(0, 0, 102));
       updatePersonalDetails.setForeground(Color.WHITE);
       updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       updatePersonalDetails.setMargin(new Insets(0, 0, 0,10));
       updatePersonalDetails.addActionListener(this);
       p2.add(updatePersonalDetails);
       
       viewPersonalDetails = new JButton("View Personal Details");
       viewPersonalDetails.setBounds(0, 100, 300,35);
       viewPersonalDetails.setBackground( new Color(0, 0, 102));
       viewPersonalDetails.setForeground(Color.WHITE);
       viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewPersonalDetails.setMargin(new Insets(0, 0, 0,27));
       viewPersonalDetails.addActionListener(this);
       p2.add(viewPersonalDetails);
       
        deletePersonalDetails = new JButton("Delete Personal Deatails");
       deletePersonalDetails.setBounds(0, 150, 300,35);
       deletePersonalDetails.setBackground( new Color(0, 0, 97));
       deletePersonalDetails.setForeground(Color.WHITE);
       deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
       deletePersonalDetails.setMargin(new Insets(0, 0, 0,5));
       deletePersonalDetails.addActionListener(this);
       p2.add(deletePersonalDetails);
       
       checkpackages = new JButton("Check Packages");
       checkpackages.setBounds(0, 200, 300,35);
       checkpackages.setBackground( new Color(0, 0, 102));
       checkpackages.setForeground(Color.WHITE);
       checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
       checkpackages.setMargin(new Insets(0, 0, 0,77));
       checkpackages.addActionListener(this);
       p2.add(checkpackages);
       
         bookpackage = new JButton("Book Package");
       bookpackage.setBounds(0, 250, 300,35);
       bookpackage.setBackground( new Color(0, 0, 102));
       bookpackage.setForeground(Color.WHITE);
       bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookpackage.setMargin(new Insets(0, 0, 0,90));
       bookpackage.addActionListener(this);
       p2.add(bookpackage);
       
       viewpackage = new JButton("View Package");
       viewpackage.setBounds(0, 300, 300,35);
       viewpackage.setBackground( new Color(0, 0, 102));
       viewpackage.setForeground(Color.WHITE);
       viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewpackage.setMargin(new Insets(0, 0, 0,90));
       viewpackage.addActionListener(this);
       p2.add(viewpackage);
       
        viewhotels= new JButton("View Hotels");
       viewhotels.setBounds(0, 350, 350,35);
       viewhotels.setBackground( new Color(0, 0, 102));
       viewhotels.setForeground(Color.WHITE);
       viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewhotels.setMargin(new Insets(0, 0, 0,160));
       viewhotels.addActionListener(this);
       p2.add(viewhotels);
       
       bookhotel = new JButton("Book Hotels");
       bookhotel.setBounds(0, 400, 350,35);
       bookhotel.setBackground( new Color(0, 0, 102));
       bookhotel.setForeground(Color.WHITE);
       bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookhotel.setMargin(new Insets(0, 0, 0,162));
       bookhotel.addActionListener(this);
       p2.add(bookhotel);
       
        viewbookedhotel = new JButton("View Booked Hotels");
       viewbookedhotel.setBounds(0, 450, 350,35);
       viewbookedhotel.setBackground( new Color(0, 0, 98));
       viewbookedhotel.setForeground(Color.WHITE);
       viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewbookedhotel.setMargin(new Insets(0, 0, 0,94));
       viewbookedhotel.addActionListener(this);
       p2.add(viewbookedhotel);
       
        destination = new JButton("Destination");
       destination.setBounds(0, 500, 350,35);
       destination.setBackground( new Color(0, 0, 100));
       destination.setForeground(Color.WHITE);
       destination.setFont(new Font("Tahoma",Font.PLAIN,20));
       destination.setMargin(new Insets(0, 0, 0,172));
       destination.addActionListener(this);
       p2.add(destination);
       
       payment = new JButton("Payment");
       payment.setBounds(0, 550, 350,35);
       payment.setBackground( new Color(0, 0, 100));
       payment.setForeground(Color.WHITE);
       payment.setFont(new Font("Tahoma",Font.PLAIN,20));
       payment.setMargin(new Insets(0, 0, 0,192));
       payment.addActionListener(this);
       p2.add(payment);
       
            calculator = new JButton("Calculator");
       calculator.setBounds(0, 600, 350,35);
       calculator.setBackground( new Color(0, 0, 102));
       calculator.setForeground(Color.WHITE);
       calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
       calculator.setMargin(new Insets(0, 0, 0,184));
       calculator.addActionListener(this);
       p2.add(calculator);
       
        notepad = new JButton("Notepad");
       notepad.setBounds(0, 650, 350,35);
       notepad.setBackground( new Color(0, 0, 102));
       notepad.setForeground(Color.WHITE);
       notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
       notepad.setMargin(new Insets(0, 0, 0,190));
       notepad.addActionListener(this);
       p2.add(notepad);
       
            about = new JButton("About");
       about.setBounds(0, 700, 350,35);
       about.setBackground( new Color(0, 0, 102));
       about.setForeground(Color.WHITE);
       about.setFont(new Font("Tahoma",Font.PLAIN,20));
       about.setMargin(new Insets(0, 0, 0,212));
       about.addActionListener(this);
       p2.add(about);
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel Image = new JLabel(i6);
       Image.setBounds(0, 0, 1650, 1000);
       add(Image);
       
       JLabel text = new JLabel("Travel and Tourism Management System");
       text.setBounds(400, 70, 1200, 70);
       text.setForeground(Color.WHITE);
       text.setFont(new Font ("Raleway", Font.BOLD, 55));
       Image.add(text);
       
       
       
       
       setVisible(true);
       
   } 
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource() == addPersonalDetails){
           new Addcustomer(username);
       }else if(ae.getSource() == viewPersonalDetails){
           new Viewcustomer(username);
       }else if(ae.getSource() == updatePersonalDetails){
           new Updatecustomer(username);
       }else if(ae.getSource() == deletePersonalDetails){
           new Deletedetails(username);
       }else if(ae.getSource() == checkpackages){
           new Checkpackage();
       }else if(ae.getSource() == bookpackage){
           new Bookpackage(username);
       }else if(ae.getSource() == viewpackage){
           new Viewpackage(username);
       }else if(ae.getSource() == viewhotels){
           new Checkhotels();
       }else if(ae.getSource() == destination){
           new Destinations();
       }else if(ae.getSource() == bookhotel){
           new Bookhotel(username);
       }else if(ae.getSource() == viewbookedhotel){
           new Viewbookedhotel(username);
       }else if(ae.getSource() == payment){
           new Payment();
       }else if(ae.getSource() == calculator){
           try{
               Runtime.getRuntime().exec("calc.exe");
           }catch(Exception e){
               e.printStackTrace();
           }
       }else if(ae.getSource() == notepad){
            try{
               Runtime.getRuntime().exec("notepad.exe");
           }catch(Exception e){
               e.printStackTrace();
           }
       }else if(ae.getSource() == about){
           new About();
       }
       
           
   }
    
 
    public static void main(String[]args)
    {
       new Dashboard(""); 
    }
}
