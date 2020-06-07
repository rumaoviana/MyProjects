import java.io.*;
import java.util.Scanner;
public class makeafile 
{
	public static void main(String[] args) throws IOException
	{int c=0;int f=0;int c1=1;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("......Project Management System......");
		System.out.println("1. Add video to the system");
		System.out.println("2. Borrow video");
		System.out.println("3. Modify video record");
		System.out.println("4. Delete video record");
		System.out.println("5. Search video");
		System.out.println("6. Report of available videos");
		System.out.println("7. Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			
			
			append obj=new append();
			append.usingBufferedWritter();
			break;
		}
		case 2:
		{
			
			borrow bor=new borrow();
			bor.main();
			
			borrowdelete bd=new borrowdelete();
			bd.main(args);
			
			break;
		}
		case 3:
		{
			modify md=new modify();
			md.main(args);
			break;
		}
		case 4:
		{
			delete dl=new delete();
			dl.main(args);
			break;
		}
		case 5:
		{
			search ob2=new search();
			search.main();
		}
		case 6:
		{
			display ob1=new display();
			ob1.main();
			break;
		}
		case 7:
		{
			c=7;
			break;
		}
		}
		}
		while(c==0);
		
		
	}

	

}
