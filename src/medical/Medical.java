//You have been tasked with creating an application to collect data on donors for a blood bank during their registration

package medical;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class Medical {

    public static void main(String[] args) {
              
        String name = JOptionPane.showInputDialog("Please enter your name");
        String surname = JOptionPane.showInputDialog("Please enter your surname");
        String identityNumber = JOptionPane.showInputDialog("Please enter your ID number");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        
        String group = JOptionPane.showInputDialog("Please enter your blood group").toUpperCase();
        while(!group.equals("A") & !group.equals("B") & !group.equals("AB") & !group.equals("O")){
        
            group = JOptionPane.showInputDialog("Please enter your blood group").toUpperCase();
        
        }
        String rhesus = JOptionPane.showInputDialog("Please enter your rhesus factor");
        while(!rhesus.equals("+") & !rhesus.equals("-") ){
        
            rhesus = JOptionPane.showInputDialog("Please enter your rhesus factor");
        
        }
        
        BloodData bloodData = new BloodData(group, rhesus);
        Donor donor = new Donor(name, surname, identityNumber, age, bloodData);

        String output = "Donor data is as follows." +
                "\nName: " + donor.getName() +
                "\nSurname: " + donor.getSurname() +
                "\nAge: " + donor.getAge() + 
                "\nIdentity Number: " + donor.getIdentityNumber() +
                "\nBlood Group: " + donor.getBloodData().getGroup() + 
                "\nRhesus Factor: " + donor.getBloodData().getRhesus() + 
                "\n\nThank you for registering with us.";
        
        JOptionPane.showInternalMessageDialog(null, output);
        
         
    }
    
}
