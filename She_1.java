package tar_2;

public class She_1 {

	public static void main(String[] args) {
		System.out.println("a * x = b");
	double a = MyConsole.readDouble("Enter a :"); 
	double b = MyConsole.readDouble("Enter b :"); 
	
	if (a == 0 && b != 0 ) System.out.println("no soultions "); 
	else if (a == 0 && b == 0 ) System.out.println("infinty  soultions "); 
	else {
	double x = b/a; 
	System.out.println("Your x is "+x);
	}
	}

}
