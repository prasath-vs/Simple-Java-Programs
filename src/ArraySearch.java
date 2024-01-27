import java.util.*;
public class ArraySearch {

	public static void main(String[] args)
	{
		int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n23MCA0078 || PRASATH VS\n\n");
        System.out.print("Enter array size: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter array elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("\nEnter the element to be searched: ");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position: "+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
