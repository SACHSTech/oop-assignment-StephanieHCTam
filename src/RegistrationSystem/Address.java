package RegistrationSystem;

public class Address {
    
    // Instance variables
    private int streetNum;
    private String streetName;
    
    /**
     * Address constructor
     * @param streetNum street number
     * @param streetName street name
     */
    public Address(int streetNum, String streetName) {
        this.streetNum = streetNum;
        this.streetName = streetName;
    }

    /**
     * Output address to screen
     * @return string representation of address
     */
    public String toString() {
        return streetNum + " " + streetName;
    }
}