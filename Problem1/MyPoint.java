package Problem1;
public class MyPoint {
    // Instance variables
    private int x;
    private int y;
    
    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getter and Setter methods for x and y
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    // Calculates the distance between two points
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Overriding toString to display point information
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}