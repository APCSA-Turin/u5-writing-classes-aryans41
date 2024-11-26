package FRQ_Check;
public class AdditionPattern {
  private int startingValue;
  private int increaseValue;
  private int currentValue; 

 public AdditionPattern(int start, int increase) {
   startingValue = start; 
   increaseValue = increase; 
   currentValue = startingValue;
 }

 public int currentNumber() {
   return currentValue;
 }

 public void next() {
   currentValue += increaseValue;
 }

 public void previous () {
   if (currentValue - increaseValue >= startingValue) {
       currentValue = currentValue - increaseValue;
   }
 }
}

