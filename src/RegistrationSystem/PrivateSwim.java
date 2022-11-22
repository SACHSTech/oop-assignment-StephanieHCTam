package RegistrationSystem;

/**
 * PrivateSwim subclass
 * @author S. Tam
 * 
 */

public class PrivateSwim extends SwimPrograms {

    // Instance variables
    private boolean swimClub;
    private boolean aquafit;
    private boolean swimLessons;
    private boolean poolBooking;

    public PrivateSwim(String address, String poolName, String features, int area, boolean publicSwim, boolean privateSwim, boolean swimClub, boolean aquafit, boolean swimLessons, boolean poolBooking){
        super(address, poolName, features, area, publicSwim, privateSwim);
        this.swimClub = swimClub;
        this.aquafit = aquafit;
        this.swimLessons = swimLessons;
        this.poolBooking = poolBooking;
    }

    public boolean getSwimClub(){
        return swimClub;
    }

    public boolean getAquafit(){
        return aquafit;
    }
}
