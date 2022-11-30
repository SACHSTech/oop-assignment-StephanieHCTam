package RegistrationSystem;

/**
 * PublicSwim subclass
 * @author S. Tam
 */

public class PublicSwim extends SwimPrograms {

    // Instance variables
    private boolean recSwim;
    private boolean laneSwim;

    /**
     * Public Swim constructor
     * @param publicSwim public swim
     * @param privateSwim private swim
     * @param recSwim recreational swim
     * @param laneSwim lane swim
     */
    public PublicSwim(boolean publicSwim, boolean privateSwim, boolean recSwim, boolean laneSwim){
        // calls superclass SwimPrograms
        super(publicSwim, privateSwim);
        this.recSwim = recSwim;
        this.laneSwim = laneSwim;
    }

    /**
     * Returns recreational swim
     * @return boolean recreational swim
     */
    public boolean getRecSwim(){
        return recSwim;
    }

    /**
     * Returns lane swim
     * @return boolean lane swim
     */
    public boolean getLaneSwim(){
        return laneSwim;
    }
}
