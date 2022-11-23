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

    public String getRed(){
        return red;
    }

    public String getYellow(){
        return yellow;
    }

    public String getGreen(){
        return green;
    }

    public void showWristband() {

        super(address, poolName, features, area, publicSwim, privateSwim, name, age, email); 

        if (int age < 6) {
            System.out.println("Public Swim: select a program");
            System.out.println("Recreational Swim, Lane Swim");
        }

        if (privateSwim) {
            System.out.println("Private Swim: select a program");
            System.out.println("Swim Club, Aquafit, Swim Lessons, Pool Booking");
        }
    }
}
