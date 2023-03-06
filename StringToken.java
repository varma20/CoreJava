import java.util.*;
public class StringToken{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter String with delimeter @");
		String str = sin.nextLine();
		StringTokenizer st = new StringTokenizer(str,"@");
		int n = 0, sum  = 0;
		while(st.hasMoreTokens()){
			String s1 = st.nextToken();
			n = Integer.parseInt(s1);
			sum = sum + n;
		}
		System.out.println(sum);
	}
}