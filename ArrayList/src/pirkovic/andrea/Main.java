package pirkovic.andrea;
import java.util.ArrayList;
import java.util.List;
	 
public class Main {

// Java Program koji implementira klase List and ArrayList 
	 
	
	
	    public static void main(String args[])
	    {
	 
	        // Kreiranje objekta klase List 
	        List<String> al = new ArrayList<>();
	 
	        // Dodavanje elemenata u listu
	        al.add("Ovo je"); 
	        al.add(" kurs");
	        al.add("JAVA programiranja");
	 
	        // Dodavanje elementa na prvom indeksu
	        al.add(1, "MISANU");
	 
	        // Stampa pocetne liste ArrayList
	        System.out.println("Pocetna lista: " + al);
	 
	        //Uklanjanje elementa sa indeksom br 1
	        al.remove(0);
	 
	        //Stampa liste posle uklanjanja elementa
	        System.out.println("Lista nakon uklanjanja elementa " + al);
	 
	        // Provera da li je neki element prisutan u listi pomocu contains() metode
	        boolean sadrzi = al.contains("MISANU");
	     
	        System.out.println("Da li je rec MISANU pristuna u recenici? " + sadrzi); 
	        //Prolazak kroz listu pomocu for petlje
	        for (int i = 0; i < al.size(); i++) {
	        // Upotreba get() metoda za pristup odredjenom elementu
	             System.out.print(al.get(i) + " ");
	         }
	    }
	}
	
