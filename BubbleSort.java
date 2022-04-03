import java.io.*;
import java.util.*;


public class BubbleSort {
	
	public static int bubble_sort(int limit) {
		//initialize Variables
			int[] array = new int[limit];
			int temp;
		//randomize numbers 
			System.out.println("Bubble sort using randomized array!");
			System.out.println("--------------------------------");
			for(int i = 0; i < limit; i++) {
				int random = (int)(Math.random()*50);
				array[i] = random; 
			}
// Sort algorithm
			for(int j = 0;j < 100;j++)
			{
				for(int f = 0;f < limit;f++)
				{
			if(array[j] < array[f]) 
			{
			//swap both of them
				System.out.println(Arrays.toString(array));
				temp  = array[j];
				array[j] = array[f];
				array[f] = temp;	
			}
				}
			}
			//print
			for(int a = 0;a<limit;a++)
			{
				//System.out.println(array[a]);
				
			}
			
			
			
			return limit;
	}
			
	public static void main(String[] args) {
		bubble_sort(100);

		 
		
		
		
	}
}
