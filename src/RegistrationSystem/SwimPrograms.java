package RegistrationSystem;
public abstract class SwimPrograms {

    // Instance variables
    private boolean publicSwim;
    private boolean privateSwim;
    
    /**
     * Swim Program constructor
     * @param publicSwim public swim
     * @param privateSwim private swim
     */
    public SwimPrograms(boolean publicSwim, boolean privateSwim){
        this.publicSwim = publicSwim;
        this.privateSwim = privateSwim;
    }

    /**
     * Returns public swim
     * @return boolean public swim
     */
    public boolean getPublicSwim(){
        return publicSwim;
    }

    /**
     * Returns private swim
     * @return boolean private swim
     */
    public boolean getPrivateSwim(){
        return privateSwim;
    }
}