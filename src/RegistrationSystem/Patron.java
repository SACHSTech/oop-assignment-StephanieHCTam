package RegistrationSystem;

/**
 * Patron class file, extends SwimPrograms
 * @author S. Tam
 * 
 */

public class Patron extends SwimPrograms {

    // instance variables
    private String name;
    private int age;
    private String email;

    /**
     * Constructor: creates new instance for a patron registering a swim program
     * @param name patron name
     * @param age patron age
     * @param email patron's email
     */
    public Patron(String address, String poolName, String features, int area, boolean publicSwim, boolean privateSwim, String name, int age, String email) {
        super(address, poolName, features, area, publicSwim, privateSwim); 
        this.name = name;
        this.age = age;
        this.email = email;  
    }

    /**
     * Returns patron's name
     * @return String address
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
}