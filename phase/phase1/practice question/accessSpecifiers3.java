package AssistedProjects;
class accessSpecifiers {
	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}


public class accessSpecifiers3 {

	public static void main(String[] args) {
		accessSpecifiers  obj  = new accessSpecifiers ();   
	       obj.display();  
	}

}
