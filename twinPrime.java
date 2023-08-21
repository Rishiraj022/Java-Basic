import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    
	    int num,flag,i,j,k =0;
	    int array [] = new int [100];
		System.out.println("Enter a number");
		
		num = sc.nextInt();
		
		for (i = 2;i <= num ;i++ )
		{
		    flag = 0;
		    for (j = 2;j<= Math.sqrt(i) ;j++ )
		    {
		        if (i % j == 0)
		        {
		            flag = 1;
		            break;
		        } 
		    }
		    if(flag == 0)
		    {
		      array[k] = i;
		      k++;
		    }
		    else
		    {
		      continue;  
		    }
		} 
		for (i = 0 ;i < num ;i++ )
		{
		    if (array[i+1]-array[i] == 1 || array[i+1]-array[i] == 2)
		    {
		        System.out.println("(" +array[i]+ "," + array[i+1]+")");
		        
		    }
		    //System.out.println(array[i]);
		}
	}
}