import java.util.*;

public class Main {
    public static String DigitToWord(int digitIn) {
	String[] singleDigitWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	if (digitIn >= 0 & digitIn <= 9) {
	    return singleDigitWords[digitIn];
	} else {
	    return "error";
	}

    }

    public static String TensDigitToWord(int digitIn) {

	String[] tensDigitWords = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
		"ninEty" };
	if (digitIn >= 2 & digitIn <= 9) {
	    return tensDigitWords[digitIn-2];
	} else {
	    return "error";
	}
    }

    public static String TwoDigitNumToWords(int numIn) {
       String digit = DigitToWord(numIn%10);
       String tens = TensDigitToWord(numIn/10);
	  return tens+" "+ digit;
      

    }

    public static void main(String[] args) {
	Main p = new Main();
	Scanner scnr = new Scanner(System.in);
	int num = scnr.nextInt();
	System.out.println(TwoDigitNumToWords(num));

    }
}
