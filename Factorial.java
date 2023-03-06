import java.util.*;
class FactorialDemo{
	long fact(long n){
		if(n == 0 || n ==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
	
}
class Factorial{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		int a = sin.nextInt();
		FactorialDemo fd = new FactorialDemo();
		long x = fd.fact(a);
		System.out.println(x);
	}
}