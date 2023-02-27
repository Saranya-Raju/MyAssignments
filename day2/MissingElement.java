package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int []a= {1,2,3,4,6,7,8};
		Arrays.sort(a);
	for (int i = 1; i<=a[a.length-1]; i++) 
	{
		if (i!=a[i-1]) 
		{
		System.out.println("The Missing Number is " +i);
		break;
		} 
		
	}

	}

}
