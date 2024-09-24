import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Person
{
    String lastname, firstname, address, city, state, zip;
    int age;
    
    public Person(String lastname, String firstName, int age, String address, String city, String state, String zip)
    {
        this.lastname = lastname;
        this.firstname = firstName;
        this.age = age;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    //method 1
    public String getLastName()
    {
        return lastname;
    }
    
    //method 2
    public String getFirstName()
    {
        return firstname;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getState()
    {
        return state;
    }
    
    public String getZip()
    {
        return zip;
    }
    
    //method 3
    public int getAge()
    {
        return age;
    }
}

public class Exercise1 extends JFrame{
    JTextField txtLastname, txtFirstname, txtAge, txtLastname2, txtFirstname2, 
            txtAge2, txtAddress, txtAddress2, txtCity, txtCity2, txtState, txtState2, txtZip, txtZip2;
    JLabel lblName, lblAge, lblName2, lblAge2, lblAddress, lblAddress2, lblCity, lblCity2, lblState, lblState2,
            lblZip, lblZip2;
    
    public Exercise1()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Person Details");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel panel1 = new JPanel(new GridLayout(3,2)); //3 columns, 2 rows
        
        JLabel lblLastname = new JLabel("Last Name 1: ");
        txtLastname = new JTextField();
        
        JLabel lblFirstname = new JLabel("First Name 1: ");
        txtFirstname = new JTextField();
        
        JLabel ageInputLabel = new JLabel("Age 1: ");
        txtAge = new JTextField();
        
        JLabel addressLabel = new JLabel("Address 1: ");
        txtAddress = new JTextField();
        
        JLabel cityLabel = new JLabel("City 1: ");
        txtCity = new JTextField();
        
        JLabel stateLabel = new JLabel("State 1: ");
        txtState = new JTextField();
        
        JLabel zipLabel = new JLabel("Zip 1: ");
        txtZip = new JTextField();
        
        JLabel lblLastname2 = new JLabel("Last Name 2: ");
        txtLastname2 = new JTextField();
        
        JLabel lblFirstname2 = new JLabel("First Name 2: ");
        txtFirstname2 = new JTextField();
        
        JLabel ageInputLabel2 = new JLabel("Age 2");
        txtAge2 = new JTextField();
        
        JLabel addressLabel2 = new JLabel("Address 2: ");
        txtAddress2 = new JTextField();
        
        JLabel cityLabel2 = new JLabel("City 2: ");
        txtCity2 = new JTextField();
        
        JLabel stateLabel2 = new JLabel("State 2: ");
        txtState2 = new JTextField();
        
        JLabel zipLabel2 = new JLabel("Zip 2: ");
        txtZip2 = new JTextField();
        
        JButton btnSubmit = new JButton("Add");
        btnSubmit.setPreferredSize(new Dimension(50, 50));
        
        //add the objects to the panel
        panel1.add(lblLastname);
        panel1.add(txtLastname);
        panel1.add(lblFirstname);
        panel1.add(txtFirstname);
        panel1.add(ageInputLabel);
        panel1.add(txtAge);
        panel1.add(addressLabel);
        panel1.add(txtAddress);
        panel1.add(cityLabel);
        panel1.add(txtCity);
        panel1.add(stateLabel);
        panel1.add(txtState);
        panel1.add(zipLabel);
        panel1.add(txtZip);
        
        panel1.add(lblLastname2);
        panel1.add(txtLastname2);
        panel1.add(lblFirstname2);
        panel1.add(txtFirstname2);
        panel1.add(ageInputLabel2);
        panel1.add(txtAge2);
        panel1.add(addressLabel2);
        panel1.add(txtAddress2);
        panel1.add(cityLabel2);
        panel1.add(txtCity2);
        panel1.add(stateLabel2);
        panel1.add(txtState2);
        panel1.add(zipLabel2);
        panel1.add(txtZip2);
        
        //create the second panel
        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        lblName = new JLabel("Name 1: ");
        lblAge = new JLabel("Age 1: ");
        lblAddress = new JLabel("Address 1: ");
        lblCity = new JLabel("City 1: ");
        lblState = new JLabel("State 1: ");
        lblZip = new JLabel("Zip 1: ");
        
        lblName2 = new JLabel("Name 2: ");
        lblAge2 = new JLabel("Age 2: ");
        lblAddress2 = new JLabel("Address 2: ");
        lblCity2 = new JLabel("City 2: ");
        lblState2 = new JLabel("State 2: ");
        lblZip2 = new JLabel("Zip 2: ");
        
        //add the objects to the second panel
        panel2.add(lblName);
        panel2.add(lblAge);
        panel2.add(lblAddress);
        panel2.add(lblCity);
        panel2.add(lblState);
        panel2.add(lblZip);
        
        panel2.add(lblName2);
        panel2.add(lblAge2);
        panel2.add(lblAddress2);
        panel2.add(lblCity2);
        panel2.add(lblState2);
        panel2.add(lblZip2);        
        //add the panels and position them on the frame
        add(panel1, BorderLayout.NORTH);
        add(btnSubmit, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);
        
        setVisible(true); //displays the frame
        
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String lastName = txtLastname.getText();
                String firstName = txtFirstname.getText();
                String address = txtAddress.getText();
                String city = txtCity.getText();
                String state = txtState.getText();
                String zip = txtZip.getText();
                
                //converting the string to an integer
                int age = Integer.parseInt(txtAge.getText());
                
                String lastName2 = txtLastname2.getText();
                String firstName2 = txtFirstname2.getText();
                String address2 = txtAddress2.getText();
                String city2 = txtCity2.getText();
                String state2 = txtState2.getText();
                String zip2 = txtZip2.getText();
                
                //converting the string to an integer
                int age2 = Integer.parseInt(txtAge2.getText());
                
                //output the results to the labels
                Person person = new Person(lastName, firstName, age, address, city, state, zip);
                Person person2 = new Person(lastName2, firstName2, age2, address2, city2, state2, zip2);
                
                lblName.setText("Name 1: " + person.getLastName() + ", " + person.getFirstName());
                lblAge.setText("Age 1: " + person.getAge());
                lblAddress.setText("Address 1: " + person.getAddress());
                lblCity.setText("City 1: " + person.getCity());
                lblState.setText("State 1: " + person.getState());
                lblZip.setText("Zip 1: " + person.getZip());
                
                
                
                lblName2.setText("Name 2: " + person2.getLastName() + ", " + person2.getFirstName());
                lblAge2.setText("Age 2: " + person2.getAge());
                lblAddress2.setText("Address 2: " + person2.getAddress());
                lblCity2.setText("City 2: " + person2.getCity());
                lblState2.setText("State 2: " + person2.getState());
                lblZip2.setText("Zip 2: " + person2.getZip());
                        
            }
        }
        
        );
    }
    
    public static void main(String[] args) {
        Exercise1 Person = new Exercise1();

        System.out.println("dfsjkldfskljdsl");
    }
}
