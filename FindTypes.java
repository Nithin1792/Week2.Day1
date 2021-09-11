package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int letter = 0, space = 0, num = 0, specialChar = 0;
int count=0,count1=0,count2=0,count3=0;
		char[] charArr = test.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			//System.out.println(charArr[i]);

			if (Character.isLetter(charArr[i])) {
				System.out.println("letter: "+charArr[i]);
				count=count+1;
				System.out.println(count);
				
				
			} else if (Character.isDigit(charArr[i])) {
				System.out.println("number: " + charArr[i]);
			} else if (Character.isSpaceChar(charArr[i])) {
				System.out.println("space: " + charArr[i]);
			}

			else {
				System.out.println("specialCharcter: " + charArr[i]);
			}
		}
	}
}





