package utility;

// Type your code
/**Go to StringMethod class and create the following methods.*
2.*Write a method to convert the String to lowercase.*
3.*Write a method to convert the String to uppercase.*
4.*Write a method to find the first character in the string.*
5.*Write a method to return string length.*
6.*Write a method to trim the input string.* 
7.*All the methods should return the value as string.*
*/
public class StringMethod{
	String string = "";
	public String toLowerCase(String str) {
		return str.toLowerCase();
	}
	public String toUpperCase(String str) {
	    return str.toUpperCase();	
	}
	public String firstChar(String str) {
		return str.charAt(0)+" ";
	}
	public int stringLength(String str) {
		return str.length();
	}
	public String trim(String str) {
		return str.trim();
	}
	public void setInput(String input) {
		// TODO Auto-generated method stub
		string = input;
	}
}