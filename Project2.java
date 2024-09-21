
package com.mycompany.cmpr113_hw5;

import javax.swing.JTextField;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Project2 extends JFrame{
    public static void main(String[] args) {
   
       
        
        JTextField field = new JTextField(7);
        JTextField field2 = new JTextField(7);
        JTextField field3 = new JTextField(7);
        JTextField field4 = new JTextField(7);

        
        
        JFrame frame = new JFrame("Theatre");
        JButton button = new JButton("Go");
        
        JLabel priceAdultLabel = new JLabel("Price Per Adult: ");
        JLabel ticketsSoldLabel = new JLabel("Number of Adults Tickets Sold: ");
        JLabel pricePerChildTicketLabel = new JLabel("Price Per Child Ticket: ");
        JLabel childTicketLabel = new JLabel("Number of Child Tickets Sold: ");
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
     
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
              double pricePerAdultD = Double.parseDouble(field.getText());
              double numTicketsSoldD = Double.parseDouble(field2.getText());
              double pricePerChildTicketD = Double.parseDouble(field3.getText());
              double numChildTicketsSoldD = Double.parseDouble(field4.getText());
              
              
              
              
                System.out.println(pricePerAdultD);
                System.out.println(numTicketsSoldD);
                System.out.println(pricePerChildTicketD);
                System.out.println(numChildTicketsSoldD); 
                                
                
                
                JOptionPane.showMessageDialog(null, "Gross Revenue For Tickets: " + numTicketsSoldD);
                JOptionPane.showMessageDialog(null, "Net Revenue For Adult Tickets Sold: ");
                JOptionPane.showMessageDialog(null, "Gross Revenue For Child Tickets Sold: ");
                JOptionPane.showMessageDialog(null, "Net Revenue For Child Tickets Sold: ");
                JOptionPane.showMessageDialog(null, "Total Gross Revenue: ");
                JOptionPane.showMessageDialog(null, "Total Net Revenue: ");
                
                
            }
        }     
        );
        
   
        frame.add(priceAdultLabel);
        frame.add(field);
        
        frame.add(ticketsSoldLabel);
        frame.add(field2);
        
        frame.add(pricePerChildTicketLabel);
        frame.add(field3);
        
        frame.add(childTicketLabel);
        frame.add(field4);
        
        
        frame.add(button);
        frame.setVisible(true);
        
    }
}
