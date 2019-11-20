package fr.dauphine.ja.kamgaingfrankyarnaud.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Bonjour!
 *
 */
public class PrimeCollection 
{ 
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	public PrimeCollection() {
		
		
	}
	void initRandom(int n, int m) {
		 for(int i=0;i<n;i++) {
		 int rand= (int)(Math.random()*m);
		 numbers.add(rand);
	}
	}
	private boolean isPrime(int p) {
		boolean etat=true;
		for(int i=2;i<p/2;i++) {
			if(p%i==0) {
				etat=false;
				break;
			}
		}
		if(etat) {
			System.out.println(p +" est un nombre premier");
			return etat;
			
		}
		else
			System.out.println(p + " n'est pas un nombre premier");
		    return etat;
	}
	void printPrimes() {
	
		for(int numb: numbers) {
			System.out.println(numb);
		
	}
	}
    public static void main( String[] args )
    { 
    	PrimeCollection p =new PrimeCollection();
    	
    	p.initRandom(100,1000);
    	p.printPrimes();
    	//p.isPrime(p.printPrimes());
    }
}
