package org.lu.ics.labbar;
import java.util.Scanner;
public class Lab1 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
	
		String firstname;
		String lastname;
		
		System.out.print("Vad heter du i förnamn? ");
		firstname = stdIn.nextLine();
		
		System.out.print("Vad heter du i efternamn? ");
		lastname = stdIn.nextLine();
		
		System.out.println();
		System.out.println("Så vänder vi på det:" + lastname +" "+ firstname);
		
		
		stdIn.close();
	}
	
				
		
	}