interface Exam 
{
	boolean Pass(int mark);
}

interface Classify {
	String Division(int average);
}

class Result implements Exam, Classify {
	public boolean Pass(int mark) {
		if (mark >= 50) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	public String Division(int average) {
		if (average >= 60) 
		{
			return "First";
		} 
		else if (average >= 50) {
			return "Second";
		} 
		else {
			return "No Division";
		}
	}
}
class ExamMain {
	public static void main(String[] args) {
		Result r = new Result();
		System.out.print("\n23MCA0078 || PRASATH VS\n\n");
		System.out.println("Pass(40) = " + r.Pass(40));
		System.out.println("Pass(50) = " + r.Pass(50));
		System.out.println("Pass(60) = " + r.Pass(60));
		System.out.println("Division(40) = " + r.Division(40));
		System.out.println("Division(50) = " + r.Division(50));
		System.out.println("Division(60) = " + r.Division(60));
	}
}