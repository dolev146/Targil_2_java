package tar_2;

public class She_5 {

	public static void main(String[] args) {
		System.out.println("ill tell your factorial number");
		int num = MyConsole.readInt("Enter n "); 
		int factorial = 1; 
		for (int i = num; i > 0 ; i--) {
		factorial *= i;
		}
		
		System.out.println("the result of "+num+"! = "+factorial);
	    ; 
			

	}

}
