// It's a recursive search !! 

public class IterativeSearch {
	public static void main(String[] args) {
		int elem=4;
		int a[] = {6,3,9,1,4,0};
		int index;
		index = find(a,elem);
		System.out.println(index);
		
	}
	
	public static int find(int[] a,int elem) {
		return find_r(a,elem,0);
	}
	
	private static int find_r(int[] a, int elem, int indx) {
		if(a.length==0 || indx == a.length) {
			return -1;
		}
		if(a[indx]==elem) {
			return indx;
		}
		return find_r(a,elem,indx+1);
		
	}

}
