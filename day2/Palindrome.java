package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int a=34343;
		int n=a;
		int sum=0;
while(n!=0)
{
	int rem=n%10;
	sum=sum*10+rem;
	n=n/10;
}
if (a==sum) 
{
System.out.println("It is a palindrome");
} 
else 
{
	System.out.println("It is not a palindrome");
}
		
}

}
