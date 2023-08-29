import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num,fact = 1;
		System.out.println("Enter number");
		num = sc.nextInt();
		System.out.println(num);
		
		/*do
		{
			fact = fact * (num - i);
			i++;
			
		}
		while(num > 0);*/
		
		for(int i = 0; i < num;i++) {
			if(num-i == 0) {
				break;
			}
			fact = fact * (num-i);
			
		}
		
		System.out.println(fact);
	}
}
