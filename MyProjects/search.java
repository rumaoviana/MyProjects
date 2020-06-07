import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class search 
{

public static void main()
{
    double count = 0,countBuffer=0,countLine=0;
    String lineNumber = "";
    String filePath = "p2.txt";
    BufferedReader br;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the video name for search");
    String inputSearch =sc.nextLine();
    String line = "";

    try {
        br = new BufferedReader(new FileReader(filePath));
        try {
            while((line = br.readLine()) != null)
            {
                countLine++;
                //System.out.println(line);
                String[] words = line.split("\n");

                for (String word : words) {
                  if (word.equalsIgnoreCase(inputSearch)) {
                    count++;
                    countBuffer++;
                  }
                }

                if(countBuffer > 0)
                {
                    countBuffer = 0;
                    lineNumber += countLine + ",";
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
    System.out.println("Video found...");
    }
    else {
    	System.out.println("Video not found");
    }
    System.out.println("Video found at line numbers - "+ lineNumber);
}
}