package java_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sortingdec
{

	public static void main(String args[])throws IOException
	
	        {
	
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	            System.out.println("Enter a sentence");
	
	            String s = br.readLine();
	
	           int spaces = 0;
	
	            for(int i=0; i<s.length(); i++)
	
	            {
	
	                if(s.charAt(i) == ' ') spaces++;
	
	            }
	
	            int words = spaces + 1;
	
	            String arr[] = new String[words];
	
	            int c = 0;
	
	            for(int i=0; i<arr.length; i++)
	
	            {
	
	                if(arr[i]!= " ") arr[i] += s.charAt(c++);
	
	            }
	
	            for(int i=0; i<arr.length; i++)
	
	            {
	
	                for(int j=0; j<arr.length-1; j++)
	
	                {
	
	                    if(arr[j].length() < arr[j+1].length())
	
	                    {
	
	                        String t = arr[j];
	
	                        arr[j] = arr[j+1];
	
	                        arr[j+1] = t;
	
	                    }
	
	                }
	
	            }
	
	        }
	
	    }


