
public class Sanatizer {
	public static boolean isSafe(String s) {
		
		String s1 = s.trim();
		
		char[] s2 = s1.toCharArray();
		
		String[] sWords = s1.split(" ");
		
		boolean notSafeFlag = false;
		
		boolean containsSelect = false;
		boolean containsWhere = false;
		
		boolean prevCharIsBackslash    = false;
		boolean charIsBackslash        = false;
		boolean inSingleQuotes         = false;
		boolean inDoubleQuotes         = false;
		int parenOpenOutsideQuoteCount = 0;
		
		
		// line ends in ";"
		if ( s2[s2.length - 1] == ';')
			notSafeFlag = true;
		
		// contains SQL code (contains "SELECT" and "WHERE")
		for (String word : sWords) {
			if (word.toLowerCase().equals("select"))
				containsSelect = true;
			if (word.toLowerCase().equals("where"))
				containsWhere = true;
			if (containsSelect && containsWhere) {
				notSafeFlag = true;
				break;
			}
		}
		
		// contains hex or octal
				for (String word : sWords) {
					if (word.matches("^(0[xX]\\d\\d)|(0\\d\\d)$"))
						notSafeFlag = true;
				}
					
		// contains incomplete quotes '' double quotes "" or parentheses ()
		
		for (char c : s2) {
			prevCharIsBackslash = charIsBackslash;
		    charIsBackslash = (c == '\\');
			
		    // Escaped Backslash doesn't escape a character
		    if (charIsBackslash && prevCharIsBackslash)
		    	charIsBackslash = false;
		    
		    // Parentheses in quotes should not change parenCount
		    // Assumes parentheses can be escaped
		    if (c == '(' && ! inSingleQuotes && ! inDoubleQuotes && ! prevCharIsBackslash)
		    	parenOpenOutsideQuoteCount += 1;
		    
		    if (c == ')' && ! inSingleQuotes && ! inDoubleQuotes && ! prevCharIsBackslash)
		    	parenOpenOutsideQuoteCount -= 1;
		    
		    if (parenOpenOutsideQuoteCount < 0) {
		    	notSafeFlag = true;
		    	break;
		    }
		    
		    if (c == '"' && ! inSingleQuotes && ! prevCharIsBackslash )
		    	inDoubleQuotes = !inDoubleQuotes;
		    
		    if (c == '\'' && ! inDoubleQuotes && ! prevCharIsBackslash )
		    	inSingleQuotes = !inSingleQuotes;
		}
		if (parenOpenOutsideQuoteCount > 0 || inDoubleQuotes || inSingleQuotes)
			notSafeFlag = true;
		
		
		return ! notSafeFlag;
	}

}
