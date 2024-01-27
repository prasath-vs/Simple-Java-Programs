import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n23MCA0078 || PRASATH VS\n\n");
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		System.out.print("\nMultiplication Table\n");
		for(int i=1;i<=n;i++)
		{
			int res = n * i;
			System.out.print("\n"+i+" * "+n+" = "+res);
		}
	}
}
