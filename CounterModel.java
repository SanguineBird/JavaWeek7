/**Class: CIT-130-BIN1
Name: Meghan Moore
Date: 10/18/2014
Programming Assignment 7 - Part 1 - CounterModel class
Purpose: Implement the provided UML for a counter that increments
once a second until a given number of seconds is reached.*/

public class CounterModel{
  int counter = 0;
  
  public void CounterModel(int initialValue){
    counter = intialValue;
  }
  
  public void Increment(){
    Thread.sleep(1000);
    counter ++;
    CounterView view = new CounterView();
  }
}
