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
    
    public boolean getPublicSwim(){
        return super.getPublicSwim();
    }

    public boolean getPrivateSwim(){
        return super.getPrivateSwim();
    }
    
    public boolean getLifeguard(){
        return lifeguard;
    }

    public boolean getInstructor(){
        return instructor;
    }

    public boolean getSupervisor(){
        return supervisor;
    }
    
    public void showStaff() {

        if (getPublicSwim() = true) {
            lifeguard = true;
            supervisor = true;
            System.out.println("Lifeguards and Supervisor needed.");
        }

        if (getPrivateSwim() = true) {
            instructor = true;
            supervisor = true;
            System.out.println("Instructor and Supervisor needed.");
        }
    }

}
