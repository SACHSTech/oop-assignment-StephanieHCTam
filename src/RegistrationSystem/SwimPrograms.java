package RegistrationSystem;
public abstract class SwimPrograms {

    // Instance variables
    private boolean publicSwim;
    private boolean privateSwim;
    private String poolName;
    
    public SwimPrograms(String poolName, boolean publicSwim, boolean privateSwim){
        // Call to super constructor

        this.poolName = poolName;
        this.publicSwim = publicSwim;
        this.privateSwim = privateSwim;
    }

    public void setPoolName(String poolName){
        this.poolName = poolName;
    }

    public String getPoolName(){
        return poolName;
    }

    public boolean getPublicSwim(){
        return publicSwim;
    }

    public boolean getPrivateSwim(){
        return privateSwim;
    }

    // abstract method to get program from subclass
    public abstract String getProgram();

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