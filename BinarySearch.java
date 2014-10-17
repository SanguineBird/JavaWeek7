/**Class: CIT-130-BIN1
Name: Meghan Moore
Date: 10/18/2014
Programming Assignment 7 - Part 2 - BinarySearch class
Purpose: Implement and test a templated binary search.*/

public class BinarySearch{

  /**This code is modified from Display 11.6 of Absolute Java, 5th ed.
  It searches the array a for key. If key is not in the array segment,
  then -1 is returned. Otherwise, it returns an index in the
  segment such that key == a[index].
  Precondition: a[first] <= a[first + 1] <= ... <= a[last] */

  public static <T extends Comparable> int search(T [] a, int first, int last, T key){
    int result = 0; //to keep the compiler happy.
    
    if (first > last)
      result = -1;
    else{
      int mid = (first + last)/2;
      
      if (key.compareTo(a[mid]) == 0)
        result = mid;
      else if (key.compareTo(a[mid]) < 0)
        result = search(a, first, mid - 1, key);
      else if (key.compareTo(a[mid]) > 0)
        result = search(a, mid + 1, last, key);
      else{
        System.out.println("Error");
        result = -1;
      }
    }
    return result;
  }
  
  public static void toString(String key, int result){
    if(result == -1)
      System.out.println(key + " is not in the array.");
    else
      System.out.println(key + " is at index " + result);
  }
}
