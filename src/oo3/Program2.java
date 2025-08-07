package oo3;

public class Program2 {

	public static void main(String[] args) {
		String name = "George";
		String surName = "Sage";
		StringBuilder sb;
		
		System.out.println(name.charAt(2));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		char[] charNamesArray = name.toCharArray();
		
		for (char charNameArray : charNamesArray) {
			System.out.println(charNameArray);
		}
		
		System.out.println(name.startsWith("Z")); // False
		System.out.println(name.endsWith("e")); // True
		
		System.out.println(name.indexOf("G")); // 0
		System.out.println(name.indexOf("Z")); // -1 - indexOF always returns a int, so we get -1 as Z is not in the string.
		
		String fullName = name + " " + "Sage";
		System.out.println(fullName);
	}
}
