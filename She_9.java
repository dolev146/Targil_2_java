package tar_2;

public class She_9 {

	public static void main(String[] args) {
		System.out.println("What is the MAX number ");
		int firNum = MyConsole.readInt("Enter 1st number  "); 
		int secNum = MyConsole.readInt("Enter 2ed number "); 
		int thiNum = MyConsole.readInt("Enter 3rd number "); 
		if ( firNum > secNum ) { 
			if (firNum > thiNum) { 
				System.out.println("MAX = "+firNum);
			}
			if (thiNum > firNum) { 
				System.out.println("MAX = "+thiNum);
			}
		}
		else if ( secNum > thiNum ) {
			System.out.println("MAX = "+secNum);
		}
		else { 
			System.out.println("MAX = "+thiNum);
		}
		

	}

}
