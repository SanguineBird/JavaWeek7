/**Class: CIT-130-BIN1
Name: Meghan Moore
Date: 10/18/2014
Programming Assignment 7 - Part 1 - Test class
Purpose: Implement the provided UML for a counter that increments
once a second until a given number of seconds is reached.*/

import java.util.Scanner;

public class Assignment7Part1Test{
  
  public static void main(String[] args){
    boolean finished = false, yN = false; //sentinels
    int start, end;
    String answer;
    CounterController controller;
    Scanner keyboard = new Scanner();
    
    System.out.println("This program tests a timer.");
    
    while (finished == false){
      valid = false;
      while (! keyboard.hasNextInt()){ //if this doesn't work, try/catch?
        System.out.println("Enter a start number of seconds");
        start = keyboard.NextInt();
      }
      
      while(! keyboard.hasNextInt()){ //if this doesn't work, try/catch?
        System.out.println("Enter an end number of seconds");
        end = keyboard.NextInt();
      }
      
      System.out.println("CounterController Starting.");
      controller = new CounterController(start, end);
      controller.Start();
      
      yN = false;
      while (yN == false){
        System.out.println("Continue? (y/n)");
        answer = keyboard.Next();
        if (answer.equalsIgnoreCase("y")){
          finished = false;
          yN = true;
        }
        else if (answer.equalsIgnoreCase("n")){
          finished = true;
          yN = true;
        }
        else{
          System.out.println("Invalid Input");
          yN = false;
        }
      }
    }
    System.out.println("Process completed.");
  }
}
