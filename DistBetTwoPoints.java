


import java.util.Scanner;

public class DistBetTwoPoints {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int z1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int z2 = in.nextInt();
		in.close();
		
		Point3D p1 = new Point3D(x1, y1, z1);
		Point3D p2 = new Point3D(x2, y2, z2);
		double d2 = p1.dist2D(p2);
		double d3 = p1.dist3D(p2);
		
		Point2D p = new Point2D(0, 0);
		p.printDistance(d2);
		p = p1;
		p.printDistance(d3);
	}

}
