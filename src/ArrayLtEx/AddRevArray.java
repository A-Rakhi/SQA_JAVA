package ArrayLtEx;
import java.util.ArrayList;
import java.util.Collections;


public class AddRevArray {
	
	public static void main(String[] args)
	    {
	        ArrayList<Integer> arrayli = new ArrayList<Integer>();
	 
	        // Appending elements at the end of the list
	        arrayli.add(1);
	        arrayli.add(2);
	        arrayli.add(3);
	        arrayli.add(4);
	        System.out.print("Elements before adding:");
	        
	        System.out.print(arrayli);
            arrayli.add(5);
            
	        System.out.print("\nElements after adding:");

	        //displaying elements
	        System.out.print(arrayli);

	        Collections.reverse(arrayli);
	        
	        System.out.print("\nElements after reversing:");
	        System.out.print(arrayli);
	    }

}
