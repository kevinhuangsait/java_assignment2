package problemdomain;

/**
 * Abstract superclass of all shapes.
 * @author 831719
 *
 */
public abstract class Polygon implements Comparable<Polygon> {
	public abstract double getVolume();
	public abstract double getBaseArea();

	private double height;
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public int compareTo(Polygon shape)
	{
		if(this.getHeight() == shape.getHeight())
		{
			return 0;
		}
		else if(this.getHeight() > shape.getHeight())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	

}
