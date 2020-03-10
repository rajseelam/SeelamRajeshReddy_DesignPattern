package Creational_Patterns2;

public class CompanyBike {
	   public BikeType buildHondaBike(){   
           BikeType cds=new BikeType();  
           cds.addItem(new Honda());  
           return cds;  
    }  
    public BikeType buildKTMBike(){  
   BikeType cds=new BikeType();  
   cds.addItem(new KTM());  
   return cds;  
    }  

}
