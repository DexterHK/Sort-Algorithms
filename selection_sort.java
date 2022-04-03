package Sort_Algorithm;
import java.util.*;
//S O R T E X A M P L E
/*
 * Looks at every index starting by 0 and uses 0 as a min
 * if there is a value, which is smaller then min select it without doing anything
 * Carry on and look for the smalles number if there is no smaller number then the selected one
 * Take the smallest number and exchange it with the index of the selected number
 * https://www.youtube.com/watch?v=92BfuxHn2XE
 */
public class selection_sort {
		 public static void sort(Comparable[] a)
		 { 
			 int N = a.length; // array length
		 for (int i = 0; i < N; i++)
		 { // Exchange a[i] with smallest entry in a[i+1...N).
		 int min = i; // index of minimal entr.
		 for (int j = i+1; j < N; j++)
		 if (less(a[j], a[min])) min = j;
		 exch(a, i, min);
		 }
		 } 
		 private static boolean less(Comparable v, Comparable w)
		 { return v.compareTo(w) < 0; }
		 private static void exch(Comparable[] a, int i, int j)
		 { Comparable t = a[i]; a[i] = a[j]; a[j] = t; }
		 private static void show(Comparable[] a)
		 { // Print the array, on a single line.
		 for (int i = 0; i < a.length; i++)
		 StdOut.print(a[i] + " ");
		 StdOut.println();
		 }
		 public static boolean isSorted(Comparable[] a)
		 { // Test whether the array entries are in order.
		 for (int i = 1; i < a.length; i++)
		 if (less(a[i], a[i-1])) return false;
		 return true;
		 }
		 public static void main(String[] args)
		 { // Read strings from standard input, sort them, and print.
			
		 Scanner in = new Scanner(System.in);
		 String[] b = in.nextLine().split(" "); 
		 sort(b);
		 assert isSorted(b);
		 show(b);
		 } 
	}


