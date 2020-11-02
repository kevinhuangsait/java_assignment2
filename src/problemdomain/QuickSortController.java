package problemdomain;

import java.util.Comparator;

/**
 * Quick sort method.
 * @author 831719
 *
 */
public class QuickSortController extends Controller{  
	
	@Override
	public void sort(Polygon[] items, Comparator<Polygon> comparator) { 
		quickSort(items, 0, items.length - 1, comparator);
	}
	
	private static void quickSort(Polygon[] array, int l, int r, Comparator<Polygon> comparator)
	{
		if (l < r)
		{
			int splitIndex = split(array, l, r, comparator);
			
			quickSort(array, l, splitIndex - 1, comparator);
			quickSort(array, splitIndex + 1, r, comparator);
		}
	}

	private static int split(Polygon[] array, int l, int r, Comparator<Polygon> comparator) {
		if(comparator instanceof BaseAreaComparator || comparator instanceof VolumeComparator)
		{
			Polygon pivot = array[r];
			int i = (l - 1);
			
			for (int j = l; j < r; j++)
			{
				if (comparator.compare(array[j], pivot) >= 0)
				{
					i++;
					
					Polygon shape = array[i];
					array[i] = array[j];
					array[j] = shape;
				}
			}
			
			Polygon shape = array[i + 1];
			array[i + 1] = array[r];
			array[r] = shape;
			
			return i + 1;
		}
		else
		{
			Polygon pivot = array[r];
			int i = (l - 1);
			
			for (int j = l; j < r; j++)
			{
				if (array[j].compareTo(pivot) >= 0)
				{
					i++;
					
					Polygon shape = array[i];
					array[i] = array[j];
					array[j] = shape;
				}
			}
			
			Polygon shape = array[i + 1];
			array[i + 1] = array[r];
			array[r] = shape;
			
			return i + 1;
		}
	}
	
//	private static Polygon[] quickSort(Polygon[] array, int l, int r, Comparator<Polygon> comparator)
//	{
//		int i = l;
//		int j = r;
//		
//		if (j > i)
//		{
//			Polygon pivot = array[l+(r-l)/2];
//			while (i <= j)
//			{
//				while (i < r && comparator.compare(array[i], pivot) > 0)
//				{
//					i++;
//				}
//				while (j > l && comparator.compare(array[j], pivot) < 0)
//				{
//					j--;
//				}
//				if(i<=j)
//				{
//					Polygon shape = array[i];
//					array[i] = array[j];
//					array[j] = shape;
//					i++;
//					j--;
//				}
//				
//				if(l<j)
//				{
//					quickSort(array, l, j, comparator);
//				}
//				if (i<r)
//				{
//					quickSort(array, i, r, comparator);
//				}
//			}
//		}
//		return array;
//	}

}
