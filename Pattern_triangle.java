//Name - Rishiraj Potdukhe SEA51

import java.util.*;

public class Pattern_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter number of rows");
		num = sc.nextInt();
		
		for(int i = 1;i<= num;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
			
	}

}
