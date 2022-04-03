package Sort_Algorithm;
import java.util.*;

public class Alphabetical_order {
	public static boolean isSorted(String[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1].compareTo(a[i]) > 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSorted("abcedf"));

	}

}
