/**Class: CIT-130-BIN1
Name: Meghan Moore
Date: 10/18/2014
Programming Assignment 7 - Part 1 - Test class
Purpose: Implement the provided UML for a counter that increments
once a second until a given number of seconds is reached.*/

import java.util.Scanner;

public class Assignment7Part1Test{
  
  public static void main(String[] args){
    boolean finished = false, valid = false, yN = false; //sentinels
    int start = 0, end = 0; //0 to keep compiler happy
    String answer;
    CounterController controller;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("This program tests a timer.");
    
    while (finished == false){
      valid = false;
      while (valid == false){
        System.out.println("Enter a start number of seconds");
        try{
          start = keyboard.nextInt();
          valid = true;
        }
        catch (Exception e){
          System.out.println("Error: invalid input.");
          valid = false;
        }
      }
      
      valid = false;
      while(valid == false){
        System.out.println("Enter an end number of seconds");
        try{
          end = keyboard.nextInt();
          if(end < start)
            System.out.println("Error: end value must be greater than start value.");
          else
          valid = true;
        }
        catch (Exception e){
          System.out.println("Error: invalid input.");
          valid = false;
        }
      }
      
      System.out.println("CounterController Starting.");
      controller = new CounterController(start, end);
      controller.Start();
      
      yN = false;
      while (yN == false){
        System.out.println("Continue? (y/n)");
        answer = keyboard.next();
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
