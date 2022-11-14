package RegistrationSystem;
import java.io.*;

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

    // Initialize objects      

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