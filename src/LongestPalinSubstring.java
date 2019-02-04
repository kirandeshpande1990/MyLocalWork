// Java implementation of O(n^2) time and O(1) space method
// to find the longest palindromic substring
public class LongestPalinSubstring
{
	// A utility function to print a substring str[low..high]
	static void printSubStr(String str, int low, int high) {
		System.out.println(str.substring(low, high + 1));
	}

	// This function prints the longest palindrome substring 
	// (LPS) of str[]. It also returns the length of the 
	// longest palindrome 
	static int longestPalSubstr(String str) {	int maxLength = 1; 
	int start = 0;
	int len = str.length();
	int low, high;

	for (int i = 1; i < len; ++i) 
	{

		low = i - 1;
		high = i;
		while (low >= 0 && high < len
				&& str.charAt(low) == str.charAt(high)) {
			if (high - low + 1 > maxLength) {
				start = low;
				maxLength = high - low + 1;
			}
			--low;
			++high;
		}

		low = i - 1;
		high = i + 1;
		while (low >= 0 && high < len
				&& str.charAt(low) == str.charAt(high)) {
			if (high - low + 1 > maxLength) {
				start = low;
				maxLength = high - low + 1;
			}
			--low;
			++high;
		}
	}
	//return maxLength;


		System.out.print("Longest palindrome substring is: ");
		printSubStr(str, start, start + maxLength - 1);

		return maxLength;
	}

	// Driver program to test above function
	public static void main(String[] args) {
		String str = "wesawracecarontheradar!";
		//String str = "forgeeksskeegfor";
		System.out.println("Length is: " + 
						longestPalSubstr(str));
	}

}
// This code is contributed by Sumit Ghosh
