package utility;
/*
1.*Go to StringBoolean class and create the following methods.*
2.*Write a method to check if the string1 contains string2.*
3.*Write a method to to check if the string starts with the given letter.*
4.*Write a method to to check if the string end with the given letter.*
5.*Write a method to to check if two strings are equal.*
6.*Write a method to to check if two strings are equal by ignoring the case. for example prograd && PROgrAD should return true.* 
7.*All the methods should return the value as boolean.*

*Go to StringBoolean class and create the following methods.*
2.*Write a method to concatenate two strings.*
3.*Write a method to split the first string based on the second string value.*
4.*Write a method to find the index value of the given character in the first string.* 
5.*All the methods should return the value as String.*

*/
public class StringBoolean {
	private String input1;
	private String input2;
     public String concatenate(String s1,String s2) {
    	 return s1+s2;
     }
     
     public int indexOf(String s1,String s2) {
    	 return s1.indexOf(s2);
     }
     
     public String[] split(String s1,String s2) {
    	 String[] strings = s1.split(s2);
    	 return strings;
     }
     
	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}
     
	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}

	public boolean contains(String input1, String input2) {
		boolean output = input1.contains(input2);
		System.out.println(output);
		return output;
	}

	public boolean endsWith(String input1, String input2) {
		boolean output = input1.endsWith(input2);
		return output;
	}

	public boolean startsWith(String input1, String input2) {
		boolean output = input1.startsWith(input2);
		return output;
	}

	public boolean equals(String input1, String input2) {
		boolean output = input1.equals(input2);
		return output;
	}

	public boolean equalsIgnoreCase(String input1, String input2) {
		boolean output = input1.equalsIgnoreCase(input2);
		return output;
	}

}
