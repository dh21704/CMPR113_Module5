
package com.mycompany.classexercise4;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author danielhernandez
 */
public class Exercise2 extends JFrame{
    JPanel studentPanel, classPanel, studentPanel2;
    JLabel lblname, lblclass, lblGender;
    JTextField txtName;
    JRadioButton rdoMath, rdoScience, rdoEnglish, rdoHistory, rdoMale, rdoFemale;
    JButton btnSubmit;
    DefaultListModel<String> studentListModel;
    JList<String> studentList;
    
    public Exercise2()
    {
        setTitle("Student and Class Information");
        setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //create a tilted border
        //classPanel.setBorder(BorderFactory.createTitledBorder("Class and Gender Selection"));
        
        //create student panel
        studentPanel = new JPanel();
        studentPanel.setLayout(new FlowLayout());
        
        studentPanel2 = new JPanel();
        studentPanel2.setLayout(new FlowLayout());
        
        lblname = new JLabel("Student Name: ");
        txtName = new JTextField(20);
        btnSubmit = new JButton("Submit");
        
        studentPanel.add(lblname);
        studentPanel.add(txtName);
        studentPanel.add(btnSubmit);
        
        //create class panel
        classPanel = new JPanel();
        classPanel.setLayout(new FlowLayout());
        classPanel.setBorder(BorderFactory.createTitledBorder("Class and Gender Selection"));
        
        lblclass = new JLabel("Select Class");
        rdoMath = new JRadioButton("Math");
        rdoScience = new JRadioButton("Science");
        rdoHistory = new JRadioButton("History");
        rdoEnglish = new JRadioButton("English");
        
        lblGender = new JLabel("Select Gender");
        rdoMale = new JRadioButton("Male");
        rdoFemale = new JRadioButton("Female");
        
        
        
        
        //button group to group button, so the user can only click on one button at a time
        ButtonGroup classButtonGroup = new ButtonGroup();
        classButtonGroup.add(rdoMath);
        classButtonGroup.add(rdoScience);
        classButtonGroup.add(rdoHistory);
        classButtonGroup.add(rdoEnglish);
        
        //button group for gender selection
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(rdoMale);
        genderButtonGroup.add(rdoFemale);

        
        classPanel.add(lblclass);
        classPanel.add(rdoMath);
        classPanel.add(rdoScience);
        classPanel.add(rdoHistory);
        classPanel.add(rdoEnglish);
        
        //now adding gender
        classPanel.add(lblGender);
        classPanel.add(rdoMale);
        classPanel.add(rdoFemale);
        
        
        
        //create student list
        studentListModel = new DefaultListModel<>();
        studentList = new JList<>(studentListModel);
        
        //add panels to the frame
        setLayout(new GridLayout(2,1));
        add(studentPanel);
        add(classPanel);
        add(new JScrollPane(studentList)); //makes the list box scrollable
                
        
        
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String studentName = txtName.getText();
                String selectedClass = " ";
                
                if (rdoMath.isSelected())
                {
                    selectedClass = "Math";
                }
                else if (rdoScience.isSelected())
                {
                    selectedClass= "Science";
                }
                else if (rdoHistory.isSelected())
                {
                    selectedClass= "History";
                }
                else if (rdoEnglish.isSelected())
                {
                    selectedClass= "English";
                }
                
                
                String genderSelection = " ";
                
                if (rdoMale.isSelected())
                {
                    genderSelection = "Male";
                }
                else if (rdoFemale.isSelected())
                {
                    genderSelection = "Female";
                }
                
                
                
                
                String studentInfo = "Student Name: " + studentName + " - Class: " + selectedClass + " - Gender: " + genderSelection;
                
                //here we add the rsults to the list box
                studentListModel.addElement(studentInfo);
                txtName.setText("");
                rdoMath.setSelected(true);
                rdoMale.setSelected(true);        
            }
        }
        
        );
    }
    
    public static void main(String[] args) {
        Exercise2 frame = new Exercise2();
        frame.setVisible(true);
    }
}
