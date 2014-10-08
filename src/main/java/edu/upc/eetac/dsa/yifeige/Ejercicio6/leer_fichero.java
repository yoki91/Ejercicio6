package edu.upc.eetac.dsa.yifeige.Ejercicio6;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class leer_fichero 
{
	public String leer(int key)
	{
		String s=null;
		 BufferedReader buffer=null;
		 String p1="/home/yifeige/dsa-projects/Ejercicio_4/registro.txt";
		 String p2="/home/yifeige/dsa-projects/Ejercicio5/registro.txt";
		 if(key==0)
		 { 
			try
	        {	        	
	        	buffer=new BufferedReader(new FileReader(p1));
	        	s=buffer.readLine();
	        }
	        catch(IOException e)
	        {
	        	System.out.println("El fichero tiene una excepcion IO:"+e.getMessage());
	        }			 
		 }
		 if(key==1)
		 { 
			try
	        {	        	
	        	buffer=new BufferedReader(new FileReader(p2));
	        	s=buffer.readLine();
	        }
	        catch(IOException e)
	        {
	        	System.out.println("El fichero tiene una excepcion IO:"+e.getMessage());
	        }			 
		 }		 
	       return s;
	}

}
