package org.csv;
import java.io.File;
import java.util.*;
import java.lang.*;
import java.io.PrintWriter;


public class Csv_Assignment
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String[] str=new String[10];

		boolean checking=true,valid=true;
		
		try
		{
			System.out.println("Enter the file name:");
			String filename=sc.next();
			File file=new File("D:\\csv\\" +filename+".csv");
			PrintWriter pw= new PrintWriter(file);
			
			
		   ArrayList<String> l=new ArrayList<String>();
		   
		   l.add("\r");
		   System.out.println("Enter the number of columns");
		   
		   int n=sc.nextInt();
		   System.out.println("Do you want to enter header name? yes/no");
		   String header=sc.next();
		   if(header.equals("yes"))
		   {
			   
		   
		   System.out.println("Enter the headers name");
		   for(int i=1;i<=n;i++)
		   {
			   str[i] =sc.next(); 
			   l.add(str[i]);
			 
			   
		   }
		   
		   
		   l.add("\n");
		  
	   		   System.out.println("write data in row:");
			   for(int i=1;i<=n;i++)
			   {
				   str[i] =sc.next(); 
				   l.add(str[i]);
				 
			   }
			 l.add("\n");
			   
			   while(valid)
				{
				   System.out.println("Do you want to enter s new row?yes/no");
				   String you=sc.next();
				
				   if(you.equals("no"))
				{
					valid=false;
					checking=false;
					
				}
				
				else if(you.equals("yes"))
				{
					System.out.println("Enter the row data:");			
					for(int i=1;i<=n;i++)
					{
						str[i] =sc.next(); 
						l.add(str[i]);
						valid=true;
					
					}
				}
			}
			pw.write(l.toString());
			pw.close();
			System.out.println("CSV generation is in process...");
			if(file.exists())
	   		{
			System.out.println("CSV Created Successfully!");
	
			System.out.println("The Path of generated csv file is: " +(new File(filename).getAbsolutePath()));
	    	}else
	    	{
	    		System.out.println("Error while generating csv");
	    	}
		   
		} else 
		   {   
	   		   System.out.println("write data in row:");
			   for(int i=1;i<=n;i++)
			   {
				   str[i] =sc.next(); 
				   l.add(str[i]);
					  
			   }
			 l.add("\n");
			   while(valid)
				{
				   System.out.println("enter another?yes/no");
				   String you=sc.next();
				
				   if(you.equals("no"))
				{
					valid=false;
					checking=false;
					
				}
				
				else if(you.equals("yes"))
				{
					System.out.println("Enter the another row data:");			
					for(int i=1;i<=n;i++)
					{
						str[i] =sc.next(); 
						l.add(str[i]);
						valid=true;
					
					}
				}
					
			}
			   
	    	 pw.write(l.toString());
	   		pw.close();
	   		System.out.println("CSV generation is in process...");
	   		if(file.exists())
	   		{
			System.out.println("CSV Created Successfully!");
	
			System.out.println("The Path of generated csv file is: " +(new File(filename).getAbsolutePath()));
	    	}else
	    	{
	    		System.out.println("Error while generating csv");
	    	}
		   }
	}
	catch (Exception e)
	{}
		
 }
}
	
	
