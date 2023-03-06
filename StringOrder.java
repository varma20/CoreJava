import java.util.*;
public class StringOrder{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sin.nextInt();
		String[] str = new String[n];
		System.out.println("Enter Strings");
		for(int i=0 ; i <n; i++){
			str[i] = sin.nextLine();
		}
		for(int i = 0; i< n;i++){
			for(int j =i+1;j<n;j++){
				if((str[i].compareTo(str[j]))>0){
					String temp;
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(str[i]);
		}
	}
}