import java.util.*;
public class TowerOfHanoi {

	static void Hanoi(int n, char from_rod, char to_rod, char helper_rod)
    {
        if (n == 1)
        {
            System.out.println("Take disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        Hanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        Hanoi(n-1, helper_rod, to_rod, from_rod);
    }

    public static void main(String args[])
    {
        int n = 5;
        System.out.print("\n23MCA0078 || PRASATH VS\n\n");
        Hanoi(n,'A','C', 'B');
    }
}
