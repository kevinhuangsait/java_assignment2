package problemdomain;


/**
 * Octagon prism shape.
 * @author 831719
 *
 */
public class OctagonPrism extends Polygon{
	
	private double length;
	private double height;

	public OctagonPrism(double height, double length) {
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
		return 2 * (1+Math.sqrt(2)) * Math.pow(this.length, 2);
	}

	@Override
	public double getHeight() {
		return height;
	}
}
