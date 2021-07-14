package tar_2;

import java.util.Iterator;

public class She_4 {

	public static void main(String[] args) {
		System.out.println("ill tell you how many zeros in your numebr  ");
		int num = MyConsole.readInt("Enter number  ");  
		int dig = 0;
		int countZero = 0; 
		while (num != 0 ) { 
			dig = num%10; 
			if (dig == 0  ) { 
				countZero ++;	
			}
			num = num/10; 

		}
		System.out.println("you have "+countZero+" zeros ");
	}

}