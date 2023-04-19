//This class is the main, it is collecting input from the user and displaying it at the end of the execution.

package medical;
import javax.swing.JOptionPane;

public class Medical {

    public static void main(String[] args) {
              
        //Collecting donor information from user
        String name = JOptionPane.showInputDialog("Please enter your name");
        String surname = JOptionPane.showInputDialog("Please enter your surname");
        String identityNumber = JOptionPane.showInputDialog("Please enter your ID number");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        
        //Collecting blood data from user
        String group = JOptionPane.showInputDialog("Please enter your blood group").toUpperCase();
        while(!group.equals("A") & !group.equals("B") & !group.equals("AB") & !group.equals("O")){
        
            //Will loop until given the correct input, i.e. A, B, AB, O
            group = JOptionPane.showInputDialog("Please enter your blood group").toUpperCase();
        
        }
        String rhesus = JOptionPane.showInputDialog("Please enter your rhesus factor");
        while(!rhesus.equals("+") & !rhesus.equals("-") ){
            
            //Will loop until given the correct input, i.e. + , -
            rhesus = JOptionPane.showInputDialog("Please enter your rhesus factor");
        
        }
        
        //creating BloodData object using overloaded constructor
        BloodData bloodData = new BloodData(group, rhesus);
        
        //creating Donor objects using overloaded constructor
        Donor donor = new Donor(name, surname, identityNumber, age, bloodData);
        
        //creating output string 
        String output = "Donor data is as follows." +
                "\nName: " + donor.getName() +
                "\nSurname: " + donor.getSurname() +
                "\nAge: " + donor.getAge() + 
                "\nIdentity Number: " + donor.getIdentityNumber() +
                "\nBlood Group: " + donor.getBloodData().getGroup() + 
                "\nRhesus Factor: " + donor.getBloodData().getRhesus() + 
                "\n\nThank you for registering with us.";
        
        //displaying output string
        JOptionPane.showInternalMessageDialog(null, output);
        
         
    }
    
}
