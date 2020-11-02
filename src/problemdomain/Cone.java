package problemdomain;

/**
 * Cone shape.
 * @author 831719
 *
 */
public class Cone extends Polygon{
	
	private double radius;
	private double height;

	public Cone(double height, double radius) {
		super();
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return (1/3) * Math.PI * Math.pow(this.radius,2) * this.height;
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
