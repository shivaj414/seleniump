
package webdriverexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

public class filehandling {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
File f=new File("F:\\Filehandling\\src\\com\\Filehandling\\");
		
		f.createNewFile();
		
		FileWriter fw=new FileWriter(f);
      
		FileReader fr=new FileReader(f);
		
	/*	
		fw.write("Hello i am writting");
		fw.write("\n");
		fw.write("Hello i am new line");
		fw.write(65);
		
		fw.flush();
		fw.close();
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		bw.write("Hello i am writting");
		bw.newLine();
		bw.write("Hello i am new line");
		bw.write(65);
		
		bw.flush();
		bw.close();
		
		
		PrintWriter pw=new PrintWriter(fw);
		pw.println(" hi am writing a line");
		pw.println(" hi am a line");
		pw.println(65);
		pw.flush();
		pw.close();
		

		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		
		
	
		while(!(str==null))
		{
			System.out.println(str);
		str=br.readLine();		
		}
	*/
		
		int filecount=0;
		int foldercount=0;
	File[] cnt=f.listFiles();
	for (File file : cnt) {
		
		if(file.isFile())
		{
			
			filecount++;
		}
		else
		{
			foldercount++;
			
		}
		
		
	} 
	
	System.out.println("The total number of files is"+filecount);
	System.out.println("The total number of folders is"+foldercount);
	
	}

	}


