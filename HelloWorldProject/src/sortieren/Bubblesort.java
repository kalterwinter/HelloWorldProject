package sortieren;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] f= {3,1,9,5,2,8,6,5};
	//
	for (int n = f.length; n>1; --n) {
		for(int i=0; i<n-1;i++) {
	  if (f[i]>f[i+1]){ 
		    int help = f[i];
		    f[i]=f[i+1];
		    f[i+1]=help;
}}}
	for(int i : f)
		System.out.println(i);
}}