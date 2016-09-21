/*
 * The first known secrete code
 * It is an alphabet shift
 * start with plain text, and a "key"
 * let's say key = 2, and
 * plain test is abc
 * then a + 2 --> c
 * b + 2 --> d
 * so secret code for abc is cde
 * deciphering the code is just reversing the key
 */

public class TheBegin {
	
	/*
	 * Graded requirements
	 * fix the space problems (hint use an if to test for a space if yes add a space to codedText)
	 * fix the z wrap (hint: if index + key is > 25 the subtract 25
	 * exmaple z + 2 is 25 + 6 = 27 >25 so crash; insead if > 25 subtract 25
	 * so from 27 - 25 = 2 = b perfect!
	 * 
	 * for this part, syso is just fine
	 * 
	 * Next Part 2
	 * add decoding knowing the key -- reverse the process
	 * 
	 * Next part 3
	 * crack a code where you do you not know the code
	 * 
	 */

	public static void main(String[] args) {
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		int key = 2;
		
		String plaintext = "h";
		String codedText = "";
		int indexPlaintext = 0;
		int indexShifted = 0;
		
		// one baby step at a time -- couple lines of code test it
		
		plaintext = plaintext.toLowerCase();
		
		//System.out.println("Lowercase:" + plaintext );
		
		//plaintext.charAt(0) tells me the char at posn 0 (I)
		// find the alphabetical index for that char at posn 0
		//so for the I it is a...b...c...d...e....f....g...h..i should be 8
		
		
		for (int i = 0; i < plaintext.length(); i++){
		indexPlaintext = alpha.indexOf(plaintext.charAt(i));
		
		//System.out.println("alpha index for the first char of plaintext is: " + indexPlaintext);
		
		//now, shift using the key
		
		indexShifted = indexPlaintext + key;
		
		//System.out.println(" key:" + key);
		//System.out.println("index of plaintext: " +indexPlaintext);
		//System.out.println("index of shiftedtext: " + indexShifted);
		//System.out.println(("shifted char is: " + alpha.charAt(indexShifted)));
		codedText = codedText + alpha.charAt(indexShifted);
		

		
	} //end of for loop
		
		System.out.println("Orignal: " + plaintext);
		System.out.println("Key: " + key);
		System.out.println("Secret Code message: " + codedText);
	}
}
