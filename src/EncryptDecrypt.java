import java.util.*;
public class EncryptDecrypt {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0, stringSize = 0;
		String snum;
		
		System.out.print("\n23MCA0078 || PRASATH VS\n\n");
		System.out.print("Enter a 4 digit number: ");
		snum = sc.nextLine();
		stringSize = snum.length();
		
		if(stringSize == 4)
		{
			num = Integer.parseInt(snum);
		}
		
		int a = num/1000;
		int b = num/100 % 10;
		int c = num/10 % 10;
		int d = num%10;
		
		a = (a+7);
		b = (b+7);
		c = (c+7);
		d = (d+7);
		
		a = a%10;
		b = b%10;
		c = c%10;
		d = d%10;
		System.out.print("\nThe Encrypted Value = "+c+d+a+b);
	}

}
