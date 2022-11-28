package RegistrationSystem;

/**
 * PublicSwim subclass
 * @author S. Tam
 * 
 */

public class PublicSwim extends SwimPrograms {

    // Instance variables
    private boolean recSwim;
    private boolean laneSwim;

    public PublicSwim(boolean publicSwim, boolean privateSwim, boolean recSwim, boolean laneSwim){
        super(publicSwim, privateSwim);
        this.recSwim = recSwim;
        this.laneSwim = laneSwim;
    }

    public boolean getRecSwim(){
        return recSwim;
    }

    public boolean getLaneSwim(){
        return laneSwim;
    }

    /* 
    public void showPrograms() {

        if (recSwim) {
            System.out.println("Recreational Swim");
        }

        if (laneSwim) {
            System.out.println("Lane Swim");
        }
    }
    */
}
