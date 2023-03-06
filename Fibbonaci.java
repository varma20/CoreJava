import java.util.*;
public class Fibbonaci{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		int end = sin.nextInt();
		int f1 = 0;
		int f2 = 1;
		while(f1 <= end){
			System.out.println(f1);
			int f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		
	}
}