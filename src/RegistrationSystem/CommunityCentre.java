package RegistrationSystem;

/**
 * Community Center class file
 * @author S. Tam
 * 
 */

public class CommunityCentre {

    // instance variables
    private String address;
    private String poolName;
    private String features;
    private int area;

    /**
     * Constructor: creates new instance of Community Center
     * @param address community center address
     * @param poolName community center pool name
     * @param features pool facility features
     * @param area community center area in square feet
     */
    public CommunityCentre(String address, String poolName, String features) {
        this.address = address;
        this.poolName = poolName;
        this.features = features;  
    }

    /**
     * Returns address
     * @return String address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns pool name
     * @return String pool name
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * Returns pool features
     * @return String features
     */
    public String getFeatures() {
        return features;
    }

    public String toString(){
        return ("Pool: " + poolName + ", " + address + ", " + features);

    }
    
}
