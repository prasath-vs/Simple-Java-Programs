import java.util.*;

abstract class Products{
	String name;
	int id;
	double price;
	abstract void total();
}

class Category extends Products{
	String type;
	int discount;
	Scanner sc = new Scanner(System.in);
	void total()
	{
		System.out.print("Enter your Name: ");
		name = sc.next();
		System.out.print("Enter ID: ");
		id = sc.nextInt();
		System.out.print("Select Food\n1. Food A(5% off)\n2. Food B(10% off)\n");
		String type = sc.next();
	}
	void calculation()
	{
		if(type == "A" || type == "a")
		{
			price = 500;
			discount = 500 * (5/100);
			price = 500 - discount;
			System.out.print("\nFood A price = "+price);
		}
		else if(type == "B" || type == "b")
		{
			price = 1000;
			discount = 1000 * (10/100);
			price = 1000 - discount;
			System.out.print("\nFood price = "+price);
		}
	}
}

class Delivery extends Category{
	boolean dd;
	Scanner s = new Scanner(System.in);
	void doord()
	{
		System.out.print("Door Delivery (true - Need)/(false - No need): ");
		dd = s.nextBoolean();
		if(dd == true)
		{
			price += 50;
			System.out.print("Total Price = "+price);
		}
		else if(dd == false)
		{
			System.out.print("Total Price = "+price);
		}
	}
}

public class DeliveryMain {
	public static void main(String[] args) {
		Delivery d = new Delivery();
		d.total();
		d.calculation();
		d.doord();
	}
}
