public class DevideAndConquer{

	
	public static void main(String[] args){
		int[] array2 = {8,7,6,5,6,4,6,3,2};
		int[]l=size(array2);
		int[]r=sizer(array2);
		System.out.println("array l size "+l.length);
		System.out.print("array r size "+r.length);
		
		displayArray("array r",split(array2,l));
		displayArray("array l",splitr(array2,r));
		
		displayArray( "array2",array2);
		/*displayArray(l, "l");
		displayArray(r, "r");
       */
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
			System.out.println("\n"+"l["+j+"] = " + l[j] + " / " + " v["+i+"] = " + v[i]);
			j--;
		}
		return l;
	}	
	
	
}
