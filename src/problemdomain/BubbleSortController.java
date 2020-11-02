package problemdomain;
import java.util.*;

/**
 * Sorter using bubble sort.
 * @author 831719
 *
 */
public class BubbleSortController extends Controller{  
	@Override
	public void sort(Polygon[] items, Comparator<Polygon> comparator) { 
    	if (comparator instanceof BaseAreaComparator || comparator instanceof VolumeComparator)
    	{
	        int x = items.length;
	        Polygon shape = null;
	        
	        for (int i = 0; i < x; i++)
	        {
	        	for (int y = 1; y < (x - i); y++)
	        	{
	        		if(comparator.compare(items[y-1], items[y]) < 0)
	        		{
	        			shape = items[y-1];
	        			items[y-1] = items[y];
	        			items[y] = shape;
	        		}
	        	}
	        }
    	}
    	else
    	{
    		int x = items.length;
    		Polygon shape = null;
    		
    		for (int i = 0; i < x; i++)
    		{
	        	for (int y = 1; y < (x - i); y++)
	        	{
	        		if(items[y-1].compareTo(items[y]) < 0)
	        		{
	        			shape = items[y-1];
	        			items[y-1] = items[y];
	        			items[y] = shape;
	        		}
	        	}
    		}

    	}
    } 
}