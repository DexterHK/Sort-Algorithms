package Sort_Algorithm;
import java.util.*;
public class BinarySearch
{
 public static int rank(int key)
 {

	 int[] a = new int[100];
	 for(int i = 0;i<100;i++)
	 {
		 a[i] = i;
	 }
	 int lo = 0 ;
	 int hi = a.length -1;

while(lo<=hi)
{
	 int mid =  lo + (hi - lo) / 2;
if(key > a[mid]) 
{
	lo = mid+1;
}

else if(key < a[mid]) 
{
	hi = mid-1;	 
}

else 	
{
	return mid;
}
 }
return -1;
 }
 public static void main(String[] args)
 {
	 System.out.println(rank(50));
 }
}