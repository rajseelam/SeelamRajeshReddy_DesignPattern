package Structural_Pattern1;

public class AdapaterPatternDemo {  
	 public static void main(String args[]){  
	  CreditCard targetInterface=new BankCustomer();  
	  targetInterface.giveBankDetails();  
	  System.out.print(targetInterface.getCreditCard());  
	 }   
	}
