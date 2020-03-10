package Creational_Patterns2;
import java.util.ArrayList;  
import java.util.List;  
public class BikeType {
	
	
	             private List<Packing> items=new ArrayList<Packing>();  
	             public void addItem(Packing packs) {    
	                    items.add(packs);  
	             }  
	             public void getCost(){  
	              for (Packing packs : items) {  
	                        packs.Cost();  
	              }   
	             }  
	             public void showItems(){  
	              for (Packing packing : items){  
	             System.out.print("Bike name : "+packing.pack());  
	             System.out.println(", Price : "+packing.Cost());  
	            
	}

}
}
