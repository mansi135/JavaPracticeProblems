// Here size and arr could have been binded together in a Class so that they are in sync and 
// We dont have to use Static
// Here arr is changed inplace-meaning since everything is pass by value in java ,
// we have essentially passed the same refernce address to be modified 
import java.util.Arrays;

public class SortedAdd {
	static int size=-1;
	public static void main(String[] args) {
		
		int[] a = new int[5];
		sortedAdd(a,3);
		sortedAdd(a,2);
		sortedAdd(a,5);
		sortedAdd(a,4);
		sortedAdd(a,0);
		//sortedAdd(a,1);
		System.out.println(Arrays.toString(a));
	}
	public static void sortedAdd(int[] arr, int v) {
		int i=0;
		if(size == arr.length - 1) {
			throw new RuntimeException("Already Reached the max capacity, "
					+ "Can't Add, Exitting!!");
		}
		if(size==-1) {
			arr[0]=v;
		}
		else { 
			for(i = size;i>=0;i--) {
				if (arr[i]>v) {
					arr[i+1]=arr[i];
				}
				else break;
			}
			arr[i+1]=v;
		}
		size++;		
	}
}
