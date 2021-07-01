import java.util.*;
import java.lang.*;

public class Main 
{
	public static void main(String[] args) 
	{
		int p;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n = sc.nextInt();

		System.out.println("which no's min, max element you want to find?");
		int k = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("enter the elements of the array ");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}

		for(int j=0; j<n-1; j++)
		{
			p=0;
			while(p<(n-1-j))
			{
				if(arr[p] > arr[p+1])
				{
					temp = arr[p];
					arr[p] = arr[p+1];
					arr[p+1] = temp;
				}
				p = p+1;
			}
		}
		
		int max_k;
		int min_k;
		max_k = arr[n-k];
		min_k = arr[k-1];
		System.out.println(k+"th largest element in the array is: "+max_k);
		System.out.println(k+"th minimum element in the array is: "+min_k);
	}
}
