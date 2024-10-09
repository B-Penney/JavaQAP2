package Problem2;

public class MyRectangle {
    // Instance variables
    private MyPointDuplicate topLeft;
    private MyPointDuplicate bottomRight;
    
    // Constructor with points
    public MyRectangle(MyPointDuplicate topLeft, MyPointDuplicate bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Constructor with coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPointDuplicate(x1, y1);
        this.bottomRight = new MyPointDuplicate(x2, y2);
    }

    // Getters and Setters for topLeft and bottomRight
    public MyPointDuplicate getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPointDuplicate topLeft) {
        this.topLeft = topLeft;
    }

    public MyPointDuplicate getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPointDuplicate bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Calculates width
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Calculates height
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Calculates area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculates perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + 
               ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}

