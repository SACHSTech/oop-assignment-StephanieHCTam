package RegistrationSystem;
public class Wristband extends Patron{

    private boolean red;
    private boolean yellow;
    private boolean green;
    
    public Wristband(String name, int age, String email, boolean red, boolean yellow, boolean green){
        // Call to super constructor
        super(name, age, email); 

        this.red = red;
        this.yellow = yellow;
        this.green = green;
    }

    public boolean getRed(){
        return red;
    }

    public boolean getYellow(){
        return yellow;
    }

    public boolean getGreen(){
        return green;
    }

    /*
    public void showWristband() {

        super(publicSwim, privateSwim, name, age, email); 

        if (int age < 6) {
            System.out.println("Public Swim: select a program");
            System.out.println("Recreational Swim, Lane Swim");
        }

        if (privateSwim) {
            System.out.println("Private Swim: select a program");
            System.out.println("Swim Club, Aquafit, Swim Lessons, Pool Booking");
        }
    }
     */
}
