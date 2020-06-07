import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class borrow 
{ 
	public static void main()
	{
	    double count = 0,countBuffer=0,countLine=0;
	    
	    String filePath = "p2.txt";
	    BufferedReader br;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the video name for borrow");
	    String inputSearch =sc.nextLine();
	    String line = "";

	    try {
	        br = new BufferedReader(new FileReader(filePath));
	        try {
	            while((line = br.readLine()) != null)
	            {
	                countLine++;
	               // System.out.println(line);
	                String[] words = line.split("\n");

	                for (String word : words) {
	                  if (word.equalsIgnoreCase(inputSearch)) {
	                    count++;
	                    
	                  }
	                }
	            }
	            br.close();
	        } catch (IOException e) {
	            
	            e.printStackTrace();
	        }
	    } catch (FileNotFoundException e) {
	       
	        e.printStackTrace();
	    }
	    if(count>0) {
	    System.out.println("Video found and can be borrowed...");
	    
		
	    }
	    else {
	    	System.out.println("Video not found");
	    }
	    
	}
	
}
	
