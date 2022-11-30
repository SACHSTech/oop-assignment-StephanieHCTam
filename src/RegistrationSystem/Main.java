package RegistrationSystem;
import java.io.*;

/**
* Main class file, simulates system
* A program that allows the user register for swimm programs at a chosen community center.
* @author: S. Tam
*/

public class Main {
  
  // static BufferedReader so all methods can access it
  static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{

    // Initialize community center Address objects
    Address aaniinAddr = new Address(5665, "14th Ave");
    Address angusGlenAddr = new Address(3990, "Major Mackenzie Dr E");
    Address centennialAddr = new Address(8600, "McCowan Rd");
    Address cornellAddr = new Address(3201, "Bur Oak Ave");
    Address panAmAddr = new Address(16, "Main St Unionville");

    // Initialize Community Centre objects
    CommunityCentre aaniin = new CommunityCentre(aaniinAddr, "Aaniin Pool", "big pool, baby pool & splash pad, therapy pool, rock wall, sauna");
    CommunityCentre angusGlen = new CommunityCentre(angusGlenAddr, "Angus Glen Pool", "big pool, baby pool");
    CommunityCentre centennial = new CommunityCentre(centennialAddr, "Centennial Pool", "big pool, baby pool, diving tank");
    CommunityCentre cornell = new CommunityCentre(cornellAddr, "Cornell Pool", "big pool, therapy pool, water slide & splash pad");
    CommunityCentre panAm = new CommunityCentre(panAmAddr, "Pan Am Pool", "10 lane, 50 metres tank pool, 2.5 metres deep throughout");

    // Initialize variables
    String center;
    String program;
    String pubSwim;
    String privSwim;

    // Starting interface that asks for a community center and swim program
    System.out.println(" ");
    System.out.println("---------- Swim Registration ----------");
    System.out.println(" ");

    // User input to create patron object
    System.out.println("Enter patron information: ");
    System.out.print("Name: ");
    String name = keyboard.readLine();

    System.out.print("Age: ");
    int age = Integer.parseInt(keyboard.readLine());

    System.out.print("Email: ");
    String email = keyboard.readLine();

    // Create patron object with user input
    Patron newPatron = new Patron(name, age, email);

    System.out.println("Hello " +  newPatron.getName() + "!");

    // User inputs a selected pool
    System.out.println(" ");
    System.out.println("---------- Choose a Pool ----------");
    System.out.println(" ");

    System.out.println("- Aaniin Pool");
    System.out.println("- Angus Glen Pool");
    System.out.println("- Centennial Pool");
    System.out.println("- Cornell Pool");
    System.out.println("- Pan Am Pool");
    System.out.println(" ");
    System.out.print("Enter the community center pool you would like to register: ");
    center = keyboard.readLine();
    System.out.println(" ");

    // The selected pool outputs pool name and features
    if (center.equalsIgnoreCase("Aaniin Pool")) {
      System.out.println("Welcome to " + aaniin);
      System.out.println(" ");
    }
    
    if(center.equalsIgnoreCase("Angus Glen Pool")) {
      System.out.println("Welcome to " + angusGlen);
      System.out.println(" ");
    }

    if(center.equalsIgnoreCase("Centennial Pool")) {
      System.out.println("Welcome to " + centennial);
      System.out.println(" ");
    }

    if(center.equalsIgnoreCase("Cornell Pool")) {
      System.out.println("Welcome to " + cornell);
      System.out.println(" ");
    }

    if(center.equalsIgnoreCase("Pan Am Pool")) {
      System.out.println("Welcome to " + panAm);
      System.out.println(" ");
    }

    // User inputs swim program
    System.out.println("---------- Select a Swim Program ----------");
    System.out.println(" ");

    System.out.print("Public or Private: ");
    program = keyboard.readLine();
    System.out.println(" ");

    // The selected public swim outputs the specific type of programs offered
    if (program.equalsIgnoreCase("Public")){
      System.out.println("---------- Select a Public Swim ----------");
      System.out.println(" ");
      System.out.println("Public Swim options: ");
      System.out.println("- Recreational Swim");
      System.out.println("- Lane Swim");
      System.out.println(" ");

      // User inputs type of public swim program
      System.out.print("Enter public swim program: ");
      pubSwim = keyboard.readLine();

      // Notify the patron of emailed information based on their input
      System.out.println(" ");
      System.out.println(name + "'s registration for " + pubSwim + " at " + center + " will be sent to " + email);
      System.out.println(" ");
    }

    // The selected private swim outputs the specific type of programs offered
    if (program.equalsIgnoreCase("Private")){
      System.out.println("---------- Select a Private Swim ----------");
      System.out.println(" ");
      System.out.println("Private Swim options: ");
      System.out.println("- Swim Club");
      System.out.println("- Aquafit");
      System.out.println("- Lessons");
      System.out.println("- Pool Booking");

      // User inputs type of private swim program
      System.out.println(" ");
      System.out.print("Enter private swim program: ");
      privSwim = keyboard.readLine();

      // Notify the patron of emailed information based on their input
      System.out.println(" ");
      System.out.println(name + "'s registration for " + privSwim + " at " + center + " will be sent to " + email);
      System.out.println(" ");
    }

    // Output wristband color for user
    System.out.println("---------- Get a Wristband ----------");
    System.out.println(" ");
    System.out.println(newPatron.getName() + " --> " + newPatron.getWristbandColor() + " Wristband.");
    System.out.println(" ");

    // Output thank you note for user
    System.out.println(" ");
    System.out.println("Thank you for registering!");
    System.out.println("--------------------------------------------------------------------------");
    System.out.println(" ");
  }
}