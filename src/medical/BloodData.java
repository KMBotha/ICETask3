package medical;
/*
This class is for storing the Blood group and rhesus factor. By defualt this will be O+.
*/
public class BloodData { //declarations 
    
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
