package problemdomain;


/**
 * Triangle prism shape.
 * @author 831719
 *
 */
public class TrianglePrism extends Polygon{
	
	private double length;
	private double height;

	public TrianglePrism(double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return this.getBaseArea() * this.height;
	}

	@Override
	public double getBaseArea() {
		return Math.pow(this.length,2) * Math.sqrt(3) / 4;
	}

	@Override
	public double getHeight() {
		return height;
	}

}
