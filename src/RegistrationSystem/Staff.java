package RegistrationSystem;

/**
 * Staff class file, extends SwimPrograms
 * @author S. Tam
 * 
 */

public class Staff extends SwimPrograms{

    // Instance variables
    private String lifeguard;
    private String instructor;
    private String supervisor;
    
    public Staff(String address, String poolName, String features, int area, boolean publicSwim, boolean privateSwim, String lifeguard, String instructor, String supervisor){
        // Call to super constructor
        super(address, poolName, features, area, publicSwim, privateSwim); 

        this.lifeguard = lifeguard;
        this.instructor = instructor;
        this.supervisor = supervisor;
    }
    
    public String getLifeguard(){
        return lifeguard;
    }

    
}
