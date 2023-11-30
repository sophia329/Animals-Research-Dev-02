package abstraction3;
import java.util.Scanner;

public class Utility extends Animal{
	
	String checkForName(String animalType) {
		
		System.out.println("Do you have a name for " + animalType + "?(Y/N): ");
		Scanner myScanner = new Scanner(System.in);
		String animalTypeReply = myScanner.next();
		
		if (animalTypeReply.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter the name of the " + animalType + ": ");
			return myScanner.next();
			} 
		
		else if (animalTypeReply.equalsIgnoreCase("N")){
			return null;
		}
		
		return null;
	}
	
		Lion getLionObject(String lionName) {
			
			if (lionName == null) {
				return new Lion();
			}
			return new Lion(lionName);
			
		}
		
		Giraffe getGiraffeObject (String giraffeName) {
			
			if (giraffeName == null) {
				return new Giraffe();
			}
			
			else {
				return new Giraffe(giraffeName);
			}
		}
		
		Bear getBearObject (String bearName) {
			
			if(bearName == null) {
				return new Bear();
			}
			
			return new Bear(bearName);
		}
		

		
	

	@Override
	void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void food() {
		// TODO Auto-generated method stub
		
	}
	
	
	}


