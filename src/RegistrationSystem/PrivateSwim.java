package RegistrationSystem;

/**
 * PrivateSwim subclass
 * @author S. Tam
 * 
 */

public class PrivateSwim extends SwimPrograms {

    // Instance variables
    private String swimClub;
    private String aquafit;
    private String swimLessons;
    private String poolBooking;

    public PrivateSwim(String address, String poolName, String features, int area, boolean publicSwim, boolean privateSwim){
        super(address, poolName, features, area, publicSwim, privateSwim);
        this.swimClub = swimClub;
        this.aquafit = aquafit;
        this.swimLessons = swimLessons;
        this.poolBooking = poolBooking;
    }

    
    
}
