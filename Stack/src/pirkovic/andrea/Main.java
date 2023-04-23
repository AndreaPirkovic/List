package pirkovic.andrea;
import java.io.*;
import java.util.*;
	 
public class Main {
	
	  public static void main(String[] args)
	    {
	        //Upotreba klase Stack
	 
	        // Deklaracija stack-a
		 	Stack<String> stack = new Stack<>();
		 	// dodavanje elemenata na vrh stack-a pomocu metode push()
		 	stack.push("kurs");
		 	stack.push("JAVA");
		 	stack.push("programiranja");
	 
	        
	         
	        //Stampa 
	        System.out.println(stack);
	 
	        //Uzimanje elementa sa vrha stack-a pomocu metode peek() bez uklanjanja elementa
	        System.out.println(stack.peek());
	        
	                
	        //Uzimanje elementa sa vrha stack-a pomocu metode pop() i uklanjanje elementa
	        stack.pop();
	 
	        // Stampa elemenata 
	        for (int i = 0; i < stack.size(); i++)
	        System.out.print(stack.get(i) + " ");
	        System.out.println();
	       
	        //Pretrazivanje stack-a pomocu metode search() i vracanje udaljenosti od vrha stack-a
	        System.out.println(stack.search("JAVA"));
	        
	    }
	}

