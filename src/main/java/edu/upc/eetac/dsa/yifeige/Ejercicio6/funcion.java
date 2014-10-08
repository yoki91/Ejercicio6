package edu.upc.eetac.dsa.yifeige.Ejercicio6;


public class funcion 
{
	public int buscar_numero(String s)
	{
		 String l=null;
	        int i=0;
	        int NumberOfBytes=0;
	        while (i<5 && l !="\n")
	        {
	        	String [] trozo=s.split(" ");
	            l=trozo[i];
	            if(i==3)
	            {
	            NumberOfBytes = Integer.parseInt(l);
	            i++;	            
	            }
	            else
	            i++;
	        }
	        return NumberOfBytes;
	}
	
	
	public void comparar(int num1,int num2)
	{
		if(num1>num2)
		System.out.println("El fichero prueba tiene mayor tamaño");
		else
			System.out.println("El fichero Cat tiene mayor tamaño");
	}

}
