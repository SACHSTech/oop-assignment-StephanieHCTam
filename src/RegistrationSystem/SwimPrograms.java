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

    public boolean getPrivateSwim(){
        return privateSwim;
    }

    public void showPrograms() {

        if (publicSwim) {
            System.out.println("Public Swim: select a program");
            System.out.println("Recreational Swim, Lane Swim");
        }

        if (privateSwim) {
            System.out.println("Private Swim: select a program");
            System.out.println("Swim Club, Aquafit, Swim Lessons, Pool Booking");
        }
    }
}