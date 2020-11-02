package problemdomain;

import java.util.Comparator;


/**
 * Insertion sort method.
 * @author 831719
 *
 */
public class InsertionSortController extends Controller{  
	@Override
	public void sort(Polygon[] items, Comparator<Polygon> comparator) { 
		if(comparator instanceof BaseAreaComparator || comparator instanceof VolumeComparator)
		{	
			Polygon shape = null;
			for (int i = 1; i < items.length; i++)
			{
				for (int j = i; j > 0; j--)
				{
					if(comparator.compare(items[j],items[j-1]) > 0)
					{
						shape = items[j];
						items[j] = items[j-1];
						items[j-1] = shape;
					}
				}
			}
		}
		else
		{
			Polygon shape = null;
			for (int i = 1; i < items.length; i++)
			{
				for (int j = i; j > 0; j--)
				{
					if(items[j].compareTo(items[j-1]) > 0)
					{
						shape = items[j];
						items[j] = items[j-1];
						items[j-1] = shape;
					}
				}
			}
		}
	}

}
