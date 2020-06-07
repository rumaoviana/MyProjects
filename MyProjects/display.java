import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class display
{
	public static void main() throws FileNotFoundException, IOException
	{
		
	try (BufferedReader br = new BufferedReader(new FileReader("p2.txt"))) {
		   String line = null;
		   while ((line = br.readLine()) != null) {
		       System.out.println(line);
		   }
		}
	
	}

}
	

