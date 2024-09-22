/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cmpr113_hw5;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Project1 extends JFrame{
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Travel Expenses");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JButton button = new JButton("Go");
        
        JLabel daysOnTripLabel = new JLabel("\nNumber of days on the trip: ");
        JTextField field = new JTextField(5);
        
        JLabel airfaireLabel = new JLabel("\nAmount of airfaire, if any: ");
        JTextField field2 = new JTextField(5);
        
        JLabel carRentalLabel = new JLabel("\nAmount of car rental fee's, if any: ");
        JTextField field3 = new JTextField(5);
        
        JLabel milesDrivenLabel = new JLabel("\nNumber of miles driven, if a private vehicle was used; ");
        JTextField field4 = new JTextField(5);
        
        JLabel parkingFeesLabel = new JLabel("\nAmount of parking fee's, if any: ");
        JTextField field5 = new JTextField(5);
        
        JLabel taxiChargesLabel = new JLabel("\nAmount of taxi charges, if any: ");
        JTextField field6 = new JTextField(5);
        
        JLabel registrationLable = new JLabel("\nConference or seminar registration fee's, if any: ");
        JTextField field7 = new JTextField(5);
        
        JLabel lodgingLabel = new JLabel("\nLodging charges, per night: ");
        JTextField field8 = new JTextField(5);     
        
        
        
        
        button.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {            
                        JFrame frame2 = new JFrame("Final Details");
                        frame2.setSize(600, 300);
                        frame2.setLayout(new FlowLayout());
                        
                        
                        double daysOnTrip = Double.parseDouble(field.getText());
                        double airfaire = Double.parseDouble(field2.getText());
                        double carRental = Double.parseDouble(field3.getText());
                        double milesDriven = Double.parseDouble(field4.getText());
                        double parkingFees = Double.parseDouble(field5.getText());
                        double taxiCharges = Double.parseDouble(field6.getText());
                        double registration = Double.parseDouble(field7.getText());
                        double lodging = Double.parseDouble(field8.getText());
                        
                        //logic for question 1
                        double totalExpenses = airfaire + carRental + milesDriven + parkingFees + taxiCharges + registration + lodging;
                        
                        //logic for question 2
                        double mealReimburse = 37.00 * daysOnTrip;
                        double parkingReimburse = 10.00 * daysOnTrip;
                        double taxiReimburse = 20.00 * daysOnTrip;
                        double lodgingReimburse = 95.00 * daysOnTrip;
                        double vehicleReimbuse = 0.27 * milesDriven; 
                        
                        double totalReimburse = mealReimburse + parkingReimburse + taxiReimburse + lodgingReimburse + vehicleReimbuse;
                        
                        //logic for question 3
                        double excessAmount = totalExpenses - totalReimburse; 
                        
                        //logic for question 4 also
                        double amountSaved = 0;
                        
                        if (excessAmount < 0)
                        {
                            amountSaved = excessAmount;
                            
                            excessAmount = 0;
                        }
                        
                        JLabel expensesLabel = new JLabel("\nTotal Expenses Incurred by the Person: " + totalExpenses);
                        JLabel reimburseLabel = new JLabel("\nThe Total Allowable Expenses for the Trip: " + totalReimburse);
                        JLabel excessLabel = new JLabel("\nThe Excess That Must Be Paid By The Business Person, If Any:  " + excessAmount);
                        JLabel amountSavedLabel = new JLabel("\nThe Amount Saved By The Business Person If The Expenses Are Under The Total Allowed: " + amountSaved);
                        
                        frame2.add(expensesLabel);
                        frame2.add(reimburseLabel);
                        frame2.add(excessLabel);
                        frame2.add(amountSavedLabel);
                        
                        frame.setVisible(false);
                        frame2.setVisible(true);
                                                
                        
                    }
                }
        
        );
        
     
               //
        
        frame.add(daysOnTripLabel);
        frame.add(field);
        frame.add(airfaireLabel);
        frame.add(field2);
        frame.add(carRentalLabel);
        frame.add(field3);
        frame.add(milesDrivenLabel);
        frame.add(field4);
        frame.add(parkingFeesLabel);
        frame.add(field5);
        frame.add(taxiChargesLabel);
        frame.add(field6);
        frame.add(registrationLable);
        frame.add(field7);
        frame.add(lodgingLabel);
        frame.add(field8);
        
             
        frame.add(button);
                
        frame.setVisible(true);
    
    }
    
}
