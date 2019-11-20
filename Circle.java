package fr.dauphine.ja.kamgaingfrankyarnaud.shapes;

public class Circle {
	
	private Point centre;
	private int rayon;
	public Circle(Point centre,int rayon) {
		this.centre = new Point(centre);
		this.rayon=rayon;
	}
	public String tostring() {
		return "Centre [centre=" + centre + "rayon=" + rayon + "]";
	}
	public void translate(int dx,int dy) {
		centre.translate(dx,dy);
	}
	public Point getCenter() {
		return centre;
	}
	public double surface() {
		return Math.PI * rayon * rayon;
	}
	
	private double distanceCarre(Point p) {
		double dx=p.getX() - centre.getX();
		double dy =p.getY() - centre.getY();
		
		return dx * dx + dy * dy;
	}
	
	public static boolean contains(Point p, Circle... cercles) {
		for(Circle c : cercles) {
			if(c.contains(p)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[]args) {
		Circle c =  new Circle(new Point(2,1),1);
		
		c.getCenter().translate(1,1);
		System.out.println(c);
		
		 
		
	}

}
