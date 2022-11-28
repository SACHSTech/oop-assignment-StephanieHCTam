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

    public PrivateSwim(boolean publicSwim, boolean privateSwim, boolean swimClub, boolean aquafit, boolean swimLessons, boolean poolBooking){
        super(publicSwim, privateSwim);
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

    public boolean getSwimLessons(){
        return swimLessons;
    }

    public boolean getPoolBooking(){
        return poolBooking;
    }

    public void showStaff() {

        if (getPublicSwim() == true) {
            System.out.println("Lifeguards and Supervisor needed.");
        }

        if (getPrivateSwim() == true) {
            System.out.println("Instructor and Supervisor needed.");
        }
    }
}
