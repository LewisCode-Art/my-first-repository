package org.amalitech.codingTest13_1_2020;

import java.io.*;

	
public class CodingTest_13_1_2020 {
	
	
	
	public static void main(String[] args) throws IOException{
		 
		 charCounter();
	 } 
	//create Scanner class to accept input in new method and call new method in main method
		 public static void charCounter()throws IOException{
			 
			  String ch;
		      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      System.out.print("Enter the Statement:");
		      ch=br.readLine();
		      int count=0,len=0;
		        do
		        {  
		          try
		          {
		          char name[]=ch.toCharArray();
		              len=name.length;
		              count=0;
		              for(int j=0;j<len;j++)
		               {
		                  if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) 
		                      count++;
		               }
		              if(count!=0)
		                System.out.println(name[0]+" appeared "+count+" Times");
		              ch=ch.replace(""+name[0],"");          
		          }
		          catch(Exception ex){}
		        }
		        while(len!=1);
		   }
		 
}

	
