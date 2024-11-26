package U5T1_Anatomy_of_a_class;
public class Dice {
    
    private int sides;
    private int rollValue;
    private int rollCount;
    
    public Dice (int sides) {
        this.sides = sides;
        rollCount = 0; 
        rollValue = 0;
    }

    public int getSides() {
        return sides;
    }

    public int getRollValue() {
        return rollValue;
    }

    public int getRollCount() {
        return rollCount;
    }

    public void setSides(int newSides) {
        sides = newSides;
    }

    public void roll() {
        int roll = (int) (Math.random() * sides) + 1;
        rollValue = roll; 
        rollCount++;
    }
}