import java.util.*;

class MaximumFinder {
  
    public static int findMax(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}

public class MainClass {
    public static void main(String[] args) {
   
        int a1 = 5, b1 = 2, c1 = 10;
        int max1 = MaximumFinder.findMax(a1, b1, c1);
        System.out.print("\n23MCA0078 || PRASATH VS\n\n");
        System.out.println("For given values (" + a1 + ", " + b1 + ", " + c1 + "):");
        System.out.println("Maximum value is: " + max1);
        int a2 = 75, b2 = 20, c2 = 89;
        int max2 = MaximumFinder.findMax(a2, b2, c2);
        System.out.println("\nFor given values (" + a2 + ", " + b2 + ", " + c2 + "):");
        System.out.println("Maximum value is: " + max2);
    }
}

