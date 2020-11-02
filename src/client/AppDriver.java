package client;

import java.io.*;
import java.util.*;

import problemdomain.*;

/**
 * This is the application driver for the CPRG311 assignment 2. Reads in arguments and runs the sorter and comparator.
 * @author Kevin Huang 831719
 *
 */
public class AppDriver {

	/**
	 * Entry point for program.
	 * @param args Arguments passed in command line.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
			String file = null;
			String type = null;
			String sort = null;
		
			for (int i = 0; i < args.length; i++) 
	        {
	            if (args[i].toLowerCase().contains("-f")) 
	            {
	                file = args[i].substring(2);
	            } 
	            else if (args[i].toLowerCase().contains("-t")) 
	            {
	                type = args[i].substring(2);
	            } 
	            else if (args[i].toLowerCase().contains("-s")) 
	            {
	                sort = args[i].toLowerCase().substring(2);
	            }
	        }

			String[] dataArray = null;
			String line;
			
			BufferedReader br = new BufferedReader(new FileReader(new File("res/" + file)));
			while((line = br.readLine()) != null)
			{
				dataArray = line.split(" ");
			}
			int arrayLength = Integer.parseInt(dataArray[0]);
			Polygon[] shapesArray = new Polygon[arrayLength];
			int count = 0;
			
			for (int i = 0; i < dataArray.length - 1; i++)
			{
				if(dataArray[i+1].contains("Cylinder"))
				{
					Cylinder shape = new Cylinder(Double.parseDouble(dataArray[i + 2]), Double.parseDouble(dataArray[i + 3]));
					shapesArray[count] = shape;
					count += 1;
				}
				else if(dataArray[i+1].contains("Cone"))
				{
					Cone shape = new Cone(Double.parseDouble(dataArray[i + 2]), Double.parseDouble(dataArray[i + 3]));
					shapesArray[count] = shape;
					count += 1;
				}
				else if(dataArray[i+1].contains("OctagonalPrism"))
				{
					OctagonPrism shape = new OctagonPrism(Double.parseDouble(dataArray[i + 2]), Double.parseDouble(dataArray[i + 3]));
					shapesArray[count] = shape;
					count += 1;
				}
				else if(dataArray[i+1].contains("PentagonalPrism"))
				{
					PentagonPrism shape = new PentagonPrism(Double.parseDouble(dataArray[i + 2]), Double.parseDouble(dataArray[i + 3]));
					shapesArray[count] = shape;
					count +=1;
				}
				else if(dataArray[i+1].contains("TriangularPrism"))
				{
					TrianglePrism shape = new TrianglePrism(Double.parseDouble(dataArray[i + 2]), Double.parseDouble(dataArray[i + 3]));
					shapesArray[count] = shape;
					count += 1;
				}
				else if(dataArray[i+1].contains("SquarePrism"))
				{
					SquarePrism shape = new SquarePrism(Double.parseDouble(dataArray[i + 2]), Double.parseDouble(dataArray[i + 3]));
					shapesArray[count] = shape;
					count += 1;
				}
				else if(dataArray[i+1].contains("Pyramid"))
				{
					Pyramid shape = new Pyramid(Double.parseDouble(dataArray[i + 2]), Double.parseDouble(dataArray[i + 3]));
					shapesArray[count] = shape;
					count += 1;
				}
			}
			br.close();
			
			Comparator<Polygon> comparator = null;
			Controller sorter = null;
			
			if(type.equals("h"))
			{
				comparator = null;
			}
			else if(type.equals("v"))
			{
				comparator = new VolumeComparator();
			}
			else if(type.equals("a"))
			{
				comparator = new BaseAreaComparator();
			}
			
			if(sort.equals("b"))
			{
				sorter = new BubbleSortController();
			}
			else if(sort.equals("s"))
			{
				sorter = new SelectionSortController();
			}
			else if(sort.equals("i"))
			{
				sorter = new InsertionSortController();
			}
			else if(sort.equals("m"))
			{
				sorter = new MergeSortController();
			}
			else if(sort.equals("q"))
			{
				sorter = new QuickSortController();
			}
			else if(sort.equals("z"))
			{
				sorter = new CocktailSortController();
			}
			
			sorter.sort(shapesArray, comparator);
			
			for (int i = 0; i <= shapesArray.length -1; i++)
			{
				if (i % 1000 == 00)
				{
					System.out.println("[" + i +"]" + shapesArray[i].getBaseArea());
				}
			}
			
			
		}
	}
