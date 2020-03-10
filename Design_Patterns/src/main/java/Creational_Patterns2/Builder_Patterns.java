package Creational_Patterns2;
import java.util.*;
public class Builder_Patterns {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to the Bike Online Shopping");
	System.out.println("The Cost of Bike is:");
	CompanyBike BikeBuilder=new CompanyBike();  
	   BikeType BikeType1=BikeBuilder.buildHondaBike();  
	   BikeType1.showItems();  
	  
	   BikeType BikeType2=BikeBuilder.buildKTMBike();  
	   BikeType2.showItems();  
	
}
}
