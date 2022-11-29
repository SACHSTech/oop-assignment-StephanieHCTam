package RegistrationSystem;

/**
 * Community Center class file
 * @author S. Tam
 */

public class CommunityCentre {

    // Instance variables
    private Address address;
    private String poolName;
    private String features;

    /**
     * Constructor: creates new instance of Community Center
     * @param address community center address
     * @param poolName community center pool name
     * @param features pool facility features
     * @param area community center area in square feet
     */
    public CommunityCentre(Address address, String poolName, String features) {
        this.address = address;
        this.poolName = poolName;
        this.features = features;  
    }

    /**
     * Returns address
     * @return String address
     */
    public String getAddress() {
        return this.address.toString();
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

    /**
     * Output pool name and features to screen/user
     * @return string representation of pool name and features
     */
    public String toString(){
        return (poolName + ": " + address + "\nFeatures: " + features + ".");
    }
}
