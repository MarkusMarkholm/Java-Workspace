package org.lu.ics.labbar;
import java.util.Scanner;
public class Lab1 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
	
				String name;
		
		System.out.print("Vad heter du? ");
		name = stdIn.nextLine();
		
		System.out.println();
		System.out.println("Välkommen "+ name + " till mjukvaruutveckling.");
		
		stdIn.close();
				
		
	}
	
}