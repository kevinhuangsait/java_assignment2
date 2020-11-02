package problemdomain;

import java.util.Comparator;


/**
 * Merge sort method.
 * @author 831719
 *
 */
public class MergeSortController extends Controller{  
	
	private Polygon[] array;
	private Polygon[] mergeArray;
	private int length;
	
	@Override
	public void sort(Polygon[] items, Comparator<Polygon> comparator) { 
		this.array = items;
		this.length = items.length;
		this.mergeArray = new Polygon[length];
		mergeSort(0, length - 1, comparator);
	}

	private void mergeSort(int l, int r, Comparator<Polygon> comparator)
	{
		if (l < r)
		{
			int m = l + (r - l) / 2;
			mergeSort(l, m, comparator);
			mergeSort(m+1, r, comparator);
			merge(l,m,r, comparator);
		}
	}
	
	private void merge(int l, int m, int r, Comparator<Polygon> comparator)
	{
		if(comparator instanceof BaseAreaComparator || comparator instanceof Comparator)
		{
			for (int i = l; i <= r; i++)
			{
				mergeArray[i] = array[i];
			}
			
			int i = l;
			int j = m + 1;
			int k = l;
			while(i <= m && j <= r)
			{
				if(comparator.compare(mergeArray[i], mergeArray[j]) > 0 || comparator.compare(mergeArray[i], mergeArray[j]) == 0)
				{
					array[k] = mergeArray[i];
					i++;
				}
				else
				{
					array[k] = mergeArray[j];
					j++;
				}
				k++;
			}
			while (i <= m)
			{
				array[k] = mergeArray[i];
				k++;
				i++;
			}
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				mergeArray[i] = array[i];
			}
			
			int i = l;
			int j = m + 1;
			int k = l;
			while(i <= m && j <= r)
			{
				if(mergeArray[i].compareTo(mergeArray[j]) > 0 || mergeArray[i].compareTo(mergeArray[j]) == 0)
				{
					array[k] = mergeArray[i];
					i++;
				}
				else
				{
					array[k] = mergeArray[j];
					j++;
				}
				k++;
			}
			while (i <= m)
			{
				array[k] = mergeArray[i];
				k++;
				i++;
			}
		}
	}
}
