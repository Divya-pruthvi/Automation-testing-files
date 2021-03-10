package javainterviewpreparation;

public class Amstrongnumber {

	public static void main(String[] args) {
		int n=153;
		int rem=0;
		int rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev+(rem*rem*rem);
			n=153/10;
			
		}
		
System.out.println(rev);
if(n==rev ) {
	System.out.println("amstromg number");
}
else {
	System.out.println("not amstrong number");
}

}
}
