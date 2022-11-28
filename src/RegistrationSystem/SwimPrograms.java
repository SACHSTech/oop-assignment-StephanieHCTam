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
     * Setter method for public swim
     * @param publicSwim public swim boolean
     */
    public void setPublicSwim(boolean publicSwim){
        this.publicSwim = publicSwim;
    }

    /**
     * Setter method for private swim
     * @param privateSwim private swim boolean
     */
    public void setPrivateSwim(boolean privateSwim){
        this.privateSwim = privateSwim;
    }

}