package Problem2;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create instances of MyPoint to represent corners
        MyPointDuplicate p1 = new MyPointDuplicate(1, 5);  // Top-left corner
        MyPointDuplicate p2 = new MyPointDuplicate(6, 1);  // Bottom-right corner

        // Create MyRectangle object using points
        MyRectangle rectangle1 = new MyRectangle(p1, p2);
        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        
        // Create another MyRectangle object using coordinates directly
        MyRectangle rectangle2 = new MyRectangle(2, 8, 5, 3);
        System.out.println("\nRectangle 2: " + rectangle2);
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
