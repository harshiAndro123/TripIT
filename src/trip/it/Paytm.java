
package trip.it;

import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;


public class Paytm extends JFrame implements ActionListener{
    
    Paytm(){
        setBounds(500,200,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try{
            //pane.setPage("https://paytm.com/rent-payment");
            ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/pay.jpg"));
        Image i2 = il.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        }catch(Exception e){
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404/html");
        }
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back = new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
    }
    
    public static void main(String[] args){
        new Paytm();
    }
}