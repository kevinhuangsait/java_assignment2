package problemdomain;

import java.util.*;

/**
 * Compares area of two shapes.
 * @author 831719
 *
 */
public class BaseAreaComparator implements Comparator<Polygon> { 
    public int compare(Polygon a, Polygon b) {
    	double areaA = a.getBaseArea();
    	double areaB = b.getBaseArea();
    	
    	if(areaA > areaB)
    	{
    		return 1;
    	}
    	else if(areaA < areaB)
    	{
    		return -1;
    	}
    	else
    	{
    		return 0;
    	}
    }
}