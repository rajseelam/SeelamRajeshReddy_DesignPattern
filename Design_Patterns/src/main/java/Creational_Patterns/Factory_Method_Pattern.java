package Creational_Patterns;
import java.util.*;
public class Factory_Method_Pattern {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		get_Trip_Factory  Factory=new get_Trip_Factory();
		System.out.println("Welcome to Rajesh Traveling agency");
		System.out.print("Enter the Which City You want go to Trip :");
		String City=sc.next();
		plan p=Factory.get_Trip(City);
		p.CostTrip();
		p.CalaculateCost();
		
	}

	

}
