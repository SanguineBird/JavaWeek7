/**Class: CIT-130-BIN1
Name: Meghan Moore
Date: 10/18/2014
Programming Assignment 7 - Part 2 - Test class
Purpose: Implement and test a templated binary search.*/

import java.util.Scanner;
import java.util.Arrays;

public class Assignment7Part2Test{
  
  public static void main(String[] args){
    BinarySearch searches = new BinarySearch();
    int result, key;
    Integer [] integerArray = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
    String [] stringArray = {"apples", "oranges", "peaches", "strawberries", "watermelons"};
    
    System.out.println("Integer test array contains:");
    System.out.println(Arrays.toString(integerArray));
    
    for(key = -3; key == 4; key++){
      result = searches.<Integer>search(integerArray, 0, 10, key);
      searches.toString(Integer.toString(key), result);
    }
    
    System.out.println("\nString test array contains:");
    System.out.println(Arrays.toString(stringArray)); //toString may not be necessary
    
    result = searches.<String>search(stringArray, 0, 10, "apples");
    searches.toString("apples", result);
    result = searches.<String>search(stringArray, 0, 10, "plums");
    searches.toString("plums", result);
    
    System.out.println("\nProcess completed.");
  }
}
