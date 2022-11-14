package RegistrationSystem;

public class CommunityCentre {

    private String address;
    private String poolName;
    private String features;
    private int area;

    public CommunityCentre(String address, String poolName, String features, int area) {
        this.address = address;
        this.poolName = poolName;
        this.features = features;  
        this.area = area; 
    }

    public String getAddress() {
        return address;
    }

    public String getPoolName() {
        return poolName;
    }

    public String getFeatures() {
        return features;
    }

    public int getArea() {
        return area;
    }

    
}
