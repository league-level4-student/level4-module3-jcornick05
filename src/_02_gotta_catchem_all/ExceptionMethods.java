package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double divide (double num1, double num2){
		if (num1/num2 == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return num1/num2;
			}
		}
	public String reverseString (String input){
		String reversed = "";
		if(input == "") {
			throw new IllegalStateException();
		}
		
		for (int i = input.length()-1; i > -1; i--) {
			reversed = reversed + input.charAt(i);
			//System.out.println(reversed);
		}
		
	return reversed;
		}
	}