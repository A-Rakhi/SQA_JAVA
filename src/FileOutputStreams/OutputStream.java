package FileOutputStreams;
import java.io.FileOutputStream;  


public class OutputStream {
	public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("D:\\Program Files/Rakhi/myFile.txt");    
          String s="Welcome to javaTpoint.";    
          byte b[]=s.getBytes();//converting string into byte array    
          fout.write(b);    
          fout.close();    
          System.out.println("success...");    
         }
        catch(Exception e){System.out.println(e);}    
   }    
}  


