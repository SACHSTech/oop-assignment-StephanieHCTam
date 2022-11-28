package RegistrationSystem;
public class Wristband{

    private String wristbandColor;

    public Wristband(int age){

        if (age < 6) {
            this.wristbandColor = "Red";
        }
    
        else if (age > 7 &&  age < 11) {
            this.wristbandColor = "Yellow";
        }
    
        else {
            this.wristbandColor = "Green";
        }
    
    }

    public String getWristbandColor(){
        return wristbandColor;
    }

}
