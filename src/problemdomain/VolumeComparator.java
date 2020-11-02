package problemdomain;

import java.util.*;

/**
 * Comparator class for comparing the volume of two shapes.
 * @author 831719
 *
 */
public class VolumeComparator implements Comparator<Polygon> { 
    public int compare(Polygon a, Polygon b) {
    	double volumeA = a.getVolume();
    	double volumeB = b.getVolume();
    	
    	if(volumeA > volumeB)
    	{
    		return 1;
    	}
    	else if(volumeA < volumeB)
    	{
    		return -1;
    	}
    	else
    	{
    		return 0;
    	}
    }
}