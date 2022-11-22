package RegistrationSystem;
public class Wristband extends Patron{

    private String red;
    private String yellow;
    private String green;
    
    public Wristband(String address, String poolName, String features, int area, boolean publicSwim, boolean privateSwim, String name, int age, String email, String red, String yellow, String green){
        // Call to super constructor
        super(address, poolName, features, area, publicSwim, privateSwim, name, age, email); 

        this.red = red;
        this.yellow = yellow;
        this.green = green;

    }
}
