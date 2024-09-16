package assignment_4.question_3;

//assignment_4.question_3
// 3) Implement a program that handles multiple exceptions (e.g., ArithmeticException, NullPointerException) and uses custom exceptions.

import java.util.Scanner;

public class ExceptionHandeling {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			try {
					System.out.println("Enter Two Numbers :");
					int num1= sc.nextInt();
					int num2 = sc.nextInt();
					
					int result = divide(num1, num2);
					System.out.println("Result if Divisio : "+ result);
					
					String str = null;
					printStringLength(str);
					
					
					  checkForNegativeNumber(num1);
			}
			catch (ArithmeticException e) {
				System.out.println("We got ArithmeticExaception: "+e.getMessage());
			}
			catch (NullPointerException e) {
				System.out.println("We got NullPointereException: "+e.getMessage());
			}
			catch(Exception e) {
				System.out.println("We got General Exception "+e.getMessage());
			}
			
			finally {
				System.out.println("Exception Completed...");
			}
		}

		public static int divide(int num1, int num2) {
			if(num2 == 0) {
				throw new ArithmeticException("Division By zero is not Allowd");
			}
			return num1/num2;
		}
		
		public static void printStringLength(String str) throws NullPointerException{
			if(str == null) {
				throw new NullPointerException("String cannpt be Null."); 
			}else {
				System.out.println("Lenth of String : "+str.length());
			}
		}
		public static void checkForNegativeNumber(int number) throws InvalidOperationException{
			if(number < 0) {
				throw new InvalidOperationException("Negative Numbers are not allowed..");
			}else {
				System.out.println("The number is valid : "+number);
			}
		}
		
}
	class InvalidOperationException extends Exception{
		public InvalidOperationException(String message) {
			super(message);
		}
		
	}






















