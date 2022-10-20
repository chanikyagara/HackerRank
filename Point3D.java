

public class Point3D extends Point2D{

	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public double dist3D(Point3D p) {
		double distance = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2) + Math.pow((p.z - z), 2));
		return distance;
	}

	public void printDistance(double d) {
		System.out.println("3D distance = " + (int) Math.ceil(d));
	}

}
