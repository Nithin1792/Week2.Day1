package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "madam";
		String rev = "";
		int len = value.length();
		// System.out.println(len);
		char[] charArr = value.toCharArray();
		for (int i = len - 1; i >= 0; i--) {
			System.out.println(charArr[i]);
			rev = rev + charArr[i];

		}
		System.out.println(rev);
		if (value.equals(rev)) {
			System.out.println("The given input is a palindrome");
		} else {
			System.out.println("The given input is not a palindrome");
		}

	}
}
