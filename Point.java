package fr.dauphine.ja.kamgaingfrankyarnaud.shapes;

public class Point {
	private int x;
	private int y;
	int nmbre_point_cree=0;
	
	
	public static void main(String args[]) {
		Point p =new Point();
		System.out.println(p.x + " " + p.y);
	}
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	public Point(int x,int y) {
		this.x=x;
	    this.y=y;
	    nmbre_point_cree ++;
	   
	}
	public Point(Point p) {
		x=p.getX();
		y=p.getY();
		
	}
	
	Point(){
		nmbre_point_cree++;
	}
	public void translate(int dx,int dy) {
		x+=dx;
		y+=dy;
		
	}
	

	

}
