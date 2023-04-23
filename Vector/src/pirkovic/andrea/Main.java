package pirkovic.andrea;
import java.io.*;
import java.util.*;
public class Main {
	// Kreiranje liste objekata pomocu klase Vektor
	 	
	    public static void main(String[] args)
	    {
	        //Velicina vektora
	        int n = 5;
	 
	        // Deklaracija objekta klase List, tj liste sa pocetnom velicinom n
	        List<Integer> v = new Vector<Integer>(n);
	 
	        //dodavanje novih elemenata na kraj liste
	        for (int i = 1; i <= n; i++)
	            v.add(i);
	 
	        //Stampa elementata
	        System.out.println(v);
	 
	        // uklanjanje elementa sa indeksom 3
	        v.remove(3);
	 
	        //ispis liste posle uklanjanja
	        System.out.println(v);
	        //Ispis elemenata liste jedan po jedan
	        for (int i = 0; i < v.size(); i++)
	        System.out.print(v.get(i) + " ");
	        System.out.println();
	        // vraca indeks poslednjeg pojavljivanja objekta u Vector listi. 
	        System.out.println(v.lastIndexOf(5));
	        // Provera da li je neki element prisutan u listi pomocu contains() metode
	        boolean sadrzi = v.contains(6);
	        System.out.println("Da li je br 6 pristan u listi? " + sadrzi);
	    }
			
	}
	

