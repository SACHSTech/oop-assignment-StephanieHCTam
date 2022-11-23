package RegistrationSystem;
public abstract class SwimPrograms {

    // Instance variables
    private String poolName;
    private boolean publicSwim;
    private boolean privateSwim;
    
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

    /**
     * Abstract showPrograms method
     */
    public abstract void showPrograms();
}