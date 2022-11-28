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

    public int getAge(){
        return super.getAge();
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


    public void showWristband() {

        if (getAge() < 6) {
            red = true;
            System.out.println("Red Wristband");
        }

        if (getAge() > 7 &&  getAge() < 11) {
            yellow = true;
            System.out.println("Yellow Wristband");
        }

        else{
            green = true;
            System.out.println("Green Wristband");
        }
    }

    //public String toString(){
    //    return ("Wristband: ");
    //}
}
