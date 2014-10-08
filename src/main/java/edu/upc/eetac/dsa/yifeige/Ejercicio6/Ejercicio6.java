package edu.upc.eetac.dsa.yifeige.Ejercicio6;
import  edu.upc.eetac.dsa.yifeige.Ejercicio6.funcion;
import  edu.upc.eetac.dsa.yifeige.Ejercicio6.leer_fichero;
import java.io.*;
import java.text.*;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.String;


public class Ejercicio6 
{
	
    public static void main( String[] args )
    {
    	String t=null;
    	String r=null;
        leer_fichero lectura=new leer_fichero();
        t=lectura.leer(0); //funcion de leer el fichero, si la entrada es 0, leo el fichero registro.txt del ejercicio 4
        r=lectura.leer(1);// funcion de leer el fichero, si la entrada es 1,leo el fichero registro.txt del ejercicio 5
        System.out.println(t);// Que me devuelve la primera linea del registro.txt del ejercicio 4
        System.out.println(r);// QUe me devuelve la primera linea del registro.txt del ejercicio 5
        
        int resultado=0;
        int resultado1=0;
        
        funcion busqueda=new funcion();
        resultado=busqueda.buscar_numero(t);// funcion de buscar el numero, el resultado nos devuelve el numero de bytes del ejercicio 4
        resultado1=busqueda.buscar_numero(r);// funcion de buscar el numero, el resultado1 nos devuelve el numero de bytes del ejercicio 5
        //System.out.println(resultado);
        //System.out.println(resultado1);        
        busqueda.comparar(resultado, resultado1);// comparo los dos resultados, si Resultado es mayor que resultado1, Prueba es mayor que CAT sino, Cat es mayor que prueba...
       
        
        
        
    }
}
