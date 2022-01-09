package Assessment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Nonrepeat {
	
	

	    private static final int EXTENDED_ASCII_CODES = 256;

	    private static final String TEXT = "Trinity Mobility";

	    public static void main(String[] args) {
	    	System.out.print("********************Program Start********************");

	        System.out.println("Input text: \n" + TEXT + "\n");

	        System.out.println("Loop and break solution:");
	        char firstcharV1 = firstNonRepeatedCharacterV1(TEXT);

	        System.out.println("Found character: " + firstcharV1);

	        System.out.println();
	        System.out.println("256 ASCII codes solution:");

	        char firstcharV2 = firstNonRepeatedCharacterV2(TEXT);
	        System.out.println("Found character: " + firstcharV2);

	        System.out.println();
	        System.out.println("LinkedHashMap based solution:");
	        char firstcharV3 = firstNonRepeatedCharacterV3(TEXT);
	        System.out.println("Found character: " + firstcharV3);
	        
	        System.out.println("\n");
		   	 System.out.println("********************Program End********************");

	    }

	    public static char firstNonRepeatedCharacterV1(String str) {

	        if (str == null) {
	            // or throw IllegalArgumentException
	            return Character.MIN_VALUE;
	        }

	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            int count = 0;
	            for (int j = 0; j < str.length(); j++) {
	                if (ch == str.charAt(j) && i != j) {
	                    count++;
	                    break;
	                }
	            }

	            if (count == 0) {
	                return ch;
	            }
	        }

	        return Character.MIN_VALUE;
	    }

	    public static char firstNonRepeatedCharacterV2(String str) {

	        if (str == null) {
	            // or throw IllegalArgumentException
	            return Character.MIN_VALUE;
	        }

	        int[] flags = new int[EXTENDED_ASCII_CODES];

	        for (int i = 0; i < flags.length; i++) {
	            flags[i] = -1;
	        }

	        for (int i = 0; i < str.length(); i++) {

	            if (flags[str.charAt(i)] == -1) {
	                flags[str.charAt(i)] = i;
	            } else {
	                flags[str.charAt(i)] = -2;
	            }
	        }

	        int position = Integer.MAX_VALUE;
	        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
	            if (flags[i] >= 0) {
	                position = Math.min(position, flags[i]);
	            }
	        }

	        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
	    }

	    public static char firstNonRepeatedCharacterV3(String str) {

	        if (str == null) {
	            // or throw IllegalArgumentException
	            return Character.MIN_VALUE;
	        }

	        Map < Character, Integer > chars = new LinkedHashMap < > ();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            Integer count = chars.get(ch);
	            if (count == null) {
	                chars.put(ch, 1);
	            } else {
	                chars.put(ch, ++count);
	            }
	        }

	        for (Map.Entry < Character, Integer > entry: chars.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }

	        return Character.MIN_VALUE;
	        
	    }

	    
}
