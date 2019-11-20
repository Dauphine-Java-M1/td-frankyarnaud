package fr.dauphine.ja.kamgaingfrankyarnaud.shapes;


import java.util.LinkedList;
import java.util.Objects;
/**
 * Hello world!
 *
 */
public class LigneBrisee 
{
	private int max;
	private int nbr;
	LinkedList<Point>points;
	
	public LigneBrisee() {
		points =new LinkedList<Point>();
	}
	
	
	public void add(Point p) {
		points.add(p);
		nbr++;
	}
	public int nbPoints() {
		 return points.size();
	}
	public boolean contains(Point p) {
		for(Point pt : points) {
			if(pt==p) {
				return true;
				
			}
			
		}return false;
		
	}
    public static void main( String[] args )
    {
    	LigneBrisee l = new LigneBrisee();
    	Point p1 =new Point(2,4);
    	Point p2 = new Point(4,5);
    	Point p3 =new Point(7,9);
    	l.add(p1);
    	l.add(p2);
    	l.add(null);
    	System.out.println(l.nbPoints());
    	System.out.println(l.contains(null));
    	System.out.println(l.contains(p3));
        System.out.println( "Hello World!" );
    }
}
