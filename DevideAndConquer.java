public class DevideAndConquer{


	public static void main(String[] args){
		int[] array2 = {8,7,6,5,6,4,6,3,2};
		displayArray("array2",array2);
		displayArray("array2 sorted", sort(array2));
	}


	public static void displayArray(String name,int[] a){
		System.out.println();
		System.out.print(name +" : ");
		for(int i=0;i<a.length;i++){
			System.out.print("|"+a[i]);
		}
	}


	public static int[] size(int[] v){
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


	public static int[] sizer(int[] v){

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



	public static int[] split(int[]v,int[]r){
		for(int i=0;i<r.length;i++){
			r[i]=v[i];
		}
		return r;
	}


	public static int[] splitr(int[]v,int[]l){
		int j=l.length-1;
		int lengthV = v.length;
		int lengthL = l.length;
		for(int i=lengthV-1;i>lengthV-lengthL-1;i--){
			l[j]=v[i];
			j--;
		}
		return l;
	}



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


	public static int[] sort(int[]array){
		if(array.length>1){
			merge(array, sort(split(array,sizer(array))), sort(splitr(array,size(array))));
		}
		return array;
	}

}
