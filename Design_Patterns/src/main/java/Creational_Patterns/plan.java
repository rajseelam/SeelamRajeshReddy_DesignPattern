package Creational_Patterns;
import java.util.*;
import java.io.*;
abstract class plan {
		protected int Cost;
		public abstract void CostTrip();
		public void CalaculateCost()
		{
		System.out.println("The Cost of Trip is: "+Cost);
		}
}
