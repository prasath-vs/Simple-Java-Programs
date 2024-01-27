import java.util.*;

public class RandomInt {

	public static void main(String[] args)
	{
		System.out.print("\n23MCA0078 || PRASATH VS\n\n");
		Random rn = new Random();
		int rd = rn.nextInt();
		System.out.print("\nRandom Integer = "+rd);
		int sum = 0;
		String str = String.valueOf(rd);
		int n = str.length();
		for(int i=0;i<n;i++)
		{
			sum += (int)(str.charAt(i) - '0');
		}
		if(sum % 3 == 0 && str.charAt(n - 1) == '0')
		{
			System.out.print("\nIt is divisible");
		}
		else
		{
			System.out.print("\nIt is not divisible");
		}
	}
}
