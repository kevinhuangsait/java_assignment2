package problemdomain;

import java.util.Comparator;

/**
 * Cocktail sort. This is a variation of bubble sort, where the algorith passes through arrays
 * in both directions once through. The first loop goes from left to right and is very similar to the bubble sort.
 * Compared items are swapped if the left is greater than the right. At the end of the loop, the largest number
 * ends up at the end of the array. Following this, the algorithm sorts again in the opposite direction. It starts
 * from the item before the most recently sorted item and goes back right to left through the array. The same
 * comparisons and swapping happens but in the other direction.
 * 
 * Worst and Average Case Time Complexity: O(n*n)
 * Best Case Time Complexity: O(n) when array is already sorted.
 * 
 * @author Kevin Huang 831719
 * @version Oct 26, 2020
 */
public class CocktailSortController extends Controller{  
	@Override
	public void sort(Polygon[] items, Comparator<Polygon> comparator) { 
		if(comparator instanceof BaseAreaComparator || comparator instanceof VolumeComparator)
		{
			boolean swap = true;
			int l = 0;
			int r = items.length;
			
			while (swap == true)
			{
				swap = false;
				
				for (int i = l; i < r - 1; i++)
				{
					if (comparator.compare(items[i], items[i+1]) < 0)
					{
						Polygon shape = items[i];
						items[i] = items[i+1];
						items[i+1] = shape;
						swap = true;
					}
				}
				
				if (swap == false)
				{
					break;
				}
				
				swap = false;
				
				r -= 1;
				
				for (int i = r - 1; i >= l; i--)
				{
					if (comparator.compare(items[i], items[i+1]) < 0)
					{
						Polygon shape = items[i];
						items[i] = items[i+1];
						items[i+1] = shape;
						swap = true;
					}
				}
				
				l = l + 1;
				
			}
		}
		else
		{
			boolean swap = true;
			int l = 0;
			int r = items.length;
			
			while (swap == true)
			{
				swap = false;
				
				for (int i = l; i < r - 1; i++)
				{
					if (items[i].compareTo(items[i+1]) < 0)
					{
						Polygon shape = items[i];
						items[i] = items[i+1];
						items[i+1] = shape;
						swap = true;
					}
				}
				
				if (swap == false)
				{
					break;
				}
				
				swap = false;
				
				r -= 1;
				
				for (int i = r - 1; i >= l; i--)
				{
					if (items[i].compareTo(items[i+1]) < 0)
					{
						Polygon shape = items[i];
						items[i] = items[i+1];
						items[i+1] = shape;
						swap = true;
					}
				}
				
				l = l + 1;
				
			}
		}
	}
}
