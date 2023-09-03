//Rishiraj P SEA51

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int range;
		System.out.println("Enter range");
		range = sc.nextInt();
		
		for (int i =2;i <= range;i++ )
		{
		    int flag =0;
		    for (int j =2;j<=Math.sqrt(i) ;j++ )
		    {
		        if(i % j == 0)
		        {
		            flag = 1;
		            break;
		        }
		    }
		    if (flag == 0)
		    {
		        System.out.println(i+" is a prime number");
		    }
		    else
		    {
		        System.out.println(i+" is not a prime number");
		    }
		}
		
	}
}
