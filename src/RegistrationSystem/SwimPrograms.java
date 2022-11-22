package RegistrationSystem;
public class SwimPrograms extends CommunityCentre{

    // Instance variables
    private boolean publicSwim;
    private boolean privateSwim;
    
    public SwimPrograms(String address, String poolName, String features, int area, boolean publicSwim, boolean privateSwim){
        // Call to super constructor
        super(address, poolName, features, area); 

        this.publicSwim = publicSwim;
        this.privateSwim = privateSwim;
    }

    public boolean getPublicSwim(){
        return publicSwim;
    }
}