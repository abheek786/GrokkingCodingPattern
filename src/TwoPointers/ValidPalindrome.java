package TwoPointers;

public class ValidPalindrome {

	private static boolean isValidPalindrome(String s) {
		if (s == null) {
			return false;
		}

		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (!(s.charAt(start) == s.charAt(end))) {
				return false;
			}

			start++;
			end--;
		}

		return true;

	}

	public static void main(String[] args) {

		String str = "racecar";

		if (isValidPalindrome(str)) {
			System.out.println(str + " is a valid palindrome");
		} else {
			System.out.println(str + " is a not valid palindrome");
		}
	}

}
