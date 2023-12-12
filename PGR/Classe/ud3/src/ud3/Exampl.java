package ud3;

public class Exampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		int[] a = new int[n];
		a[0]=1;		a[1]=2;		a[2]=3;		a[3]=4;		a[4]=5;
		a[5]=6;		a[6]=7;		a[7]=8;		a[8]=9;		a[9]=10;
		
		int[] b = {1,2,3,4,5,6,7,8,9,10};
		int[] c = new int[n];
		// mejor usar .length
		for(int i=1;i<=c.length ;i++ ) {
			c[i-1]=i;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
	}//

}
