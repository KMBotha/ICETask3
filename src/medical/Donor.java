/*

This class is storing the donor information.

*/

package medical;

import java.time.LocalDate;


public class Donor{ //Declarations
    
    
    private String name;
    private String surname;
    private String identityNumber;
    private int age;
    private LocalDate registered;
    private BloodData bloodData;
    
    
    public Donor(){ // default constructor 
    
        name = "";
        surname = "";
        identityNumber = "0";
        age = 0;
        registered = LocalDate.now();
        bloodData = new BloodData();       
        
    }
    
    public Donor(String name, String surname, String identityNumber, int age, BloodData bloodData){ // overloaded constructor 
    
        this.name = name;
        this.surname = surname;
        this.identityNumber = identityNumber;
        this.age = age;
        this.registered = LocalDate.now();
        this.bloodData = bloodData;
    }
    
    public void setName(String name){ // setter for name
    
        this.name = name;
    
    }
    
    public String getName(){ // getter for name 
    
        return name;
        
    }
    
    public void setSurname(String surname){ // setter for surname 
    
        this.surname = surname;
        
    }
    
    public String getSurname(){ //getter for surname
    
        return surname;
        
    } 
    
    public void setIdentityNumber(String identityNumber){ // setter for ID
    
        this.identityNumber = identityNumber;
        
    }
    
    public String getIdentityNumber(){ // getter for ID
    
        return identityNumber;
        
    }
    
    public void setAge(int age){ // setter for age
    
        this.age = age;
        
    }
    
    public int getAge(){ // getter for age
    
        return age;
        
    }  
    
    public void setRegistered(LocalDate registered){
    
        this.registered = registered;
    
    }
    
    public LocalDate getRegistered(){
    
        return registered;
    
    }
    
    public void setBloodData(BloodData bloodData){
    
        this.bloodData =  bloodData;
    
    }
    
    public BloodData getBloodData(){
    
        return bloodData;
    
    }
      
    
}
