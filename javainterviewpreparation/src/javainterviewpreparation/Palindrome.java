package javainterviewpreparation;

public class Palindrome {

	public static void main(String[] args) {
	int rem=0;
	int rev=0;
	int n=333;
	while(n>0) {
		rem= n%10; 	
		rev=rev*10+rem;
		n=n/10;
		
	}
	System.out.println(rev);

	
	if(rev==n) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}

}
}
