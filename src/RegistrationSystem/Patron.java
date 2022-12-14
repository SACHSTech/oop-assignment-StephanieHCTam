package RegistrationSystem;

/**
 * Patron class file
 * @author S. Tam
 */

public class Patron{

    // Instance variables
    private String name;
    private int age;
    private String email;
    // Aggregation relationship with Wristband class
    private Wristband wristband;

    /**
     * Constructor: creates new instance for patron registering for a swim program
     * @param name patron name
     * @param age patron age
     * @param email patron's email
     */
    public Patron(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;  
        // wristband object is determined by patrons age in Wristband class
        this.wristband = new Wristband(age);
    }

    /**
     * Returns patron's name
     * @return String name
     */

    public String getName() {
        return name;
    }

    /**
     * Returns patron's age
     * @return int age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns patron's email
     * @return String email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns patron's wristband color
     * @return String wristbandColor
     */
    public String getWristbandColor() {
        return this.wristband.getWristbandColor();
    }

    /**
     * Setter method for patron's name
     * @param name a new name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Setter method for patrons's age
     * @param age a new age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Setter method for patrons's email
     * @param email a new email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Output user name, age, email to screen
     * @return string representation of name, age, email
     */
    public String toString(){
        return "Name: " + name + "age: " + age + "email: " + email;
    }
}