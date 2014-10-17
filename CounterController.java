/**Class: CIT-130-BIN1
Name: Meghan Moore
Date: 10/18/2014
Programming Assignment 7 - Part 1 - CounterController class
Purpose: Implement the provided UML for a counter that increments
once a second until a given number of seconds is reached.*/

public class CounterController{
  int startValue, endValue;
  
  public CounterController(int startValue, int endValue){
    this.startValue = startValue;
    this.endValue = endValue;
  }
  
  public void Start(){
    int counter;
    CounterModel model = new CounterModel(startValue);
    
    for(counter = startValue, counter <= endValue, counter++){
      model.Indrement();
    }
  }
}
