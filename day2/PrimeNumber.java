package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
	int a=29;
	boolean flag=false;
	for (int i = 2; i<a/2; i++) 
	{
	if (a%i==0) 
	{
		flag=true;
		break;
	} 		
	}
	if (flag==false) 
	{
	System.out.println("It is a prime number");	
	}
	else 
	{
		System.out.println("It is not a prime number");	
	}
	}

	}

