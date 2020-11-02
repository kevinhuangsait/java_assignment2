package problemdomain;


/**
 * Pyramid shape
 * @author 831719
 *
 */
public class Pyramid extends Polygon{
	
	private double length;
	private double height;

	public Pyramid(double height, double length) {
		super();
		this.length = length;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return (1/3) * Math.pow(this.length,2) * this.height;
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
