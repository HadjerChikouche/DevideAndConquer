public class DevideAndConquer{

	public static void main(String[] args){
		int[] array2 = {8,7,6,5,6,4,6,3,2};
		displayArray("array2",array2);
		displayArray("array2 sorted", sort(array2));
	}

	/**
	 * Display an array with its name
	 * @param name
	 * @param a
     */
	public static void displayArray(String name,int[] a){
		System.out.println();
		System.out.print(name +" : ");
		for(int i=0;i<a.length;i++){
			System.out.print("|"+a[i]);
		}
	}


	/**
	 * get the left array with half size of the original array (array in parameter).
	 * @param v
	 * @return an array with 0 values with the good size.
     */
	public static int[] sizeL(int[] v){
		int[]l;
		int size=v.length;

		if(size%2 == 0){
			l=new int[size/2];
		}else{
			int a=(size-1)/2;
			l=new int[a];
		}
		return l;
	}


	/**
	 * get the right array with half size of the original array (array in parameter)
	 * @param v
	 * @return an array with 0 values with the good size.
     */
	public static int[] sizeR(int[] v){

		int[]r;
		int size=v.length;

		if(size%2 == 0){
			r=new int[size/2];
		}else{
			int a=(size-1)/2;
			r=new int[size-a];
		}
		return r;
	}


	/**
	 * it puts the values of the array as parameter in the right sub-array.
	 * @param v
	 * @param r
	 * @return filled right sub-array.
     */
	public static int[] fillR(int[]v,int[]r){
		for(int i=0;i<r.length;i++){
			r[i]=v[i];
		}
		return r;
	}


	/**
	 * it puts the values of the array as parameter in the left sub-array.
	 * @param v
	 * @param l
	 * @return filled left sub-array.
     */
	public static int[] fillL(int[]v,int[]l){
		int j=l.length-1;
		int lengthV = v.length;
		int lengthL = l.length;
		for(int i=lengthV-1;i>lengthV-lengthL-1;i--){
			l[j]=v[i];
			j--;
		}
		return l;
	}


	/**
	 * it merges the two sub-arrays l and r into array.
	 * @param array
	 * @param l
	 * @param r
     */
	public static void merge(int[] array,int[]l,int[]r){

		int j=0;int k=0;
		for(int i=0;i<array.length;i++){
			if(j>=l.length||k<r.length && r[k]<=l[j]){
				array[i]=r[k];
				k++;
			}else{
				array[i]=l[j];
				j++;
			}
		}
	}


	/**
	 * call recusively the sort method that sort and merge an array.
	 * @param array
	 * @return sorted array
     */
	public static int[] sort(int[]array){
		if(array.length>1){
			merge(array, sort(fillL(array,sizeL(array))), sort(fillR(array,sizeR(array))));
		}
		return array;
	}

}
