package tar_2;

public class She_8 {

	public static void main(String[] args) {
		System.out.println("What is the min number ");
		int firNum = MyConsole.readInt("Enter 1st number  "); 
		int secNum = MyConsole.readInt("Enter 2ed number "); 
		int thiNum = MyConsole.readInt("Enter 3rd number "); 
		if ( firNum < secNum ) { 
			if (firNum < thiNum) { 
				System.out.println("MIN = "+firNum);
			}
			if (thiNum < firNum) { 
				System.out.println("MIN = "+thiNum);
			}
		}
		else if ( secNum < thiNum ) {
			System.out.println("Min = "+secNum);
		}
		else { 
			System.out.println("Min = "+thiNum);
		}
		
	}

}
