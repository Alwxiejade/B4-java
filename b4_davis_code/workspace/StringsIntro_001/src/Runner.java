
public class Runner {
	
	//Strings-- class notes with working examples
	// *toUpperCase - toLowerCase
	//*compareTo (alphabetical compare)
	// *indexOf -- find the position of a char in a string
	//endWith - startWith
	//*substring -- heavily used on AP / college tests
	//*equals -- must NOT use math operators with strings! do no use =
	// *charAt
	//trim
	// valueOf
	
	//Strings are character arrays -- so what are arrays?

	public static void main(String[] args) {
		String name = "Alex Dino";
		System.out.println("name before: " + name);
		name = name.toLowerCase();
		System.out.println("name after lower case conversion: " + name);
		name = name.toUpperCase();
		System.out.println("name after upper case conversion: " + name);
		
		System.out.println();
		
		int result;
		String s1 = "Abc";
		String s2 = "Abd";
		
		 result = s1.compareTo(s2);
		
		if (result<0){
			
			System.out.println("s1 < s2");
			System.out.println(s1 + " alphabetically comes before" + s2);
		}

		else if (result == 0){
			System.out.println("s1 == s2");
			System.out.println(s2 + " alphabetically comes as " + s1);
		}
		
		else if (result > 0){
			System.out.println("s1 > s2");
			System.out.println(s1 + " alphabetically comes before" + s2);
		}
		
		else {
			System.out.println("Something went wrong");
	
		}
		
		
		
		//working example of equals
		
		System.out.println();
		String seq1 = "CHS";
		String seq2 = "MHS";
		
		// WRONG way Always tested
		
		//if (seq1 == seq2); // must Not use math operators with Strings!
		//instead, you must always use a string method, like .equals
		
		if (seq1.equalsIgnoreCase(seq2)){
			System.out.println(seq1 + " is equal to " + seq2);
			
		}
		
		else {
			System.out.println(seq1 + " is NOT equal to " + seq2);
		}
		
		// String as a char array -- what is an array?
		// an array is a group of similar things
		// means an array, a collection of similar things
		
		String[] stringArray = new String[5];
		
		stringArray[0]= "Welcome";
		stringArray[1]= "to";
		stringArray[2]= "me";
		stringArray[3]= "favorite";
		stringArray[4]= "store";
		
		for (int i = 0; i <= 4; i++){
			System.out.println(stringArray[i] );
		
			
		
	}
		
		
		//start of examples Th 15 Sept
		//practice pulling chars out of words a letter at a time
		//example: abc -- pull out the a, then the b, then the c ...
		System.out.println();
		
		String myWord = "Thursday";
		
		for (int i = 0; i < myWord.length(); i ++){
			
			System.out.println(" index " + i + " letter is " +myWord.substring(i, i+1));
			
		}
		
		String outputTxt = "";
		System.out.println();
		// use charAt(index);
		for (int i = 0; i < myWord.length(); i ++){
			
			System.out.println(" index " + i + " letter is " + myWord.charAt(i));
			outputTxt = outputTxt + myWord.charAt(i);

		}
		
		//loop is done
		
		
		
		//final intro notes
		//how to use indexOf()
		//myWord.indexOf(char)
		//Thursday -- let's find the index for d
		// myWord.indexOf('d') -- return an int, a number for the index
		
		System.out.println();
		
		int indexPosn = 0;
		indexPosn = myWord.indexOf('d'); //answer should be *5*
		System.out.println("index of d in Thurday is " + indexPosn);
		
	
		String reverseTxt = "";
		System.out.println();
		// use charAt(index);
		for (int i = 0; i < myWord.length(); i ++){
			
			System.out.println(" index " + i + "letter is " + myWord.charAt(i));
			reverseTxt = reverseTxt + myWord.charAt(i);
			
		
		
		

	}
		System.out.println("Input text is" + inputTxt);
	

	}
	
}
