package problemdomain;


/**
 * Square prism shape
 * @author 831719
 *
 */
public class SquarePrism extends Polygon{
	
	private double length;
	private double height;

	public SquarePrism(double height, double length) {
		super();
		this.length = length;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return Math.pow(this.length,2) * this.height;
	}

	@Override
	public double getBaseArea() {
		return Math.pow(this.length,2);
	}

	@Override
	public double getHeight() {
		return height;
	}

}
