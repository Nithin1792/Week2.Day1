package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
String str1="welcome to chennai";
char[] chArr = str1.toCharArray();
System.out.println(chArr.length);
String typeName = chArr.getClass().getTypeName();
System.out.println(typeName);
System.out.println(chArr);
	for (int i = 0; i < chArr.length; i++) {
		//System.out.println(chArr[i]);
		if (chArr[i]=='e') {
			count= count+1;
		}
	}
	System.out.println("Count of e: "+ count);
	}

}
