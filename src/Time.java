import java.util.*;
public class Time {
	    private int minutes;
	    public Time(int minutes) {
	        this.minutes = minutes;
	    }

	    public void displayTime() {
	        int hours = minutes / 60;
	        int remainingMinutes = minutes % 60;
	        System.out.print("\n23MCA0078 || PRASATH VS\n\n");
	        System.out.println("Time Worked: " + hours + " hours and " + remainingMinutes + " minutes");
	    }

	    public static void main(String[] args) {

	        int minutesWorked = 135;
	        Time timeWorked = new Time(minutesWorked);
	        timeWorked.displayTime();
	    }
	}
