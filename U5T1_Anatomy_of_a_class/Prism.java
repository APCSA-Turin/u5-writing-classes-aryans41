package U5T1_Anatomy_of_a_class;
public class Prism {
    
    private int length;
    private int width;
    private int height;

    public Prism (int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism(int sideLength) {
        length = sideLength; 
        width = sideLength; 
        height = sideLength; 
    }

    public Prism() {
        length = (int) (Math.random() * 91) + 10; 
        width = (int) (Math.random() * 91) + 10; 
        height = (int) (Math.random() * 91) + 10; 
    }

    public void setLength (int newLength) {
        length = newLength;
    }

    public void setWidth (int newWidth) {
        width = newWidth;
    }

    public void setHeight (int newHeight) {
        height = newHeight;
    }

    public String dimensions () {
        String dimensions = "Length = " + length + "\n" + "Width = " + width + "\n" + "Height = " + height;
        return dimensions;
    }

    public int volume() {
        int volume = length * width * height;
        return volume;
    }

    public int surfaceArea() {
        int surfaceArea = 2 * (length*width + length*height + width*height);
        return surfaceArea;
    }

}


