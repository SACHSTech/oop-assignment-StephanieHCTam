package RegistrationSystem;
import java.io.*;

//import junit.framework.AssertionFailedError;

/**
* Main class file, simulates system
* A program that allows the user register for swim at community center.
* @author: S. Tam
*/

public class Main {
  
  // static BufferedReader so all methods can access it
  static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{

    // Initialize Community Centre objects
    CommunityCentre aaniin = new CommunityCentre("5665 14th Ave", "Aaniin Pool", "big pool, baby pool & splash pad, therapy pool, rock wall, sauna");

    CommunityCentre angusGlen = new CommunityCentre("3990 Major Mackenzie Dr E", "Angus Glen Pool", "big pool, baby pool");

    CommunityCentre centennial = new CommunityCentre("8600 McCowan Rd", "Centennial Pool", "big pool, baby pool, diving tank");

    CommunityCentre cornell = new CommunityCentre("3201 Bur Oak Ave", "Cornell Pool", "big pool, therapy pool, water slide & splash pad");

    CommunityCentre panAm = new CommunityCentre("16 Main St Unionville", "Pan Am Pool", "10 lane, 50 metres tank pool, 2.5 metres deep throughout");

    // Initialize Public Swim objects
    PublicSwim recSwim = new PublicSwim(true, false, true, false);
    PublicSwim laneSwim = new PublicSwim(true, false, false, true);

    // Initialize Private Swim objects
    PrivateSwim swimClub = new PrivateSwim(false, true, true, false, false, false);
    PrivateSwim aquafit = new PrivateSwim(false, true, false, true, false, false);
    PrivateSwim swimLessons = new PrivateSwim(false, true, false, false, true, false);
    PrivateSwim poolBooking = new PrivateSwim(false, true, false, false, false, true);

    // Initialize Staff objects
    Staff lifeguard = new Staff(false, false, true, false, false);
    Staff instructor = new Staff(false, false, false, true, false);
    Staff supervisor = new Staff(false, false, false, true, true);

    // Initialize Wristband objects
    Wristband red = new Wristband(true, false, null, 0, null, true, false, false);

    Wristband yellow = new Wristband(true, false, null, 0, null, false, true, false);

    Wristband green = new Wristband(true, false, null, 0, null, false, false, true);


    // Initialize variables
    String center;
    String program;

    // Starting interface that asks for a community center and swim program
    System.out.println(" ");
    System.out.println("---------- Welcome to Swim Registration! ----------");
    System.out.println(" ");

    System.out.println("Enter patron information: ");
    System.out.print("Name: ");
    String name = keyboard.readLine();

    System.out.print("Age: ");
    int age = Integer.parseInt(keyboard.readLine());

    System.out.print("Email: ");
    String email = keyboard.readLine();

    // Create patron object with user input
    Patron newPatron = new Patron(name, age, email) {
    };

    System.out.println(" ");
    System.out.println("---------- Choose a Pool ----------");
    System.out.println(" ");

    System.out.println("- Aaniin Pool");
    System.out.println("- Angus Glen Pool");
    System.out.println("- Centennial Pool");
    System.out.println("- Cornell Pool");
    System.out.println("- Pan Am Pool");
    System.out.println(" ");
    System.out.println("Enter the community center pool you would like to register: ");
    center = keyboard.readLine();

    if (center.equals("Aaniin Pool")) {
      System.out.println("Welcome to " + aaniin);
      System.out.println(" ");
    }
    
    if(center.equals("Angus Glen Pool")) {
      System.out.println("Welcome to " + angusGlen);
      System.out.println(" ");
    }

    if(center.equals("Centennial Pool")) {
      System.out.println("Welcome to " + centennial);
      System.out.println(" ");
    }

    if(center.equals("Cornell Pool")) {
      System.out.println("Welcome to " + cornell);
      System.out.println(" ");
    }

    if(center.equals("Pan Am Pool")) {
      System.out.println("Welcome to " + panAm);
      System.out.println(" ");
    }




      /* 
      System.out.print("Select a swim program (Public/Private): ");
      program = keyboard.readLine();
        if (program.equals("Public")){
          System.out.println("Public Swim options: ");
          System.out.println("1| Recreational Swim");
          System.out.println("2| Lane Swim");
        }
      }
      */
    
    
  }

}