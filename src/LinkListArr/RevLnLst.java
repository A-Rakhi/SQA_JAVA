package LinkListArr;
import java.util.LinkedList;
import java.util.Collections;

public class RevLnLst {

	    public static void main(String[] args) 
	    {
	        //Creating a LinkedList object          
	        LinkedList<String> linkedlist = new LinkedList<String>(); 
	 
	        //Adding elements to LinkedList object 
	        linkedlist.add("Java");        
	        linkedlist.add("Python");
	        linkedlist.add("C++");
	        linkedlist.add("PHP");
	         
	        //Displaying linkedlist before reverse         
	        System.out.print("Before ADD LinkedList:");         
	        System.out.println(linkedlist);
	        
	        linkedlist.add("Ruby");
	         
		    System.out.print("After ADD LinkedList:");         
		    System.out.println(linkedlist);

	         
	        /*Reversing the list using 
	          Collections.reverse() method*/        
	        Collections.reverse(linkedlist);
	         
	        //Displaying linkedlist after reverse         
	        System.out.print("After Reverse LinkedList:");         
	        System.out.println(linkedlist);
	    }
	}


