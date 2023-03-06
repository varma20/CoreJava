interface sample{
	int sum(int m , int n);
}
class Add{
	static int func(int m , int n){
		int a = m + n;
		return a;
	}
	int fun(int m , int n){
		int a = m + n;
		return a;
	}
	
}
public class Lambda{
	static int demo(sample s,int m,int n ){
		return s.sum(m,n);
	}
	public static void main(String[] args){
		Add a = new Add();
		System.out.println(demo(int add::func,10,20));
		System.out.println(demo(a::fun,10,20));
	}
}