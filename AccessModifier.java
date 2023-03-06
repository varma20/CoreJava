import java.util.*;
class Super{
	private int a=2;
	int b = 3;
	public int c = 4;
	protected int d = 5;
	void displayPrivate(){
		System.out.println(a);
	}
}
class Sub extends Super{
	public void displayFromSuper(){
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		super.displayPrivate();
	}
}
public class AccessModifier{
	public static void main(String[] args){
		Sub s = new Sub();
		s.displayFromSuper();
	}
}