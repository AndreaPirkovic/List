package pirkovic.andrea;
import java.io.*;
import java.util.*;
	 
public class Main {
	// Kreiranje liste implementiranjem klase LinkedList
	 
	
	 public static void main(String[] args)
	    {
	        //Velicina liste LinkedList
	        int n = 5;
	 
	        //Deklaracija liste klase LinkedList
	        List<String> lista = new LinkedList<String>();
	 
	        //Dodavanje novih elemenata u listu
	        for (int i = 1; i <= n; i++)
	            lista.add("a");
	 
	        // Stampa liste
	        System.out.println(lista);
	 
	        // Uklanjanje elementa sa indeksom 3
	        lista.remove(3);
	 
	        // Stampa liste nakon uklanjanja
	        System.out.println(lista);
	 
	        //Postavljanje elementa u listu sa odredjenim indeksom
	        lista.set(3, "b");
	        // Pojedinacna stampa elemenata liste
	        for (int i = 0; i < lista.size(); i++)
	            System.out.print(lista.get(i) + " ");
	        System.out.println();
	        //Uzimanje elementa iz liste sa odredjenim indeksom
	        System.out.println(lista.get(3));
	    }
	}

