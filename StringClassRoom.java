package week2.day1;

public class StringClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="changeme";

char[] chArr1 = str.toCharArray();
	for (int i = 0; i < chArr1.length; i++) {
		if (i%2!=0) {
			char uCase = Character.toUpperCase(chArr1[i]);
			System.out.print(uCase);
		}
		
		else {
			char lCase = Character.toLowerCase(chArr1[i]	);
			System.out.print(lCase);
		} 
			
	}
	
	}

}
