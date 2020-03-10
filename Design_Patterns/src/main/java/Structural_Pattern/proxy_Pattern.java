package Structural_Pattern;
import java.io.*;
import java.util.Scanner;
public class proxy_Pattern {
	public static void main(String[] args)
	{
		
		
		OfficeinternetAccess O=new ProxyInternetAccess();
		O.grantInternetAccess();
		
		OfficeinternetAccess O1=new RealInternetAccess();
		O1.grantInternetAccess();
	}

}
