import java.util.*;
public class NPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, n, p, count, flag;
		
		System.out.print("\n23MCA0078 || PRASATH VS\n\n");
		System.out.println("Enter n value: ");
		n = sc.nextInt();
		System.out.print("\nFirst "+n+" Prime numbers are: ");
		
		p = 2;
		i = 1;
		
		while(i<=n)
		{
			flag = 1;
			for(count=2;count<=p-1;count++)
			{
				if(p%count == 0)
				{
					flag = 0;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.print(p+" ,");
				i++;
			}
			p++;
		}
	}
}
