package FRQ_Check;
public class StepTracker {
    private int minimumSteps; 
    private int numDays;
    private int totalSteps; 
    private int numActiveDays; 
  
    public StepTracker(int minSteps) {
      minimumSteps = minSteps; 
      numActiveDays = 0; 
      totalSteps = 0;
      numDays = 0;
    }
    
    public void addDailySteps(int steps) {
       totalSteps += steps; 
       numDays++;
       if (steps >= minimumSteps) {
           numActiveDays++;
       }
    }
    
    public int activeDays() {
       return numActiveDays;
    }
  
    public double averageSteps() {
       if (numDays == 0) {
          return 0.0;
       } else {
         double averageSteps = (double) totalSteps/numDays; 
         return averageSteps; 
       }
    }
  }
  
