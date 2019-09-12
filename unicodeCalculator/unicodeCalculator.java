package unicodeCalculator;
import java.util.Scanner;
public class unicodeCalculator{
	public static void main (String[] args){

        Scanner scnr = new Scanner(System.in);
        String string1;
        String string2;
        int string1CharValue;
        int string1CharSum = 0;
        int string2CharValue;
        int string2CharSum = 0;
        int totalCharDifference;
        
        	System.out.println("Welcome to the Unicode Calculator!");
        	
        	System.out.println("Enter a string:");

        	string1 = scnr.nextLine();

        	System.out.println("OK, great. Now enter another string:");

        	string2 = scnr.nextLine();

        	System.out.println("Sweet, you've entered: " + string1 + " " + string2);
        
        	for (int i = 0; i < string1.length(); ++i) {
        		string1CharValue = (int)string1.charAt(i);
        		string1CharSum = string1CharSum + string1CharValue;
        	}
        
        	for (int i = 0; i < string2.length(); ++i) {
        		string2CharValue = (int)string2.charAt(i);
        		string2CharSum = string2CharSum + string2CharValue;
        	}
        
        	totalCharDifference = Math.abs(string1CharSum - string2CharSum);

        	System.out.println("Here's the difference in unicode value between '" + string1 + "' and '" + string2 + "': " + totalCharDifference);
        	
	}
}
