class square {
    public double area(double a) {
        return a * a;
    }
}

class cube extends square {
    @Override
    public double area(double a) {
        return 6 * a * a;
    }
}

public class MainArea {
    public static void main(String[] args) {
        double sideLength = 5.0; 
        square sq = new square();
        double squareArea = sq.area(sideLength);
        cube c = new cube();
        double cubeSurfaceArea = c.area(sideLength);
        System.out.print("\n23MCA0078 || PRASATH VS\n\n");
        System.out.println("Area of the Square with side length " + sideLength + " = " + squareArea);
        System.out.println("Surface Area of the Cube with side length " + sideLength + " = " + cubeSurfaceArea);
    }
}
