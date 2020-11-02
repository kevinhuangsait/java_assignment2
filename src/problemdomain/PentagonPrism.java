package problemdomain;

/**
 * Pentagon prism shape.
 * @author 831719
 *
 */
public class PentagonPrism extends Polygon{
	
	private double length;
	private double height;

	public PentagonPrism(double height, double length) {
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
		return 5*(Math.pow(this.length, 2)) * Math.tan(54) / 4;
	}

	@Override
	public double getHeight() {
		return height;
	}

}
