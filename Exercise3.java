/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise4;

import javax.swing.*;





public class Exercise3 extends Grades{
    public static void main(String[] args) {
        String input;
        
        double testScore;
        
        Grades var = new Grades();
        
        input = JOptionPane.showInputDialog("Enter a score between 0-100");
        testScore = Double.parseDouble(input);
        
        var.setScore(testScore);
        var.setSum(0,0, 0);
        
        JOptionPane.showMessageDialog(null, "The grade is " + var.getGrade());
        JOptionPane.showMessageDialog(null, "The sum is " + var.getSum());
        JOptionPane.showMessageDialog(null, "The average is: " + var.getAverage());
    }
}
