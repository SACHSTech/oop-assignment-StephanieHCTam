package RegistrationSystem;
public abstract class SwimPrograms {

    // Instance variables
    private boolean publicSwim;
    private boolean privateSwim;
    
    public SwimPrograms(boolean publicSwim, boolean privateSwim){
        this.publicSwim = publicSwim;
        this.privateSwim = privateSwim;
    }

    public boolean getPublicSwim(){
        return publicSwim;
    }

    public boolean getPrivateSwim(){
        return privateSwim;
    }

    /**
     * Abstract showPrograms method
     */
    public abstract void showPrograms();

    /*
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
     */
}