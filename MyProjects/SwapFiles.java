import java.io.*;
import java.io.BufferedWriter;
 
public class SwapFiles {
 
public static void main(String[] args) {
 try {
 //copy the contents of file1.txt to temp.txt
 String temp = "";
 BufferedReader br = new BufferedReader(new FileReader("C:\Users\Smith Pereira\Desktop\p2.txt"));
 BufferedWriter bw = new BufferedWriter(new FileWriter("C:\Users\Smith Pereira\Desktop\temp.txt"));
 while ((temp = br.readLine()) != null) {
 bw.write(temp);
 bw.newLine();
 bw.flush();
 }
 //copy the contents of file2.txt to a file1.txt
 br = new BufferedReader(new FileReader("C:\Users\Smith Pereira\Desktop\newfile.txt"));
 bw = new BufferedWriter(new FileWriter("C:\Users\Smith Pereira\Desktop\p2.txt"));
 while ((temp = br.readLine()) != null) {
 bw.write(temp);
 bw.newLine();
 bw.flush();
 }
 //copy the contents of temp.txt to file2.txt
 br = new BufferedReader(new FileReader("C:\Users\Smith Pereira\Desktop\temp.txt"));
 bw = new BufferedWriter(new FileWriter("C:\Users\Smith Pereira\Desktop\newfile.txt"));
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

