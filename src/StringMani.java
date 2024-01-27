import java.util.*;
public class StringMani {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("\n23MCA0078 || PRASATH VS\n\n");
	        System.out.print("Enter a character string: ");
	        String inputString = scanner.nextLine();
	        System.out.print("Enter the starting position (n): ");
	        int n = scanner.nextInt();
	        System.out.print("Enter the number of characters to extract (m): ");
	        int m = scanner.nextInt();
	        String extractedPortion = extractPortion(inputString, n, m);

	        String sortedExtractedPortion = sortStringAscending(extractedPortion);
	        
	        String remainingPortion = removePortion(inputString, n, m);

	        String sortedRemainingPortion = sortStringDescending(remainingPortion);

	        System.out.println("Extracted portion in ascending order): " + sortedExtractedPortion);
	        System.out.println("Remaining portion in descending order): " + sortedRemainingPortion);
	    }
	    public static String extractPortion(String str, int start, int length) {
	        return str.substring(start - 1, start - 1 + length);
	    }
	    public static String removePortion(String str, int start, int length) {
	        String firstPart = str.substring(0, start - 1);
	        String secondPart = str.substring(start - 1 + length);
	        return firstPart + secondPart;
	    }
	    public static String sortStringAscending(String str) {
	        char[] chars = str.toCharArray();
	        Arrays.sort(chars);
	        return new String(chars);
	    }
	    public static String sortStringDescending(String str) {
	        char[] chars = str.toCharArray();
	        Arrays.sort(chars);
	        return new StringBuilder(new String(chars)).reverse().toString();
	    }
	}

