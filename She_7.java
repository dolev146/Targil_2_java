package tar_2;

public class She_7 {

	public static void main(String[] args) {
		System.out.println("get you GCD ");
		int a = MyConsole.readInt("Enter first number  "); 
		int b = MyConsole.readInt("Enter second number "); 
		while (b != 0 && a != 0  ) { 
			int euc = a%b; 
			a = b; 
			b = euc;
			System.out.println("gcd("+a+","+b+")");
		} 
		System.out.println("GCD is "+a);// according to euclid algoritem https://en.wikipedia.org/wiki/Euclidean_algorithm

	}


}
