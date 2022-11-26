package RegistrationSystem;
import java.io.*;

import junit.framework.AssertionFailedError;

/**
* Main class file, simulates system
* A program that allows the user register for swim at community center.
* @author: S. Tam
* 
*/

public class Main {
  
  // static BufferedReader so all methods can access it
  static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{

    // Initialize Community Centre objects
    CommunityCentre aaniin = new CommunityCentre("5665 14th Ave", "Aaniin Pool", "Aquatics Center");
    CommunityCentre angusGlen = new CommunityCentre("3990 Major Mackenzie Dr E", "Angus Glen Pool", "Aquatics Center");
    CommunityCentre centennial = new CommunityCentre("8600 McCowan Rd", "Centennial Pool", "Aquatics Center");
    CommunityCentre cornell = new CommunityCentre("3201 Bur Oak Ave", "Cornell Pool", "Aquatics Center");
    CommunityCentre millikenMills = new CommunityCentre("7600 Kennedy Rd", "Milliken Mills Pool", "Aquatics Center");

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
    int age;

    // Starting interface that asks for a community center and swim program
    System.out.println("Welcome to Swim Registration!");
    System.out.println(" ");
    System.out.println("A| Aaniin Community Centre");
    System.out.println("B| Angus Glen Community Centre");
    System.out.println("C| Centennial Community Centre");
    System.out.println("D| Cornell Community Centre");
    System.out.println("E| Milliken Mills Community Centre");
    System.out.println(" ");
    System.out.println("Enter the community center you would like to register: ");
    center = keyboard.readLine();

    if (center.equals("A")) {
      System.out.println("Welcome to Aaniin Community Centre!");
      System.out.println("Facility Area: 122,000 sq.ft");
      System.out.println("Aquatics center features: Lane Pool, Baby Pool, Hot Tub, Rock Wall, Sauna");
      System.out.println(" ");
      System.out.print("Select a swim program (Public/Private): ");
      program = keyboard.readLine();
        if (program.equals("Public")){
          System.out.println("Public Swim options: ");
          System.out.println("1| Recreational Swim");
          System.out.println("2| Lane Swim");
        }
    }
    
  }

}