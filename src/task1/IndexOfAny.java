package task1;

public class IndexOfAny {
    /**
     * Write covering tests + refactor code. In this task signature should stay
     * the same
     */
    public static int indexOfAny(String str, char[] searchChars) {
	if (str.isEmpty() || searchChars.length == 0) {
	    return -1;
	}

	for (int strIdx = 0; strIdx < str.length(); ++strIdx) {
	    char ch = str.charAt(strIdx);

	    for (int searchIdx = 0; searchIdx < searchChars.length; ++searchIdx) {
		if (searchChars[searchIdx] != ch) {
		    continue;
		}
		if (strIdx == str.length() - 1 || searchIdx == searchChars.length - 1) {
		    return strIdx;
		}

		if (searchChars[searchIdx + 1] == str.charAt(strIdx + 1)) {
		    return strIdx;
		}

	    }
	}

	return -1;
    }
}
