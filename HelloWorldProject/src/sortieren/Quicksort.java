package sortieren;

public class Quicksort{
		static int[] z = {4,2,5,9,6,10,9,7}; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		quicksort(0,z.length-1);
} 
static void quicksort(int l, int r) { 
	
if (l > r) {
       int teiler = teile(l, r); 
       quicksort(l, teiler-1); 
       quicksort(teiler+1, r); 
} 
} 
private static int teile(int l, int r) {  
int i = l ; 
int j = r - 1;
int pivot = z[r];
//
do { 
if (i < j)   { 
} 
} while (i < j); 
		  if (z[i]> pivot){ 
			    int help = z[i];
			    z[i]=z[j+1];
			    z[i+1]=help;
		  
        return i; 
} 
} 
}