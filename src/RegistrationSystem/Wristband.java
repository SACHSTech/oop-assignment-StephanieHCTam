package RegistrationSystem;

/**
 * Wristband class file
 * @author S. Tam
 */

public class Wristband{

    // Instance variables
    private String wristbandColor;

    /**
     * Wristband color constructor
     * @param age patron age
     */
    public Wristband(int age){

        // Determine  wristband color based on inputted age
        // Red wristband = 0-6 years old
        if (age < 6) {
            this.wristbandColor = "Red";
        }
        // Yellow wristband = 7-11 years old
        else if (age > 7 &&  age < 11) {
            this.wristbandColor = "Yellow";
        }
        // Green wristband = 12+ years old
        else {
            this.wristbandColor = "Green";
        }
    }

    /**
     * Returns wristband color
     * @return String wristband color
     */
    public String getWristbandColor(){
        return wristbandColor;
    }
}