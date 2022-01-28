package AssistedProjects;
import java.util.*;


public class Map {
	 public static void main(String args[]) {  
		    HashMap<Integer,String> map=new HashMap<Integer,String>();          
		      map.put(100,"Raju");    
		      map.put(101,"Sham");    
		      map.put(102,"Rakesh");  
		      map.put(103, "Anish");  
		    System.out.println("Initial list of elements: "+map);  
		    //key-based removal  
		    map.remove(100);  
		    System.out.println("Updated list of elements: "+map);  
		    //value-based removal  
		    map.remove(101);  
		    System.out.println("Updated list of elements: "+map);  
		    //key-value pair based removal  
		    map.remove(102, "Rahul");  
		    System.out.println("Updated list of elements: "+map);  
		   }      
		}  
