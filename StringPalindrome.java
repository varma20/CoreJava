import java.util.*;
public class StringPalindrome{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		String str = sin.nextLine();
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--){
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str)){
			System.out.println("Palindrome");
		}
	}
}