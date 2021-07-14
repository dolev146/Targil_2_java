package tar_2;

public class She_3 {

	public static void main(String[] args) {
		System.out.println("ill tell you how many digis in your numebr  ");
		int num = MyConsole.readInt("Enter number  ");  
		int countDig  = 0; 
		while ( num != 0 ) { 
		countDig  = countDig + 1;
	    num = num/10;
	    }
		System.out.println("Your have  "+countDig+" digis.");
	}

}
