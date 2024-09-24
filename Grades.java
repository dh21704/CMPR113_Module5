/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise4;

import javax.swing.JOptionPane;


public class Grades
{
    private double score;
    double score1, score2;
    double sum, average;
    
    public void setScore(double s)
    {
        score = s;
    }
    
    public void setSum(double s1, double s2, double s3)
    {
        String input;
        
        input = JOptionPane.showInputDialog("Enter the 1st Number: ");
        s1 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the 2nd Number: ");
        s2 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter the 3rd Number: ");
        s3 = Double.parseDouble(input);
        
        sum = s1 + s2 + s3;
        
        average = sum / 3;
    }
    
    public double getSum()
    {
        return sum;
    }
    
    public double getScore()
    {
        return score;
    }
    
    public double getAverage()
    {
        return average;
    }
    
    public char getGrade()
    {
        char letterGrade;
        
        if(score >= 90)
        {
            letterGrade = 'A';
        }
        else if (score>=80)
        {
            letterGrade = 'B';
        }
        else if (score>=70)
        {
            letterGrade = 'C';
        }
        else if (score>=60)
        {
            letterGrade = 'D';
        }
        else 
        {
            letterGrade = 'F';
        }
        
        return letterGrade;
    }
}
