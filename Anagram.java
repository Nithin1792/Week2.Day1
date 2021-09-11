package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "stops";
String str1 = "potss";
int len1 = str.length();
	int len2 = str1.length();
	System.out.println("length of str: "+len1);
	System.out.println("length of str1: "+len2);
	if (len1==len2) {
		System.out.println("length of both strings are same");
	}
	char[] charArr1 = str.toCharArray();
	
	for (int i = 0; i < charArr1.length; i++) {
		System.out.println(charArr1[i]);

	}
	
	char[] charArr2 = str1.toCharArray();
	
	for (int i = 0; i < charArr2.length; i++) {
		System.out.println(charArr2[i]);
	}
	System.out.println("Sorted Array 1 below");
	Arrays.sort(charArr1);
	for (int i = 0; i < charArr1.length; i++) {
		System.out.println("Sorted Array Char1: "+ charArr1[i]);
	}
	System.out.println("Sorted Array 2 below");
	Arrays.sort(charArr2);
	for (int i = 0; i < charArr2.length; i++) {
		System.out.println("Sorted Array Char2: "+ charArr2[i]);
	}
	if (Arrays.equals(charArr1, charArr2)) {
		System.out.println("CharArr1 equals CharArr2");
		
	}
	else {
		System.out.println("Arrays not similar");
	}
	}
	

}
