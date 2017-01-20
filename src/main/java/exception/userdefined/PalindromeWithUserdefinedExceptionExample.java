package exception.userdefined;

import exception.common.InvalidInputException;



public class PalindromeWithUserdefinedExceptionExample {

	/*public String palindromeString(String input){
		//String output= null;// we should not give null
		String output= "";
		for(int i=input.length()-1;i>=0;i--){
			output= output+input.charAt(i);
			
		}
		return output;
	}*/

	public long palindromeNumber(long input) throws InvalidInputException {
		
		long result = 0;
		if(input<=10){
			throw new InvalidInputException("please enter valid input <=10"); 
		}else{
			long palindrome = input ;
		
		//long result = 0;
		while (palindrome != 0) {
			
			long reminder = palindrome % 10;
			result = (result * 10) + reminder;
			palindrome = palindrome / 10;
			
		}
		}
		
		return result;
	}
	public static void main(String[] args) {
		long input = 1;
		PalindromeWithUserdefinedExceptionExample palindromeWithUserdefinedExceptionExample = new PalindromeWithUserdefinedExceptionExample();
		long output = 0;
		try {
			output = palindromeWithUserdefinedExceptionExample.palindromeNumber(input);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (input == output) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
		/*String inputstring ="amma";
	String outputstring	=palindromeExample.palindromeString(inputstring);
	System.out.println(outputstring);
		//if (inputstring == outputstring) {
			if (inputstring.equals(outputstring)) {//difference b/w "==" and .equals()?
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}*/
	}



}
