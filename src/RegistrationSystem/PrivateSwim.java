package RegistrationSystem;

/**
 * PrivateSwim subclass
 * @author S. Tam
 */

public class PrivateSwim extends SwimPrograms {

    // Instance variables
    private boolean swimClub;
    private boolean aquafit;
    private boolean swimLessons;
    private boolean poolBooking;

    /**
     * Private Swim constructor
     * @param publicSwim public swim
     * @param privateSwim private swim
     * @param swimClub swim club
     * @param aquafit aquafit
     * @param swimLessons swim lessons
     * @param poolBooking pool booking
     */
    public PrivateSwim(boolean publicSwim, boolean privateSwim, boolean swimClub, boolean aquafit, boolean swimLessons, boolean poolBooking){
        // calls superclass SwimPrograms
        super(publicSwim, privateSwim);
        this.swimClub = swimClub;
        this.aquafit = aquafit;
        this.swimLessons = swimLessons;
        this.poolBooking = poolBooking;
    }

    /**
     * Returns swim club
     * @return boolean swim club
     */
    public boolean getSwimClub(){
        return swimClub;
    }

    /**
     * Returns aquafit
     * @return boolean aquafit
     */
    public boolean getAquafit(){
        return aquafit;
    }

    /**
     * Returns swim lessons
     * @return boolean swim lessons
     */
    public boolean getSwimLessons(){
        return swimLessons;
    }

    /**
     * Returns pool booking
     * @return boolean pool booking
     */
    public boolean getPoolBooking(){
        return poolBooking;
    }
}
