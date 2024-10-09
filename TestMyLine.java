public class TestMyLine {
    public static void main(String[] args) {
        // Test MyPoint class
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        
        // Test MyLine class
        MyLine line1 = new MyLine(p1, p2);
        System.out.println("Line 1: " + line1);
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 1: " + line1.getGradient());
        
        // Test using constructor with coordinates
        MyLine line2 = new MyLine(1, 1, 2, 2);
        System.out.println("Line 2: " + line2);
        System.out.println("Length of Line 2: " + line2.getLength());
        System.out.println("Gradient of Line 2: " + line2.getGradient());
        
        // Modify and retest
        line2.setEndXY(5, 5);
        System.out.println("Modified Line 2: " + line2);
        System.out.println("New length of Line 2: " + line2.getLength());
        System.out.println("New gradient of Line 2: " + line2.getGradient());
    }
}

