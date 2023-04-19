package medical;
/*
Create a class called BloodData that holds a blood type (the four blood types are O, A, B, AB) and a RH factor (the factors are + and -). 
Create a default constructor that sets the fields to "O" and "+", and an overloaded constructor that requires values for both fields
*/
public class BloodData {
    
    private String group;
    private String rhesus;
    
    public BloodData(){ // default constructor 
    
        group = "O";
        rhesus = "+";
    
    }
    
    public BloodData(String group, String rhesus){ // overloaded constructor
    
        this.group = group;
        this.rhesus = rhesus;
    
    }
    
    public void setGroup(String group){ // setter for group
    
        this.group = group;
    
    }
    
    public String getGroup(){ // getter for group
    
        return group;
        
    }
    
    
    public void setRhesusS(String rhesus){ // setter for rhesus
    
        this.rhesus = rhesus;
    
    }
    
    
    public String getRhesus(){ // getter for rhesus
    
        return rhesus;
        
    } 
    
    
}
