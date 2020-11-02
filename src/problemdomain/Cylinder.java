package problemdomain;


/**
 * Cylinder shape class.
 * @author 831719
 *
 */
public class Cylinder extends Polygon{
	
	private double radius;
	private double height;

	public Cylinder(double height, double radius) {
		super();
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return Math.PI * Math.pow(this.radius,2) * this.height;
	}

	@Override
	public double getBaseArea() {
		return Math.PI * Math.pow(this.radius,2);
	}

	@Override
	public double getHeight() {
		return height;
	}

}
