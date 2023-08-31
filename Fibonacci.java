import java.util.*;		//Fibonacci 

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i,end,num1,num2,sum =0;
		System.out.println("Enter number of terms");
		end = sc.nextInt();
		
		num1 = 0;
		num2 = 1;
		System.out.print(num1+" "+ num2+" ");
		i= 0;
		
		do {
			sum = num1 + num2;
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
			i++;
		}
		while(i<end);
	}
}
