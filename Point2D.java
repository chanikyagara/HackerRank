



public class Point2D {

	int x, y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double dist2D(Point2D p) {
        System.out.println("p.x " + p.x + "p.y " + p.y + " x " + x + " y " + y);
		double distance = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
		return distance;
	}

	public void printDistance(double d) {
		System.out.println("2D distance = " + (int) Math.ceil(d));
	}

}
