import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		System.out.println("Enter first number -");
		firstNumber=scanner.nextInt();
		System.out.println("Enter second number -");
		secondNumber=scanner.nextInt();
		System.out.println("Enter third number -");
		thirdNumber=scanner.nextInt();
		if((firstNumber > secondNumber) && (firstNumber > thirdNumber))
		{
			if (secondNumber>thirdNumber)
			System.out.println(secondNumber +"is greatest");
			
			else 
				System.out.println(thirdNumber +"is greatest");		
		}
		else if
		((secondNumber>firstNumber) && (secondNumber > thirdNumber)) {
			
			if (firstNumber>thirdNumber) {
				System.out.println(firstNumber +"is greatest");
		
			System.out.println(secondNumber +"is greatest");
			}
	
			  else
	                System.out.println(thirdNumber+" is middlarge");
	        }
	        
	        else if(thirdNumber>firstNumber && thirdNumber>secondNumber)
	        {
	            if(thirdNumber>secondNumber)
	            {
	                System.out.println(secondNumber+" is middlarge");
	            }
	            else
	                System.out.println(thirdNumber+" is middlarge");
	        }
	        
	        



	   }



	}

