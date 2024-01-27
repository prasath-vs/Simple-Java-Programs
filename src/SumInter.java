import java.util.*;

interface Numbers{
	int process(int a,int b);
}

class Sum implements Numbers{
	
	public int process(int a, int b){
		return(a+b);
	}
}

class Average implements Numbers{
	public int process(int a, int b){
		return((a+b)/2);
	}
}

public class SumInter{
	public static void main(String[] args){
		Sum s = new Sum();
		Average a= new Average();
		System.out.print("\n23MCA0078 || PRASATH VS\n\n");
		System.out.println("Sum of numbers = " +s.process(5,5));
		System.out.println("Average = " +a.process(5,5));
	}
}