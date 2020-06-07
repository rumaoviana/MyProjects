import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class append {
	public static void usingBufferedWritter() throws IOException 
	{
		System.out.println("Enter the name of the video");
		Scanner sc=new Scanner(System.in);
		
	    String textToAppend =sc.nextLine();
	     
	   
	    BufferedWriter br = new BufferedWriter(new FileWriter("p2.txt", true));
	  
	    
	    br.write(textToAppend);
            br.newLine();
	   

	    br.close();
	    
	}

}
