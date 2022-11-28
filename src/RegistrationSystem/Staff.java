package RegistrationSystem;

/**
 * Staff class file, extends SwimPrograms
 * @author S. Tam
 * 
 */

public class Staff extends SwimPrograms{

    // Instance variables
    private boolean lifeguard;
    private boolean instructor;
    private boolean supervisor;
    
    public Staff(boolean publicSwim, boolean privateSwim, boolean lifeguard, boolean instructor, boolean supervisor){
        // Call to super constructor
        super(publicSwim, privateSwim); 

        this.lifeguard = lifeguard;
        this.instructor = instructor;
        this.supervisor = supervisor;
    }

    /* 
    public String getStaff(){
        if (super.publicSwim = true){
            return lifeguard = true;
        }
    }
    */
    
    public boolean getLifeguard(){
        return lifeguard;
    }

    public boolean getInstructor(){
        return instructor;
    }

    public boolean getSupervisor(){
        return supervisor;
    }
    
}
