package problemdomain;

import java.util.Comparator;

/**
 * Selection sort method.
 * @author 831719
 *
 */
public class SelectionSortController extends Controller{  
	@Override
	public void sort(Polygon[] items, Comparator<Polygon> comparator) { 
		if(comparator instanceof BaseAreaComparator || comparator instanceof VolumeComparator)
		{	
			Polygon shape = null;
			for (int i = 0; i < items.length - 1; i++)
			{
				int x = i;
				for (int j = i + 1; j < items.length; j++)
					if(comparator.compare(items[j], items[x]) > 0)
					{
						x = j;
					}
				shape = items[x];
				items[x] = items[i];
				items[i] = shape;
			}
		}
		else
		{
			Polygon shape = null;
			for (int i = 0; i < items.length - 1; i++)
			{
				int x = i;
				for (int j = i + 1; j < items.length; j++)
					if(items[j].compareTo(items[x]) > 0)
					{
						x = j;
					}
				shape = items[x];
				items[x] = items[i];
				items[i] = shape;
			}
		}
	}
}
