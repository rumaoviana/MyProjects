import java.io.*;
import java.util.*;

public class delete 
{


	    public static void main(String[] args) throws IOException
	    {
	    	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the text to be deleted");
			String lineToRemove=sc.nextLine();

			File inputFile = new File("p2.txt");
			File tempFile = new File("newfile.txt");

			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
			String currentLine;
			while((currentLine = reader.readLine()) != null) {
				// trim newline when comparing with lineToRemove
				String trimmedLine = currentLine.trim();
				if(trimmedLine.equals(lineToRemove)) continue;
				writer.write(currentLine + System.getProperty("line.separator"));
			}
			writer.close();
			reader.close();
			boolean successful = tempFile.renameTo(inputFile);
			try {
				 //copy the contents of file1.txt to temp.txt
				 String temp = "";
				 BufferedReader br = new BufferedReader(new FileReader("p2.txt"));
				 BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));
				 while ((temp = br.readLine()) != null) {
				 bw.write(temp);
				 bw.newLine();
				 bw.flush();
				 }
				 //copy the contents of file2.txt to a file1.txt
				 br = new BufferedReader(new FileReader("newfile.txt"));
				 bw = new BufferedWriter(new FileWriter("p2.txt"));
				 while ((temp = br.readLine()) != null) {
				 bw.write(temp);
				 bw.newLine();
				 bw.flush();
				 }
				 //copy the contents of temp.txt to file2.txt
				 br = new BufferedReader(new FileReader("temp.txt"));
				 bw = new BufferedWriter(new FileWriter("newfile.txt"));
				 while ((temp = br.readLine()) != null) {
				 bw.write(temp);
				 bw.newLine();
				 bw.flush();
				 }
				 } catch (IOException e) {
				 e.printStackTrace();
				 }
	    }

}